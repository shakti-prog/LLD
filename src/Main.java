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
       System.out.println(calculateProbs(0,1,6,10));
    }


    private static double calculateProbs(int curr,int k,int n,int maxPts){
        if(curr >= k) {
            if(curr <= n) return 1;
            return 0;
        }
        double prob = 0;
        for(int i = 1;i<=maxPts;i++){
            prob += ((double)1/(double) maxPts) * calculateProbs(curr+i,k,n,maxPts);
        }
        return prob;
    }

}
