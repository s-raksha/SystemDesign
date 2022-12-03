package design.pattern.builder.aircraft;

/*
 builder pattern encapsulates or hides the process of building a complex object and separates the
 representation of the object and its construction. The separation allows us to construct different
 representations using the same construction process.
 */
public class AircraftMain {
    public static void main(String[] args) {
        Aircraft f16;
        Aircraft boeing;

        F16Builder f16Builder = new F16Builder();
        Director director = new Director(f16Builder);
        director.construct(false);
        f16 = director.getAirCraft();

        BoeingBuilder boeingBuilder = new BoeingBuilder();
        director = new Director(boeingBuilder);
        director.construct(true);
        boeing = director.getAirCraft();
    }
}
