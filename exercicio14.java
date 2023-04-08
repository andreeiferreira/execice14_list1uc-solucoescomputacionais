import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o peso dos peixes pescados (em quilos): ");
            double peso = scanner.nextDouble();

            double excesso = 0;
            double multa = 0;

            if (peso > 50) {
                excesso = peso - 50;
                multa = excesso * 4;

                System.out.printf("O peso excedeu o limite em %.2f kg. A multa a ser paga é de R$ %.2f", excesso, multa);
            } else {
                System.out.println("O peso está dentro do limite estabelecido, não há multa a ser paga.");
            }
        }
    }
}