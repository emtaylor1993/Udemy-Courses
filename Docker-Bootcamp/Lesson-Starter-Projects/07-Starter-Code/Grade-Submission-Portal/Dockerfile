## Base Image
FROM python:3.8-slim 

## Work Directory
WORKDIR /app

## Copy source code
COPY . .

## Install requirements
RUN pip install -r requirements.txt

## Expose container port
EXPOSE 5001

## Execute Application
CMD [ "python", "app.py" ]