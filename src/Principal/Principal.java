package Principal;

import challenge.conversor.de.Moeda.Conversao.Conversoes;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Conversoes conversao = new Conversoes();
        int opcao = 0;


        while(opcao != 7){
           Scanner leitura = new Scanner(System.in);

            double resultado = 0;

           opcao =  menu.exibirMenu();
           switch (opcao){
               case 1 -> {
                   System.out.println("Qual valor deseja converter: ");
                   double valorConverter = leitura.nextDouble();
                   resultado = conversao.realizarConversao("USD","BRL",valorConverter);
                   System.out.println(resultado);
               }
               case 2 -> {
                   System.out.println("Qual valor deseja converter: ");
                   double valorConverter = leitura.nextDouble();
                   resultado = conversao.realizarConversao("BRL","USD",valorConverter);
                   System.out.println(resultado);
               }
               case 3 -> {
                   System.out.println("Qual valor deseja converter: ");
                   double valorConverter = leitura.nextDouble();
                   resultado = conversao.realizarConversao("EUR","BRL",valorConverter);
                   System.out.println(resultado);
               }
               case 4 -> {
                   System.out.println("Qual valor deseja converter: ");
                   double valorConverter = leitura.nextDouble();
                  resultado = conversao.realizarConversao("BRl","EUR",valorConverter);
                   System.out.println(resultado);
               }
               case 5 -> {
                   System.out.println("Qual valor deseja converter: ");
                   double valorConverter = leitura.nextDouble();
                  resultado = conversao.realizarConversao("EGP","BRL",valorConverter);
                   System.out.println(resultado);
               }
               case 6 -> {
                   System.out.println("Qual valor deseja converter: ");
                   double valorConverter = leitura.nextDouble();
                   resultado = conversao.realizarConversao("BRL","EGP",valorConverter);
                   System.out.println(resultado);
               }
               case 7 -> {
                   System.out.println("Saindo.");
               }
               default -> {
                   System.out.println("Opção Inválida");
               }
           }
        }
    }
}
