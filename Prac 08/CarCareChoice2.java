import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args){
        String[] services = {"oil change", "tire rotation", "battery check", "break inspection"};
        int[] prices = {25, 22, 15, 5};
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a service:" +
                "\n- Oil change" +
                "\n- Tire rotation" +
                "\n- Battery check" +
                "\n- Break inspection");
        String userInput = input.nextLine();

        boolean valid = false;

        for(int i = 0; i < services.length; ++i ){
            if (services[i].substring(0,3).equalsIgnoreCase(userInput.substring(0, 3))){
                System.out.println("The cost of " + services[i] + " is $" + prices[i]);
                valid = true;
            }
        }

        if(!valid){
            System.out.println("You have entered an invalid choice of: " + userInput);
        }
    }

}