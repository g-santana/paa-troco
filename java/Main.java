import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        contaTroco();
    }

    private static void contaTroco() {
        List<Integer> moedas = new ArrayList<Integer>();
        List<Integer> entradas = new ArrayList<Integer>();
        moedas.add(100);
        moedas.add(25);
        moedas.add(10);
        moedas.add(5);
        moedas.add(1);
        entradas.add(55);
        entradas.add(67);
        entradas.add(23);
        entradas.add(141);
        guloso(entradas.get(0), moedas);
        guloso(entradas.get(1), moedas);
        guloso(entradas.get(2), moedas);
        guloso(entradas.get(3), moedas);
    }

    private static void guloso(int entrada, List<Integer> moedas) {
        int troco = entrada;
        int[] moedasUsadas = new int[moedas.size()];
        int numMoedas = 0;
        int i = 0;
        while (troco > 0) {
            if (troco >= moedas.get(i)) {
                troco -= moedas.get(i);
                moedasUsadas[i] += 1;
                numMoedas += 1;
            } else {
                i += 1;
            }
        }
        System.out.println("Valor do troco: " + entrada);
        System.out.println("Número de moedas usadas: " + numMoedas);
        String mensagem = "";
        for (int j = 0; j < moedasUsadas.length; j++) {
            if (moedasUsadas[j] > 0) {
                if ((moedasUsadas[j] == 1) && (moedas.get(j) == 1)) {
                    mensagem += "Foi usada " + moedasUsadas[j] + " moeda de " + moedas.get(j) + " centavo.\n";
                } else if ((moedasUsadas[j] == 1) && (moedas.get(j) != 1)) {
                    mensagem += "Foi usada " + moedasUsadas[j] + " moeda de " + moedas.get(j) + " centavos.\n";
                } else if ((moedasUsadas[j] > 1) && (moedas.get(j) == 1)) {
                    mensagem += "Foram usadas " + moedasUsadas[j] + " moedas de " + moedas.get(j) + " centavo.\n";
                } else {
                    mensagem += "Foram usadas " + moedasUsadas[j] + " moedas de " + moedas.get(j) + " centavos.\n";
                }
            }
        }
        System.out.println(mensagem);
    }
}