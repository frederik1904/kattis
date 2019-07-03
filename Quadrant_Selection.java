import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = x < 0 ? (y < 0 ? 3 : 2) : (y < 0 ? 4 : 1);

        System.out.println(result);
    }
}