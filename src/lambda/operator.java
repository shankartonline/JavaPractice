package lambda;

public class operator {
    public static void main(String[] args) {
        solve(10.25,17,5);
    }

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double temp1 = (meal_cost/100)*tip_percent;
        //System.out.println(temp1);
        double temp2 = (meal_cost/100)*tax_percent;
        //System.out.println(temp2);
        double total = meal_cost + temp1 + temp2;
        //System.out.println(total);
        System.out.println(Math.round(total));

    }
}
