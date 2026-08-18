public class App {

    public static void main(String[] args) throws Exception {

        String texto = "Tri Campeao da Libertadores e Maior do Sul";

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


        // Codificador Lucas Fischer
        Codificador codFischer = new CodificadorFischer();

        System.out.println("\n===== " + codFischer.getNome() + " =====");
        System.out.println("Versao: " + codFischer.getDataCriacao());
        System.out.println("Nivel de seguranca: " + codFischer.getNivelSeguranca());

        String codificadoFischer = codFischer.codifica(texto);
        String decodificadoFischer = codFischer.decodifica(codificadoFischer);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto codificado: " + codificadoFischer);
        System.out.println("Texto decodificado: " + decodificadoFischer);

        // Codificador Eduardo Boeira
        Codificador codBoeira = new CodificadorBoeira();

        System.out.println("\n===== " + codBoeira.getNome() + " =====");
        System.out.println("Versao: " + codBoeira.getDataCriacao());
        System.out.println("Nivel de seguranca: " + codBoeira.getNivelSeguranca());

        String codificadoBoeira = codBoeira.codifica(texto);
        String decodificadoBoeira = codBoeira.decodifica(codificadoBoeira);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto codificado: " + codificadoBoeira);
        System.out.println("Texto decodificado: " + decodificadoBoeira);
    }
}