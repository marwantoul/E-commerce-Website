package Option;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {

    private JSONObject userData;

    public JsonReader() {
        try {
            String content = new String(Files.readAllBytes(Paths.get("src/test/resources/TestData/Personne.json")));
            userData = new JSONObject(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getUserName() {
        return userData.getJSONObject("user").getString("first name");
    }

    public String getUserEmail() {
        return userData.getJSONObject("user").getString("email");
    }

    public String getUserPassword() {
        return userData.getJSONObject("user").getString("password");
    }

    public String getUserDay() {
        return userData.getJSONObject("user").getString("day");
    }
    public String getUserMonth() {
        return userData.getJSONObject("user").getString("month");
    }
    public String getUserYear() {
        return userData.getJSONObject("user").getString("year");
    }

    public String getUserFirstName() {
        return userData.getJSONObject("user").getString("first name");
    }

    public String getUserLastName() {
        return userData.getJSONObject("user").getString("last name");
    }

    public String getUserCompany() {
        return userData.getJSONObject("user").getString("company");
    }

    public String getUserAddress1() {
        return userData.getJSONObject("user").getString("address1");
    }

    public String getUserAddress2() {
        return userData.getJSONObject("user").getString("address2");
    }
    public String getUserCountry() {
        return userData.getJSONObject("user").getString("country");
    }

    public String getUserState() {
        return userData.getJSONObject("user").getString("state");
    }

    public String getUserCity() {
        return userData.getJSONObject("user").getString("city");
    }
    public String getUserZipCode() {
        return userData.getJSONObject("user").getString("zipcode");
    }

    public String getUserMobileNumber() {
        return userData.getJSONObject("user").getString("mobileNumber");
    }
}
