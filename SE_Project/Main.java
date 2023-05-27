package SE_Project; // add ticket prices (Movie rating 100rs difference, if premium or vip add cost),
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------ WELCOME TO REEL THEATRES --------------");
        System.out.println("WATCH THE BEST MOVIES AT REELS AN THE BEST CINEMAS IN TOWN");
        System.out.println("\n\n -------------- OUR SHOWS -------------");
        Movies m = new Movies("The Godfather", "Francis Ford Coppola", "The aging patriarch of an organized crime dynasty in postwar New York City transfers control of his clandestine empire to his reluctant youngest son.", Movies.Category.Drama, "Al Pacino","Marlon Brando","James Caan");
        Movies m2 = new Movies("The Matrix", "The Wachowski Brothers", "A computer hacker joins forces with rebel warriors to battle a malevolent cyber intelligence", Movies.Category.Action, "Keanu Reaeves", "Lawrence Fishburn", "Carrie-Anne Moss");
        m.setRating(5);
        m2.setRating(3);
        MovieList ml = new MovieList();
        ml.addMovie(m);
        ml.addMovie(m2);
        ml.showMovies();
        System.out.println("\n-----MOVIE SELECTION-----");
        System.out.println("Enter Movie number to select: ");
        int choose = sc.nextInt();
        ml.selectMovie(choose);
        System.out.println("-----THEATER SELECTION-----\n\n1)---Standard Theater---\nOur standard theater offers a comfortable and enjoyable movie experience at an affordable price. The seating arrangements are basic, with simple, cushioned seats that offer a good view of the screen. Standard audio and video equipment deliver clear and immersive movie sound and picture quality.\n2)---Premium Theater---\nOur Premium theater offers a more luxurious movie experience with enhanced audio and video quality. The seating arrangements are more comfortable and spacious, with larger seats that recline, and footrests that allow for maximum relaxation. It features a larger screen and better sound systems with advanced technologies like Dolby Atmos and THX-certified audio.\n3---VIP Theater---\nOur VIP theater offers the ultimate movie experience, with the highest level of comfort, luxury, and exclusivity. The seating arrangements are designed for maximum relaxation, with plush, oversized reclining chairs, individual tables, and personal service from a waitstaff. VIP theaters feature the latest audio and video technologies, including laser projection and 4K Ultra HD resolution.\n");
        System.out.println("Choose Theater by number: ");
        choose = sc.nextInt();
        switch(choose){
            case 1: Theater Standard = new Theater(ml, Theater.TheaterTypes.Standard);
                System.out.println("You have chosen the Standard Theater");
                Seats StandardSeats = new Seats(Standard);
                StandardSeats.setSeats(m2.getRating());
                System.out.println("Seats marked with X are already occupied");
                StandardSeats.printSeats();
            break;
            case 2: Theater Premimum = new Theater(ml, Theater.TheaterTypes.Premium);
                System.out.println("You have chosen the Premium Theater");
                Seats PremiumSeats = new Seats(Premimum);
                PremiumSeats.setSeats(m2.getRating());
                System.out.println("Seats marked with X are already occupied");
                PremiumSeats.printSeats();
            break;
            case 3: Theater Vip = new Theater(ml, Theater.TheaterTypes.VIP);
                System.out.println("You have chosen the VIP Theater");
                Seats VIPSeats = new Seats(Vip);
                VIPSeats.setSeats(m2.getRating());
                System.out.println("-----SEAT SELECTION-----");
                System.out.println("\nSeats marked with X are already occupied");
                VIPSeats.printSeats();
            break;
        }
    }
}


