
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Planes planes = new Planes();
        Flights flights = new Flights();

        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String option = in.nextLine();

            if (option.equals("1")) {
                planes.add(in);
            } else if (option.equals("2")) {
                flights.add(in, planes);
            } else {
                break;
            }
        }

        System.out.println();
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String option = in.nextLine();

            if (option.equals("1")) {
                planes.printPlanes();
            } else if (option.contains("2")) {
                flights.printFlights();
                System.out.println();
            } else if (option.equals("3")) {
                planes.printPlane(in);
                System.out.println();
            } else {
                break;
            }
        }

    }
}
