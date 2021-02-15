import { ILoggerAbstractFactory, ILoggerGetFactory, ILoggerSaveFactory } from ".";
import { ILogDto } from "../interfaces";

export class FileLoggerFactory implements ILoggerAbstractFactory {

    public saver(): ILoggerSaveFactory<ILogDto> {
        throw new Error("Method not implemented.");
    }

    public getter(): ILoggerGetFactory<ILogDto, {}> {
        throw new Error("Method not implemented.");
    }

}