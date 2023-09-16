import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] whole = new int[3];
        for (int i = 0; i < whole.length ; i++) {
            whole [i] = i +1;

        }

        double[] fractional = {1.57, 7.654, 9.986};

        int[] myNumbers = {2, 6, 8, 10, 15};

        System.out.println("Задание №2");

        for (int i = 0; i < whole.length; i++) {
            if (i == whole.length - 1) {
                System.out.print(whole[i]);
                break;
            }
            System.out.print(whole[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < fractional.length; i++) {
            if (i == fractional.length - 1) {
                System.out.print(fractional[i]);
                break;
            }
            System.out.print(fractional[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < myNumbers.length; i++) {
            if (i == myNumbers.length - 1) {
                System.out.print(myNumbers[i]);
                break;
            }
            System.out.print(myNumbers[i] + ", ");
        }
        System.out.println();
        System.out.println("Задание №3");

        for (int i = whole.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(whole[i]);
                break;
            }
            System.out.print(whole[i] + ", ");
        }

        for (int i = fractional.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(fractional[i]);
                break;
            }
            System.out.print(fractional[i] + ", ");
        }

        for (int i = myNumbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(myNumbers[i]);
                break;
            }
            System.out.print(myNumbers[i] + ", ");
        }

        System.out.println("Задание №4");
        for (int i = 0; i < whole.length; i++) {
            if (whole[i] % 2 == 1){
                whole[i] ++;}
            if (i == whole.length - 1) {
                System.out.print(whole[i]);
                break;
            }
                System.out.print(whole[i] + ", ");
        }

    }
}