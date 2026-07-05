class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length, m = matrix[0].length;
        int RS = 0, CS = 0, RE = n - 1, CE = m - 1;
        while (RS <= RE && CS <= CE) {
            for (int j = CS; j <= CE; j++)
                list.add(matrix[RS][j]);
            RS++;

            for (int i = RS; i <= RE; i++)
                list.add(matrix[i][CE]);
            CE--;

            if (RS <= RE) {
                for (int j = CE; j >= CS; j--)
                    list.add(matrix[RE][j]);
                RE--;
            }

            if (CS <= CE) {
                for (int i = RE; i >= RS; i--)
                    list.add(matrix[i][CS]);
                CS++;
            }
        }
        return list;
    }
}