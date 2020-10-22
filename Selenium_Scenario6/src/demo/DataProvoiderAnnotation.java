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
		Object[][] data=new Object[3][1];
       		data[0][0]="JAVA";
        	data[1][0]="C";
        	data[2][0]="SELENIUM";

		return data;
	}
}
