package ToolsQA.DemoMavenEclipseProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        WebDriver driver=new ChromeDriver();
    	driver.get("http://www.yahoo.com");
    	
    		
    	
    		String appTitle = driver.getTitle();
    		System.out.println("Application title is :: "+appTitle);
    		System.out.println("Application title is 2 :: "+appTitle);
    		driver.quit();
    	
    }
}
