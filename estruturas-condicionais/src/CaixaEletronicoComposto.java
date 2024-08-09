public class CaixaEletronicoComposto {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicitado = 17.0;

    if (valorSolicitado < saldo) {
      saldo = saldo - valorSolicitado;
      System.out.println("Novo saldo: " + saldo);
    } else {
      System.out.println("Saldo insuficiente :(");
    }

    /*
     * Para condições com mais de uma instrução (linha)
     * o uso de {} é obrigatório, dessa forma, essa
     * condição pode ser escrita da seguinte forma também:
     * 
     * if (valorSolicitado < saldo) {
     *   saldo = saldo - valorSolicitado;
     *   System.out.println("Novo saldo: " + saldo);
     * } else
     *   System.out.println("Saldo insuficiente :(");
     * 
     * Repare que o else contém uma instrução por isso
     * ele pode ser escrito sem as {}
     */
  }
}
