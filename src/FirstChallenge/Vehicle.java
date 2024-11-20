package FirstChallenge;

public class Vehicle {
    private String vehicleId;
    private String type;


    public Vehicle(String vehicleId, String type){
        this.vehicleId = vehicleId;
        this.type = type;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getType() {
        return type;
    }

}
