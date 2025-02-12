## 1. Which base image do you want to use?
FROM python:3.8-slim

## 2. Set the working directory.
WORKDIR /app

## 3. Copy your source code file to the working directory.
## The first dot represents everything in the current directory, second dot represents /app.
COPY . .

## 4. Define the command to run when the container starts.
CMD [ "python", "/app/python-app.py" ]