import { ILogDto } from "../../interfaces";
import { ILoggerSaveFactory } from "../factories/i-logger-save-factory";

export class DatabaseLoggerSaveFactory extends ILoggerSaveFactory {
    public save(payload: ILogDto): Promise<string> {
        throw new Error("Method not implemented.");
    }

}