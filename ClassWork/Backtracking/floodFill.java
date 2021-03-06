import java.util.Scanner;
public class floodFill {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] maze = new int[n][m];
        for(int i = 0; i<maze.length; i++){
            for(int j = 0; j<maze[0].length; j++){
                maze[i][j] = scn.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodFill(maze, 0, 0, "", visited);
    }
    public static void floodFill(int[][] maze, int row, int col, String psf, boolean[][] visited){
        if(row<0 || col<0 || row>=maze.length || col>=maze[0].length || maze[row][col] == 1 || visited[row][col] == true){
            return;
        }
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(psf);
            return;
        }

        visited[row][col] = true;
        floodFill(maze, row - 1, col, psf + "t", visited);
        floodFill(maze, row, col - 1, psf + "l", visited);
        floodFill(maze, row + 1, col, psf + "d", visited);
        floodFill(maze, row, col + 1, psf + "r", visited);
        visited[row][col] = false;
    }
}
