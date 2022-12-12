import java.util.*;
public class crossword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of crossword board:");
        int size_Of_array;
        
        try {
            size_Of_array = s.nextInt();
            int[][] crosswordBoard1 = new int[size_Of_array][size_Of_array];
            int[][] crosswordBoard2 = new int[size_Of_array][size_Of_array];
            createCrossWordBoard(crosswordBoard1, crosswordBoard2, size_Of_array);
            
        } catch (Exception e) {
            System.out.println("You enter wrong input");
            System.out.println("Please enter valid input");
        }
    }
    static int createCrossWordBoard(int[][] crosswordBoard1,int[][] crosswordBoard2,int size_Of_array){
        int min = 0;
        int max = 1;
        for(int i = 0;i < crosswordBoard1.length;i++){
            for(int j = 0;j < crosswordBoard1[0].length;j++){
                crosswordBoard1[i][j] = (int)Math.floor(Math.random()*(max-min+1)+min);
                crosswordBoard2[i][j] = crosswordBoard1[i][j];
            }
        }
        for(int i = 0;i < crosswordBoard1.length;i++){
            for(int j = 0;j < crosswordBoard1[0].length;j++){
                System.out.print(crosswordBoard1[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0;i < crosswordBoard1.length;i++){
            for(int j = 0;j < crosswordBoard1[0].length;j++){
                if(crosswordBoard1[i][j] == 1){
                    downCheck(i,j,crosswordBoard1);
                    acrossCheck(i,j, crosswordBoard2);
                }
                    
            }
        }
        return 0;
    }
    static void downCheck(int i,int j,int[][] crosswordBoard1){
        int lengthOfword = 1;
        for(int row = i+1;row < crosswordBoard1.length;row++){
            if(crosswordBoard1[row][j] != 1){
                break;
            }
            crosswordBoard1[row][j] = 2;
            lengthOfword++;
            
        }
        if(lengthOfword > 1){
            System.out.println("Length of word in downwards" + " " +lengthOfword + " " +"in" + " " + j + " " + "column");
        } 
    }
    static void acrossCheck(int i,int j,int[][] crosswordBoard2){
        int lengthOfword = 1;
        for(int col = j+1;col < crosswordBoard2[0].length;col++){
            if(crosswordBoard2[i][col] != 1){
                break;
            }
            crosswordBoard2[i][col] = 2;
            lengthOfword++;
            
        }
        if(lengthOfword > 1){
            System.out.println("Length of word in across   " + " " + lengthOfword + " " + "in" + " " + i +" " + "row");
        } 
    }
}
