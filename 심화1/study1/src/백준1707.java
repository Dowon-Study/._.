import java.util.*;

public class Main {
    static List<Integer>[] graph; // 그래프의 인접 리스트
    static int[] visited; // 방문 상태 및 그룹 정보 저장 (0: 방문 안 함, 1: 그룹 1, -1: 그룹 2)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // 테스트 케이스의 개수

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < k; t++) {
            int v = sc.nextInt(); // 정점의 개수
            int e = sc.nextInt(); // 간선의 개수

            graph = new ArrayList[v + 1];
            visited = new int[v + 1];

            for (int i = 1; i <= v; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < e; i++) {
                int u = sc.nextInt();
                int w = sc.nextInt();
                graph[u].add(w);
                graph[w].add(u);
            }

            boolean isBipartite = true;
            for (int i = 1; i <= v; i++) {
                if (visited[i] == 0) {
                    if (!bfs(i)) {
                        isBipartite = false;
                        break;
                    }
                }
            }

            sb.append(isBipartite ? "YES\n" : "NO\n");
        }

        System.out.println(sb.toString());
    }

    public static boolean bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 1; // 첫 번째 그룹으로 설정

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int next : graph[current]) {
                if (visited[next] == 0) { // 방문하지 않은 정점
                    visited[next] = -visited[current]; // 현재 정점과 다른 그룹으로 설정
                    queue.add(next);
                } else if (visited[next] == visited[current]) { // 같은 그룹에 속하면 이분 그래프가 아님
                    return false;
                }
            }
        }
        return true;
    }
}
