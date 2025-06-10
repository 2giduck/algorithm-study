package baekjoon.silver.t5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _8979 {

    static class Country {
        int num;
        int gold;
        int silver;
        int bronze;
        int sum;

        boolean isSameMedal(Country other) {
            return this.gold == other.gold &&
                    this.silver == other.silver &&
                    this.bronze == other.bronze;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Country> countries = new ArrayList<>();
        for(int i = 0; i< n; i++) {
            st = new StringTokenizer(br.readLine());
            Country country = new Country();
            country.num = Integer.parseInt(st.nextToken());
            country.gold = Integer.parseInt(st.nextToken());
            country.silver = Integer.parseInt(st.nextToken());
            country.bronze = Integer.parseInt(st.nextToken());
            country.sum = country.gold + country.silver + country.bronze;
            countries.add(country);
        }

        Collections.sort(countries, new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                if(o1.gold == o2.gold) {
                    if(o1.silver == o2.silver) {
                        if(o1.bronze == o2.bronze) {
                            return 0;
                        }else {
                            return o2.bronze - o1.bronze;
                        }
                    }else {
                        return o2.silver - o1.silver;
                    }
                }

                return o2.gold - o1.gold;
            }
        });

        int rank = 1;
        int realRank = 1;

        Country prev = countries.get(0);

        if (prev.num == k) {
            System.out.println(realRank);
            return;
        }

        for (int i = 1; i < n; i++) {
            Country cur = countries.get(i);

            if (!cur.isSameMedal(prev)) {
                rank = i + 1; // 새로운 등수
            }

            if (cur.num == k) {
                System.out.println(rank);
                return;
            }

            prev = cur;
        }
    }
}
