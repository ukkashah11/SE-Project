package SE_Project;
import java.util.*;
public class Seats extends Theater {
    private int randrow, randcol, numRows, numSeatsPerRow;
    private char[][] seats = new char[numRows][numSeatsPerRow];
    public void setSeats() {
        switch(getTheaterType()){
            case "Standard":
                numRows=9;
                numSeatsPerRow = 20;
                break;
            case "Premium":
                numRows=10;
                numSeatsPerRow = 10;
                break;
            case "VIP":
                numRows=5;
                numSeatsPerRow = 12;
                break;
            default:
                System.out.println("null");
        }
    }
    public void showSeats(int rating){
            if (getTheaterType() == "Standard" && rating > 0 && rating <= 3) {
                Random random = new Random();
                for (int i = 0; i <= 50; i++) {
                    randrow = random.nextInt(numRows);
                    randcol = random.nextInt(numSeatsPerRow);
                    if (seats[randrow][randcol] == '\0') {
                        seats[randrow][randcol] = 'X';
                    }
                }
                System.out.print("  ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    System.out.print("       ");
                }
                System.out.println();
                System.out.print("   ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    if (i / 10 == 0) {
                        System.out.print(" " + i + "   ");
                    } else {
                        System.out.print(i + "   ");
                    }
                }
                System.out.println();
                System.out.print("  ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    System.out.print("-------");
                }
                System.out.println();
                for (int row = 0; row < numRows; row++) {
                    System.out.print((row + 1) + " ");
                    for (int seat = 0; seat < numSeatsPerRow; seat++) {
                        if (seats [row][seat] == 'X') {

                            System.out.print("[ "+seats[row][seat]+" ]");
                        } else {
                            System.out.print("[   ]");
                        }
                    }
                    System.out.println();
                }
            }
            if (getTheaterType() == "Standard" && rating > 3 && rating <= 5) {
                Random random = new Random();
                for (int i = 0; i <= 100; i++) {
                    randrow = random.nextInt(numRows);
                    randcol = random.nextInt(numSeatsPerRow);
                    if (seats[randrow][randcol]=='\0')
                    {
                        seats[randrow][randcol] = 'X';
                    }
                }
                System.out.print("  ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    System.out.print("       ");
                }
                System.out.println();
                System.out.print("   ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    if (i / 10 == 0) {
                        System.out.print(" " + i + "   ");
                    } else {
                        System.out.print(i + "   ");
                    }
                }
                System.out.println();
                System.out.print("  ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    System.out.print("-------");
                }
                System.out.println();
                for (int row = 0; row < numRows; row++) {
                    System.out.print((row + 1) + " ");
                    for (int seat = 0; seat < numSeatsPerRow; seat++) {
                        if (seats[row][seat] != '\0') {
                            System.out.print("[ "+seats[row][seat]+" ]");
                        } else {
                            System.out.print("[   ]");
                        }
                    }
                    System.out.println();
                }
            }
            if (getTheaterType() == "Premium" && rating > 0 && rating <= 3) {
                Random random = new Random();
                for (int i = 0; i <= 30; i++) {
                    randrow = random.nextInt(numRows);
                    randcol = random.nextInt(numSeatsPerRow);
                    if (seats[randrow][randcol] == '\0') {
                        seats[randrow][randcol] = 'X';
                    }
                }
                System.out.print("  ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    System.out.print("       ");
                }
                System.out.println();
                System.out.print("   ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    if (i / 10 == 0) {
                        System.out.print(" " + i + "   ");
                    } else {
                        System.out.print(i + "   ");
                    }
                }
                System.out.println();
                System.out.print("  ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    System.out.print("-------");
                }
                System.out.println();
                for (int row = 0; row < numRows; row++) {
                    System.out.print((row + 1) + " ");
                    for (int seat = 0; seat < numSeatsPerRow; seat++) {
                        if (seats[row][seat] == '\0' ) {
                            System.out.print("[ "+seats[row][seat]+" ]");
                        } else {
                            System.out.print("[   ]");
                        }
                    }
                    System.out.println();
                }
            }
            if (getTheaterType() == "Premium" && rating > 3 && rating <= 5) {
                Random random = new Random();
                for (int i = 0; i <= 50; i++) {
                    randrow = random.nextInt(numRows);
                    randcol = random.nextInt(numSeatsPerRow);
                    if (seats[randrow][randcol] == '\0') {
                        seats[randrow][randcol] = 'X';
                    }
                }
                System.out.print("  ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    System.out.print("       ");
                }
                System.out.println();
                System.out.print("   ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    if (i / 10 == 0) {
                        System.out.print(" " + i + "   ");
                    } else {
                        System.out.print(i + "   ");
                    }
                }
                System.out.println();
                System.out.print("  ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    System.out.print("-------");
                }
                System.out.println();
                for (int row = 0; row < numRows; row++) {
                    System.out.print((row + 1) + " ");
                    for (int seat = 0; seat < numSeatsPerRow; seat++) {
                        if (seats[row][seat] != '\0') {
                            System.out.print("[ "+seats[row][seat]+" ]");
                        } else {
                            System.out.print("[   ]");
                        }
                    }
                    System.out.println();
                }
            }
            if (getTheaterType() == "VIP" && rating > 0 && rating <= 3) {
                Random random = new Random();
                for (int i = 0; i <= 20; i++) {
                    randrow = random.nextInt(numRows);
                    randcol = random.nextInt(numSeatsPerRow);
                    if (seats[randrow][randcol] == '\0') {
                        seats[randrow][randcol] = 'X';
                    }
                }
                System.out.print("  ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    System.out.print("       ");
                }
                System.out.println();
                System.out.print("   ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    if (i / 10 == 0) {
                        System.out.print(" " + i + "   ");
                    } else {
                        System.out.print(i + "   ");
                    }
                }
                System.out.println();
                System.out.print("  ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    System.out.print("-------");
                }
                System.out.println();
                for (int row = 0; row < numRows; row++) {
                    System.out.print((row + 1) + " ");
                    for (int seat = 0; seat < numSeatsPerRow; seat++) {
                        if (seats[row][seat] != '\0') {
                            System.out.print("[ "+seats[row][seat]+" ]");
                        } else {
                            System.out.print("[   ]");
                        }
                    }
                    System.out.println();
                }
            }
            if (getTheaterType() == "VIP" && rating > 3 && rating <= 5) {
                Random random = new Random();
                for (int i = 0; i <= 50; i++) {
                    randrow = random.nextInt(getNumRows());
                    randcol = random.nextInt(getNumSeatsPerRow());
                    if (seats[randrow][randcol] == '\0') {
                        seats[randrow][randcol] = 'X';
                    }
                }
                System.out.print("  ");
                for (int i = 1; i <=numSeatsPerRow; i++) {
                    System.out.print("       ");
                }
                System.out.println();
                System.out.print("   ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    if (i / 10 == 0) {
                        System.out.print(" " + i + "   ");
                    } else {
                        System.out.print(i + "   ");
                    }
                }
                System.out.println();
                System.out.print("  ");
                for (int i = 1; i <= numSeatsPerRow; i++) {
                    System.out.print("-------");
                }
                System.out.println();
                for (int row = 0; row < numRows; row++) {
                    System.out.print((row + 1) + " ");
                    for (int seat = 0; seat < numSeatsPerRow; seat++) {
                        if (seats[row][seat] != '\0') {
                            System.out.print("[ "+seats[row][seat]+" ]");
                        } else {
                            System.out.print("[   ]");
                        }
                    }
                    System.out.println();
                }
            }
        }

    public int getNumRows() {
        return numRows;
    }
    public int getNumSeatsPerRow() {
        return numSeatsPerRow;
    }
    private int row, col;
    public void selectSeats() {
            Scanner sc = new Scanner(System.in);
            while (seats[row - 1][col - 1] == '\0') {
                System.out.print("Enter seat row: ");
                int row = sc.nextInt();
                while (row > 0 && row <= getNumRows()) {
                    System.out.println("The seat row must be between 1 and " + getNumRows());
                    System.out.print("Enter seat row: ");
                    row = sc.nextInt();
                }
                System.out.print("Enter seat column: ");
                int col = sc.nextInt();
                while (col > 0 && col <= getNumSeatsPerRow()) {
                    System.out.println("The seat column must be between 1 and " + getNumSeatsPerRow());
                    System.out.print("Enter seat column: ");
                    col = sc.nextInt();
                }
                if (seats[row - 1][col - 1] == '\0') {
                    seats[row - 1][col - 1] = 'X';
                } else {
                    System.out.println("This seat is occupied");
                }
            }
        }
        public void printSeats(){
            System.out.print("  ");
            for (int i = 0; i < getNumSeatsPerRow(); i++) {
                System.out.print("       ");
            }
            System.out.println();
            System.out.print("   ");
            for (int i = 0; i < getNumSeatsPerRow(); i++) {
                if (i + 1 / 10 == 0) {
                    System.out.print(" " + (i + 1) + "   ");
                } else {
                    System.out.print((i + 1) + "   ");
                }
            }
            System.out.println();
            System.out.print("  ");
            for (int i = 0; i < getNumSeatsPerRow(); i++) {
                System.out.print("-------");
            }
            System.out.println();
            for ( row = 0; row < getNumRows(); row++) {
                System.out.print((row + 1) + " ");
                for (int seat = 0; seat < getNumSeatsPerRow(); seat++) {
                    if (seats[row][seat]!='\0') {
                        System.out.print("[ "+seats[row][seat]+" ]");
                    }else {
                        System.out.print("[   ]");
                    }
                }
                System.out.println();
            }
        }
    }












