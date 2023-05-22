package SE_Project;
public class Theater extends Movies{
    public enum TheaterTypes {
        Premium, VIP, Standard;
    }
    @Override
    public int getRating() {
        return super.getRating();
    }
    private String TheaterType;
    public void setTheaterType(TheaterTypes type) {
        TheaterType = type.toString();
    }
    public String getTheaterType() {
        return TheaterType;
    }
    private String TheaterDescription;
    public void getTheaterDescription() {
        String type = getTheaterType();
        switch (type) {
            case "Standard":
                System.out.println("---Standard Theater---");
                TheaterDescription = "Our standard theater offers a comfortable and enjoyable movie experience at an affordable price. The seating arrangements are basic, with simple, cushioned seats that offer a good view of the screen. Standard audio and video equipment deliver clear and immersive movie sound and picture quality.";
                System.out.println(TheaterDescription);
            break;
            case "Premium":
                System.out.println("---Premium Theater---");
                TheaterDescription = "Our Premium theater offers a more luxurious movie experience with enhanced audio and video quality. The seating arrangements are more comfortable and spacious, with larger seats that recline, and footrests that allow for maximum relaxation. It features a larger screen and better sound systems with advanced technologies like Dolby Atmos and THX-certified audio.";
                System.out.println(TheaterDescription);
            break;
            case "VIP":
                System.out.println("---VIP Theater---");
                TheaterDescription = "Our VIP theater offers the ultimate movie experience, with the highest level of comfort, luxury, and exclusivity. The seating arrangements are designed for maximum relaxation, with plush, oversized reclining chairs, individual tables, and personal service from a waitstaff. VIP theaters feature the latest audio and video technologies, including laser projection and 4K Ultra HD resolution.";
                System.out.println(TheaterDescription);
            break;
            default:
                System.out.println("null");
        }
    }
}
