
public class Cross {
    static final int K = 7; // Размерность
    public static void main(String[] args) {
        String [][] str = new String [K][K];
        for (int i = 0; i < K; i++)
            for (int j = 0; j < K; j++)
                if ((i == j) || ((i + j) == (K - 1))) str[i][j] = "*";
                else str[i][j] = " ";
        for (int i = 0; i < K; i++)
        {
            for (int j = 0; j < K; j++)
                System.out.print(str[i][j]);
            System.out.println();
        }
    }
}