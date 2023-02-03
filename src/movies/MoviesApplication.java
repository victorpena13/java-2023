package movies;
import java.util.Arrays;
import util.Input;

public class MoviesApplication {

    public static void categorySelection() {
        for(Movie movie: MoviesArray.findAll()) {
            System.out.println(movie.getName());
        }
    }

    public static void categorySelection(String category) {
        for(Movie movie : MoviesArray.findAll()) {
            if(movie.getCategory().equals(category)) {
                System.out.println(movie.getName());
            }
        }
    }

    public static Movie[] addMovie() {
        Input input = new Input();
        System.out.print("movie: ");
        String userMovie = input.getString();
        System.out.print("category: ");
        String userCategory = input.getString();
        Movie newMovie = new Movie(userMovie, userCategory);
        Movie[] newArray = Arrays.copyOf(MoviesArray.findAll(), MoviesArray.findAll().length+1);
        newArray[newArray.length-1] = newMovie;
        for(Movie m: newArray) {
            System.out.println(m.getName() + " - " + m.getCategory());
        }
        return newArray;
    }

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("what would you like to do? ");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - add a new movie");

        do {
            System.out.print("enter your choice: ");
            int userInput = input.getInt();
            switch(userInput) {
                case 0: 
                System.out.println("goodbye");
                return;
                case 1: 
                categorySelection();
                break;
                case 2:
                categorySelection("animated");
                break;
                case 3: 
                categorySelection("drama");
                break;
                case 4:
                categorySelection("horror");
                break;
                case 5: 
                categorySelection("scifi");
                break;
                case 6:
                addMovie();
            }
        } while(true);
    }
}
