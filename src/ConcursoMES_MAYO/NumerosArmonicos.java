package ConcursoMES_MAYO;

import java.util.Scanner;

public class NumerosArmonicos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        double loop=1;
        double sum=0;
        while (loop<=numero){
            sum= sum +(1/loop);
            loop++;
        }
        System.out.printf("%.4f\n",sum);
    }
}
