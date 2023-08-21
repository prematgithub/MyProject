package firstRestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class HttpResponse {

	public void method1() {
		RestAssured.get();
	}
}
