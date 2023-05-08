package ConcursoMES_MAYO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Bar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNext("-1")){
                //int loop = Integer.parseInt(br.readLine());
                int loop = sc.nextInt();
                String bebidas = "ABSINTH BEER BRANDY CHAMPAGNE GIN RUM SAKE TEQUILA VODKA WHISKEY WINE";
                String[] vec = new String[10];
                vec = bebidas.split(" ");
                int count=0;
                while(loop-- > 0){
                    String cad = sc.next();
                    //String cad = br.readLine();
                    if (cad != null && cad.matches("[0-9]+")){
                        int edad = Integer.parseInt(cad);
                        if(edad < 18){
                            count++;
                        }
                    }
                    else{
                        for (String c: vec) {
                            if (cad.compareTo(c)==0)
                                count++;
                        }
                    }
                }
                System.out.println(count);
        }
    }
}
