public class ComputadorPedrinho {
    public static void main(String[] args) throws Exception {
        /*
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("FACEBOOK");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("TELEGRAM");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
        */

        /*
         * POLIMORFISMO
         * Cada objeto tem sua forma de executar o mesmo método.
         * Esse pilar pode ser associado a palavra reservada 'protected'
         */
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        switch (appEscolhido) {
            case "msn":
                smi = new MSNMessenger();
                break;
            case "fcb":
                smi = new FacebookMessenger();
                break;
            case "tlg":
                smi = new Telegram();
                break;
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
