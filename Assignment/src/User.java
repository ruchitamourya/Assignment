import java.util.ArrayList;

/**
 * Created by ruchi on 17/07/2017.
 */
public class User extends Person { // A subclass User extends superclass Person

    // fields of this class
    private String location;
    private String loginId;

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLocation() {
        return location;
    }

    public String getLoginId() {
        return loginId;
    }
}
