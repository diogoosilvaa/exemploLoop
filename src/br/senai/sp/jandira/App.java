package br.senai.sp.jandira;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String [] carros ={"x1", "fusca", "ferrari", "uno"};
        System.out.println("-------------------");
        System.out.println("-    Bem vindo    -");
        System.out.println("-------------------");



        for (int i=0; i<carros.length; i++){
            System.out.println("Carro "+(i+1) + " : "  +carros[i]);
        }

        System.out.println("Escolha seu Carro: ");

        String opcaoUsuario = teclado.nextLine();

        boolean validaCar = false;


        for (int i =0; i< carros.length; i++){

            if(opcaoUsuario.equalsIgnoreCase(carros[i])){
                System.out.println("Veiculo Disponivel");
                validaCar = true;

            }

        }
        if(!validaCar){
            System.out.println("Infelizmente este veiculo nao esta disponivel");
        }



      for (int i = 10; i>0; i--){
          System.out.println("java java");
      }




        //Exemplo loop doWhile

        boolean testeDo = false;

        do{
            System.out.println("Amo o senai jandira");
        }while(testeDo);



        // Exemplo For
        boolean testeWhile = true;

        while (testeWhile){
            System.out.println("java é incrivel");
            testeWhile=false;
        }

        for(int i=0; i<10; i++){
            System.out.println("Java e top");

        }

    }
}
