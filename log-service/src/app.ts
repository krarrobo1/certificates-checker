import express from 'express';
import { routing } from './routes';

const app = express();
const port = 3000;

// plugins
// app.use(bodyParser);

// routing
app.get('/', (_, res) => res.send('hello World from logger'));
app.use('/logger', routing);

// startup
app.listen(port, () => {
    return console.log(`server is listening on ${port}`);
});
