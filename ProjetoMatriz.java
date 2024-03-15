import java.util.Scanner;

public class ProjetoMatriz {

    public static void main(String[] args) {
        int[][] quant = new int[3][3];
        Scanner s = new Scanner(System.in);
        int produtoPrimeiraLinha = 1;
        int somaPrimeiraColuna = 0;
        int somaTotal = 0;
        int somaDiagonalPrincipal = 0;

        // Ler os valores
        for (int i = 0; i < quant.length; i++) {
            for (int j = 0; j < quant[i].length; j++) {
                System.out.println("Informe o valor:");
                quant[i][j] = s.nextInt();
            }
            System.out.println();
        }

        // Exibir os valores em forma de tabela
        System.out.println("Valores informados:");
        for (int i = 0; i < quant.length; i++) {
            for (int j = 0; j < quant[i].length; j++) {
                System.out.print(quant[i][j] + "\t");
            }
            System.out.println(); // Adicionando uma quebra de linha após cada linha da matriz
        }

        for (int i = 0; i < 3; i++) {
            somaPrimeiraColuna += quant[i][0];
        }
        for (int j = 0; j < 3; j++) {
            produtoPrimeiraLinha *= quant[0][j];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaTotal += quant[i][j];
            }
        }
        for (int j = 0; j < 3; j++) {
            somaDiagonalPrincipal += quant[j][j];
        }

        
        System.out.println("Soma da primeira coluna: " + somaPrimeiraColuna);
        System.out.println("Produto da primeira linha: " + produtoPrimeiraLinha);
        System.out.println("Soma total: " + somaTotal);
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);

        s.close(); // Fechando o Scanner para evitar vazamentos de recursos
    }
}
