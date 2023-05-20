package ConcursoMES_MAYO;

import java.util.Scanner;

public class ProblemaDeLaSandia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte num = teclado.nextByte();

        byte mitad = (byte) (num/2);
        if (num%2!=0 || (num/2)%2!=0){
            mitad++;
        }
        boolean flag=true;
        for (int i = 1; i <= mitad; i++) {
            if (i+mitad==num && i%2==0 && mitad%2==0){
                System.out.println("SI");
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("NO");
        }
    }
}
