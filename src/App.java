import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] numeros = {900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanos = {"CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        int a = sc.nextInt();
        StringBuilder br = new StringBuilder();

        while (true) {
            if(a == 0){
                break;
            }

            for (int i = 0; i < numeros.length; i++) {
                if (a >= numeros[i]) {
                    br.append(romanos[i]);
                    a -= numeros[i];
                    break;
                }
            }

        }

        sc.close();
        System.out.println(br.toString());

    }
}
