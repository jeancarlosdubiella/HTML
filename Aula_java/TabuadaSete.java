import java.util.Scanner;
public class TabuadaSete {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
        int maior = Integer.MIN_VALUE; // Começa com o menor valor possível

        System.out.println("Digite 5 números:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numeroAtual = leitor.nextInt();

            // Se o número digitado for maior que o atual 'maior', ele assume o trono
            if (numeroAtual > maior) {
                maior = numeroAtual;
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
        leitor.close();
    }
}