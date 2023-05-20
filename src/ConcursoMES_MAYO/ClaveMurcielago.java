package ConcursoMES_MAYO;

import java.util.Scanner;

public class ClaveMurcielago {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int loop = teclado.nextInt();

        while (loop-- >  0){
            String mensaje = teclado.next();
            String nuevoMensaje="";
            for (int i = 0; i < mensaje.length(); i++) {
                switch (mensaje.charAt(i)){
                    case 'M':
                        nuevoMensaje= nuevoMensaje + "0";
                        break;
                    case 'U':
                        nuevoMensaje= nuevoMensaje + "1";
                        break;
                    case 'R':
                        nuevoMensaje= nuevoMensaje + "2";
                        break;
                    case 'C':
                        nuevoMensaje= nuevoMensaje + "3";
                        break;
                    case 'I':
                        nuevoMensaje= nuevoMensaje + "4";
                        break;
                    case 'E':
                        nuevoMensaje= nuevoMensaje + "5";
                        break;
                    case 'L':
                        nuevoMensaje= nuevoMensaje + "6";
                        break;
                    case 'A':
                        nuevoMensaje= nuevoMensaje + "7";
                        break;
                    case 'G':
                        nuevoMensaje= nuevoMensaje + "8";
                        break;
                    case 'O':
                        nuevoMensaje= nuevoMensaje + "9";
                        break;
                    default:
                        nuevoMensaje=nuevoMensaje + mensaje.charAt(i);
                }
            }
            System.out.println(nuevoMensaje);
        }
    }
}
