import java.util.ArrayList;
import java.util.Scanner;

public class Beekeeper {
    private static ArrayList<String> vowels = new ArrayList<>();
    public static void main(String[] args) {
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        vowels.add("y");

        Scanner sc = new Scanner(System.in);
        int current;
        while (sc.hasNext()) {
            current = Integer.parseInt(sc.nextLine());
            if (current != 0) {
                printResult(current, sc);
            }
        }
    }

    private static void printResult(int current, Scanner sc) {
        int bestPoints = -1;
        String word = null;
        for (int k = 0; k < current; k++) {
            String temp = sc.nextLine();
            String[] tempArray = temp.split("");
            int points = 0;
            for (int i = 0; i < tempArray.length - 1; i++) {
                if(vowels.contains(tempArray[i]) && tempArray[i].equals(tempArray[i+1])) points++;
            }
            if(bestPoints < points) {
                bestPoints = points;
                word = temp;
            }
        }
        System.out.println(word);
    }
}