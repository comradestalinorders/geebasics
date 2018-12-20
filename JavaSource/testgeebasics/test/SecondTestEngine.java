package testgeebasics.test;

import engines.sceletal.GEEngineBaseSceletal;
import net.is_bg.ltf.IBeanFactory;
import net.is_bg.net.ltf.client.ltf.dependencies.LtfDependencies;

public class SecondTestEngine extends GEEngineBaseSceletal {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1790524748993981383L;
	
	public SecondTestEngine() {
		engineName = "testgeebasics.test.SecondTestEngine";
		getBeanService().put(engineName, new SeondTestEngineBeanFactory());
		LtfDependencies.setBeanFactoryToApplicationGlobals(engineName, getBeanService());
	}
	
	@Override
	public void unload() {
		//super.unload();
		LtfDependencies.removeBeanFactoryByEngineName(engineName);
	}
	
	public static class SeondTestEngineBeanFactory implements IBeanFactory{

		/**
		 * 
		 */
		private static final long serialVersionUID = -587193390094083027L;

		@Override
		public Object getBean() {
			return new SecondTestObject();
		}

		@Override
		public Object getBean(String arg0) {
			return new SecondTestObject();
		}

		@Override
		public Object getBean(Object arg0) {
			return new SecondTestObject();
		}
		
	}
	
	

}
