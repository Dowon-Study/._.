import java.util.*;

public class Main {
    static int[][] map; // 지도 정보
    static boolean[][] visited; // 방문 여부
    static int n; // 지도의 크기
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 이동
    static int[] dy = {0, 0, -1, 1}; // 상하좌우 이동

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        List<Integer> complexes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    complexes.add(bfs(i, j));
                }
            }
        }

        Collections.sort(complexes); // 오름차순 정렬
        System.out.println(complexes.size()); // 단지 수 출력
        for (int count : complexes) {
            System.out.println(count);
        }
    }

    public static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;

        int count = 0; // 단지 내 집의 수
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            count++;

            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.add(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return count;
    }
}
