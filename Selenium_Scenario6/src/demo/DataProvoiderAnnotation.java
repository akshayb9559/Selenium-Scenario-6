package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvoiderAnnotation {

	@Test(dataProvider = "details")
	public void f(Integer id, String firstName, String lastName) {

		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);

	}

	@DataProvider(name = "details")
	public Object[][] details() {
		Object[][] data = new Object[2][3];

		data[0][0] = 1;
		data[0][1] = "Akshay";
		data[0][2] = "Bramhane";

		data[1][0] = 2;
		data[1][1] = "Mehul";
		data[1][2] = "Wankhede";

		return data;
	}
}