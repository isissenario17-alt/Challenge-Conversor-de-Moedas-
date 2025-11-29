package Principal;

import java.util.Scanner;

public class Menu {
    public int exibirMenu(){
        Scanner leitura = new Scanner(System.in);
        String menu = """
                ********************************************
                |Bem-vindo ao seu Conversor de Moedas|
                A seguir você terá 6 opções de consulta com
                uma opção de saída após a consulta:
                1) USD para BRL
                2) BRL para USD
                3) EUR para BRL
                4) BRL para EUR
                5) GPB para BRL
                6) BRL para GPB
                7) Sair.
                ********************************************
                """;
        System.out.println(menu);
        System.out.println("Digite uma opção para consulta:");
        return leitura.nextInt();
    }

}
