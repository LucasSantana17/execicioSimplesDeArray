package estudoJava;

package programExercicios;

import java.util.Scanner;

public class newPratica {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        System.out.println("quantos numeros deseja somar? ");
        int n = input.nextInt();

        int Array[] = new int[n];

        for (int i = 0; i < Array.length; i++) {
            Array[i] = input.nextInt();
        }

        int total = 0;
        for (int i = 0; i < Array.length; i++) {
            total += Array[i];
        }
        System.out.println("Soma: " + total);
        System.out.println(Array[3]);
    }

}
