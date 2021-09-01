const express = require('express');
const fs = require('fs');

const {createProxyMiddleware} = require('http-proxy-middleware');


const app = express();

let text = fs.readFileSync(`proxy.config.json`);
let obj = JSON.parse(text);

obj.forEach(e => {
    app.use(e.path, createProxyMiddleware(
        {
            target: e.target,
            changeOrigin: true,
            logLevel: 'debug',
        }
    ));
})

app.listen(3001);

console.log('[PROXY] Server: listening on port 3001');
