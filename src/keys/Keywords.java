package keys;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Keywords {
	static WebDriver driver;
	static FileInputStream file;
	static Properties props;
	static WebElement element;
	static Robot robot;
	
	//static WebDriverWait wait = new WebDriverWait(driver,20);
	public void openBrowser() throws Exception{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		System.out.println(System.getProperty("user.dir"));
		driver = new FirefoxDriver();
//		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		file = new FileInputStream("objectRepo.properties");
		props= new Properties();
		props.load(file);
	}
	public void navigate(String data) {
		driver.get(data);
	}
	public void intNavigation(String data) throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to(data);
	}
	public void closeWindow() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}
	public void input(String data, String objectName) throws Exception {
		Thread.sleep(1000);
		robot = new Robot();
		element=driver.findElement(By.xpath(props.getProperty(objectName)));
		System.out.println(element.isDisplayed());
		while(!element.isDisplayed()) {
			System.out.println("hello");
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);	
		}
		element.clear();
		element.sendKeys(data);
		//		element.sendKeys(Keys.TAB);

	}
	public void inputDob(String data, String objectName) throws Exception {
		Thread.sleep(1000);
		System.out.println(objectName);
		driver.findElement(By.xpath(props.getProperty(objectName))).sendKeys(data);
		driver.findElement(By.xpath(props.getProperty(objectName))).sendKeys(Keys.TAB);

	}
	public void input2(String data, String objectName) throws Exception {
		Thread.sleep(1000);
		System.out.println(objectName);
		driver.findElement(By.xpath(props.getProperty(objectName))).sendKeys(data);
		driver.findElement(By.xpath(props.getProperty(objectName))).sendKeys(Keys.TAB);

	}

	public void click(String objectName) throws Exception{
		Thread.sleep(3000);
		robot = new Robot();
		element=driver.findElement(By.xpath(props.getProperty(objectName)));
		System.out.println(element.isDisplayed());
		while(!element.isDisplayed()) {
			System.out.println("hello");
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
		element.click();

	}
	//	public void click2(String objectName) throws Exception{
	//		Thread.sleep(2000);
	//		element=driver.findElement(By.xpath(props.getProperty(objectName)));
	//		element.click();
	//		pageDown();
	//		Thread.sleep(5000);
	//		element.click();
	//		
	//	
	//	}
	public void radioButton(String objectName) throws Exception{
		Thread.sleep(2000);
		element=driver.findElement(By.xpath(props.getProperty(objectName)));
		if(!element.isSelected()) {
			element.click();
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);


		}
	}

	public void pageUp() throws Exception {
		robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}

	public void customBrowserWindow() throws Exception {
		Thread.sleep(3000);
		for(int i=0;i<3;i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
			Thread.sleep(500);
		}
	}

	public void modeDropDown(String data, String objectName) throws Exception{
		element = driver.findElement(By.xpath(props.getProperty(objectName)));
		if(data.equals("Flux C")) {
			element.click();
			System.out.println("IN Case 1");
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			for( int i =0; i<10;i++) {
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(500);
			}
			Thread.sleep(1000);
		}else if(data.equals("Flux CV")) {
			System.out.println("IN Case 2");
			element.click();
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			for( int i =0; i<11;i++) {
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(500);
			}
		}else {
			element.sendKeys(data);
		}

	}

	public void auxPortDropDown(String data, String objectName) throws Exception{
		element = driver.findElement(By.xpath(props.getProperty(objectName)));
		if(data.equals("Aux Pump 1")) {
			element.click();
			System.out.println("IN Case 1");
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		}else if(data.equals("Aux Pump 2")) {
			System.out.println("IN Case 2");
			element.click();
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
	}

	public void pumpDropDown(String data, String objectName) throws Exception{
		element = driver.findElement(By.xpath(props.getProperty(objectName)));
		if(data.equals("FS 15")) {
			element.click();
			System.out.println("IN Case 1");
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			for( int i =0; i<2;i++) {
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(500);
			}
			Thread.sleep(1000);
		}else if(data.equals("FS 500")) {
			System.out.println("IN Case 2");
			element.click();
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(500);
			for( int i =0; i<3;i++) {
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				Thread.sleep(500);
			}
		}else {
			element.sendKeys(data);
		}
	}

	public void dropDown(String data, String objectName) throws Exception{
		element = driver.findElement(By.xpath(props.getProperty(objectName)));
		Thread.sleep(200);
		element.sendKeys(data);
		Thread.sleep(200);
	}

	public void filterDropDown(String data, String objectName) throws Exception{
		element = driver.findElement(By.xpath(props.getProperty(objectName)));
		element.click();
		Thread.sleep(1000);
		element.sendKeys(data);
		Thread.sleep(1000);
		element.sendKeys(Keys.TAB);
		System.out.println("filter drop");

	}

	public String verifyPageTitle() {
		String actualValue = driver.getTitle();
		return actualValue;
	}
	public String verifyPageText(String objectName) {
		String actualValue=driver.findElement(By.xpath(props.getProperty(objectName))).getText();
		return actualValue;

	}
	public String verifyEditBoxText(String objectName) {
		String actualValue=driver.findElement(By.xpath(props.getProperty(objectName))).getAttribute("value");
		return actualValue;

	}

}
