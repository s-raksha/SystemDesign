package design.pattern.builder.aircraft;

public class Aircraft {

    private String cockpit;
    private String engine;
    private String wings;
    private String bathroom;

    public void setCockpit(String cockpit) {
        this.cockpit = cockpit;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWings(String wings) {
        this.wings = wings;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }
}
