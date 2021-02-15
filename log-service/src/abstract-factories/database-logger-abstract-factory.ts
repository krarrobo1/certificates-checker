import { ILogDto, ILoggerAbstractFactory, ILoggerGetFactory, ILoggerSaveFactory } from "../interfaces";

export class DatabaseLoggerFactory extends ILoggerAbstractFactory {

    public save(): ILoggerSaveFactory<ILogDto> {
        throw new Error("Method not implemented.");
    }
    public get(): ILoggerGetFactory<ILogDto, {}> {
        throw new Error("Method not implemented.");
    }

}