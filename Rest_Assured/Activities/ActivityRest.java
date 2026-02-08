import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class ActivityRest {
	

	    // Declare RequestSpecification object
	    private RequestSpecification requestSpec;

	    // Declare String variable for the SSH key
	    private String sshKey;

	    // Declare int variable for the generated ID
	    private int sshKeyId;

	    @BeforeClass
	    public void setup() {
	        // Initialize the SSH key string
	        sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAICjA8SEK+AjIiTR+jzLI1uJfWtq6Oty0dygolsBbB+K2 azuread\\archanap@IBM-8QY82F3";

	        // Initialize RequestSpecification
	        requestSpec = new RequestSpecBuilder()
	                .setBaseUri("https://api.github.com")
	                .addHeader("Authorization", "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")
	                .setContentType(ContentType.JSON)
	                .build();
	    }


	    @Test
	    public void postSshKey() {
	        // Example of how the variables are used within the test
	        sshKeyId = given()
	                        .spec(requestSpec)
	                        .body("{\"title\":\"TestKey\", \"key\":\"" + sshKey + "\"}")
	                   .when()
	                        .post("/user/keys")
	                   .then()
	                        .statusCode(201)
	                        .extract()
	                        .path("id"); // Assigns the generated ID to the int variable
	        
	        System.out.println("The generated SSH Key ID is: " + sshKeyId);
	    }
	    

	        // 2. GET: Retrieve all SSH keys attached to the account
	        @Test(priority = 2, dependsOnMethods = "addSshKey")
	        public void getAllSshKeys() {
	            given()
	                    .spec(requestSpec)
	                .when()
	                    .get("/user/keys")
	                .then()
	                    .statusCode(200)
	                // Verify the new key exists in the list
	                    .log().all();
	        }

	        // 3. DELETE: Remove the SSH key using the generated ID
	        @Test(priority = 3, dependsOnMethods = "addSshKey")
	        public void deleteSshKey() {
	            given()
	                    .spec(requestSpec)
	                    .pathParam("keyId", sshKeyId) // Use the stored int variable
	                .when()
	                    .delete("/user/keys/{keyId}")
	                .then()
	                    .statusCode(204);

	            System.out.println("Deleted SSH Key ID: " + sshKeyId);
	        }
	    

	        }
