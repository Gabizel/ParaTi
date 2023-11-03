

import java.util.Scanner;

public class Main {
    public static void calculoImc(double peso, double altura) {

        double[] pesosImc = {18.5, 24.9, 29.9, 39.9, 90000};
        String[] classificacoesImc = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade Grave"};
        double imc = peso / (altura * altura);
        System.out.println("O IMC é: " + imc);

        int i = 0;
        while (imc > pesosImc[i]) {
            i++;
        }
        System.out.println("A cssificação é: " + classificacoesImc[i]);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String teste = "s";
        while (teste.equals("s")) {
            System.out.println("Calcular IMC? (s/n)");
            teste = entrada.nextLine();
            if (teste.equals("s")) {
                System.out.println("Entre com o peso em kg:");
                double peso = entrada.nextFloat();
                entrada.nextLine();
                System.out.println("Entre com a altura em metros:");
                double altura = entrada.nextFloat();
                entrada.nextLine();
                calculoImc(peso, altura);
            }
        }
    }
}
    /*public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(("Entre com peso em kg:"));
        float peso = entrada.nextFloat();

        System.out.println(("Entre com a altura em metros:"));
        Float altura = entrada.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println(("O imc é: " + imc));

        String classificacao = "";
        if(imc < 18.5) classificacao = "Magreza";
        else if(imc < 24.9) classificacao = "Normal";
        else if(imc < 29.9) classificacao = "Sobrepeso";
        else if(imc < 39.9) classificacao = "Obesidade";
        else classificacao = "Obesidade grave";

        System.out.println(("A classificação é: " + classificacao));
    }
}*/