/**
 * Created by ruchi on 17/07/2017.
 */
public abstract class Person {
    // four states of this class
    private String name;
    private String address;
    private String emailId;
    private int mobNo;


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setMobNo(int mobNo) {
        this.mobNo = mobNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailId() {
        return emailId;
    }

    public int getMobNo() {
        return mobNo;
    }
}
