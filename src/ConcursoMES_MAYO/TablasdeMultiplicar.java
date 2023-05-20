package ConcursoMES_MAYO;

import java.util.Scanner;

public class TablasdeMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        byte multiplo = teclado.nextByte();
        byte cantidad = teclado.nextByte();
        int nueva=multiplo;

        for (int i = 0; i < cantidad; i++) {
            System.out.print(nueva+ " ");
            nueva = (Integer) (nueva + multiplo);
        }
    }
}
