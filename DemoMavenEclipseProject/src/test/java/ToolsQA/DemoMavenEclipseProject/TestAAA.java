package ToolsQA.DemoMavenEclipseProject;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.HashMap;

import org.openqa.selenium.By;      
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;       
import org.testng.annotations.Test; 
import org.testng.annotations.BeforeTest;   
import org.testng.annotations.AfterTest;        
	
	public class TestAAA {      
	        private WebDriver driver;       
	      
	        @Test              
	        public void testEasy() {    
	            driver.get("http://www.guru99.com/selenium-tutorial.html");  
	            String title = driver.getTitle();                
	            Assert.assertTrue(title.contains("Free Selenium Tutorials"));   
	            System.out.println("Class1");
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


