import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int house = 1;
        while (true) {
            String widthAndLength = sc.nextLine();
            String[] line = widthAndLength.split(" ");
            int W = Integer.parseInt(line[0]);
            int L = Integer.parseInt(line[1]);
            if (W < 1) {
                break;
            }
            int x = 0;
            int y = 0;
            int dir = -1;
            String[][] layout = new String[L][W];
            for (int i = 0; i < L; i++) {
                String[] bricks = sc.nextLine().split("");
                for (int j = 0; j < W; j++) {
                    if (bricks[j].equals("*")) {
                        x = i;
                        y = j;
                        if (x < 1) {
                            dir = DOWN;
                        } else if (x == L - 1) {
                            dir = UP;
                        } else if (y < 1) {
                            dir = RIGHT;
                        } else {
                            dir = LEFT;
                        }
                    }
                    layout[i][j] = bricks[j];
                }
            }

            while (!layout[x][y].equals("x")) {
                if(!layout[x][y].equals(".")) {
                    switch (layout[x][y]) {
                        case "/":
                            if (dir == UP) dir = RIGHT;
                            else if (dir == LEFT) dir = DOWN;
                            else if (dir == RIGHT) dir = UP;
                            else dir = LEFT;
                            break;
                        case "\\":
                            if (dir == UP) dir = LEFT;
                            else if (dir == DOWN) dir = RIGHT;
                            else if (dir == LEFT) dir = UP;
                            else if (dir == RIGHT) dir = DOWN;
                            break;
                    }
                }
                if(dir == DOWN) {
                    x++;
                } else if (dir == UP){
                    x--;
                } else if(dir == LEFT) {
                    y--;
                } else {
                    y++;
                }
            }

            layout[x][y] = "&";
            result += "HOUSE " + house + "\n";
            for (int i = 0; i < L; i++){
                for (int j = 0; j < W; j++) {
                    result += layout[i][j];
                }
                result += "\n";
            }
            house++;
        }

        System.out.println(result);
    }

    private static final int DOWN = 0;
    private static final int UP = 1;
    private static final int LEFT = 2;
    private static final int RIGHT = 3;
}