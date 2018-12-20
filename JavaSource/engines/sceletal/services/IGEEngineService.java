package engines.sceletal.services;

/**
 * The main service interface for each engine service!!!
 * @author lubo
 *
 */
public interface IGEEngineService  {
	/***
	 * Registers this service!!!
	 */
	public void register();
	/***
	 * Unregisters this service!!
	 * @return
	 */
	public boolean unregister();
	
	/**Check if this service is registered!!!**/
	public boolean isRegistered();
	/***
	 *Retrieves service name!!! 
	 * @return
	 */
	public String getServiceName();
}
