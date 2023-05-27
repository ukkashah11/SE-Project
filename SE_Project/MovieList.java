package SE_Project;
import java.util.*;
public class MovieList{
    private ArrayList <Movies> MovieList = new ArrayList<>();
    public void addMovie(Movies movie){
        MovieList.add(movie);
    }
    public void removeMovie(Movies movie){
        MovieList.remove(movie);
    }
    public void searchMoviesByName(String MovieName){
        for(Movies i: MovieList){
            if(MovieName.equals(i.getMovieName())) {
                System.out.println("\nMovie Name: " + i.getMovieName() + "\nMovie Cast: " + i.getCast() + "\n" + i.getGenre() + "\nDirected by: " + i.getDirector() + "\nMovie Description: " + i.getDescription());
                System.out.print("Rating: ");
                i.showRating();
                System.out.println(" ");
            }
            else {
                System.out.println("There are no results for "+ MovieName);
            }
        }

    }
    public void searchMoviesByGenre(String Genre) {
        for (Movies i : MovieList) {
            if (Genre.equals(i.getGenre())) {
                System.out.println("\nMovie Name: " + i.getMovieName() + "\nMovie Cast: " + i.getCast() + "\n" + i.getGenre() + "\nDirected by: " + i.getDirector() + "\nMovie Description: " + i.getDescription());
                System.out.print("Rating: ");
                i.showRating();
                System.out.println(" ");
            }
        }
    }
    public void selectMovie(int index){
        System.out.println("\nYou have chosen "+MovieList.get(index-1).getMovieName()+", Directed by "+MovieList.get(index-1).getDirector()+"\n\n");
    }
    public void showMovies(){
        int cnt=1;
        for(Movies i: MovieList){
            System.out.println("\n"+ cnt + ") Movie Name: "+i.getMovieName()+"\n  Movie Cast: "+i.getCast()+"\n  "+i.getGenre()+"\n  Directed by: "+i.getDirector()+"\n  Movie Description: "+i.getDescription());
            System.out.print("Rating: ");
            i.showRating();
            System.out.println(" ");
            cnt++;
        }
    }
}

