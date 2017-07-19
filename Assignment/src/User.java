import java.util.ArrayList;

/**
 * Created by ruchi on 17/07/2017.
 * This class contains user information
 */
public class User extends Person {

    private String location;
    private String loginId;

    //Users are equal if there loginId are equal.
    @Override
    public boolean equals(Object user) {
       if (this == user){
           return true;
       }
       if (user instanceof User){
           User anotherUser = (User)user;
           if (this.loginId == anotherUser.loginId){
               return true;
           }else {
               return false;
           }
       }else {
           return false;
       }
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginId() {
        return loginId;
    }
}
