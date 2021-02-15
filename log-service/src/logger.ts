import { DatabaseLoggerFactory, FileLoggerFactory } from "./abstract-factories";
import { ILoggerAbstractFactory } from "./interfaces";

const useDatabase = true;

export class Logger {

    // tslint:disable-next-line: variable-name
    private static _instance: ILoggerAbstractFactory | null = null;

    private constructor() { }

    get instance(): ILoggerAbstractFactory {
        if (!Logger._instance)
            Logger._instance = useDatabase
                ? new DatabaseLoggerFactory()
                : new FileLoggerFactory();

        return Logger._instance;
    }
}
