import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
  public static void main(String[] args) {
    double mesada = 50.0;

    while (mesada > 0) {
      double valorDoce = valorAleatorio();

      if (valorDoce > mesada) {
        valorDoce = mesada;
      }

      System.out.printf("Doce do valor: %.2f adicionado no carrinho. \n", valorDoce);
      mesada = mesada - valorDoce;
    }

    System.out.println("Mesada: " + mesada);
    System.out.println("Joãozinho gastou toda a sua mesada em doces.");
  }

  // Esse método cria um valor aleatório entre 2 e 8
  private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 8);
  }
}
