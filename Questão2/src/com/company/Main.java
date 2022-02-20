package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //System.out.println("Digite aqui sua senha: ");

        //Pega o Input da senha do Usuário:
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        //System.out.println("Sua senha: " + password);

        //Mede o tamanho da senha:
        int lenght = password.length();

        //System.out.println("Tamanho da sua senha: " + lenght);

        //Testa se é uma senha forte, se não é diz quantos caracteres faltam para se tornar uma senha forte
        if (lenght < 6){
            int n;
            n = 6 - lenght;
            System.out.println(n);
        } else if(lenght > 6){
            System.out.println("Senha forte!");
        }
    }
}
