import java.time.LocalDate;

public class CodificadorBoeira implements Codificador{
    public String getNome() {
        return "Codificador Boeira (ROT13)";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2026, 8, 17);
    }

    public int getNivelSeguranca() {
        return 30; // ROT13 é bem básico
    }

    public String codifica(String str) {
         StringBuilder resultado = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                resultado.append((char) ((c - 'a' + 13) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                resultado.append((char) ((c - 'A' + 13) % 26 + 'A'));
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public String decodifica(String str) {
        return codifica(str); // ROT13 é simétrico então vise e versa
    }

    
}
