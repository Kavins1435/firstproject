import java.util.*;
public class missingnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array in integer:");
        int size_Of_array;
        try {
            size_Of_array=s.nextInt();
            int[] missNumber = new int[size_Of_array];
            System.out.println("Enter the list of numbers in negative:");
            for(int i=0;i<size_Of_array;i++){
               missNumber[i] = s.nextInt();
            }
            findMissingNumber(missNumber, size_Of_array);
            
        } catch (Exception e) {
            System.out.println("You enter wrong input");
            System.out.println("Please enter the valid input");
        }
    }
    static int findMissingNumber(int[] missNumber,int size_Of_array){
        System.out.println("Sorted array");
        Arrays.sort(missNumber);

        for(int i = 0;i < size_Of_array;i++){
            System.out.print(missNumber[i] + " ");
        }
        System.out.println();
        System.out.println("Missing number:");
        int missingNumber = missNumber[0];
        for(int i = 0;i < size_Of_array;i++){
            if(missNumber[i] != missingNumber){
                System.out.println(missingNumber);
                break;
            }  
            missingNumber += 1;
        }
        return 0;
    }
}
