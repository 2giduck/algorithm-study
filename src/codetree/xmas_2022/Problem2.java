package codetree.xmas_2022;

import java.io.*;
import java.util.StringTokenizer;

public class Problem2 {

    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int n;
    static int[] nList;

    static void input() {
        n = scan.nextInt();
        nList = new int[n];
        for (int i = 0; i < n; i++) {
            nList[i] = scan.nextInt();
        }
    }

    public static void main(String[] args) {
        input();
        pro();
    }

    static void pro() {
        int count = 1;
        int min = nList[1] - nList[0];
        for (int i = 1; i < n -1; i++) {

            int temp = nList[i+1] - nList[i];
            if(temp < min) {
                min = temp;
                count = 1;
            }else if(temp == min) {
                count++;
            }
        }
        System.out.println(count);
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
