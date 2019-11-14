package FinalMilestone2;

import java.util.Scanner;

/**
 * finalproject
 */
public class WeightOnPlanets  {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare constant of Earth's Gravity
        final double earthGrav = 9.81; // in m/s^2

        // Declare constant of Mercury's Gravity
        final double mercGrav = 1.622; // in m/s^2

        // Declare constant of Venus's Gravity
        final double venusGrav = 8.87; // in m/s^2

        // Declare constant of Mars's Gravity
        final double marsGrav = 3.711; // in m/s^2

        // Declare constant of Jupiter's Gravity
        final double jupGrav = 24.79; // in m/s^2

        // Declare constant of Saturn's Gravity
        final double satGrav = 10.44; // in m/s^2

        // Declare constant of Uranus's Gravity
        final double uranGrav = 8.69; // in m/s^2

        // Declare constant of Neptune's Gravity
        final double neptGrav = 11.15; // in m/s^2
        // Initialize and delcare the boolean programRuns
        boolean programRuns = true;

        while (programRuns) {

            // Prompt user to put in there weight in pounds
            System.out.print("Input your body weight in pounds: ");
            double userWeight = input.nextDouble();
            input.nextLine();

            //Prompt user to what planet they want to compare their weight
            System.out.print("Input the planet that you want to compare your weight with: ");
            String userPlanet = input.nextLine();

            if (userPlanet.equals("Mercury")) {
                double finalWeight1 = convMerc(userWeight, earthGrav, mercGrav);
                System.out.printf("You weight on this planet would: %.2f%n", finalWeight1);
            } else if (userPlanet.equals("Venus")) {
                double finalWeight2 = convVenus(userWeight, earthGrav, venusGrav);
                System.out.printf("You weight on this planet would: %.2f%n", finalWeight2);
            } else if (userPlanet.equals("Mars")) {
                double finalWeight3 = convMars(userWeight, earthGrav, marsGrav);
                System.out.printf("You weight on this planet would: %.2f%n", finalWeight3);
            } else if (userPlanet.equals("Jupiter")) {
                double finalWeight4 = convJup(userWeight, earthGrav, jupGrav);
                System.out.printf("You weight on this planet would: %.2f%n", finalWeight4);
            } else if (userPlanet.equals("Saturn")) {
                double finalWeight5 = convSat(userWeight, earthGrav, satGrav);
                System.out.printf("You weight on this planet would: %.2f%n", finalWeight5);
            } else if (userPlanet.equals("Uranus")) {
                double finalWeight6 = convUran(userWeight, earthGrav, uranGrav);
                System.out.printf("You weight on this planet would: %.2f%n", finalWeight6);
            } else if (userPlanet.equals("Neptune")) {
                double finalWeight7 = convNept(userWeight, earthGrav, neptGrav);
                System.out.printf("You weight on this planet would: %.2f%n", finalWeight7);
            }

            //Prompt user to do another calculation, if quit is entered then the program ends. Otherwise the loop will continue
            System.out.println("Would you like to do another calculation? If not enter quit:");
            String repeat = input.nextLine();
            if (repeat.equals("quit")) {
                programRuns = false;
            } else programRuns = true;
        }
    }

    //
    public static double convMerc(double userWeight,double earthGrav, double mercGrav){
        double mercWeight = (userWeight/earthGrav) * mercGrav;
        return mercWeight;
    }

    public static double convVenus(double userWeight, double earthGrav, double venusGrav){
        double venWeight = (userWeight/earthGrav) * venusGrav;
        return venWeight;
    }

    public static double convMars(double userWeight, double earthGrav, double marsGrav){
        double marsWeight = (userWeight/earthGrav) * marsGrav;
        return marsWeight;
    }

    public static double convJup(double userWeight, double earthGrav, double jupGrav){
        double jupWeight = (userWeight/earthGrav) * jupGrav;
        return jupWeight;
    }

    public static double convSat(double userWeight, double earthGrav, double satGrav){
        double satWeight = (userWeight/earthGrav) * satGrav;
        return satWeight;
    }

    public static double convUran(double userWeight, double earthGrav, double uranGrav){
        double uranWeight = (userWeight/earthGrav) * uranGrav;
        return uranWeight;
    }

    public static double convNept(double userWeight, double earthGrav, double neptGrav){
        double neptWeight = (userWeight/earthGrav) * neptGrav;
        return neptWeight;
    }

}