import java.util.Scanner;
public class trappingwater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of buildings:");
        int noOfBuilding;  
        try {
            noOfBuilding=s.nextInt();
            
            int[] buildings = new int[noOfBuilding];
            System.out.println("Enter the buildings:");
            for(int i = 0;i < noOfBuilding;i++){
            buildings[i] = s.nextInt();
            }
            findQuantity_Of_Water(buildings, noOfBuilding);
        } catch (Exception e) {
            System.out.println("You enter wrong input");
            System.out.println("Please enter valid input");
        }
        
        
        
    } 
    static int findQuantity_Of_Water(int[] buildings,int noOfBuilding){
        int quantityOfwater = 0;
        int leftMaximumBuilding,rightMaximumBuilding;
        for(int i = 1;i < noOfBuilding-1;i++){
            leftMaximumBuilding = buildings[i]; 
            for(int j = 0;j < i;j++){
                leftMaximumBuilding = Math.max(leftMaximumBuilding, buildings[j]);
            }
            rightMaximumBuilding = buildings[i];
            for(int j = i+1;j < noOfBuilding;j++){
                rightMaximumBuilding = Math.max(rightMaximumBuilding, buildings[j]);
            }
            quantityOfwater = quantityOfwater + (Math.min(leftMaximumBuilding, rightMaximumBuilding) - buildings[i]);
        }
        System.out.println();
        System.out.println(quantityOfwater + " " + "Quantity of water is trapped between blocks during rainy days");
        return 0;
    }
}