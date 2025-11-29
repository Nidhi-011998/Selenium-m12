package assignments;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngAssignmnet {
@Test
public void hi() 
{
	Reporter.log("hi",true);
}

@Test

public void bye()
{
	Reporter.log("bye",true);
}

@Test
public void hello()
{
	Reporter.log("hello",true);
	}
}
