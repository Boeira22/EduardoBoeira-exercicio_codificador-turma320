import java.time.LocalDate;

public class CodificadorFischer implements Codificador {

    public String getNome() {
        return "Codificador Fischer (ATBASH)";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2026, 8, 16);
    }

    public int getNivelSeguranca() {
        return 20;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {

            if (c >= 'A' && c <= 'Z') {
                encoded.append((char) ('Z' - (c - 'A')));

            } else if (c >= 'a' && c <= 'z') {
                encoded.append((char) ('z' - (c - 'a')));

            } else {
                encoded.append(c);
            }
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        // O algoritmo Atbash é simétrico:
        // aplicar o mesmo processo novamente recupera o texto original.
        return codifica(str);
    }
}