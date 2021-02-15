import { ILogDto } from "../interfaces";
import { ILoggerGetFactory } from "./factories/i-logger-get-factory";
import { ILoggerSaveFactory } from "./factories/i-logger-save-factory";
import { FileLoggerGetFactory } from "./get/file-logger-get-factory";
import { ILoggerAbstractFactory } from "./i-logger-abstract-factory";
import { FileLoggerSaveFactory } from "./save/file-logger-save-factory";

export class FileLoggerFactory implements ILoggerAbstractFactory {

    public saver(): ILoggerSaveFactory<ILogDto> {
        return new FileLoggerSaveFactory();
    }

    public getter(): ILoggerGetFactory<ILogDto, {}> {
        return new FileLoggerGetFactory();
    }

}
