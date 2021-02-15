import { writeFileSync } from "fs";
import { ILogDto } from "../../interfaces";
import { ILoggerSaveFactory } from "../factories/i-logger-save-factory";

export class FileLoggerSaveFactory extends ILoggerSaveFactory {

    public save(payload: ILogDto): Promise<string> {
        const data = JSON.stringify(payload);
        const now = Date.now();
        const path = `_logs/${now}.json`;
        writeFileSync(path, data);
        return Promise.resolve(path);
    }

}