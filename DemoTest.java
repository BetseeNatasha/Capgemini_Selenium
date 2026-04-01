package practice;


import java.lang.reflect.Method;
import org.testng.annotations.Test;
import generic_utility.DemoBaseClass;

public class DemoTest extends DemoBaseClass {

@Test(priority = 1)
public void logIn(Method m1) {
	System.out.println("Executing login "+m1);
}

@Test(dependsOnMethods = "logIn")
public void addEmployee(Method m2) {
	System.out.println("Executing add employee "+m2);
}

@Test(dependsOnMethods = "logIn")
public void logOut(Method m3) {
	System.out.println("Executing  logout "+m3);
}
}