public class BonusMilesService {
    public static int calculate(int ticketPrice) {
        int miles = ticketPrice / 20;
        return miles;
    }
}
