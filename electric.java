import java.util.*;

public class electric {
    public static void main(String [] args) {
        double p = solarPower();
        System.out.println("Solar panels are currently producing an ouput of " + p + " kWh");
    }

    public static double solarPower() {
        Random rand = new Random();
        int n = rand.nextInt(10) + 25; // Average monthly kWh output of solar panels are 25 - 35 kWh
        return n;
    }
}