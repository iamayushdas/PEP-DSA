import java.util.*;

public class sorting2Darray {
    public static void main(String[] args){
        int [][] arr = {{1,4},{5,7},{3,12},{18,2},{6,10}};

        Arrays.sort(arr,(a,b)->{
            return a[0] - b[0];
        });

        for(int[] d : arr){
            System.out.println(d[0] + "," + d[1]);
        }
    }
}
