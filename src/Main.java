// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[] d = {1.57, 7.654, 9.986};

        int[] b = {2, 6, 8, 10, 15};

        System.out.println("Задание №2");

        System.out.println(i[0] + ", " + i[1] + ", " + i[2]);
        System.out.println(d[0] + ", " + d[1] + ", " + d[2]);
        System.out.print(b[0] + ", " + b[1] + ", " + b[2] + ", " + b[3] + ", " + b[4]);

        System.out.println();

        System.out.println("Задание №3");

        System.out.println(i[2] + ", " + i[1] + ", " + i[0]);
        System.out.println(d[2] + ", " + d[1] + ", " + d[0]);
        System.out.print(b[4] + ", " + b[3] + ", " + b[2] + ", " + b[1] + ", " + b[0]);

        System.out.println();

        System.out.println("Задание №4");

        for (int c = 0; c < i.length; c++)
            if (i[c] % 2 != 0 ) {
                i[c]++;
                System.out.print(i[c]);
            }
    }
}