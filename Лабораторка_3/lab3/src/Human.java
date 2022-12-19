public class Human {
    private String name;
    public Move move;
    private double m = 0;
    private double weight;

    public Human(String name){
        this.name = name;
    }

    public Human(String name, float m){
        this.name = name;
        this.m = m;
    }

    public double get_weight(CelestialBody celestialBody){
        return (weight = m * celestialBody.get_g());
    }

}
