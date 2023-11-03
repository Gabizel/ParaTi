package imc;

public class Imc {
    public double getPeso() {

        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) return;
        this.peso = peso;
    }

    private double peso;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double altura;

    public double getImc() {
        return imc;
    }

    private double imc;

    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Imc(double peso, double altura, double x1) {
        this.peso = peso;
        this.altura = altura + x1;
    }

    public void calculaImc() {
        this.imc = ( (this.peso) / (this.altura * this.altura)) ;
    }

    public String classificacao() {
        this.calculaImc();
        if (this.imc < 18.5) return "magreza";
        if (this.imc < 24.9) return "normal";
        if (this.imc < 29.9) return "sobrepeso";
        if (this.imc < 39.9) return "obesidade";
        return "obesidade grave";
    }

}
