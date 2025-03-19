import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Ss fabricantes imprimem faixas codificadas por cores nos
        //resistores para definir seus valores de resistência. Cada faixa tem uma posição e um valor
        //numérico.
        //As 2 primeiras faixas de um resistor têm um esquema de codificação simples: cada cor é
        //mapeada para um número único. Por exemplo, se eles imprimissem uma faixa marrom (valor
        //1) seguida por uma faixa verde (valor 5), seria traduzido para o número 15.



        String entrada = JOptionPane.showInputDialog("Digite as cores do resistor separado por espaços:");

        String[] faixaCores = entrada.split("\\s+");

        try {
            int resultado = Cores.calcularValor(faixaCores);
            JOptionPane.showMessageDialog(null, "O número correspondente é: " + resultado);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());

        }
    }
}
