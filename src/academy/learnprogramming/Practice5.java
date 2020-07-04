package academy.learnprogramming;

import java.util.Arrays;

public class Practice5 {
    // read several values from command line arguments and display max value, minimum value, and average

    public static void main(String[] args) {
        double sum;
        double[] array1;

        sum = 0;

        try {
            array1 = new double[args.length];
            for (int j = 0; j < args.length; j++) {
                array1[j] = Double.parseDouble(args[j]);
            }
            Arrays.sort(array1);
            System.out.println("最小値" + array1[0]);
            System.out.println("最大値" + array1[args.length - 1]);

            for(int i = 0; i < args.length; i++) {
                sum += array1[i];
            }
            System.out.println("平均: " + (sum / args.length));

        } catch (NumberFormatException e) {
            System.out.println("数値を入れてください");
        }

    }

}
