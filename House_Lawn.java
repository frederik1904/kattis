import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cm2 = sc.nextInt(), n = sc.nextInt();
        sc.nextLine();

        double cm2PrMinute = (double) cm2 / 10080;

        int bestPrice = Integer.MAX_VALUE;
        ArrayList<String> mowers = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String[] temp = sc.nextLine().split(",");
            int price = Integer.parseInt(temp[1]), cm2PrMin = Integer.parseInt(temp[2]), minPrCharge = Integer.parseInt(temp[3]), chargeTime = Integer.parseInt(temp[4]);



            if((1.0d * cm2PrMin * minPrCharge) / (minPrCharge + chargeTime) >= cm2PrMinute) {
                if(price < bestPrice) {
                    mowers.clear();
                    mowers.add(temp[0]);
                    bestPrice = price;
                } else if (price == bestPrice) {
                    mowers.add(temp[0]);
                }
            }
        }
        if (mowers.size() > 0) {
            mowers.forEach(System.out::println);
        } else {
            System.out.println("no such mower");
        }
    }
}