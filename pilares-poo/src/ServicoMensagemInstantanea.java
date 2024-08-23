public class ServicoMensagemInstantanea {

  /*
   * HERANÇA
   * Essa classe pai, vai conter todos os métodos comuns dos seus filhos.
   * Todas as classes que 'extends' essa classe, vai poder utilizar 
   * todos os métodos públicos de ServicoMensagemInstantanea.
   * Esse pilar ajuda no reaproveitamento de reutilização de métodos/códigos.
   */
  public void enviarMensagem() {
    validarConnectadoInternet();
    System.out.println("Enviando mensagem");
    salvarHistoricoMensagem();
  }
  
  public void receberMensagem() {
    System.out.println("Recebendo mensagem");
  }

   /*
    * ENCAPSULAMENTO
    * Tornando esses métodos privados, outras classes não conseguem
    * mais ter acesso a eles. Esses métodos ficam disponíveis apenas
    * dentro da própria classe.
    */

  private void validarConnectadoInternet() {
    System.out.println("Validando se está conectado");
  }

  private void salvarHistoricoMensagem() {
    System.out.println("Salvando o histórico da mensagem");
  }
}
