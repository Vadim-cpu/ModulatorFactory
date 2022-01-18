package factory;

public class Program {

	public static void main(String[] args) {
		
		ModulaterFactory modulaterFactory = createModulationBySpec("freq");
		Modulater modulater = modulaterFactory.createModulater();
		
		modulater.makeModulation();
	}

	static ModulaterFactory createModulationBySpec (String special) {
		if (special.equalsIgnoreCase("ampl")) {
			return new AmplituedModulaterFactory();
		} else if (special.equalsIgnoreCase("freq")) {
			return new FrequencyModulaterFactory();
		}else {
			throw new RuntimeException(special = " UNKNOWN !!!");
		}
		
	}
}
