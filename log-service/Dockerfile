from node:12
COPY package.json package-lock.json* ./
RUN npm install --no-optional && npm cache clean --force
# COPY node_modules node_modules/
COPY _logs _logs/
COPY dist dist/
CMD ["node", "dist/app.js"]