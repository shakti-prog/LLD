import java.util.*;

class Order {
    private String userId;
    private String orderId;
    private int payment;
    private String status;

    public Order(String userId, String orderId, int payment, String status) {
        this.userId = userId;
        this.orderId = orderId;
        this.payment = payment;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public int getPayment() {
        return payment;
    }

    public String getStatus() {
        return status;
    }

}
//
class Pair{
    int total;
    float paymentTotal;
    Pair(int total , float paymentTotal){
        this.total = total;
        this.paymentTotal = paymentTotal;
    }

}

public class Main {
    public static void main(String[] args) {
      /*  List<Order> orders = Arrays.asList(
                new Order("u_001", "o_001", 300, "completed"),
                new Order("u_002", "o_002", 500, "completed"),
                new Order("u_002", "o_003", 100, "pending"),
                new Order("u_001", "o_004", 100, "completed"),
                new Order("u_003", "o_005", 200, "pending"),
                new Order("u_004", "o_006", 100, "completed"),
                new Order("u_005", "o_007", 100, "cancelled"),
                new Order("u_001", "o_008", 100, "completed"),
                new Order("u_005", "o_009", 50, "completed")
        );
       Map<String,Pair> m1 = getUserWiseDetails(orders,"cancelled");
       for(Map.Entry<String,Pair> x :m1.entrySet()){
           System.out.println(x.getKey() + " " + x.getValue().total + " " + x.getValue().paymentTotal );
       }*/
        System.out.println(Integer.numberOfLeadingZeros());
        int n = 81;
        List<Integer> ret = new ArrayList<>();
        while(n > 0){
            ret.add(n&1);
            n = n>>1;
        }

        System.out.println(ret.size());
        System.out.println(ret);
    }

    public static Map<String,Pair> getUserWiseDetails(List<Order> orders,String status){
     Map<String,Pair> result = new HashMap<>();
     Order curr;
     Pair p;
     for(int i = 0;i<orders.size();i++){
         curr = orders.get(i);
         if(curr.getStatus().equals(status)){
             if(result.containsKey(curr.getUserId())){ // handle the reccuring ones
                 p = result.get(curr.getUserId());
                 result.put(curr.getUserId(),new Pair( p.total+1,p.paymentTotal + curr.getPayment()));
             }
             else{
                 p = new Pair(1, curr.getPayment());
                 result.put(curr.getUserId(),p); // First time if no earlier entry
             }
         }

     }
     return result;
    }

}
