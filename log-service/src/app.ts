import bodyParser from 'body-parser';
import express from 'express';
import * as logger from './create';

const app = express();
const port = 3000;
app.use(bodyParser);

app.use('/logger', logger.app);

app.listen(port, () => {
    return console.log(`server is listening on ${port}`);
});
