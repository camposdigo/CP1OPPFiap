package br.com.fiapride.model;

public class Veiculo {

    private String dono;
    private String placa;
    private double gasolina;

    public Veiculo(String dono, String placa, double gasolina) {
        this.dono = dono;
        this.placa = placa;
        setGasolina(gasolina);
    }

    public void adicionarGasolina(double valor) {
        if (valor > 0) {
            gasolina += valor;
        }
    }

    public void gastarGasolina(double valor) {
        if (valor > 0 && gasolina >= valor) {
            gasolina -= valor;
        }
    }

    public String getDono() {
        return dono;
    }

    public String getPlaca() {
        return placa;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        if (gasolina >= 0) {
            this.gasolina = gasolina;
        } else {
            this.gasolina = 0;
        }
    }
}