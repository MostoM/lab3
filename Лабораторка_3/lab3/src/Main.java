public class Main {
    public static void main(String[] args) {
        Human Person_1 = new Human("Neznaika", 55);
        Human Person_2 = new Human("Ponchik", 45);

        Planet Earth = new Planet();

        Earth.set_name("Earth");
        Earth.set_g(9.81);
        Earth.terrain = Terrain.Hills;

        Satellite Moon = new Satellite();

        Moon.set_name("Moon");
        Moon.set_g(1.62);
        Moon.terrain = Terrain.Priming;

        Star Sun = new Star();

        Sun.set_name("Sun");
        Sun.set_g(274);

        Person_1.get_weight(Moon);
        Person_2.get_weight(Moon);
    }
}