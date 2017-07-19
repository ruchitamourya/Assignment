/**
 * Created by ruchi on 17/07/2017.
 * Person is the super class for employee and user as it holds common properties.
 */
public abstract class Person {
    private String name;
    private String address;
    private String emailId;
    private int mobNo;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setMobNo(int mobNo) {
        this.mobNo = mobNo;
    }

    public int getMobNo() {
        return mobNo;
    }
}
