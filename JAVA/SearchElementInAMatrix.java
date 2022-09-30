class SearchElementInAMatrix {
    static int search(int[][] mat, int n, int x)
    {
        if (n == 0)
            return -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (mat[i][j] == x) {
                    System.out.print( i + ", " + j );
                    return 1;
                }
        }
 
        System.out.print("not found");
        return 0;
    }
    public static void main(String[] args)
    {
        int mat[][] = { { 10, 2, 30, 40 },
                        { 1, 25, 3, 45 },
                        { 27, 9, 3, 48 },
                        { 3, 3, 39, 0 } };
        search(mat, 4, 9);
    }
}