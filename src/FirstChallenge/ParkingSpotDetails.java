package FirstChallenge;

public class ParkingSpotDetails {
    static String[][] spotDetails = {
                                {"4",ParkingSpotSize.MOTORCYCLE.name()},
                                {"5",ParkingSpotSize.COMPACT.name()},
                                {"6",ParkingSpotSize.LARGE.name()},
                                {"7",ParkingSpotSize.MOTORCYCLE.name()},
                                {"8",ParkingSpotSize.COMPACT.name()}
                            };

    public static String[][] getSpotDetails(){
        return spotDetails;
    }

}
