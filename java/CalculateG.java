public class CalculateG {

    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        int fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;

        finalPosition = 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition;
        finalVelocity = gravity * fallingTime + initialVelocity;

        System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m.");
        System.out.println("The object's velocity after " + fallingTime + " seconds is " + finalVelocity + " m/s.");
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double powerToSquare(double a) {
        return Math.pow(a, 2);
    }

    public static int summation(int a, int b) {
        return a + b;
    }

    public static void outline(String output) {
        System.out.println(output);
    }
}

