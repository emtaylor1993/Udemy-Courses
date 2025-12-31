bat

@echo off
setlocal EnableExtensions EnableDelayedExpansion

REM ============================================================
REM WSL Kafka Port Forwarding (Windows -> WSL)
REM
REM Windows (Spring Boot) connects to:
REM   localhost:9092, localhost:9094, localhost:9096
REM
REM This script forwards those to the current WSL IP:
REM   WSP_IP:9092, WSL_IP:9094, WSL_IP:9096
REM
REM Run this script as an Adminstrator and re-run anytime 
REM WSL IP changes.
REM ============================================================

REM ---- Get WSL IP (first IP from "hostname -I") ----
for /f "usebackq tokens=1" %%i in (`wsl -e sh -lc "hostname -I | awk '{print $1}'"`) do set "WSL_IP=%%i"

if "%WSL_IP%"=="" (
  echo [ERROR] Could not determine WSL IP address.
  echo Make sure WSL is installed and your distro is running.
  pause
  exit /b 1
)

echo.
echo [INFO] Detected WSL IP: %WSL_IP%
echo.

REM ---- Forwarded Ports ----
set "PORTS=9092 9094 9096"

REM ---- Create or Refresh Port Proxy Rules ----
for %%p in (%PORTS%) do (
  echo [INFO] Configuring portproxy for 127.0.0.1:%%p  ->  %WSL_IP%:%%p

  REM Delete Existing Mappings (Ignore Errors)
  netsh interface portproxy delete v4tov4 listenaddress=127.0.0.1 listenport=%%p >nul 2>&1

  REM Add New Mapping
  netsh interface portproxy add v4tov4 listenaddress=127.0.0.1 listenport=%%p connectaddress=%WSL_IP% connectport=%%p >nul 2>&1
)

echo.
echo [INFO] Current portproxy mappings:
netsh interface portproxy show v4tov4
echo.

REM ---- Add Firewall Rules (Safe to Re-Run; Duplicates Possible on Some Systems) ----
echo [INFO] Ensuring Windows Firewall allows inbound TCP on Kafka ports...
for %%p in (%PORTS%) do (
  netsh advfirewall firewall add rule name="WSL Kafka Port %%p" dir=in action=allow protocol=TCP localport=%%p >nul 2>&1
)

echo .
echo [INFO] Quick connectivity test (Windows -> localhost ports):
for %%p in (%PORTS%) do (
  powershell -NoProfile -Command ^
    "$r = Test-NetConnection -ComputerName localhost -Port %%p; " ^
    "Write-Host ('  Port %%p : ' + ($r.TcpTestSucceeded))"
)

echo .
echo [DONE] If tests show False, confirm Kafka is listening in WSL on 0.0.0.0 for those ports.
echo .
pause
endlocal