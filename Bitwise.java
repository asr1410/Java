import java.io.*;

public class Bitwise {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i_A = 0; i_A < arr_A.length; i_A++) {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }
        int Q = Integer.parseInt(br.readLine().trim());
        int[][] query = new int[Q][2];
        for (int i_query = 0; i_query < Q; i_query++) {
            String[] arr_query = br.readLine().split(" ");
            for (int j_query = 0; j_query < arr_query.length; j_query++) {
                query[i_query][j_query] = Integer.parseInt(arr_query[j_query]);
            }
        }

        long[] out_ = positiveAND(N, A, Q, query);
        System.out.print(out_[0]);
        for (int i_out_ = 1; i_out_ < out_.length; i_out_++) {
            System.out.print(" " + out_[i_out_]);
        }

        wr.close();
        br.close();
    }

    static long[] positiveAND(int N, int[] A, int Q, int[][] query) {
        long[] result = new long[Q];
        int[] B = new int[A.length];
        B = A.clone();
        for (int i = 0; i < Q; i++) {
            int first = query[i][0];
            int last = query[i][1];
            int count = 0;
            int ans = 0;
            A = B.clone();
            while (ans == 0) {
                ans = A[first - 1];
                for (int j = first; j < last; j++) {
                    ans &= A[j];
                }
                if (ans == 0) {
                    count++;
                    A[last - 1]++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
// 4
// 1 3 5 2
// 2
// 1 3
// 2 4
