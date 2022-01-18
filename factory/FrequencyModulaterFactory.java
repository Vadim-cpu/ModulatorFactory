package factory;

public class FrequencyModulaterFactory implements ModulaterFactory {

	@Override
	public Modulater createModulater() {
		return new FrequencyModulation();
	}

}
