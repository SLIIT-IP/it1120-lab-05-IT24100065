import java.util.Scanner;

public class IT24100065lab05Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of new members introduced: ");
        int numMembers = scanner.nextInt();

        if (numMembers < 0) {
            System.out.println("Invalid input. The number of new members must be greater than or equal to 0.");
        } else {
           
            String prize;
            switch (numMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }

           
            System.out.println("The prize is: " + prize);
        }

        scanner.close();
    }
}
