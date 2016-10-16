
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTesting 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver w= new FirefoxDriver();
	        
                w.get("https://www.google.com"); //opens google webpage
	
		w.findElement(By.id("gb_70)).click(); //click on sign-in icon
                
                w.findElement(By.id("Email)).sendkeys("nitya.kf512@gmail.com"); //email id is entered 
            
                w.findElement(By.id("next")).click(); // next icon is clicked after entering email id
			        
		w.findElement(By.id("Passwd")).sendkeys("xyz1234"); //Password is entered for the email id provided
	        
		w.findElement(By.id("signIn")).click(); //signing in after entering password
	}
}
	    
	    
	    
