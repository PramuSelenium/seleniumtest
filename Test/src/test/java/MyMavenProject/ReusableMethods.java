package MyMavenProject;

	import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

	import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


	public class ReusableMethods{
		//	static WebDriver driver;
		static BufferedWriter bw = null;
		static BufferedWriter bw1 = null;
		static String htmlname;
		static String objType;
		static String objName;
		static String TestData;
		static String rootPath;
		static int report;

		static Date cur_dt = null;
		static String filenamer;
		static String TestReport;
		int rowcnt;
		static String exeStatus = "True";
		static int iflag = 0;
		static int j = 1;

		static String fireFoxBrowser;
		static String chromeBrowser;

		static String result;

		static int intRowCount = 0;
		static String dataTablePath;
		static int i;
		static String browserName;
		
		/* Name of the Method: enterText
		 * Brief description: Enter text value to text boxes 
		 * Arguments: obj --> webelement Object, textVal --> text to be entered, objName --> Object Name
		 * Created By: TechPirates 
		 * Creation Date: June 29 2016
		 * Last Modified: June 29 2016
		 * */
		public static void enterText(WebElement obj, String textVal, String objName) throws IOException{
				
			if(obj.isDisplayed()){
				obj.sendKeys(textVal);
				Update_Report("Pass", "enterText", textVal+ "  is entered in " + objName + " field");
			}else{
				Update_Report("Fail", "enterText", objName + " field is not displayed please check your application ");
			}
			
		}
		
		/* Name of the Method: clickElement	
		 * Brief description: Click on a web element
		 * Arguments: obj --> webelement Object, objName --> Object Name
		 * Created By: TechPirates 
		 * Creation Date: June 29 2016
		 * Last Modified: June 29 2016
		 * */
		
		public static void clickElement(WebElement obj, String objName) throws IOException  {
			
			if(obj.isDisplayed()){
				obj.click();
				Update_Report("Pass", "clickElement", objName + " is clicked");
			}else{
				Update_Report("Fail", "clickElement", objName + " is not displayed please check your application ");
			}
			
		}
		
		/* Name of the Method: validateTextMessage
		 * Brief description: Validate Text Message
		 * Arguments: obj --> webelement Object, expectedTextMsg --> Expected Text Message
		 * Created By: TechPirates 
		 * Creation Date: June 29 2016
		 * Last Modified: June 29 2016
		 * */
		
	       public static void validateTextMessage(WebElement obj, String expectedTextMessage, String objName) throws IOException{
			
			if(obj.isDisplayed()){
				String actualTextMessage = obj.getText().trim();
			if(actualTextMessage.equals(expectedTextMessage) ){	
				Update_Report("Pass", "validateTextMessage", " Expected message matched with actual message '" + expectedTextMessage +"'");
			}else{
				Update_Report("Fail", "validateTextMessage", objName + " is not displayed please check your application ");
			}
			}
			
	       }
	        
	       /* Name of the Method: selectCheckBox
	   	 * Brief description: Select Check Box
	   	 * Arguments: obj --> webelement Object, expectedTextMsg --> Expected Text Message
	   	 * Created By: TechPirates 
	   	 * Creation Date: June 29 2016
	   	 * Last Modified: June 29 2016
	   	 * */
	       
	       public static void selectCheckBox(WebElement obj, String objName) throws IOException  {
	   		
	   		if(obj.isDisplayed()){
	   			if(obj.isSelected()){
	   			obj.click();
	   			Update_Report("Pass", "selectCheckBox", objName + " checkbox is checked");
	   		}else{
	   			Update_Report("Pass", "selectCheckBox", objName + " checkbox is already selected"); 
	   		}
	   		}else{
	   				Update_Report("Fail", "selectCheckBox", objName + " checkbox is not Displayed, please check your application");
	   			}
	       }

	       /* Name of the Method: deSelectCheckBox
	      	 * Brief description: deSelect a Check Box
	      	 * Arguments: 
	      	 * Created By: TechPirates 
	      	 * Creation Date: June 29 2016
	      	 * Last Modified: June 29 2016
	      	 * */
	          
	          public static void deSelectCheckBox(WebElement obj, String objName) throws IOException  {
	      		
	      		if(obj.isDisplayed()){
	      			if(obj.isSelected()){
	      			obj.click();
	      			Update_Report("Pass", "deSelectCheckBox", objName + " checkbox is deselected");
	      		}else{
	      			Update_Report("Pass", "deSelectCheckBox", objName + " checkbox is already deselected"); 
	      		}
	      		}else{
	      			Update_Report("Fail", "deSelectCheckBox", objName + " is not Displayed, please check your application");
	      			}
	          }

	       
	       
	     @Test
		public void test() throws Exception {

			startReport("Decending order sort","C:/Users/pramu/Desktop/Report/Report/");

			Update_Report( "Pass", "Decending order sort",  "Decending order sort executing is complete.");
			Update_Report( "Fail", "Decending order sort",  "Decending order sort executing is complete.");
			
			bw.close();  }

	     	public static void startReport(String scriptName, String ReportsPath) throws IOException{

			String strResultPath = null;

			String testScriptName =scriptName;

			cur_dt = new Date(); 
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			String strTimeStamp = dateFormat.format(cur_dt);

			if (ReportsPath == "") { 

				ReportsPath = "C:\\";
			}

			if (ReportsPath.endsWith("\\")) { 
				ReportsPath = ReportsPath + "\\";
			}

			strResultPath = ReportsPath + "Log" + "/" +testScriptName +"/"; 
			File f = new File(strResultPath);
			f.mkdirs();
			htmlname = strResultPath  + testScriptName + "_" + strTimeStamp 
					+ ".html";

			bw = new BufferedWriter(new FileWriter(htmlname));

			bw.write("<HTML><BODY><TABLE BORDER=0 CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
			bw.write("<TABLE BORDER=0 BGCOLOR=BLACK CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
			bw.write("<TR><TD BGCOLOR=#66699 WIDTH=27%><FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>Browser Name</B></FONT></TD><TD COLSPAN=6 BGCOLOR=#66699><FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>"
					+ "FireFox " + "</B></FONT></TD></TR>");
			bw.write("<HTML><BODY><TABLE BORDER=1 CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
			bw.write("<TR COLS=7><TD BGCOLOR=#BDBDBD WIDTH=3%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>SL No</B></FONT></TD>"
					+ "<TD BGCOLOR=#BDBDBD   WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Step Description</B></FONT></TD>"
					+ "<TD BGCOLOR=#BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Execution Time</B></FONT></TD> "
					+ "<TD BGCOLOR=#BDBDBD WIDTH=10%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Status</B></FONT></TD>"
					+ "<TD BGCOLOR=#BDBDBD WIDTH=47%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Detail Report</B></FONT></TD></TR>");

		}

		public static void Update_Report(String Res_type,String Action, String result) throws IOException {
			String str_time;
			Date exec_time = new Date();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			str_time = dateFormat.format(exec_time);
			if (Res_type.startsWith("Pass")) {
				bw.write("<TR COLS=7><TD BGCOLOR=#EEEEEE WIDTH=3%><FONT FACE=VERDANA SIZE=2>"
						+ (j++)
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
						+Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2 COLOR = GREEN>"
						+ "Passed"
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = GREEN>"
						+ result + "</FONT></TD></TR>");

			} else if (Res_type.startsWith("Fail")) {
				exeStatus = "Failed";
				report = 1;
				bw.write("<TR COLS=7><TD BGCOLOR=#EEEEEE WIDTH=3%><FONT FACE=VERDANA SIZE=2>"
						+ (j++)
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
						+Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=10%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "<a href= "
						+ htmlname
						+ "  style=\"color: #FF0000\"> Failed </a>"

					+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
					+ result + "</FONT></TD></TR>");
			}
		}
				
				public static String[][] readExcel(String dtTablePath, String sheetName) throws IOException  {
				
				File xlFile = new File(dtTablePath);
				
				FileInputStream xlDoc = new FileInputStream(xlFile);
				
				HSSFWorkbook wb = new HSSFWorkbook(xlDoc);
				
				HSSFSheet sheet = wb.getSheet(sheetName);
				
				int iRowCount = sheet.getPhysicalNumberOfRows();
				int iColCount = sheet.getRow(0).getLastCellNum();
				
				String[][] xlData = new String[iRowCount][iColCount];
				
				for(int i=0; i<iRowCount; i++){
					for(int j=0; j<iColCount; j++){
						xlData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
					}
					}
				
				return xlData;
				
			} 
		}





