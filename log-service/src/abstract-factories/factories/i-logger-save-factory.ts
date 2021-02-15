import { ILogDto } from "../../interfaces/i-log-dto";

/**
 * Footprint to log anything
 */
export abstract class ILoggerSaveFactory<T = ILogDto> {

    /**
     * Save log
     * @param payload log data to store
     */
    public abstract save(payload: T): Promise<string>;
}
