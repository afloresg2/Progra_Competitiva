package ConcursoMES_MAYO;

import java.util.Scanner;

public class RestasSucesivasEspeciales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int ciclos = teclado.nextInt();

        while (ciclos-- > 0){
            if (numero%10==0){
                numero = numero/10;
            }
            else {
                numero--;
            }
        }
        System.out.println(numero);
    }
}
