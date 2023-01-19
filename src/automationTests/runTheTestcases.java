package automationTests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;

public class runTheTestcases {
public static void main (String[]arg) {
	
	
	//Create a object of TestNG
	TestNG TNG = new TestNG();
	
	//define a list
	List<String>suites = new ArrayList<String>();
	
	//Add the TestNG xml files
	suites.add("C:\\Users\\vakacharla.sri\\eclipse-workspace\\FirstProject\\testng.xml");
	suites.add("C:\\Users\\vakacharla.sri\\eclipse-workspace\\FirstProject\\testngBROWSERS.xml");
	suites.add("C:\\Users\\vakacharla.sri\\eclipse-workspace\\FirstProject\\testngFACTORY.xml");
	suites.add("C:\\Users\\vakacharla.sri\\eclipse-workspace\\FirstProject\\testngOBJ.xml");
	
	//set the suites to run
	TNG.setTestSuites(suites);
	
	// call the run method
	TNG.run();
	
}
}
