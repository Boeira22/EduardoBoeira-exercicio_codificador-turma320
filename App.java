public class App {

    public static void main(String[] args) throws Exception {

        String texto = "Este e o string a ser codificado";

        // Codificador Simples
        Codificador codSimples = new CodificadorSimples();

        System.out.println("===== " + codSimples.getNome() + " =====");
        System.out.println("Versao: " + codSimples.getDataCriacao());
        System.out.println("Nivel de seguranca: " + codSimples.getNivelSeguranca());

        String codificadoSimples = codSimples.codifica(texto);
        String decodificadoSimples = codSimples.decodifica(codificadoSimples);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto codificado: " + codificadoSimples);
        System.out.println("Texto decodificado: " + decodificadoSimples);


        // Codificador Fischer
        Codificador codFischer = new CodificadorFischer();

        System.out.println("\n===== " + codFischer.getNome() + " =====");
        System.out.println("Versao: " + codFischer.getDataCriacao());
        System.out.println("Nivel de seguranca: " + codFischer.getNivelSeguranca());

        String codificadoFischer = codFischer.codifica(texto);
        String decodificadoFischer = codFischer.decodifica(codificadoFischer);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto codificado: " + codificadoFischer);
        System.out.println("Texto decodificado: " + decodificadoFischer);
    }
}