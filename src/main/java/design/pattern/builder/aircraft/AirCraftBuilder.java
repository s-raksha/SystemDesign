package design.pattern.builder.aircraft;

public abstract class AirCraftBuilder {

    public void buildCockpit() {
    }

    public void buildWing() {
    }

    public void buildEngine() {
    }

    public void buildBathRoom() {
    }

    public abstract Aircraft getAircraft();
}
