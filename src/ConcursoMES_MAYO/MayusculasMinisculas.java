package ConcursoMES_MAYO;

import java.util.Scanner;

public class MayusculasMinisculas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String letra = teclado.nextLine();
        char x= letra.charAt(0);
        int valor = (int)x;
        if (x<92){
            letra = letra.toLowerCase();
        }
        else {
            letra = letra.toUpperCase();
        }
        System.out.println(letra);
    }
}
