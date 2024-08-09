public class ExemploForArray {
  public static void main(String[] args) {
    String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

    // o índice nos arrays começa sempre em 0
    for (int i = 0; i < alunos.length; i++) {
      System.out.println("O aluno no índice i = " + i + " é " + alunos[i]);
    }
  }
}
