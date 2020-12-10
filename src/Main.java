import javafx.scene.paint.Stop;

import java.util.stream.IntStream;
import java.util.Random;
public class Main {

   // singular loop, increments sum by 1 for each i
   public static void linearFunction(int[] a) {
        int i;
        int sum = 0;

        for(i = 0; i < a.length; i++) {
            sum += i;
        }
    }

    // double nested loop, increments sum each time loop is executed
    public static void QuadraticFunction(int[] a) {
        int i,j;
        int sum = 0;

        for(i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                sum += j;
            }
        }
    }

    // triple nested loop, increments as loop is executed
    public static void CubicFunction(int[] a) {
        int i,j,k;
        int sum = 0;

        for(i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                for(k = 0; k < a.length; k++) {
                    sum += k;
                }
            }
        }
    }

    public static void main(String[] args) {

        // randomly generated array of ints
        int[] randomNums = IntStream.generate( () -> new Random().nextInt(1000)).limit(11000).toArray();

        Stopwatch linearTimer = new Stopwatch(); // stopwatch for linear function
        linearFunction(randomNums); // run linearFunction on randomNums
        double linearTime = linearTimer.elapsedTime(); // setting linear time to the time elapsed right when linear function finishes running
        System.out.printf("The Linear Function took %f seconds to execute.\n", linearTime); // print out time in seconds

        Stopwatch QuadTimer = new Stopwatch(); // stopwatch for quad function
        QuadraticFunction(randomNums); // run quadFunction on randomNums
        double quadTime = QuadTimer.elapsedTime(); // setting quad time to the time elapsed right when quadratic function finishes running
        System.out.printf("The Quadratic Function took %f seconds to execute.\n", quadTime); // print out time in seconds

        Stopwatch CubicTimer = new Stopwatch(); // stopwatch for cubic function
        CubicFunction(randomNums); // run cubicFunction on randomNums
        double cubicTime = CubicTimer.elapsedTime(); // setting cubic time to the time elapsed right when cubic function finishes running
        System.out.printf("The Cubic Function took %f milliseconds to execute.\n", cubicTime); // print out time in seconds

    }


}