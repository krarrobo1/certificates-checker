import { ILogDto } from "../interfaces/i-log-dto";
import { ILoggerGetFactory } from "./factories/i-logger-get-factory";
import { ILoggerSaveFactory } from "./factories/i-logger-save-factory";

/**
 * Abstract factory to create a family of loggers
 */
export abstract class ILoggerAbstractFactory<T = ILogDto> {

    public abstract saver(): ILoggerSaveFactory<T>;
    public abstract getter(): ILoggerGetFactory<T>;
}
