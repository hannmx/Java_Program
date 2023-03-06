/* Вывести все простые числа от 1 до 1000 */
package java_projects;

public class j_prime_num {
    public static void main(String[] args) {
        System.out.println("\nПростые числа от 1 до 1000: ");
        int n = 100;
        for (int i = 2; i < n; i++) {
            boolean a = true;
            int q = (int) Math.sqrt(i);
            for (int j = 2; j <= q; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(i + " ");
            }
        }

    }
}
