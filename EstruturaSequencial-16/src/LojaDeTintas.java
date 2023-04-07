import java.util.Scanner;

public class LojaDeTintas {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o tamanho da área a ser pintada em metros quadrados
        System.out.print("Digite o tamanho da área a ser pintada (em metros quadrados): ");
        double area = scanner.nextDouble(); // Lê o tamanho da área digitado pelo usuário

        // Cálculos
        int latas = (int) Math.ceil(area / 3 / 18); // Calcula a quantidade de latas de tinta necessárias, arredondando para cima
        double precoTotal = latas * 80; // Calcula o preço total das latas de tinta

        // Exibir os resultados
        System.out.println("Quantidade de latas de tinta: " + latas);
        System.out.println("Preço total: R$ " + precoTotal);

        // Fechar o objeto Scanner
        scanner.close();
    }
}
