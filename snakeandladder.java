import java.util.Scanner;

public class snakeandladder {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size_Of_Board=s.nextInt();
        int number=100;
        int[][] snakeAndLadder=new int[size_Of_Board][size_Of_Board];
        for(int i=0;i<size_Of_Board;i++){
            for(int j=0;j<size_Of_Board;j++){
                snakeAndLadder[i][j]=number--;
            }
        }
        for(int i=0;i<size_Of_Board;i++){
            for(int j=0;j<size_Of_Board;j++){
                if(i%2==0){
                    System.out.print(snakeAndLadder[i][j] + " ");
                }
                else{
                    
                }
            }
            System.out.println();
        }

    }
}
