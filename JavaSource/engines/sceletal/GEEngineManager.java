package engines.sceletal;

import clframe.GEEngineUtils;
import clframe.IGEEngine;

/**Abstract class used to obtain reference to current module engine!!! Engine must be loaded in advance before invoking getEngine() method.*/
/**Exposes each engine interface!*/
public abstract class GEEngineManager<T extends IGEEngine> {
	private T engine;
	public GEEngineManager() {}
	
	/**Get the engine manager!!!*/
	@SuppressWarnings("unchecked")
	public T getEngine(){
		if(engine == null) engine = (T)GEEngineUtils.getEngine(getEngineName());
		return engine;
	}
	
	/**Retrieve engine Name - implemented in successors.*/
	protected abstract String getEngineName();
}
