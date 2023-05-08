package ConcursoMES_MAYO;

import java.util.Scanner;

public class ImpuestoCarromasLargo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte loop = sc.nextByte();
        while (loop-- > 0){
            double n1= sc.nextDouble();
            double n2 = sc.nextDouble();
            double res = n1*n2;
            System.out.println(String.format("%.3f",res));
        }

    }
}
