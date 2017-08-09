
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* @author marbi */
public class Planes {

    private List<Plane> planes;

    public Planes() {
        planes = new ArrayList<Plane>();
    }

    public void add(Scanner reader) {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());

        planes.add(new Plane(id, capacity));

    }

    public void printPlanes() {
        if (!planes.isEmpty()) {
            for (Plane plane : planes) {
                System.out.println(plane);
            }
        }
    }

    public void printPlane(Scanner reader) {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();

        for (Plane plane : planes) {
            if (plane.getId().equals(id)) {
                System.out.println(plane);
            }
        }
    }

    public Plane findPlane(String id) {
        for (Plane plane : planes) {
            if (plane.getId().equals(id)) {
                return plane;
            }
        }

        return null;
    }

}
