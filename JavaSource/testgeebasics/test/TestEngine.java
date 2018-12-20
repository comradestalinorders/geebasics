package testgeebasics.test;


import java.util.Enumeration;
import java.util.Properties;
import engines.sceletal.GEEngineBaseSceletal;
import net.is_bg.ltf.IBeanFactory;
import net.is_bg.net.ltf.client.TestMe;
import net.is_bg.net.ltf.client.ltf.dependencies.LtfDependencies;

public class TestEngine extends  GEEngineBaseSceletal{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1713635300202178388L;
	private TestMe tm;
	//private Properties prop;
	
	
	public TestEngine() {
		engineName = "testgeebasics.test.TestEngine";
		getBeanService().put(engineName, new TestEngineBeanFactory());
		LtfDependencies.setBeanFactoryToApplicationGlobals(engineName, getBeanService());
		
		/*engineName = "testgeebasics.test.TestEngine";
		EngineRegisterWait.wait(engineName, 10, new IEngineRegisterCallBack() {
			@Override
			public void register(Object arg0) { getEngineProperties(); printProperties(prop); }
		});*/
	}
	
	private void printProperties(Properties p ) {
		 Enumeration<Object> keys =  p.keys();
		 while(keys.hasMoreElements()) {
			 String key =  keys.nextElement().toString();
			 System.out.println(key + " = " + p.getProperty(key));
		 }
	}
	
	
	@Override
	public void unload() {
		LtfDependencies.removeBeanFactoryByEngineName(engineName);
		/*super.unload();
		tm.stopTest();
		if(tm.isStopped()){
			System.out.println("testgeebasics.test.TestEngine unloaded...");
		}*/
	}
	
	
	public static class TestEngineBeanFactory implements IBeanFactory{

		/**
		 * 
		 */
		private static final long serialVersionUID = -587193390094083027L;

		@Override
		public Object getBean() {
			return new TestObject();
		}

		@Override
		public Object getBean(String arg0) {
			return new TestObject();
		}

		@Override
		public Object getBean(Object arg0) {
			return new TestObject();
		}
		
	}
	
	
}
