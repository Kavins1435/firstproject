import java.util.*;
// import java.lang.*;
public class horse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random number = new Random();
        int number0fHorse;
        int winningHorses;
        
        try {
            System.out.println("Enter the number of horses:");
            number0fHorse = s.nextInt();
            float[] horse = new float[number0fHorse];
            float[] sortedHorse = new float[number0fHorse];
            System.out.println("Please enter how many horses to win the race:");
            winningHorses = s.nextInt();
            for(int i = 0;i < number0fHorse;i++){
                horse[i] = number.nextFloat(number0fHorse);
                
            }
            findWinnigHorses(horse, sortedHorse, winningHorses, number0fHorse);
        } catch (Exception e) {
            System.out.println("You enter wrong input");
            System.out.println("Please enter valid input");
        }
    
    }
    static void findWinnigHorses(float[] horse,float[] sortedHorse,int winningHorses,int number0fHorse){
        for(int i = 0;i < number0fHorse;i++){
            sortedHorse[i] = horse[i];
            System.out.print(sortedHorse[i] + " ");
        }
        System.out.println();
        
            float swap;
            for(int i = 0;i < number0fHorse-1;i++){
                if(sortedHorse[i] > sortedHorse[i+1]){
                    swap = sortedHorse[i];
                    sortedHorse[i] = sortedHorse[i+1];
                    sortedHorse[i+1] = swap;
                    i=-1;
                }
            }
            System.out.println("Sorted horses:");
            for(int i=0;i<number0fHorse;i++){
                System.out.print(sortedHorse[i] + " ");
            }
            System.out.println();
            System.out.println("Winning Horses are:");
            int holdNumber = number0fHorse - 1;
            for(int i = 0;i < number0fHorse;i++){
                if(winningHorses == 0){
                        break;
                    }
                else if(horse[i] == sortedHorse[holdNumber]){
                        horse[i] = 0;
                        System.out.print(i + " ");
                        winningHorses--;
                        holdNumber--;
                        i =- 1;
                        }
            }
    }
}
