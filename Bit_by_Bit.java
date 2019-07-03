import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bit_by_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current;
        while (sc.hasNext()) {
            current = Integer.parseInt(sc.nextLine());
            if (current != 0) {
                printResult(current, sc);
            }
        }
    }

    private static void printResult(int tries, Scanner sc) {
        ArrayList<String> temp = new ArrayList<>();
        for(int i = 0; i < 32; i++) {
            temp.add("?");
        }

        for (int i = tries; i > 0; i--) {
            String[] instruction = sc.nextLine().split(" ");
            int index1 = Integer.parseInt(instruction[1]);
            int index2;
            switch (instruction[0]) {
                case "CLEAR":
                    temp.set(index1, "0");
                    break;
                case "SET":
                    temp.set(index1, "1");
                    break;
                case "OR":
                    index2 = Integer.parseInt(instruction[2]);
                    String one = temp.get(index1);
                    String two = temp.get(index2);
                    if (one.equals("1") || two.equals("1")) {
                        temp.set(index1, "1");
                    } else if (one.equals("?") || two.equals("?")) {
                        temp.set(index1, "?");
                    } else {
                        temp.set(index1, "0");
                    }
                    break;
                case "AND":
                    index2 = Integer.parseInt(instruction[2]);
                    String three = temp.get(index1);
                    String four = temp.get(index2);
                    if(three.equals("1") && four.equals("1")) {
                        temp.set(index1, "1");
                    } else if (three.equals("?") && four.equals("1") || four.equals("?") && three.equals("1") || four.equals("?") && three.equals("?")) {
                    temp.set(index1, "?");
                } else {
                    temp.set(index1, "0");
                }
                break;
            }
        }
        for (int i = 31; i >= 0; i--) {
            System.out.print(temp.get(i));
        }
        System.out.println();
    }
}