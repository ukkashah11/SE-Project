package SE_Project;

public class User {

    private String email;
    private String password;
    private String phoneNumber;

    public User(String email, String password, String phoneNumber) {
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
enum MovieGenre {
    COMEDY("Comedy", MovieCategory.COMEDY),
    HORROR("Horror", MovieCategory.HORROR),
    THRILLER("Thriller", MovieCategory.THRILLER),
    ACTION("Action", MovieCategory.ACTION),
    ROMANTIC("Romantic", MovieCategory.ROMANTIC);

    private String displayName;
    private MovieCategory category;

    MovieGenre(String displayName, MovieCategory category) {
        this.displayName = displayName;
        this.category = category;
    }

    public String getDisplayName() {
        return displayName;
    }

    public MovieCategory getCategory() {
        return category;
    }
}
enum MovieCategory {
    COMEDY("Comedy"),
    HORROR("Horror"),
    THRILLER("Thriller"),
    ACTION("Action"),
    ROMANTIC("Romantic");

    private String displayName;

    MovieCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}

