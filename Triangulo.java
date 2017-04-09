/**
 * Created by Paulo Pocinho on 03/04/2017.
 */
public class Triangulo extends Forma implements Modificavel {
    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double getArea() {
        return (altura * largura) / 2;
    }

    @Override
    public double getPerimetro() {
        return altura * 2 + largura;
    }

    @Override
    public void modificavel(double x) {
        this.setAltura(getAltura() * x);
        this.setLargura(getLargura() * x);
    }

    public Triangulo(String cor, double altura, double largura) {
        super(3, cor);
        this.altura = altura;
        this.largura = largura;
    }
}
