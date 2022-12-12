import java.util.*;
public class ore{
public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
   
    int rowSizeofArray;
    int columnSizeofArray;
    try {
        System.out.print("Enter the  rowsize for chessboard in integer:");
        
        rowSizeofArray=s.nextInt();
        System.out.println("Enter the columnsize for chessboard in integer:");
        columnSizeofArray=s.nextInt();
        String chessboard[][] = new String[rowSizeofArray][columnSizeofArray];
        System.out.println("Chessboard style");
        System.out.println();
        blackAndWhite(rowSizeofArray, columnSizeofArray, chessboard);
        System.out.println();
        chessBoardAlternatives(rowSizeofArray, columnSizeofArray, chessboard);
        System.out.println(); 
        whiteSurronding(rowSizeofArray, columnSizeofArray, chessboard);
    } catch (Exception e) {
        System.out.println("You enter wrong input");
        System.out.println("Please enter the valid numbers");
    }
    
}
static int blackAndWhite(int row,int column,String[][] chessboard){
    System.out.println("Black in all edges & corners, white in the inners:");
    for(int i = 0;i < row;i++){
        for(int j = 0;j < column;j++){
            if(i == 0 || i == row-1 || j == 0 || j == column-1 || ((i+j)%2 != 0)){
                chessboard[i][j] = "b ";
            }
            else{
                chessboard[i][j] = "W ";
            }
        }
        System.out.println();
    }
    for(int i = 0;i < row;i++){
        for(int j = 0;j < column;j++){
            System.out.print(chessboard[i][j]);
        }
        System.out.println();
    }
    return 0;
}
static int chessBoardAlternatives(int row,int column,String[][] chessboard){
    System.out.println("Black and white alternatives:");
    for(int i = 0;i <  row;i++){
        for(int j = 0;j < column;j++){
            if((i+j)%2 == 0){
                chessboard[i][j] = "w ";
            }
            else if((i+j)%2 != 0){
                chessboard[i][j] = "b ";
            }
        }
        System.out.println();
    }
    for(int i = 0;i < row;i++){
        for(int j = 0;j < column;j++){
            System.out.print(chessboard[i][j]);
        }
        System.out.println();
    }
    return 0;
}
static int whiteSurronding(int row,int column,String[][] chessboard){
    System.out.println("White surounded by black:");
    for(int i = 0;i < row;i++){
        for(int j = 0;j < column;j++){
            if(i%2 == 0 && j%2 == 0){
                chessboard[i][j] = "w ";
            }
            else{
                chessboard[i][j] = "b ";
            }
        }
        System.out.println();
    }
    for(int i = 0;i < row;i++){
        for(int j = 0;j < column;j++){
            System.out.print(chessboard[i][j]);
        }
        System.out.println();
    }
    return 0;
}
}