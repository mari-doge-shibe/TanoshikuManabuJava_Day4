package academy.learnprogramming;

import com.sun.tools.example.debug.tty.MessageOutput;

public class Practice3 {
    // add an exception handling to Weight3.java
    // to edit the command line arguments, click Run - Edit configuration - Program arguments

    public static void main(String[] args) {
        final double BMI = 22;
        double weight, height;
        try {
            for (int i = 0; i < args.length; i++) {
                height = Double.parseDouble(args[i]) / 100;
                weight = height * height * BMI;
                System.out.println("身長: " + args[i] + "cm");
                System.out.println("体重: " + weight + "kg");
            }

        } catch(NumberFormatException e) {
            System.out.println("引数が正しくありません");
        }


    }
}
