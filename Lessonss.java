import java.util.Scanner;

class Lessonss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание: ");
        int base = scanner.nextInt();

        System.out.print("Введите степень: ");
        int exp = scanner.nextInt();

        int ans = 1;

        if (exp == 0) {
            ans = 1;
        } else {
            for (int i = 1; i <= exp; i++) {
                ans = ans * base;
            }
        }

        System.out.println(base + " ^ " + exp + " = " + ans);
    }
}
