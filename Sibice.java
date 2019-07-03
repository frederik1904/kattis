import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] dimensions = sc.nextLine().split(" ");
        int amount = Integer.parseInt(dimensions[0]);
        int W = Integer.parseInt(dimensions[1]);
        int H = Integer.parseInt(dimensions[2]);

        int maxLength = (int) Math.sqrt(W*W+H*H);

        for (int i = 0; i < amount; i++) {
            String s = sc.nextInt() > maxLength ? "NE" : "DA";
            System.out.println(s);
        }
    }
}

