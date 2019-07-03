import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] cords = sc.nextLine().split(" ");
            int fromX = Integer.parseInt(cords[1]);
            String fromY = cords[0];
            int toX = Integer.parseInt(cords[3]);
            String toY = cords[2];
            if ((toY + " " + toX).equals(fromY + " " + fromX)) {
                System.out.println("0 " + fromY + " " + fromX);
            } else {
                boolean done = false;
                switch (whiteOrBlack(fromY, fromX)) {
                    case "W":
                        if (whiteOrBlack(toY, toX).equals("B")) {
                            System.out.println("Impossible");
                            done = true;
                        }
                        break;
                    case "B":
                        if (whiteOrBlack(toY, toX).equals("W")) {
                            System.out.println("Impossible");
                            done = true;
                        }
                        break;
                }
                if (!done) {
                    Set<String> placesToHit = new HashSet<>(canHit(fromY, fromX));
                    Set<String> placesToHit2 = new HashSet<>(canHit(toY, toX));
                    if (!placesToHit.contains(toY + " " + toX)) {
                        System.out.print("2 " + fromY + " " + fromX);
                        for (String s : placesToHit2) {
                            if (!placesToHit.add(s)) {
                                System.out.print(" " + s);
                                break;
                            }
                        }
                    } else {
                        System.out.print("1 " + fromY + " " + fromX);
                    }
                    System.out.println(" " + toY + " " + toX);
                }
            }
        }
    }

    private static String whiteOrBlack(String yPos, int xPos) {
        if (yPos.equals("A") || yPos.equals("C") || yPos.equals("E") || yPos.equals("G")) {
            if (xPos % 2 == 0) {
                return "W";
            } else {
                return "B";
            }
        } else {
            if(xPos % 2 == 0) {
                return "B";
            } else {
                return "W";
            }
        }
    }

    private static ArrayList<String> canHit(String yPos, int xPos) {
        ArrayList<String> placesToHit = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            int newX = xPos + i;
            if(newX > 0 && newX < 9) {
                char newY = (char) (yPos.toCharArray()[0] + i);
                if(newY >= 'A' && newY < 'I') {
                    placesToHit.add(newY + " " + newX);
                }
            }
            newX = xPos - i;
            if(newX > 0 && newX < 9) {
                char newY = (char) (yPos.toCharArray()[0] - i);
                if(newY >= 'A' && newY < 'I') {
                    placesToHit.add(newY+ " " + newX);
                }
            }

            newX = xPos - i;
            if(newX > 0 && newX < 9) {
                char newY = (char) (yPos.toCharArray()[0] + i);
                if(newY >= 'A' && newY < 'I') {
                    placesToHit.add(newY+ " " + newX);
                }
            }
            newX = xPos + i;
            if(newX > 0 && newX < 9) {
                char newY = (char) (yPos.toCharArray()[0] - i);
                if(newY >= 'A' && newY < 'I') {
                    placesToHit.add(newY+ " " + newX);
                }
            }
        }
        return placesToHit;
    }
}

