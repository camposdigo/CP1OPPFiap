package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Main {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Carlos", "ABC-1234", 0);

        v1.adicionarGasolina(50);
        v1.gastarGasolina(30);

        System.out.println("Dono: " + v1.getDono() +
                " | Placa: " + v1.getPlaca() +
                " | Gasolina: " + v1.getGasolina());
    }
}