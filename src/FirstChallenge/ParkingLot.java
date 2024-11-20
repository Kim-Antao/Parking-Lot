package FirstChallenge;

import java.util.ArrayList;

public class ParkingLot {
    ArrayList<ParkingSpot> parkingSpotList = new ArrayList<>();

    public void addParkingSpot(ParkingSpot spot){
        parkingSpotList.add(spot);
    }

    public void parkVehicle(Vehicle vehicle){

        for(ParkingSpot spot: parkingSpotList){
//            if (spot.isAvailable())
////             Check if the parking spot, same size as that of the vehicle is free
////                if( spot.getSize().equalsIgnoreCase(vehicle.getSize())){
//                if(vehicle.getType().equalsIgnoreCase("motorcyle")){
//
//                    spot.parkVehicle();
//                    System.out.printf("Vehicle No: %s has been parked at spot %d \n", vehicle.getVehicleId(), spot.getSpotNumber());
////                System.out.println(vehicle.getSize());
//                    return;
//                }
//              motorcyle and car can park in large spots

            if(vehicle.getType().equals("Motorcycle")){
                if(spot.isAvailable()){
                    spot.parkVehicle();
                    System.out.printf("Vehicle No: %s has been parked at spot %d \n", vehicle.getVehicleId(), spot.getSpotNumber());
                   return;
                }
            }

            if (vehicle.getType().equals("Car") && spot.isAvailable()){
                if( spot.getSize().equals(ParkingSpotSize.COMPACT.name()) || (spot.getSize().equals(ParkingSpotSize.LARGE.name()))){
                    spot.parkVehicle();
                    System.out.printf("Vehicle No: %s has been parked at spot %d \n", vehicle.getVehicleId(), spot.getSpotNumber());
                    return;
                }
            }

            if (vehicle.getType().equals("Car") && spot.isAvailable()){
                if( spot.getSize().equals(ParkingSpotSize.LARGE.name())){
                    spot.parkVehicle();
                    System.out.printf("Vehicle No: %s has been parked at spot %d \n", vehicle.getVehicleId(), spot.getSpotNumber());
                    return;
                }
            }


        }
        System.out.println("No spots available");
    }

    public void removeVehicle(int spotNumber){
        for(ParkingSpot spot: parkingSpotList){
            if(spot.getSpotNumber() == spotNumber){
                spot.removeVehicle();
                System.out.println("Vehicle left the parking space");
                return;
            }
        }
        System.out.println("Spot Number not found");
    }

    public int getNumberOfParkingSpots(){
        return parkingSpotList.size();
    }

    public int getNumberOfFilledSpots(){
        int counter = 0;
        for(ParkingSpot spot: parkingSpotList){
            if(!spot.isAvailable()){
                counter++;
            }
        }
        return counter;
    }

}
