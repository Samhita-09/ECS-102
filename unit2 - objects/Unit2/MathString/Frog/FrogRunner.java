package Frog;

public class FrogRunner {
    public static void main(String[] args) {
        FrogSimulation sim = new FrogSimulation(24, 5);
        System.out.println(sim.simulate());
        System.out.println(sim.simulate());
        System.out.println(sim.simulate());
        System.out.println(sim.simulate());
        System.out.println(sim.simulate());
        System.out.println(sim.runSimulations(5)); // running it another 5 times to show proportion
    }
}
