

package ToolsQA.DemoMavenEclipseProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import org.openqa.selenium.By;      
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;       
import org.testng.annotations.Test; 
import org.testng.annotations.BeforeTest;   
import org.testng.annotations.AfterTest;        
	
	public class TestAAATwo {      
	        private WebDriver driver;       
	        
	        @Test              
	        public void testEasy2() {    
	            driver.get("http://www.aaa.com/stop"); 
	            driver.findElement(By.id("ZipCodeEntry")).sendKeys("92647");
	            driver.findElement(By.id("goBtn")).click();
	            driver.get("https://apps.calif.aaa.com/aceapps/authenticate/login?");
	         
	            String title = driver.getTitle();                
	            System.out.println("Class2");  
	            System.out.println(title);  
	            driver.findElement(By.id("UserName")).sendKeys("80363432");
	            driver.findElement(By.id("Password")).sendKeys("autoclub1");
	            driver.findElement(By.name("LoginSubmit")).click();
	            
	        }   
	        @BeforeTest
	        public void beforeTest() {  
	               	System.setProperty("webdriver.chrome.driver", 	 	               
	               	"C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	            driver = new ChromeDriver();
	        }       
	        @AfterTest
	        public void afterTest() {
	            driver.quit();          
	        }       
	
	}   

