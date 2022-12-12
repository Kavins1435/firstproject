import java.util.*;
public class pascal
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int rowSize;
		try {
			System.out.println("Enter the rowSize in integer:");
		    rowSize = s.nextInt();
		    printPascal(rowSize);
			
		} catch (Exception e) {
			System.out.println("You enter wrong input");
			System.out.println("Please enter the valid input");
		}	
	}
    static int printPascal(int rowSize){
		System.out.println("Pascal pyramid:");
        for(int i = 0;i < rowSize;i++){
		    for(int j = 0;j < rowSize - i;j++){
		        System.out.print(" ");
		    }
		    int holdNumber = i;
		    for(int k = 0;k <= i;k++){
		        System.out.print(++holdNumber);
		    }
		    for(int k = 0;k < i;k++){
		        System.out.print(--holdNumber);
		    }
		    System.out.println();
		}
        return 0;
    }
}