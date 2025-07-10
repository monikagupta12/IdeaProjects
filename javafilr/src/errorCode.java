public class errorCode {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    dfs(i,j, m,n,grid);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(int i , int j ,int m , int n, char[][] grid){
        if(i==m|| j==n||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        dfs(i+1,j,m,n,grid);
        dfs(i,j+1,m,n,grid);
    }

    public static void main(String[] args) {
        errorCode e=new errorCode();
        char[][] arr={{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        int count=e.numIslands(arr);
        System.out.println(count);
    }
}
