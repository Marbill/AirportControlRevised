
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/* @author marbi */
public class Flights {

    private List<Flight> flights;

    public Flights() {
        flights = new ArrayList<Flight>();
    }

    public void add(Scanner reader, Planes planes) {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();

        if (planes.findPlane(id) != null) {
            System.out.print("Give departure airport code: ");
            String departure = reader.nextLine();
            System.out.print("Give destination airport code: ");
            String destination = reader.nextLine();
            flights.add(new Flight(planes.findPlane(id), departure, destination));

        }

    }
    
    public void printFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

}
