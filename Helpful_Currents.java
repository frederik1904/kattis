import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mod = 1000003;
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt(),x = sc.nextInt(), start = sc.nextInt();
        sc.nextLine();
        boolean[] boolArr = new boolean[x];
        long[] arr = new long[x];
        char[][] lines = new char[y][x];

        for (int i = 0; i < y; i++) {
            String tmp = sc.nextLine();
            char[] tmpArr = tmp.toCharArray();
            for (int j = 0; j < x; j++) {
                lines[i][j] = tmpArr[j];
            }
        }

        for (int i = 0; i < x; i++) {
            arr[i] = 0;
            boolArr[i] = false;
        }
        arr[start] = 1;
        boolArr[start] = true;

        for (int i = y - 1; i >= 0; i--) {
            for (int j = 0; j < x - 1; j++) {
                if (lines[i][j] == '>') {
                    arr[j + 1] = (arr[j] + arr[j+1]) % mod;
                    boolArr[j + 1] = boolArr[j] || boolArr[j + 1];
                }
            }

            for (int j = x - 1; j > 0; j--) {
                if (lines[i][j] == '<') {
                    arr[j -1] = (arr[j] + arr[j-1]) % mod;
                    boolArr[j - 1] = boolArr[j] || boolArr[j - 1];
                }
            }

            for (int j = 0; j < x; j++) {
                if (lines[i][j] == '#') {
                    arr[j] = 0;
                    boolArr[j] = false;
                }
                if (lines[i][j] == '@') {
                    if (!boolArr[j]) {
                        System.out.println("begin repairs");
                        return;
                    }

                    System.out.println(arr[j]);
                }
            }
        }
    }
}