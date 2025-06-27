import java.io.*;
import java.util.*;

public class Dados {

    public static void main(String[] args) throws IOException {
        BufferedReader leia = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int quantidade = 1;

        out.write("Digite a quantidade de dados (pressione Enter para 1 dado):\n");
        out.flush();
        String entrada = leia.readLine().trim();

        if (!entrada.isEmpty()) {
            quantidade = Integer.parseInt(entrada);
        }

        int[] dados = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            dados[i] = (int)(Math.random() * 6) + 1;
        }


        desenharDados(dados, out);

        out.flush();
    }

    public static void desenharDados(int[] dados, BufferedWriter out) throws IOException {
        String[][] faces = {
            {
                "+-------+",
                "|       |",
                "|   *   |",
                "|       |",
                "+-------+"
            },
            {
                "+-------+",
                "| *     |",
                "|       |",
                "|     * |",
                "+-------+"
            },
            {
                "+-------+",
                "| *     |",
                "|   *   |",
                "|     * |",
                "+-------+"
            },
            {
                "+-------+",
                "| *   * |",
                "|       |",
                "| *   * |",
                "+-------+"
            },
            {
                "+-------+",
                "| *   * |",
                "|   *   |",
                "| *   * |",
                "+-------+"
            },
            {
                "+-------+",
                "| *   * |",
                "| *   * |",
                "| *   * |",
                "+-------+"
            }
        };

        for (int linha = 0; linha < 5; linha++) {
            for (int dado : dados) {
                out.write(faces[dado - 1][linha] + "   ");
            }
            out.write("\n");
        }
    }
}
