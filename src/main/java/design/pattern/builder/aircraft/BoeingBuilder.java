package design.pattern.builder.aircraft;

public class BoeingBuilder extends AirCraftBuilder {
    Aircraft aircraft;

    public BoeingBuilder(){
        aircraft = new Aircraft();
    }

    public void buildCockpit() {
        System.out.println("cockpit");
        aircraft.setCockpit("cockpit");
    }

    public void buildWing() {
        System.out.println("wing");
        aircraft.setWings("wing");
    }

    public void buildEngine() {
        System.out.println("engine");
        aircraft.setEngine("engine");
    }

    @Override
    public void buildBathRoom(){
        System.out.printf("bathroom");
        aircraft.setBathroom("bathroom");
    }

    @Override
    public Aircraft getAircraft() {
        return aircraft;
    }
}
