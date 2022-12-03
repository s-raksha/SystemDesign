package design.pattern.builder.aircraft;

public class F16Builder extends AirCraftBuilder{
    Aircraft aircraft;

    public F16Builder(){
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
    public Aircraft getAircraft() {
        return  aircraft;
    }
}
