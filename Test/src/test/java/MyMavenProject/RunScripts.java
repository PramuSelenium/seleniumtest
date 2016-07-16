package MyMavenProject;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunScripts {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
String[][] recData = SeleniumTestQ2.readExcel("C:/Users/pramu/Desktop/TestSuit.xls", "Sheet1");
		
		String automationScript;
	//	String runNoRun;
		
		for(int i = 1; i<recData.length; i++)  {
			
		//	runNoRun = recData[i][1];
			
		//	if(runNoRun.equalsIgnoreCase("Y")) {
				
			automationScript = recData[i][1];
			
			Method ts = SeleniumTestQ2.class.getMethod(automationScript);
			ts.invoke(ts);
			}	

	}

}
