import java.net.http.WebSocketHandshakeException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        AtmOperationInterf op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin = 123;

        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to ATM JAVA!\n");
        System.out.print("Enter ATM Number: ");
        int number = in.nextInt();

        System.out.print("Enter Pin: ");
        int pin = in.nextInt();
        
        if((atmnumber == number) && (atmpin == pin)){
            System.out.println("Validation Done\n");
            while(true){
                System.out.println("1. View Available Balance\n");
                System.out.println("2. Withdraw Amount\n");
                System.out.println("3. Deposit Amount\n");
                System.out.println("4. View Ministatement\n");
                System.out.println("5. Exit\n");
                System.out.println("Enter Choice: ");
                int ch = in.nextInt();
                System.out.println("\n");
                
                if(ch == 1){
                    op.viewBalance();
                }
                else if(ch == 2){
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(ch == 3){
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = in.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(ch == 4){
                    op.viewMiniStatement();
                }
                else if(ch == 5){
                    System.out.println("Collect your ATM Card\n");
                    System.exit(0);
                }
                else{
                    System.out.println("Not a vailed choice");
                }
            }
        }
        else{
            System.out.println("Incorrect ATM Number or Pin");
            System.exit(0);
        }
    }
}
