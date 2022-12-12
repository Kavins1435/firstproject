import java.util.*;
 class dummy{
      public static int trapping(int[] array,int number){

         int total=0;
       
         for(int index=1;index<number-1;index++){
            int left = array[index];
            for (int j = 0; j < index; j++) {
                left = Math.max(left, array[j]);
            }
             int right = array[index];
            for (int j = index + 1; j < number; j++) {
                right = Math.max(right, array[j]);
            }
           
             total=total+(Math.min(left,right)-array[index]);
             
            }
            System.out.println("total rain water:");
            return total;
       
     }
     public static void main(String[] args){
        Scanner s=new Scanner(System.in);
       
        System.out.println("enter the number:");
        int number=s.nextInt();
        int []array=new int[100];
        System.out.print("array element:");
        for(int index=0;index<number;index++){
            array[index]=s.nextInt();
        }
        System.out.println(trapping(array, number));
     }
   
}
