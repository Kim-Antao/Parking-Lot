package FirstChallenge;

public class ParkingSpot {
    private int spotNumber;
    private boolean isAvailable;
    private String size;

    public ParkingSpot(int spotNumber, String size){
        this.spotNumber = spotNumber;
        this.isAvailable = true;
        this.size = size;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getSize() {
        return size;
    }

    public void parkVehicle(){
        isAvailable = false;
    }

    public void removeVehicle(){
        isAvailable = true;
    }


}
