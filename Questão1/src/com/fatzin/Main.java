package com.fatzin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Variaveis de ajuda: p, ajd, ajd1, spc
        int  p = 1, ajd, spc = 1, ajd1;

        //Espaço e asterisco
        char espaco = ' ', asterisco = '*';

        //Entrada com o tamanho da escada e o armazenamento dela na variável de altura 'n'.
        System.out.print("Digite a altura da escada: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        //Usa a variavel spc (space) para dar o espaçamento da lateral esquerda da escada
        for (int i = 0; i < n; i++) {
            spc+=1;
        }

        for (int i=1; i <= n; i++){
            ajd = p;
            ajd1 = spc;

            //Dá o espaçamento em todas as linhas da escada
            while (ajd1>=1){
                System.out.print(espaco);

                ajd1--;
            }
            //Printa o número de asteristicos em ordem crescente
            while(ajd>=1){
                System.out.print(asterisco);

                ajd--;
            }
           p+=1;
           spc--;
           //Dá o espaço entre uma linha e outra
           System.out.print("\n");

        }

    }
}
