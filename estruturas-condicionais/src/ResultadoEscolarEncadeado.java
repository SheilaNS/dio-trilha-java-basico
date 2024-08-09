public class ResultadoEscolarEncadeado {
  public static void main(String[] args) {
    int nota = 6;

    if (nota >= 7) {
      System.out.println("Aprovado");
    } else if (nota >= 5 && nota < 7) {
      System.out.println("Recuperação");
    } else {
      System.out.println("Reprovado");
    }

    /*
     * Outra forma de escrever um if - else if - else simples:
     * 
     * if(nota >= 7)
     *  System.out.println("Aprovado");
     * else if (nota >= 5 && nota < 7)
     *  System.out.println("Recuperação");
     * else
     *  System.out.println("Reprovado");
     */

  }
}
