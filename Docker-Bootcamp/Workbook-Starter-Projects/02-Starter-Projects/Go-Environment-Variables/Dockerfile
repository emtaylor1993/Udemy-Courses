# Dockerfile for Go Environment Variables

## 1. Which base image do you want to use?
FROM golang:1.16

## 2. Set the working directory.
WORKDIR /app

## 3. Copy your source code file to the working directory.
COPY . .

## 4. Define the command to run when the container starts.
CMD [ "go", "run", "main.go" ]