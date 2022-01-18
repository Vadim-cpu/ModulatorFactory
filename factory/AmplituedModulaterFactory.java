package factory;

public class AmplituedModulaterFactory implements ModulaterFactory{

	@Override
	public Modulater createModulater() {
		
		return new AmplituedModulation();
	}

}
