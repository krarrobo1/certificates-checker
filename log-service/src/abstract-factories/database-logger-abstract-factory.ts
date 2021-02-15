import { ILogDto } from "../interfaces";
import { ILoggerGetFactory } from "./factories/i-logger-get-factory";
import { ILoggerSaveFactory } from "./factories/i-logger-save-factory";
import { DatabaseLoggerGetFactory } from "./get/database-logger-get-factory";
import { ILoggerAbstractFactory } from "./i-logger-abstract-factory";
import { DatabaseLoggerSaveFactory } from "./save/database-logger-save-factory";

export class DatabaseLoggerFactory extends ILoggerAbstractFactory {

    constructor() { super(); }

    public saver(): ILoggerSaveFactory<ILogDto> {
        return new DatabaseLoggerSaveFactory();
    }
    public getter(): ILoggerGetFactory<ILogDto, {}> {
        return new DatabaseLoggerGetFactory();
    }
}
