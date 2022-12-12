import java.util.Scanner;

public class sudoku{ 
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of sudoku in integer:");
        int rows = s.nextInt();
        int min = 0;
        int max = 9;
        int[][] sudokuBoard = new int[rows][rows];
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < rows;j++){
                sudokuBoard[i][j] = (int)Math.floor(Math.random()*(max-min+1)+min);
            }
        }
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < rows;j++){
                System.out.print(sudokuBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the insertrow in integer:");
        int insertRows = s.nextInt();
        System.out.println("Enter the insertcolumn in integer:");
        int insertColumns = s.nextInt();
        System.out.println("Enter the insertnumber in integer:");
        int insertNumber = s.nextInt();
        
        boolean results = sudokuCalc(insertRows,insertColumns,insertNumber,sudokuBoard,rows) && shellCalc(insertRows, insertColumns, insertNumber, sudokuBoard);
        
        
        if(results == true){
            sudokuBoard[insertRows][insertColumns] = insertNumber;
            System.out.println();
            for(int i = 0;i < rows;i++){
                for(int j = 0;j < rows;j++){
                    System.out.print(sudokuBoard[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Number is Inserted");
        }else{
            System.out.println("Number is Not inserted");
        }
        

    }
    static boolean sudokuCalc(int insertRows,int insertColumns,int insertNumber,int[][] sudokuBoard,int rows){
            for(int i = 0;i < rows;i++){
                if (sudokuBoard[i][insertColumns] == insertNumber || sudokuBoard[insertRows][i]==insertNumber) { 
                    return false;
                }   
            }  
            return true;
    }
    static boolean shellCalc(int insertRows,int insertColumns,int insertNumber,int[][] sudokuBoard){
        
        int shellRow = insertRows-(insertRows%3);
        int shellColumn = insertColumns-(insertColumns%3);
        for(int i = shellRow;i < shellRow+3;i++){
            for(int j = shellColumn;j < shellColumn+3;j++){
                if(sudokuBoard[i][j] == insertNumber){
                    return false;
                }
            }
        }
        
        return true;
    }
}
