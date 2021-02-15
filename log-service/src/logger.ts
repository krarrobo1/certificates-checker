import { DatabaseLoggerFactory } from "./abstract-factories/database-logger-abstract-factory";
import { FileLoggerFactory } from "./abstract-factories/file-logger-abstract-factory";
import { ILoggerAbstractFactory } from "./abstract-factories/i-logger-abstract-factory";

const useDatabase = false;

export class Logger {

    // tslint:disable-next-line: variable-name
    private static _instance: ILoggerAbstractFactory | null = null;

    private constructor() { }

    public static get instance(): ILoggerAbstractFactory {
        if (!Logger._instance)
            Logger._instance = useDatabase
                ? new DatabaseLoggerFactory()
                : new FileLoggerFactory();

        return Logger._instance;
    }
}
