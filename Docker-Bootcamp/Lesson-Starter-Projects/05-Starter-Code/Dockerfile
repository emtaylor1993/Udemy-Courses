## 1. Which base image do you want to use?
FROM python:3.8-slim

## 2. Set the working directory
WORKDIR /app

## 3. Copy the project files into the working directory.
## Copies the contents of Flask-Demo into /app
COPY Flask-Demo/ .

## 4. Install the dependencies
## Can directly reference requirements.txt thanks to Step 3.
RUN pip install -r requirements.txt

## 5. Document and inform the developer that the application will use PORT 5000 of the container.
EXPOSE 5000

## CAUTION: ONLY HAVE ONE OF STEPS 6 AND 7 ACTIVE.
## These are two different methods of running a Flask App.

## 6. Define the command to run when the container starts.
CMD [ "python", "/app/app.py" ]

## 7. Define the command to run when the container starts. (Environment Variable)
# ENV FLASK_APP=app.py
# CMD [ "flask", "run", "--host=0.0.0.0" ]