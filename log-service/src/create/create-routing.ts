import express from 'express';
import { Logger } from '../logger';

export const app = express();

app.post('/', (req, res) => {
    const saver = Logger.instance.saver();


});
