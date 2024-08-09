public class ExemploBreakCotinue {
  public static void main(String[] args) {
    for (int i = 0; i <= 5; i++) {
      if (i == 3) {
        // O break interrompe o fluxo do for
        break;
      }
      System.out.println(i);
    }

    System.out.println();
    
    for (int i = 0; i <= 5; i++) {
      if (i == 3) {
        // O continue não interrompe o fluxo do for, mas força o fluxo a continuar, sem processar o que esta depois dele
        // Ele "pula" o número 3
        continue;
      }
      System.out.println(i);
    }

  }
}
