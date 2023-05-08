package ConcursoMES_MAYO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cadena_Bailarani {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());

        while (loop-- > 0){
            String cadena = br.readLine();
            String cadenaNueva = "";
            boolean flag = true;
            for (int i = 0; i < cadena.length(); i++) {
                if (flag){
                    if (cadena.codePointAt(i)<97){
                        cadenaNueva = cadenaNueva + cadena.charAt(i);
                        if (cadena.charAt(i)== ' '){
                            continue;
                        }
                    }
                    else{
                        char aux = (char) Character.toUpperCase(cadena.codePointAt(i));
                        cadenaNueva = cadenaNueva + aux;
                        if (cadena.charAt(i)== ' '){
                            continue;
                        }
                    }
                    flag=false;
                }
                else{
                    if (cadena.codePointAt(i)>97){
                        cadenaNueva = cadenaNueva + cadena.charAt(i);
                        if (cadena.charAt(i)== ' '){
                            continue;
                        }
                    }
                    else{
                        char aux = (char) Character.toLowerCase(cadena.codePointAt(i));
                        cadenaNueva = cadenaNueva + aux;
                        if (cadena.charAt(i)== ' '){
                            continue;
                        }
                    }
                    flag = true;
                }

            }
            System.out.println(cadenaNueva);
        }
    }
}
