package ConcursoMES_MAYO;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeroBalanceado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        byte loop = teclado.nextByte();
        boolean flag=true;
        while (loop-- >0){
            int numero = teclado.nextInt();
            ArrayList<Byte> l1 = new ArrayList<>();
            ArrayList<Byte> l2 = new ArrayList<>();
            while (numero>0){
                byte digito = (byte) (numero%10);
                numero = numero/10;
                if(flag){
                    l1.add(digito);
                    flag=false;
                }
                else {
                    l2.add(digito);
                    flag=true;
                }
            }
            int sum1 = l1.stream().mapToInt(Byte::intValue).sum();
            int sum2 = l2.stream().mapToInt(Byte::intValue).sum();
            if (sum1==sum2){
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
