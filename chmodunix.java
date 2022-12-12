import java.util.Scanner;

public class chmodunix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] chmod = {"---","--x","-w-","-wx","r--","r-x","rw-","rwx"};
        String numericCommands;
        try {
            System.out.println("Enter the numeric commands between 0 to 7 digits:");
            numericCommands = s.nextLine();
            checkChmodCommand(chmod, numericCommands);
        } catch (Exception e) {
            System.out.println("You enter wrong input");
            System.out.println("Please enter valid input");
        }
        
    }
    static int checkChmodCommand(String[] chmod,String numericCommands){
        int numberInnumeric;
        for(int i = 0;i < numericCommands.length();i++){
            numberInnumeric = numericCommands.charAt(i) - '0';
            for(int j = 0;j < chmod.length;j++){
                if(numberInnumeric == j){
                    System.out.print(chmod[j] + " ");
                }
            }
        }
        return 0;
    }
}
