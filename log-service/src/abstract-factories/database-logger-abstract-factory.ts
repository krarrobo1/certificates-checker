import { ILoggerAbstractFactory, ILoggerGetFactory, ILoggerSaveFactory } from ".";
import { ILogDto } from "../interfaces";
import { DatabaseLoggerGetFactory } from "./get/database-logger-get-factory";
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
