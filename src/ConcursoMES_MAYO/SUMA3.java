package ConcursoMES_MAYO;

import java.util.ArrayList;
import java.util.Scanner;

public class SUMA3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entrada = teclado.nextInt();
        int cont3=3;
        ArrayList<Integer> v = new ArrayList();
        while (cont3<entrada){
            v.add(cont3);
            cont3 = cont3 + 3;
        }
        int sum = v.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
