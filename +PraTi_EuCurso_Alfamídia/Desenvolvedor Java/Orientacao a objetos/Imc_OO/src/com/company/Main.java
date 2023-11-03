package com.company;

import imc.Imc;

import imc.ImcLeitura;
import imc.ImcNovo;

public class Main {

    public static void main(String[] args) {
        Imc imc1 = new Imc(80,2.10);
        imc1.setPeso(90);
        System.out.println("A classificação é " + imc1.classificacao());
        ImcNovo imc2 = new ImcNovo(80,2.10, 0.1);
        System.out.println("A classificação é " + imc2.classificacao());
        ImcLeitura imc3 = new ImcLeitura();
        imc3.lerPeso();
        imc3.lerAltura();
        System.out.println("A classificação é " + imc3.classificacao());
    }
}
