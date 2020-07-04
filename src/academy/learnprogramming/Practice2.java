package academy.learnprogramming;

public class Practice2 {
    // program to display sum of numbers specified as command line arguments (1 or larger)
    public static void main(String[] args) {
        int number;
        int sum = 0;
        number = 10;
        if (number < 1) {
            System.out.println("invalid number");;
        }

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("１から" + number + "までの合計は" + sum + "です。");




    }

}
