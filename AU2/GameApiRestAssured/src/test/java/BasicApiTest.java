import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class BasicApiTest  {

    @Test
    public void gameGetId() {
        RestAssured.given()
                .when()
                .get("https://api.rawg.io/api/games/31?key=3459280c793d4d98a43a473699f88354")
                // Then
                .then()
                .statusCode(200) // 200 Assertions
                .body("$", hasKey("id")) // Field verification fpr id name re;eased and tba
                .body("$", hasKey("name"))
                .body("$", hasKey("released"))
                .body("$", hasKey("tba"))
                .body("id", notNullValue())
                .body("name", notNullValue())
        ;
    }
}
