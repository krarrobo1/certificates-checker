import { DatabaseLoggerFactory, FileLoggerFactory, ILoggerAbstractFactory } from "./abstract-factories";

const useDatabase = true;

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
