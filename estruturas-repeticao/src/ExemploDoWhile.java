import java.util.Random;

public class ExemploDoWhile {
  public static void main(String[] args) {
    /*
     * O do while executa o bloco antes de verificar a condição da estrutura de repetição
     * Diferente do while que verifica a condição antes de executar o bloco
     */

    System.out.println("Discando...");

    do {
      System.out.println("Telefone tocando");
    } while (tocando());

    System.out.println("Alô!");
  }

  private static boolean tocando() {
    boolean atendeu = new Random().nextInt(3) == 1;
    System.out.println("Atendeu? " + atendeu);

    // Se ele atendeu, ele para de tocar
    return !atendeu;
  }
}
