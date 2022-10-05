import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a medida do lado do quadrado? ");
        double lado = sc.nextDouble();

        double area;
        area = lado * lado;
        System.out.println("A área do quadrado corresponde a: " + area + ". O dobro da sua área é igual a: " + area * 2);
    }
}
