package ConcursoMES_MAYO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Maximode3nums {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        ArrayList<Integer> v = new ArrayList<>();

        v.add(num1);
        v.add(num2);
        v.add(num3);

        Collections.sort(v);
        System.out.println(v.get(v.size()-1));
    }
}
