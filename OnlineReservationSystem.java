import java.util.Scanner;

class ReservationSystem {
    private String basicDetails;
    private String trainNumber;
    private String trainName;
    private String classType;
    private String dateOfJourney;
    private String fromPlace;
    private String toDestination;

    // Constructor
    public ReservationSystem(String basicDetails, String trainNumber, String trainName, String classType, String dateOfJourney, String fromPlace, String toDestination) {
        this.basicDetails = basicDetails;
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.classType = classType;
        this.dateOfJourney = dateOfJourney;
        this.fromPlace = fromPlace;
        this.toDestination = toDestination;
    }

    // Getters and Setters
    public String getBasicDetails() {
        return basicDetails;
    }

    public void setBasicDetails(String basicDetails) {
        this.basicDetails = basicDetails;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getDateOfJourney() {
        return dateOfJourney;
    }

    public void setDateOfJourney(String dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public String getToDestination() {
        return toDestination;
    }

    public void setToDestination(String toDestination) {
        this.toDestination = toDestination;
    }

    @Override
    public String toString() {
        return "Reservation Details:\n" +
                "Basic Details: " + basicDetails + "\n" +
                "Train Number: " + trainNumber + "\n" +
                "Train Name: " + trainName + "\n" +
                "Class Type: " + classType + "\n" +
                "Date of Journey: " + dateOfJourney + "\n" +
                "From: " + fromPlace + "\n" +
                "To: " + toDestination;
    }
}

class OnlineReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login Form
        System.out.println("=== Login Form ===");
        System.out.print("Enter your login id: ");
        String loginId = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Check login credentials
        if (isValidLogin(loginId, password)) {
            System.out.println("Login Successful!\n");

            // Reservation System
            System.out.println("=== Reservation System ===");
            System.out.print("Enter your basic details: ");
            String basicDetails = scanner.nextLine();
            System.out.print("Enter train number: ");
            String trainNumber = scanner.nextLine();
            System.out.print("Enter train name: ");
            String trainName = scanner.nextLine();
            System.out.print("Enter class type: ");
            String classType = scanner.nextLine();
            System.out.print("Enter date of journey: ");
            String dateOfJourney = scanner.nextLine();
            System.out.print("Enter from place: ");
            String fromPlace = scanner.nextLine();
            System.out.print("Enter to destination: ");
            String toDestination = scanner.nextLine();

            ReservationSystem reservation = new ReservationSystem(basicDetails, trainNumber, trainName, classType, dateOfJourney, fromPlace, toDestination);

            System.out.println("\nReservation Successful!");
            System.out.println(reservation);

            // Cancellation Form
            System.out.println("\n=== Cancellation Form ===");
            System.out.print("Enter your PNR number: ");
            String pnrNumber = scanner.nextLine();

            // Display cancellation information
            displayCancellationDetails(pnrNumber);

            System.out.print("Press OK to confirm cancellation (or any key to exit): ");
            String confirmation = scanner.nextLine();

            if (confirmation.equalsIgnoreCase("OK")) {
                System.out.println("Cancellation confirmed. Your ticket has been cancelled.");
            } else {
                System.out.println("Cancellation not confirmed. Your ticket is still valid.");
            }
        } else {
            System.out.println("Invalid login credentials. Access denied.");
        }
    }

    // Validate login credentials
    private static boolean isValidLogin(String loginId, String password) {
        // Implement your login validation logic here
        // Return true if the login credentials are valid, false otherwise
        return loginId.equals("admin") && password.equals("admin123");
    }

    // Display cancellation details
    private static void displayCancellationDetails(String pnrNumber) {
        // Implement your cancellation details retrieval logic here
        // Retrieve the reservation information based on the provided PNR number
        // Display the retrieved information to the user
        System.out.println("Cancellation Details:");
        System.out.println("PNR Number: " + pnrNumber);
        System.out.println("Passenger Name: John Doe");
        System.out.println("Train Name: XYZ Express");
        System.out.println("Class Type: AC");
        System.out.println("Date of Journey: 2023-07-11");
        System.out.println("From: Station A");
        System.out.println("To: Station B");
    }
}
