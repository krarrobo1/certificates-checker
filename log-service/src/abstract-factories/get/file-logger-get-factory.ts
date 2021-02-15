import { readFileSync } from "fs";
import { ILogDto } from "../../interfaces";
import { ILoggerGetFactory } from "../factories/i-logger-get-factory";

export class FileLoggerGetFactory extends ILoggerGetFactory {

    public async get(options: { id: string; }): Promise<ILogDto | null> {
        try {
            const path = `_logs/${options.id}.json`;
            const data = readFileSync(path);
            return JSON.parse(data.toString()) as ILogDto;
        } catch (error) {
            console.log(error);
            return null;
        }
    }


}