import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sizeOfArray;
        try {
            System.out.println("Enter the size of queues:");
            sizeOfArray = s.nextInt();
            int[] queue1 = new int[sizeOfArray];
            int[] queue2 = new int[sizeOfArray];
            int[] queue3 = new int[sizeOfArray];
            System.out.println("Enter the estimated time to close the queue:");
            int estimatedTime = s.nextInt();
            createQueues(queue1, queue2, queue3, sizeOfArray, estimatedTime);
        } catch (Exception e) {
            System.out.println("You enter wrong input");
            System.out.println("Please enter the valid input");
        }
        
        
    }
    static int createQueues(int[] queue1,int[] queue2,int[] queue3,int sizeOfArray,int estimatedTime){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the time of single person in queue1:");
        for(int i = 0;i < sizeOfArray;i++){
            queue1[i] = s.nextInt();
        }
        System.out.println("Enter the time of single person in queue2:");
        for(int i = 0;i<sizeOfArray;i++){
            queue2[i] = s.nextInt();
        }
        System.out.println("Enter the time of single person in queue3:");
        for(int i = 0;i < sizeOfArray;i++){
            queue3[i] = s.nextInt();
        }
        checkNoOfPerson1(queue1, estimatedTime, sizeOfArray);
        checkNoOfPerson2(queue2, estimatedTime, sizeOfArray);
        checkNoOfPerson3(queue3, estimatedTime, sizeOfArray);
        return 0;
    }
    static int checkNoOfPerson1(int[] queue1,int estimatedTime,int sizeOfArray){
        int number0fPerson_in_Queue1 = 0;
        for(int i = 0;i < sizeOfArray;i++){
            if(estimatedTime > 0){
                estimatedTime -= queue1[i];
                
            }else{
                number0fPerson_in_Queue1++;
            }
        }
        System.out.println("Number of person left in queue1:" + " " + number0fPerson_in_Queue1);
        return 0;
    }
    static int checkNoOfPerson2(int[] queue2,int estimatedTime,int sizeOfArray){
        int number0fPerson_in_Queue2 = 0;
        for(int i = 0;i < sizeOfArray;i++){
            if(estimatedTime > 0){
                estimatedTime -= queue2[i];
                
            }else{
                number0fPerson_in_Queue2++;
            }   
        }
        System.out.println("Number of person left in queue2:" + " " + number0fPerson_in_Queue2);
        return 0;
    }
    static int checkNoOfPerson3(int[] queue3,int estimatedTime,int sizeOfArray){
        int number0fPerson_in_Queue3 = 0;
        for(int i = 0;i < sizeOfArray;i++){
            if(estimatedTime > 0){
                estimatedTime -= queue3[i];
                
            }else{
                number0fPerson_in_Queue3++;
            }
        }
        System.out.println("Number of person left in queue3:" + " " + number0fPerson_in_Queue3);
        return 0;
    }

}
