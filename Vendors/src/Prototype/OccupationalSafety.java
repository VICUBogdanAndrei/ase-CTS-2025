package Prototype;

public class OccupationalSafety implements IOccupationalSafety, Cloneable{

    private String nameEvent;
    private String eventDetails;

    @Override
    public void print() {
        System.out.println("OccupationalSafety{" +
                "nameEvent='" + nameEvent + '\'' +
                ", eventDetails='" + eventDetails + '\'' +
                '}');
    }

    public OccupationalSafety(String nameEvent, String eventDetails) {
        this.nameEvent = nameEvent;
        this.eventDetails = eventDetails;
    }

    @Override
    public OccupationalSafety clone() {

        OccupationalSafety copy = null;

        try {
            copy=(OccupationalSafety) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return copy;
    }
}
