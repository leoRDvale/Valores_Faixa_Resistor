
import java.util.ArrayList;
import java.util.List;

public class Cores {
    private static final List<Cor> cores = new ArrayList<>();

    static {
        cores.add(new Cor("preto", 0));
        cores.add(new Cor("marrom", 1));
        cores.add(new Cor("vermelho", 2));
        cores.add(new Cor("laranja", 3));
        cores.add(new Cor("amarelo", 4));
        cores.add(new Cor("verde", 5));
        cores.add(new Cor("azul", 6));
        cores.add(new Cor("violeta", 7));
        cores.add(new Cor("cinza", 8));
        cores.add(new Cor("branco", 9));
    }

    public static int calcularValor(String[] coresEntrada) {
        if (coresEntrada == null || coresEntrada.length < 2) {
            throw new IllegalArgumentException("Insira pelo menos duas cores.");
        }

        int primeiroValor = getValorCor(coresEntrada[0].toLowerCase());
        int segundoValor = getValorCor(coresEntrada[1].toLowerCase());

        return primeiroValor * 10 + segundoValor;
    }

    private static int getValorCor(String cor) {
        for (Cor c : cores) {
            if (c.getNome().equals(cor)) {
                return c.getValor();
            }
        }
        throw new IllegalArgumentException("Cor inválida: " + cor);
    }
}

class Cor {
    private String nome;
    private int valor;

    public Cor(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }
}