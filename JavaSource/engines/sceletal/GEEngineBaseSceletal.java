package engines.sceletal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import clframe.GEEngineUtils;
import clframe.IGEEngine;
import engines.sceletal.services.IGEEngineService;
import net.is_bg.net.ltf.client.ltf.dependencies.EngineBeanFactoryServiceMap;

/***
 * Provides the main functionality for each engine!
 * @author Lubo
 */
public abstract class  GEEngineBaseSceletal implements IGEEngine{
	/**
	 * 
	 */
	private   static final long serialVersionUID = -632753573138983340L;
	protected String engineName = "engines.sceletal.GEEngineBaseSceletal";       //the name of the engine class
	protected String engProperties =  "engine.properties";  //the name of engine properties file
	protected Properties properties;
	protected String key;
	private   EngineBeanFactoryServiceMap beanService = new EngineBeanFactoryServiceMap();
	
	private List<IGEEngineService> services = new ArrayList<IGEEngineService>();
	/**
	 * Retrieves the names of the engine resources!!!
	 * @return
	 */
	public Set<String>  getResourceNames(){
		return  GEEngineUtils.getEngineResourceNames(engineName);
	}
	
	public List<String> getResourceNamesList(){
		List<String> l = new ArrayList<String>();
		l.addAll(getResourceNames());
		return l;
	}
	
	public Set<String>  getEngineClassNames(){
		return GEEngineUtils.getEngineClassNames(engineName);
	}
	
	public List<String> getEngineClassNamesList(){
		List<String> l = new ArrayList<String>();
		l.addAll(getEngineClassNames());
		return l;
	}
	
	public Enumeration<Object> getEnginePropertyNames(){
		return GEEngineUtils.getEnginePropertyNames(engineName);
	}
	
	public Object getEngineProperty (String propertyKey){
		getEngineProperties();
		return properties.get(propertyKey);
	}
	
	public byte [] getEngineResource(String resourceName){
		return GEEngineUtils.getEngineResource(engineName, resourceName);
	}
	
	public byte [] getEngineClass(String className){
		return GEEngineUtils.getEngineClass(engineName, className);
	}
	
	/**
	 * Verifies engine key & sets deep view flag in current user to true!!!
	 * @param key
	 * @return
	 */
	protected boolean verifyKey(String key){
		return false;
		/*String k = (String)getEngineProperty("key");
		boolean b = new Sha512().digest(key).equals(k);
		if(b){
			Visit v = AppUtil.getVisit();
			if(v!=null){
				VisitFlags f = new VisitFlags(v.getVisitAdditionals().getFlags());
				f.setDeepView(true);
				v.getVisitAdditionals().setFlags(f.getFlags());
			}
		}
		return b;*/
	}
	
	public void verifyKey(){
		verifyKey(key);
	}
	
	
	/**
	 * Retrieves the engine properties!!!
	 * @return
	 */
	public Properties getEngineProperties(){
		if(properties != null) return properties;
		properties = new Properties();
		byte[] b = GEEngineUtils.getEngineResource(engineName, engProperties);
		GEEngineUtils.getEngineClassNames(engineName);
		try {
			properties.load(new ByteArrayInputStream(b));
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return properties;
	}
	
	/**
	 * Destroys this engine & returns the state back to pre - loading this engine!!!
	 */
	public void destroyEngine(){
		GEEngineUtils.destroyEngine(engineName);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	/***
	 * Returns the ids of the session stored in applicationSession manager!!!
	 * @return
	 */
	/*private static Set<String> getSessionIds(){
		try{
			Field  f =	ApplicationSessionManager.class.getDeclaredField("sessions");
		    f.setAccessible(true);
		    Map<String, HttpSession> value = (Map<String, HttpSession>)f.get(null);
		    return value.keySet();
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return null;
	}*/
	
	public List<IGEEngineService> getServices() {
		return services;
	}
	
	public void addService(IGEEngineService service) {
		services.add(service);
	}
	
	@Override
	public void unload() {
		//unload everything - unregister all services in list
		for(IGEEngineService s : getServices()){
			if(s!=null)s.unregister();
		}
	}
	
	@Override
	public int hashCode() {
		return engineName.hashCode();
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(arg0 instanceof GEEngineBaseSceletal) return false;
		GEEngineBaseSceletal s = (GEEngineBaseSceletal)arg0;
		return s.engineName.equals(engineName);
	}
	
	public EngineBeanFactoryServiceMap getBeanService() {
		return beanService;
	}

}

