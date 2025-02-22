package test.java.restAssured;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test04_PATCH {

    @Test
    public void test4() {

        JSONObject request = new JSONObject();
        request.put("name", "Sahil");
        request.put("job", "BAA");

        System.out.println(request);
        System.out.println(request.toString());

        given().
                body(request.toJSONString()).
                when().
                patch("https://reqres.in/api/users").
                then().statusCode(200);

    }
}
