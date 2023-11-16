import java.util.LinkedList;
import java.util.Queue;

class Solution {

    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int solution(int[][] maps) {
        int rows = maps.length;
        int cols = maps[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});

        while (!queue.isEmpty()) {
            int[] current = queue.remove();
            int currentRow = current[0];
            int currentCol = current[1];
            int currentDistance = current[2];

            if (currentRow == rows - 1 && currentCol == cols - 1) {
                return currentDistance;
            }

            for (int[] direction : DIRECTIONS) {
                int newRow = currentRow + direction[0];
                int newCol = currentCol + direction[1];

                if (isValid(newRow, newCol, rows, cols) && maps[newRow][newCol] == 1) {
                    queue.add(new int[]{newRow, newCol, currentDistance + 1});
                    maps[newRow][newCol] = 0; // 방문한 위치는 0으로 표시하여 재방문을 방지
                }
            }
        }

        return -1; // 도착점에 도달할 수 없는 경우
    }

    private boolean isValid(int row, int col, int rows, int cols) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }
}
