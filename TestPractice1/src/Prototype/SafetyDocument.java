package Prototype;

public class SafetyDocument implements IOccupationalSafety, Cloneable{

    private String description;

    public SafetyDocument() {
        this.description = "Safety Document";
        System.out.println("Generating safety document...");
    }


    @Override
    public void print() {
        System.out.println("SafetyDocument{" +
                "description='" + description + '\'' +
                '}');
    }

    @Override
    public SafetyDocument clone(){
        SafetyDocument copy = null;
        try {
            copy = (SafetyDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return copy;
    }
}
