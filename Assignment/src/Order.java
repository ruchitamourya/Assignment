/**
 * Created by ruchi on 18/07/2017.
 * This class contains order information
 */
public class Order {
    private String orderId;
    private String status;
    private double value;

    public void setOrderId(String orderId){
        this.orderId = orderId;
    }

    public String getOrderId(){
        return orderId;
    }

    public void setStatus(String status){
        this.status  = status;
    }

    public String getStatus(){
        return status;
    }

    public void setValue(double value){
        this.value = value;
    }

    public double getValue(){
        return value;
    }
}
