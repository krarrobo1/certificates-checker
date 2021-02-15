import { ILogDto } from "../../interfaces/i-log-dto";

/**
 * Footprint to get a log event
 */
export abstract class ILoggerGetFactory<T = ILogDto, U = { id: string }> {

    /**
     * Function to get one log from registry
     * @param options log data to store
     */
    public abstract get(options: U): Promise<T | null>;
}
