import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(feedCatsWithConsoleValidation()));
    }

    public static boolean[] isCatsHungry(int[] cats) {
        boolean[] eat = new boolean[cats.length];
        for (int i = 0; i < eat.length; i++) {
            if (cats[i] < 100) {
                eat[i] = false;
            } else eat[i] = true;
        }
        return eat;
    }

    public static int[] feedCats(int[] cats) {
        int[] eat = new int[cats.length];
        for (int i = 0; i < eat.length; i++) {
            if (cats[i] < 100) {
                int feed = 100 - cats[i];
                eat[i] = cats[i] + feed;
            } else eat[i] = cats[i];
        }
        return eat;
    }

    public static int[] feedCatsWithValidations(int[] cats) {
        int[] eat = new int[cats.length];
        for (int i = 0; i < eat.length; i++) {
            if (cats[i] < 100) {
                int feed = 100 - cats[i];
                eat[i] = cats[i] + feed;
            } else {
                eat[i] = 100;
            }
        }
        return eat;
    }

    public static int[] feedCatsWithConsole() {
        Scanner inputFromConsole = new Scanner(System.in);
        System.out.println("Введите процент сытости 1го котика: ");
        int firstPercent = inputFromConsole.nextInt();
        System.out.println("Введите процент сытости 2го котика: ");
        int secondPercent = inputFromConsole.nextInt();
        System.out.println("Введите процент сытости 3го котика: ");
        int thirdPercent = inputFromConsole.nextInt();
        inputFromConsole.close();
        int[] cats = {firstPercent, secondPercent, thirdPercent};
        int[] eat = new int[cats.length];
        for (int i = 0; i < eat.length; i++) {
            if (cats[i] < 100) {
                int feed = 100 - cats[i];
                eat[i] = cats[i] + feed;
            } else {
                eat[i] = 100;
            }
        }
        return eat;
    }

    public static int[] feedCatsWithDynamicArraySize() {
        Scanner inputFromConsole = new Scanner(System.in);
        System.out.println("Введите размер массива котиков (сколько их будет): ");
        int catSize = inputFromConsole.nextInt();
        int[] cats = new int[catSize];
        for (int i = 0; i < catSize; i++) {
            System.out.println("Введите процент сытости " + (i + 1) + "го котика: ");
            int eatPercent = inputFromConsole.nextInt();
            cats[i] = eatPercent;
        }
        inputFromConsole.close();
        int[] eat = new int[cats.length];
        for (int i = 0; i < eat.length; i++) {
            if (cats[i] < 100) {
                int feed = 100 - cats[i];
                eat[i] = cats[i] + feed;
            } else {
                eat[i] = 100;
            }
        }
        return eat;
    }

    public static int[] feedCatsWithConsoleValidation() {
        Scanner inputFromConsole = new Scanner(System.in);
        System.out.println("Введите размер массива котиков (сколько их будет): ");
        int catSize = inputFromConsole.nextInt();
        int[] cats = new int[catSize];
        for (int i = 0; i < catSize; i++) {
            boolean isValidPercent = true;
            int eatPercent = 0;
            while (isValidPercent) {
                System.out.println("Введите процент сытости " + (i + 1) + "го котика: ");
                eatPercent = inputFromConsole.nextInt();
                if (inputFromConsole.nextInt() < 0 || inputFromConsole.nextInt() > 100) {
                    System.out.println("Вы ввели неверное значение! Попробуйте ещё раз.");
                }
                isValidPercent = false;
            }
            cats[i] = eatPercent;
        }
        inputFromConsole.close();
        int[] eat = new int[cats.length];
        for (int i = 0; i < eat.length; i++) {
            if (cats[i] < 100) {
                int feed = 100 - cats[i];
                eat[i] = cats[i] + feed;
            } else {
                eat[i] = 100;
            }
        }
        return eat;
    }
}