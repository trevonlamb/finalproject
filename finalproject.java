import java.util.Scanner;

/**
 * finalproject
 */
public class finalproject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt user to put in there weight in pounds
        System.out.print("Input your body weight in pounds: ");
        double userWeight = input.nextDouble();
        input.nextLine();

        //Prompt user to what planet they want to compare their weight
        System.out.print("Input the planet that you want to compare your weight with: ");
        String userPlanet = input.nextLine();
        
        
        // Declare constant of Earth's Gravity
        final double earthGrav =  9.81; // in m/s^2

        // Declare constant of Mercury's Gravity
        final double mercGrav =  1.622; // in m/s^2 
        
        // Declare constant of Venus's Gravity
        final double venusGrav =  8.87; // in m/s^2

        // Declare constant of Mars's Gravity
        final double marsGrav =  3.711; // in m/s^2

        // Declare constant of Jupiter's Gravity
        final double jupGrav =  24.79; // in m/s^2

        // Declare constant of Saturn's Gravity
        final double satGrav =  10.44; // in m/s^2

        // Declare constant of Uranus's Gravity
        final double uranGrav =  8.69; // in m/s^2

        // Declare constant of Neptune's Gravity
        final double neptGrav =  11.15; // in m/s^2

        if(userPlanet.equals("Mercury")){
            double finalWeight1 =  convMerc(userWeight, earthGrav, mercGrav);
            System.out.println("You weight on this planet would: " + finalWeight1);
        }
        else if(userPlanet.equals("Venus")){
            double finalWeight2 =  convVenus(userWeight, earthGrav, venusGrav);
            System.out.println("You weight on this planet would: " + finalWeight2);
        }
        else if(userPlanet.equals("Mars")){
            double finalWeight3 =  convMars(userWeight, earthGrav, marsGrav);
            System.out.println("You weight on this planet would: " + finalWeight3);
        }
        else if(userPlanet.equals("Jupiter")){
            double finalWeight4 =  convJup(userWeight, earthGrav, jupGrav);
            System.out.println("You weight on this planet would: " + finalWeight4);
        }
        else if(userPlanet.equals("Saturn")){
            double finalWeight5 =  convSat(userWeight, earthGrav, jupGrav);
            System.out.println("You weight on this planet would: " + finalWeight5);
        }
        else if(userPlanet.equals("Uranus")){
            double finalWeight6 =  convUran(userWeight);
            System.out.println("You weight on this planet would: " + finalWeight6);
        }
        else if(userPlanet.equals("Neptune")){
            double finalWeight7 =  convNept(userWeight);
            System.out.println("You weight on this planet would: " + finalWeight7);
        }
    }

    // 
    public static double convMerc(double mercwWeight, double earthGrav, double mercGrav){
        double conWeight = (mercwWeight/earthGrav) * mercGrav;
        return conWeight;
    }

    public static double convVenus(double venWeight){
        double th = 0.0;
        return th;
    }

    public static double convMars(double marsWeight){
        double th = 0.0;
        return th;
    }

    public static double convJup(double jupWeight){
        double th = 0.0;
        return th;
    }

    public static double convSat(double satWeight){
        double th = 0.0;
        return th;
    }

    public static double convUran(double uranWeight){
        double th = 0.0;
        return th;
    }

    public static double convNept(double neptWeight){
        double th = 0.0;
        return th;
    }
}

