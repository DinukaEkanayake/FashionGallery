#stage 1 - build stage
FROM node:19.9.0-alpine as stage1

# Set the working directory to the root of your project
WORKDIR /app

#from local to container
COPY Frontend/package*.json .

RUN npm install

COPY Frontend/ ./

RUN npm run build

#stage 2 - running stage
FROM nginx:alpine

WORKDIR /usr/share/nginx/html

# Copy the built static files from the previous stage
COPY --from=stage1 /app/build .

EXPOSE 3000

# Start Nginx and run it in the foreground
CMD ["nginx", "-g", "daemon off;"]