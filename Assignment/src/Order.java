/**
 * Created by ruchi on 18/07/2017.
 */
public class Order {
    private String orderId;
    private String status;
    private String value;

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

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
