package programmers.etc;

import java.util.LinkedList;
import java.util.Queue;

public class _게임_맵_최단_거리 {
    public static void main(String[] args) {
        int[][] m1 = new int[][] {{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}},
                m2 = new int[][] {{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,0}, {0,0,0,0,1}};
        System.err.println(solution(m1));
        System.err.println(solution(m2));
    }
    
    public static int solution(int[][] maps) {
        int[][] dir = { {1,0}, {-1, 0}, {0, 1}, {0, -1}};
        int[][] dist = new int[maps.length][maps[0].length];
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);   // 시작 위치를 0,0으로 설정
        queue.add(0);
        dist[0][0] = 1;
        
        while(!queue.isEmpty()) {
            var x = queue.poll();
            var y = queue.poll();
            var d = dist[x][y];
            
            for (int i = 0; i < dir.length; i++) {
                var dx = x + dir[i][0];
                var dy = y + dir[i][1];
                
                if(dx < 0 || dy < 0 || dx >= maps.length || dy >= maps[0].length) continue;
                if(maps[dx][dy] ==0) continue;  // 벽이라면
                if(dist[dx][dy] != 0) continue;    // 이미 지나갔다면

                dist[dx][dy] = d + 1;
                queue.add(dx);
                queue.add(dy);
            }
        }
        
        return dist[maps.length-1][maps[0].length-1] == 0 ? -1 : dist[maps.length-1][maps[0].length-1];
    }
}
