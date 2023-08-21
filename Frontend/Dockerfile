FROM node:19.5.0-alpine
EXPOSE 3000
COPY Frontend/package*.json .
RUN npm install
COPY Frontend/* .
CMD ["npm", "run", "start"]


