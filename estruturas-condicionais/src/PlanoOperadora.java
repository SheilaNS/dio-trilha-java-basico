public class PlanoOperadora {
  public static void main(String[] args) {
    String plano = "M";

    switch (plano) {
      case "T": {
        System.out.println("5Gb YouTube");
      }
      case "M": {
        System.out.println("WhatsApp e Instagram grátis");
      }
      case "B": {
        System.out.println("100 minutos de ligação");
      }
    }

    /*
     * Um switch sem break pode ser usado para simplificar
     * uma condicional encadeada que posui instruções repetidas
     * 
     * Mas ATENÇÃO! a ordem dos cases pracisa ser decrescente
     * ao que se quer como instrução
     * 
     * if (plano == "B") {
		 *   System.out.println("100 minutos de ligação");
		 * } else if (plano == "M") {
		 *   System.out.println("100 minutos de ligação");
		 *   System.out.println("WhatsApp e Instagram grátis");	
		 * } else if (plano == "T") {
		 *   System.out.println("100 minutos de ligação");
		 *   System.out.println("WhatsApp e Instagram grátis");	
		 *   System.out.println("5Gb Youtube");	
		 * }
    */
  }
}
