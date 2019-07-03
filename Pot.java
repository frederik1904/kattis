import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amount = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for(int i = 0; i < amount; i++) {
            String temp = sc.nextLine();
            int power = Integer.parseInt(temp.split("")[temp.split("").length - 1]);
            sum += Math.pow(Integer.parseInt(temp.substring(0, temp.length() - 1)), power);
        }

        System.out.println(sum);
    }
}