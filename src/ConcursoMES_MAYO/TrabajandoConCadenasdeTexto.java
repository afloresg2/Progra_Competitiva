package ConcursoMES_MAYO;

import java.util.Scanner;

public class TrabajandoConCadenasdeTexto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.next();
        String nueva="";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)!='a'&&cadena.charAt(i)!='e'&&cadena.charAt(i)!='i'&&cadena.charAt(i)!='o'&&cadena.charAt(i)!='u'&&
                    cadena.charAt(i)!='A'&&cadena.charAt(i)!='E'&&cadena.charAt(i)!='I'&&cadena.charAt(i)!='O'&&cadena.charAt(i)!='U'){
                nueva = nueva + "."+(cadena.charAt(i)+"").toLowerCase();
            }
        }
        System.out.println(nueva);
    }
}
