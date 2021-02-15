import express from 'express';
import { ILogDto } from '../interfaces';
import { Logger } from '../logger';

export const routing = express();

routing.get('/:id', async (req, res) => {
    const id = req.params.id as string;
    const getter = Logger.instance.getter();

    try {
        const content = await getter.get({ id });
        res.json(content);
    } catch (error) {
        res.status(404).send(`Log ${id} not found`);
    }
});

routing.post('/', async (req, res) => {
    const body = req.body as ILogDto;
    const saver = Logger.instance.saver();

    try {
        const content = await saver.save(body);
        res.json(content);
    } catch (error) {
        res.status(500).send(`couldn't save log`);
    }
});
