public class SistemaMedida {
  public static void main(String[] args) {
    String sigla = "M";

    switch (sigla) {
      case "P": {
        System.out.println("PEQUENO");
        break;
      }
      case "M": {
        System.out.println("MÉDIO");
        break;
      }
      case "G": {
        System.out.println("GRANDE");
        break;
      }
      default:
        System.out.println("INDEFINIDO");
    }

    /*
     * Essa estrutura tem o mesmo resultado que
     * uma condicional encadeada:
     * 
     * if (sigla = "P")
     *   System.out.println("PEQUENO");
     * else if (silga = "M")
     *   System.out.println("MÉDIO");
     * else if (silga = "G")
     *   System.out.println("GRANDE");
     * else
     *   System.out.println("INDEFINIDO");
     */
  }
}
