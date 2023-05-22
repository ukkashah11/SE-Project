package SE_Project;

public class Main {
    public static void main(String[] args) {
        Movies m = new Movies("The Godftaher", "Francis Ford Coppola", "The aging patriarch of an organized crime dynasty in postwar New York City transfers control of his clandestine empire to his reluctant youngest son.", Movies.Category.Drama, 3);
        m.setCast("Al Pacino","Marlon Brando","James Caan");
        MovieList ml = new MovieList();
        ml.addMovie(m);
        ml.ShowMovies();
        Seats s = new Seats();
        s.setTheaterType(Theater.TheaterTypes.VIP);
        s.getTheaterDescription();
        s.setSeats();
        s.showSeats(m.getRating());
        s.printSeats();
    }


}


