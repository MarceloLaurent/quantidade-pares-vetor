package view;

import controller.QuantidadeParesController;

public class Main {
    public static void main(String[] args) {

        int []vetor = {0, 3, 7, 8, 14, 15, 30};
        int tamanhoVetor = vetor.length;

        QuantidadeParesController qp = new QuantidadeParesController();

        int resultado = qp.quantidadeParesVetor(vetor, tamanhoVetor);

        System.out.println(resultado);
    }
}