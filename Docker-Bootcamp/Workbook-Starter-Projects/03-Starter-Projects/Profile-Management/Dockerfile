# Use the official Node.js image as the base image
FROM node:14

# Set the working directory inside the container
WORKDIR /app

# Copy the application source code
COPY . .

# Install the dependencies
RUN npm install

# Expose the port that the API listens on
EXPOSE 3003

# Run the Node.js application when the container starts
CMD [ "node", "auth_api.js" ]