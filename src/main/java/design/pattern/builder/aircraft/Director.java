package design.pattern.builder.aircraft;

public class Director {
    AirCraftBuilder airCraftBuilder;

    public Director(AirCraftBuilder airCraftBuilder) {
        this.airCraftBuilder = airCraftBuilder;
    }

    public void construct(boolean isPassanger) {
        airCraftBuilder.buildCockpit();
        airCraftBuilder.buildEngine();
        airCraftBuilder.buildWing();
        if (isPassanger) {
            airCraftBuilder.buildBathRoom();
        }
    }

    public Aircraft getAirCraft() {
        return airCraftBuilder.getAircraft();
    }

}
