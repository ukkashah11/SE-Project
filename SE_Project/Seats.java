package SE_Project;
import java.util.*;
public class Seats{
    private Theater t;
    Seats(Theater t){
        this.t = t;
    }
    private int randrow, randcol, numRows, numSeatsPerRow,cnt;
    private char[][] seats;
    public void setSeats(int rating) {
        Random random = new Random();
        switch(t.getType().toString()){
            case "Standard":
                numRows=9;
                numSeatsPerRow = 20;
                seats = new char[numRows][numSeatsPerRow];
                if(rating>0 && rating<4){
                    while(cnt <= 90){
                        randrow = random.nextInt(numRows);
                        randcol = random.nextInt(numSeatsPerRow);
                        if (seats[randrow][randcol] == '\0') {
                            seats[randrow][randcol] = 'X';
                            cnt++;
                        }
                    }
                }
                if(rating>3 && rating <=5){
                    while(cnt <= 130){
                        randrow = random.nextInt(numRows);
                        randcol = random.nextInt(numSeatsPerRow);
                        if (seats[randrow][randcol] == '\0') {
                            seats[randrow][randcol] = 'X';
                            cnt++;
                        }
                    }
                }
                break;
            case "Premium":
                numRows=10;
                numSeatsPerRow = 10;
                seats = new char[numRows][numSeatsPerRow];
                if(rating>0 && rating<4){
                    while(cnt <= 50){
                        randrow = random.nextInt(numRows);
                        randcol = random.nextInt(numSeatsPerRow);
                        if (seats[randrow][randcol] == '\0') {
                            seats[randrow][randcol] = 'X';
                            cnt++;
                        }
                    }
                }
                if(rating>3 && rating <=5){
                    while(cnt <= 75){
                        randrow = random.nextInt(numRows);
                        randcol = random.nextInt(numSeatsPerRow);
                        if (seats[randrow][randcol] == '\0') {
                            seats[randrow][randcol] = 'X';
                            cnt++;
                        }
                    }
                }
                break;
            case "VIP":
                numRows=5;
                numSeatsPerRow = 10;
                seats = new char[numRows][numSeatsPerRow];
                if(rating>0 && rating<4){
                    while(cnt <= 25){
                        randrow = random.nextInt(numRows);
                        randcol = random.nextInt(numSeatsPerRow);
                        if (seats[randrow][randcol] == '\0') {
                            seats[randrow][randcol] = 'X';
                            cnt++;
                        }
                    }
                }
                if(rating>3 && rating <=5){
                    while(cnt <= 35){
                        randrow = random.nextInt(numRows);
                        randcol = random.nextInt(numSeatsPerRow);
                        if (seats[randrow][randcol] == '\0') {
                            seats[randrow][randcol] = 'X';
                            cnt++;
                        }
                    }
                }
                break;
            default:
                System.out.println("Seats not set");
        }
    }
    public int getNumRows() {
        return numRows;
    }
    public int getNumSeatsPerRow() {
        return numSeatsPerRow;
    }
    private int row, col;
    public void selectSeats(int seatrow, int seatcol) {
        if(seats[seatrow-1][seatcol-1]!= '\0'){
            seats[seatrow-1][seatcol-1]='X';
        }
        else{
            System.out.println("This seat is occupied");
        }

    }
        public void printSeats(){
            System.out.print("\n\n     ");
            for (int i = 1; i <= numSeatsPerRow; i++) {
                if (i / 10 == 0) {
                    System.out.print( i + "    ");
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
                if((row+1)/10 == 0) {
                    System.out.print((row + 1) + "  ");
                }
                else{
                    System.out.print((row + 1) + " ");
                }
                for (int seat = 0; seat < numSeatsPerRow; seat++) {
                    if (seats [row][seat] == 'X') {

                        System.out.print("[ "+seats[row][seat]+" ]");
                    } else {
                        System.out.print("[   ]");
                    }
                }
                System.out.println();
            }
            System.out.println("\n");
            for (int i = 1; i <= numSeatsPerRow; i++) {
                if(i==numSeatsPerRow/2){
                    System.out.print("SCREEN");
                }
                System.out.print("-------");
            }
        }
}













