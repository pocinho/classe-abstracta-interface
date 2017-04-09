import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rectangulo[] listaDeRectangulos = new Rectangulo[1];
        Triangulo[] listaDeTriangulos = new Triangulo[1];

        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);

        int op = 0;

        do {
            menu();
            op = Integer.parseInt(s.nextLine());
            switch(op) {
                case 1:
                    criarRectangulo(s, listaDeRectangulos);
                    break;
                case 2:
                    criarTriangulo(s, listaDeTriangulos);
                    break;
                case 3:
                    redimensionarRectangulo(s, listaDeRectangulos);
                    break;
                case 4:
                    redimensionarTriangulo(s, listaDeTriangulos);
                    break;
                case 5:
                    System.out.println("Adeus. Volte Sempre!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (op != 5);

        s.close();
    }

    static void menu() {
        System.out.println("Opções disponíveis:");
        System.out.println(" 1 - Criar Rectangulo");
        System.out.println(" 2 - Criar Triangulo");
        System.out.println(" 3 - Redimensionar Rectangulo");
        System.out.println(" 4 - Redimensionar Triangulo");
        System.out.println(" 5 - Sair");
        System.out.println("Introduza uma opção:");
    }

    static void criarRectangulo(Scanner s, Rectangulo[] listaDeRectangulos) {
        System.out.println("Introduza a cor do rectangulo:");
        String cor = s.nextLine();
        System.out.println("Introduza a altura do rectangulo:");
        double altura = validarDouble(s);
        System.out.println("Introduza a largura do rectangulo:");
        double largura = validarDouble(s);
        listaDeRectangulos[0] = new Rectangulo(cor, altura, largura);
        System.out.println("O rectangulo de cor " + listaDeRectangulos[0].getCor() + " tem de area " + listaDeRectangulos[0].getArea() + " e perimetro " + listaDeRectangulos[0].getPerimetro() + ".");
    }

    static void criarTriangulo(Scanner s, Triangulo[] listaDeTriangulos) {
        System.out.println("Introduza a cor do triangulo:");
        String cor = s.nextLine();
        System.out.println("Introduza a altura do triangulo:");
        double altura = validarDouble(s);
        System.out.println("Introduza a largura do triangulo:");
        double largura = validarDouble(s);
        listaDeTriangulos[0] = new Triangulo(cor, altura, largura);
        System.out.println("O triangulo de cor " + listaDeTriangulos[0].getCor() + " tem de area " + listaDeTriangulos[0].getArea() + " e perimetro " + listaDeTriangulos[0].getPerimetro() + ".");
    }

    static void redimensionarRectangulo(Scanner s, Rectangulo[] listaDeRectangulos) {
        if (listaDeRectangulos[0] != null) {
            System.out.println("Introduza a escala do rectangulo:");
            double escala = validarDouble(s);
            listaDeRectangulos[0].modificavel(escala);
            System.out.println("O rectangulo de cor " + listaDeRectangulos[0].getCor() + " tem de area " + listaDeRectangulos[0].getArea() + " e perimetro " + listaDeRectangulos[0].getPerimetro() + ".");
        } else {
            System.out.println("Crie um rectangulo primeiro.");
        }
    }

    static void redimensionarTriangulo(Scanner s, Triangulo[] listaDeTriangulos) {
        if (listaDeTriangulos[0] != null) {
            System.out.println("Introduza a escala do triangulo:");
            double escala = validarDouble(s);
            listaDeTriangulos[0].modificavel(escala);
            System.out.println("O triangulo de cor " + listaDeTriangulos[0].getCor() + " tem de area " + listaDeTriangulos[0].getArea() + " e perimetro " + listaDeTriangulos[0].getPerimetro() + ".");
        } else {
            System.out.println("Crie um triangulo primeiro.");
        }
    }

    static double validarDouble(Scanner s) {
        double resultado = 0.0;
        do {
            System.out.println("(valor real maior que zero)");
            while (!s.hasNextDouble()) {
                System.out.println("Numero inválido. Introduza um valor real maior que zero.");
                s.nextLine();
            }
            resultado = Double.parseDouble(s.nextLine());
        } while (resultado <= 0);
        return resultado;
    }
}
