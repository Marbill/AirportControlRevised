
/* @author marbi */
public class Flight {

    private Plane plane;
    private String departureID;
    private String destinationID;

    public Flight(Plane plane, String departureID, String destinationID) {
        this.plane = plane;
        this.departureID = departureID;
        this.destinationID = destinationID;
    }

    @Override
    public String toString() {
        return this.plane + " (" + this.departureID + "-" + this.destinationID + ")";
    }
    
    
}
