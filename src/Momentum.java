import java.util.Scanner;
public class Momentum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mass,vel,momentum;
        System.out.print("Enter mass in kg: ");
        mass = scan.nextDouble();
        System.out.print("Enter velocity in m/s: ");
        vel = scan.nextDouble();
        momentum = mass*vel;
        System.out.format("The momentum is %.2f\n", momentum);
    }
    
}
