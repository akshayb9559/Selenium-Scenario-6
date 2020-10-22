package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvoiderAnnotation {

	@Test(dataProvider = "details")
	public void f(String keyword) {

		WebDriver wd;
		String url = "https://www.google.co.in";

		System.setProperty("webdriver.chrome.driver", "D:\\Certification Data\\Selenium\\Driver\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get(url);
		wd.manage().window().maximize();

		wd.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(keyword);

		System.out.println("Data is send to google:- " + keyword);

	}

	@DataProvider(name = "details")
	public Object[][] details() {
		Object[][] data=new Object[3][1];
       		data[0][0]="JAVA";
        	data[1][0]="C";
        	data[2][0]="SELENIUM";

		return data;
	}
}
