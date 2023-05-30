import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
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
        int[] arr = generateRandomArray();

        System.out.println(" 1 задача ");

        int[] salary = new int[30];
        salary = generateRandomArray();
        for (int i = 0; i < salary.length; i++) {
            System.out.println("Сумма трат за месяц составила " + salary[i] + " рублей");
        }

        System.out.println(" 2 задача ");
        int[] salary2 = new int[30];
        salary2 = generateRandomArray();
        int salaryMax = -1;
        for (int i = 0; i < salary2.length; i++) {
            final int current = salary2[i];
            if (current > salaryMax) {
                salaryMax = current;
            }
        }
        int salaryMin = 200000;
        for (int i = 0; i < salary2.length; i++) {
            final int current = salary2[i];
            if (current < salaryMin) {
                salaryMin = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + salaryMin + " рублей, а Максимальная сумма трат за день составила " + salaryMax + " рублей");

        System.out.println(" 3 задача ");

        int[] salary3 = new int[30];
        salary3 = generateRandomArray();
        for (int i = 0; i < salary3.length; i++) {
        }
        int sum = 0;
        for (int i = 0; i < salary3.length; i++) {
            sum += salary3[i];
        }
        double middle = sum / 30;
        System.out.println(" Средняя сумма трат за месяц составила " + middle + " рублей ");

        System.out.println(" 4 задача ");
        char[] a = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        char temp;

        for (int i = 0; i < n / 2; i++) {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

}




















