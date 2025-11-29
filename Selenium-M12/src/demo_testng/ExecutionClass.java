package demo_testng;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExecutionClass {
	@Test
public void demo1() throws IOException {
	FileLib f=new FileLib();
	String url = f.readPropertyData("url");//url
	System.out.println(url);
	String un = f.readPropertyData("un");//un
	System.out.println(un);
	String pwd = f.readPropertyData("pwd");//un
	System.out.println(pwd);
	String data1 = f.readExcelData("Sheet1",1,2);
	String data2 = f.readExcelData("Sheet2",0,3);
	System.out.println(data1);
	System.out.println(data2);
	f.writeDataIntoExcel("Sheet1",1,2,"Costly Mobile");
	f.writeDataIntoExcel("Sheet2",1,1,"Samsung S25 Ultra");
}	
}
