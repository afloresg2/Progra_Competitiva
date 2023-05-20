package ConcursoMES_MAYO;

import java.util.Scanner;

public class Es_Divisible {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte n1 = teclado.nextByte();
        byte n2 = teclado.nextByte();

        if (n1%n2==0){
            System.out.println(n1+" es divisible por "+n2);
        }
        else {
            if (n2%n1==0){
                System.out.println(n2+" es divisible por "+n1);
            }
            else {
                System.out.println(-1);
            }
        }
    }
}
