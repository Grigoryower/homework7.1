import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int salary : arr) {
            sum += salary;
        }
        System.out.print("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (Integer i : arr) {
            if (i < min) min = i;
            if (i > max)
                max = i;
        }
        System.out.println("Минимальная сумма трат за день составила: " + min);
        System.out.println("Максимальная сумма трат за день составила: " + max);


        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] arr = generateRandomArray();
        double trat = 0;
        if (arr.length > 0) {
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            trat = sum / arr.length;
            System.out.println("Средняя сумма трат за месяц составила " + trat + " рублей");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            if (i == reverseFullName.length - 1) {
                System.out.print(reverseFullName[i] + "");
            } else {
                System.out.print(reverseFullName[i] + "");
            }
        }


    }
}

