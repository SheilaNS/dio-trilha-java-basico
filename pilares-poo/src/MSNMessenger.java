public class MSNMessenger extends ServicoMensagemInstantanea {

  @Override
  public void enviarMensagem() {
    System.out.println("Enviando mensagem pelo MSN Messenger");
    salvarHistoricoMensagem();
  }

  @Override
  public void receberMensagem() {
    System.out.println("Recebendo mensagem pelo MSN Messenger");
  }

  @Override
  public void salvarHistoricoMensagem() {
    System.out.println("Salvando o histórico de mensagem no MSN Messenger");
  }

}
