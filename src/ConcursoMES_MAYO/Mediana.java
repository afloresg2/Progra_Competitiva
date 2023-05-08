package ConcursoMES_MAYO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);


        while(sc.hasNext()) {
            int loop = sc.nextInt();
            int tam = loop;
            int[] vec = new int[0];
            int c = 0;
            vec = new int[tam];
            while (loop-- > 0) {
                int num = sc.nextInt();
                vec[c] = num;
                c++;
            }
            Arrays.sort(vec);
            if (vec.length % 2 == 0) {
                System.out.println(-1);
            } else {
                boolean sw = true;
                boolean sw1 = true;
                for (int i = 0; i < vec.length; i++) {
                    if (vec.length / 2 == i) {
                        sw = false;
                        continue;
                    }

                    if (sw) {
                        if (vec[i] >= vec[vec.length / 2]) {
                            System.out.println(-1);
                            sw1=false;
                            break;
                        }
                    } else {
                        if (vec[i] <= vec[vec.length / 2]) {
                            System.out.println(-1);
                            sw1=false;
                            break;
                        }
                    }
                }
                if (sw1) System.out.println(vec[vec.length / 2]);
                sw1 = true;
            }
        }
    }
}
