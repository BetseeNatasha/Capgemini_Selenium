package demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class LoginUsingJSON_OR {
@Test
public void login() throws IOException {
	String data= new String(Files.readAllBytes(Paths.get("./src/main/resources/ObjectRepository/LoginPage.json")));
	JSONObject json=new JSONObject();
}
}