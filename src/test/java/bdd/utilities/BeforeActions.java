package bdd.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	
	
	@Before
	public void beforeActions(Scenario scen){
		System.out.println(">> Initializing Chrome Driver");
		SetupDrivers.setupDriver(); //before running any test, call setup driver
		System.out.println(scen.getName());
	}

}