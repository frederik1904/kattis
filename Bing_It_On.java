import java.util.Scanner;

public class Bing_It_On {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Holder start = new Holder();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            search(sc.nextLine(), start);
        }
        System.out.println(sb.toString());
    }

    public static void search(String wordLeft, Holder holder) {
        int index = wordLeft.charAt(0) - 'a';
        if (holder.holderArray[index] == null) {
            holder.holderArray[index] = new Holder();
        }
        Holder h = holder.holderArray[index];
        if (wordLeft.length() == 1) {
            sb.append(h.count).append("\n");
        }
        h.increment();
        if (wordLeft.length() > 1) {
            search(wordLeft.substring(1, wordLeft.length()), h);
        }
    }

    public static class Holder {
        public Holder[] holderArray = new Holder[26];
        public int count = 0;

        public void increment() {
            count++;
        }
    }
}