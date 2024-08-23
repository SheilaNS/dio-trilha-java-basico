public class MSNMessenger {

  /*
   * ENCAPSULAMENTO
   * Tornando esses métodos privados, o ComputadorPedrinho não consegue
   * mais ter acesso a eles. Esses métodos ficam disponíveis apenas
   * dentro da própria classe.
   */
  private void validarConnectadoInternet() {
    System.out.println("Validando se está conectado");
  }

  public void enviarMensagem() {
    validarConnectadoInternet();
    System.out.println("Enviando mensagem");
    salvarHistoricoMensagem();
  }

  private void salvarHistoricoMensagem() {
    System.out.println("Salvando o histórico da mensagem");
  }

  public void receberMensagem() {
    System.out.println("Recebendo mensagem");
  }

}
