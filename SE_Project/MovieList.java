package SE_Project;
import java.util.*;
public class MovieList {
    private ArrayList <Movies> MovieList = new ArrayList<>();
    public void addMovie(Movies movie){
        MovieList.add(movie);
    }
    public void removeMovie(Movies movie){
        MovieList.remove(movie);
    }
    public void ShowMovies(){
        for(Movies i: MovieList){
            System.out.println("\nMovie Name: "+i.getMovieName()+"\nMovie Cast: "+i.getCast()+"\n"+i.getGenre()+"\nDirected by: "+i.getDirector()+"\nMovie Description: "+i.getDescription());
            System.out.print("Rating: ");
            i.showRating();
            System.out.println(" ");
        }
    }

}
