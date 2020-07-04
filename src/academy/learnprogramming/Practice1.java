package academy.learnprogramming;

public class Practice1 {
    public static void main(String[] args) {
        // omikuji program
        int index;
        String[] omikuji;
        omikuji = new String[5];
        omikuji[0] = new String("大吉");
        omikuji[1] = new String("中吉");
        omikuji[2] = new String("小吉");
        omikuji[3] = new String("凶");
        omikuji[4] = new String("大凶");

        index = (int)(Math.random() * 5);
        System.out.println("おみくじの結果は" + omikuji[index]);


    }
}
