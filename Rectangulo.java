/**
 * Created by Paulo Pocinho on 03/04/2017.
 */
public class Rectangulo extends Forma implements Modificavel {
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
        return altura * largura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (altura + largura);
    }

    @Override
    public void modificavel(double x) {
        this.setAltura(getAltura() * x);
        this.setLargura(getLargura() * x);
    }

    public Rectangulo(String cor, double altura, double largura) {
        super(4, cor);
        this.altura = altura;
        this.largura = largura;
        this.setNumeroDeLados(4);
    }
}
