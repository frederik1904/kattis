import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] dimensions = sc.nextLine().split(" ");
        int rOne = Integer.parseInt(dimensions[0]);
        int s = Integer.parseInt(dimensions[1]);

        System.out.println(Math.round((1.0*s-(1.0*rOne/2))*2));
    }
}

