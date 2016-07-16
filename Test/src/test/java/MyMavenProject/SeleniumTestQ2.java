package MyMavenProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTestQ2 extends ReusableMethods {

	public static void LaunchTheAmazonApplication() throws IOException, InterruptedException {
		
		WebDriver driver;
		
		Thread.sleep(3000);

		startReport("Amazon Test Case", "C:/Users/pramu/Desktop/Report/Report"); 
		
		driver = new FirefoxDriver(); // Launch firefox driver
		driver.get("http://www.amazon.com/");  //Launch Amazon application
		
		Update_Report("Pass", "Launch Amazon application", "Amazon application is launched"); }
		
	//	Test ID 002
	
	public static void TestID002() throws IOException, InterruptedException {	
	{	
		WebDriver driver;
		driver = new FirefoxDriver(); // Launch firefox driver
	
		WebElement searchTextbox = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		enterText(searchTextbox, "Iphone", "Search Text box");
		{	
		WebElement firstDropDown = driver.findElement(By.xpath(".//*[@id='issDiv0']")); 
		if(firstDropDown.isDisplayed()){
   			
			System.out.println("'Iphone  6s  case in All Departments' Is Displayed in 1st Drop Down Search Engine");
		}else{
			System.out.println("'Iphone  6s  case in All Departments' Is Not Displayed in 1st Drop Down Search Engine"); }
		
		{	Update_Report("Pass", "search box", "'Iphone  6s  case in All Departments' Is Displayed in 1st Drop Down Search Engine");
		
		WebElement secondDropDown = driver.findElement(By.xpath(".//*[@id='issDiv0']"));
		if(secondDropDown.isDisplayed()){
   			
			System.out.println("'Iphone  6s  case in Electronics' Is Displayed in 2nd Drop Down Search Engine");
		}else{
			System.out.println("'Iphone  6s  case in Electronics' Is Not Displayed in 2nd Drop Down Search Engine"); }
		
		Update_Report("Pass", "search box", "'Iphone  6s  case in Electronics' Is Displayed in 2nd Drop Down Search Engine");
		
		WebElement thirdDropDown = driver.findElement(By.xpath(".//*[@id='issDiv2']"));
		if(thirdDropDown.isDisplayed()){
   			
			System.out.println("'Iphone  6s  case in Cell Phones And Accessories' Is Displayed in 3rd Drop Down Search Engine");
		}else{
			System.out.println("'Iphone  6s  case in Cell Phones And Accessories' Is Not Displayed in 3rd Drop Down Search Engine"); }
		
		Update_Report("Pass", "search box", "'Iphone  6s  case in Cell Phones And Accessories' Is Displayed in 3rd Drop Down Search Engine");
		}
		}
	}
	}
		// Test ID 003
	
        public static void TestID003() throws IOException, InterruptedException {
		boolean flag=false;
		WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
		enterText(searchTextBox, "Iphone", "Search Text box");
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		actions.moveToElement(mainMenu).perform();
		flag=true;
		if(flag){
			System.out.println("Pass");
		}else{
			System.out.println("Fail"); 
			
		}
	   
      Update_Report("Pass", "hover over", "Cursor changes to Pointer  and the Buton color changes to Darker Shade");
      
	   WebElement searchBox = driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		searchBox.click();
        
		WebElement validateTextMessage = driver.findElement(By.xpath(".//*[@id='s-result-count']/span"));	
		if(validateTextMessage.isDisplayed()){
			
			Thread.sleep(3000);
   			
			System.out.println("'results for iphone' page Is Displayed");
			
		}else{
			System.out.println("'results for iphone' page Is not Displayed"); }
		
		Update_Report("Pass", "search box", "'results for iphone' page is displayed");  
}

//		Test ID 004
		
		public static void TestID004() throws IOException, InterruptedException  {
			{
		}
			
			{	WebDriver driver;
			
			Thread.sleep(3000);

			startReport("Amazon Test Case", "C:/Users/pramu/Desktop/Report/Report"); 
			
			driver = new FirefoxDriver(); // Launch firefox driver
			
		driver.get("http://www.amazon.com/s/ref=nb_sb_noss_2?url=search-alias%3Daps&field-keywords=iphone");
		
		Update_Report("Pass", "Launch Amazon application", "Amazon application is launched");
		
		Thread.sleep(5000);
		boolean flag=false;
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[4]"));
		actions.moveToElement(mainMenu).perform();
		flag=true;
		if(flag){
			System.out.println("Pass");
		}else{
			System.out.println("Fail"); 	
			
			Update_Report("Pass", "hover over", "'Cell Phone Accessories' option is Displayed");
			
			Thread.sleep(3000);
			
			bw.close();
		
			Actions actions2 = new Actions(driver);
			driver.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[5]/a/span[1]"));
			actions2.moveToElement(mainMenu).perform();
			flag=true;
			if(flag){
				System.out.println("Pass");
			}else{
				System.out.println("Fail"); 	
				
				Update_Report("Pass", "hover over", "'Cell Phone Cases' option is Displayed"); 
			}
		}
		}			
				
		//Test ID 005
		
		          public static void TestID005() throws IOException, InterruptedException               {
		
					WebDriver driver2;
					
					Thread.sleep(3000);

					startReport("Amazon Test Case", "C:/Users/pramu/Desktop/Report/Report"); 
					
					driver2 = new FirefoxDriver(); // Launch firefox driver
					
				driver2.get("https://www.amazon.com/s/ref=sr_hi_2?rh=n%3A172282%2Cn%3A541966%2Ck%3Acomputer&keywords=computer&ie=UTF8&qid=1468655897");
				
				Update_Report("Pass", "Launch Amazon application", "Amazon application is launched");
				
				
				WebElement seeMore = driver2.findElement(By.xpath(".//*[@id='seeAllDepartmentClosed1']/li/span/a"));
				seeMore.click();
				
				Thread.sleep(5000);
				boolean flagg=false;
				Actions action = new Actions(driver2);
				WebElement mainMenuu = driver2.findElement(By.xpath(".//*[@id='refinements']/div[2]/ul[1]/li[4]"));
				flagg=true;
				if(flagg){
					System.out.println("Pass");
				}else{
					System.out.println("Fail"); 	
					
					Update_Report("Pass", "hover over", "'Cell Phone Accessories' option is Displayed");
				}
		          }
				
		// Test ID 006
					
			public static void TestID008() throws IOException, InterruptedException {
				
				WebDriver driver;
				
				Thread.sleep(3000);

				startReport("Amazon Test Case", "C:/Users/pramu/Desktop/Report/Report"); 
				
				driver = new FirefoxDriver(); // Launch firefox driver
				driver.get("http://www.amazon.com/");  //Launch Amazon application
				
				Update_Report("Pass", "Launch Amazon application", "Amazon application is launched"); 
				
				boolean flag=false;
				Actions actions = new Actions(driver);
				WebElement mainMenu = driver.findElement(By.xpath(".//*[@id='nav-link-shopall']"));
				actions.moveToElement(mainMenu).perform();
				flag=true;
				if(flag){
					System.out.println("Pass");
				}else{
					System.out.println("Fail"); 	
					
					Update_Report("Pass", "hover over", "'Shop by Department' dropdown is available");
				
				bw.close();
			   
				


				}				
			
}		
			
			
		
}

		


		
		
			
		


		
		

	

	
		


	
		



