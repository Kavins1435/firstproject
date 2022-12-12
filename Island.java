import java.util.Scanner;

public class Island {
    static void findIsland(int[][] islands,int i,int j){
        if(i < 0 || j < 0 || i >= islands.length || j >= islands[0].length ||islands[i][j] != 1 ){
            return;
        }else{
        islands[i][j] = 2;
        findIsland(islands, i+1, j);
        findIsland(islands, i, j+1);
        findIsland(islands, i-1, j);
        findIsland(islands, i, j-1);
        findIsland(islands, i+1, j+1);
        findIsland(islands, i-1, j-1);
        findIsland(islands, i+1, j-1);
        findIsland(islands, i-1, j+1);
        }
    }
    static int countIsland(int[][] islands){
        int numberofIsland = 0;
        for(int i = 0;i < islands.length;i++){
            for(int j = 0;j < islands[0].length;j++){
                if(islands[i][j] == 1){
                    findIsland(islands, i, j);
                    numberofIsland++;
                }
            }
        }
        return numberofIsland;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size_Of_array;
        try {
            size_Of_array=s.nextInt();
            int[][] islands=new int[size_Of_array][size_Of_array];
            int min = 0;
            int max = 1;
        for(int i = 0;i < size_Of_array;i++){
            for(int j = 0;j < size_Of_array;j++){
                islands[i][j] = (int)Math.floor(Math.random()*(max-min+1)+min);
            }
        }
        for(int i = 0;i < size_Of_array;i++){
            for(int j = 0;j < size_Of_array;j++){
                System.out.print(islands[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(countIsland(islands)); 
        } catch (Exception e) {
            System.out.println("Please enter valid input:");
        }
        
    }
}