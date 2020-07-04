package academy.learnprogramming;

import java.util.Arrays;

public class Practice4 {
    // change Practice3.java and display the height and weight in the ascending order of the height
    public static void main(String[] args) {
        final double BMI = 22;
        double[] height;
        double weight;

        try {
            height = new double[args.length];
            for (int i = 0; i < args.length; i++) {
                height[i] = Double.parseDouble(args[i]) / 100;
            }
            Arrays.sort(height);
            for (int i = 0; i < height.length; i++) {
                weight = height[i] * height[i] * BMI;
                System.out.println("身長: " + (height[i] * 100) + "cm");
                System.out.println("体重: " + weight + "kg");
            }
        } catch (NumberFormatException e) {
            System.out.println("引数が正しくありません");
        }


    }
}
