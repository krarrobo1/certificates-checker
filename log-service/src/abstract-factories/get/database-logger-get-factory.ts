import { ILogDto } from "../../interfaces";
import { ILoggerGetFactory } from "../factories/i-logger-get-factory";

export class DatabaseLoggerGetFactory extends ILoggerGetFactory {

    public get(options: {}): Promise<ILogDto | null> {
        throw new Error("Method not implemented.");
    }

}