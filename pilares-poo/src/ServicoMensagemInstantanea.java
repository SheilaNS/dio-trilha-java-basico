/*
 * ABSTRAÇÃO
 * A classe pai tem os métodos, mas cabe aos filhos implementarem 
 * o que eles querem que esses métodos façam.
 * Esse pilar é representado pela palavra reservada 'abstract'
 * e seus métodos não tem corpo.
 */

public abstract class ServicoMensagemInstantanea {

  public abstract void enviarMensagem();
  public abstract void receberMensagem();

  /*
   * HERANÇA
   * Essa classe pai, vai conter todos os métodos comuns dos seus filhos.
   * Todas as classes que 'extends' essa classe, vai poder utilizar 
   * todos os métodos públicos de ServicoMensagemInstantanea.
   * Esse pilar ajuda no reaproveitamento de reutilização de métodos/códigos.
   */

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
