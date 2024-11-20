package FirstChallenge;

import java.util.Arrays;
import java.util.Scanner;


/*  PENDING
* Van takes 3 compact spots
*
* print how many vans are present
* */


public class Main {
    private ParkingLot park1;

    public Main(){
        this.park1 = new ParkingLot();
        createParkingLot();
    }

    public void createParkingLot(){
        for(String[] details: ParkingSpotDetails.getSpotDetails()){
            park1.addParkingSpot(new ParkingSpot(Integer.parseInt(details[0]), details[1]));
        }
    }

    public void welcomeMessage(int totalSpots){
        System.out.println("-------------------------------------------");
        System.out.println("     Welcome to Kimberley's Parking Lot");
        System.out.println("-------------------------------------------");
        System.out.printf("In total there are %d spots \n", totalSpots);
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        int userInput, vehicleType, spotNumber, filledSpots;
        String vehicleNumber, vehicleSize;

        String[] vehicleTypeList = {"Motorcycle", "Car", "Van"};
        int totalSpots = park1.getNumberOfParkingSpots();

        welcomeMessage(totalSpots);

        while (true){
            filledSpots = park1.getNumberOfFilledSpots();

            if(totalSpots == filledSpots){
                System.out.println("Parking lot is full");
            }
            else if(filledSpots == 0){
                System.out.println("Parking lot is empty.");
            }else{
                System.out.printf("\nThere are %d slots remaining.\n", (totalSpots - filledSpots));
            }

            park1.checkIfSpotTypeFilled();

            System.out.println("\n--MENU--");
            System.out.println("1. Park a vehicle \n" +
                                "2. Remove a vehicle \n" +
                                "3. Exit");
            userInput = scanner.nextInt();
            scanner.nextLine();
            switch(userInput){
                case 1:
                    System.out.println("Enter the vehicle Number");
                    vehicleNumber = scanner.nextLine();

                    System.out.println("Choose the type of vehicle");
                    System.out.println("1. Motorcycle \n2. Car \n3. Van");
                    vehicleType = scanner.nextInt();
                    park1.parkVehicle(new Vehicle(vehicleNumber, vehicleTypeList[vehicleType-1]));
                    break;

                case 2:
                    System.out.println("Enter the spot number");
                    spotNumber = scanner.nextInt();

                    park1.removeVehicle(spotNumber);
                    break;

                case 3:
                    System.out.println("Exiting the system");
                    System.exit(0);

                default:
                    System.out.println("Invalid option");

            }

        }
    }



    public static void main(String args[]){

        Main parking = new Main();
        parking.run();
    }

}
