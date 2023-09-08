#stage 1 - build stage
#rich base image
FROM ubuntu as stage1

COPY Frontend/package*.json .

RUN npm install

COPY Frontend/* .

#stage 2 - running stage
FROM node:19.5.0-alpine

WORKDIR Frontend/app

EXPOSE 8080

CMD ["npm", "run", "start"]