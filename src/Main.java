import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String username, password;
        int right = 3;
        int select ;
        int balance = 0;
        while (right>0){
            System.out.print("Enter username :");
            username = scanner.nextLine();
            System.out.print("Enter password :");
            password = scanner.nextLine();
            if (username.equals("fazil")&& password.equals("123")){
                System.out.println("*** Successfully entered... ***");
                do {
                    System.out.println("==============================");
                    System.out.println(
                            "1-Increase balance\n" +
                            "2-Get cash\n" +
                            "3-Show balance\n" +
                            "4-Exit"
                            );
                    System.out.println("==============================");
                    System.out.print("Please select any operation :");
                    select = scanner.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Amount you increase balance: ");
                            int amount = scanner.nextInt();
                            balance+=amount;
                            System.out.println("Successfully increased ...");

                            break;
                        case 2:
                            System.out.print("Amount you got cash: ");
                            int amount2  = scanner.nextInt();
                            if (amount2>balance){
                                System.out.println("not enough balance...");
                            }else {
                                balance-=amount2;
                                System.out.println("Successfully you get cash");
                            }
                            break;
                        case 3:
                            System.out.println("Your balance : "+ balance);
                            break;

                    }

                }while (select!=4);
                System.out.println("Thanks...");
                break;

            } else {
                right--;
                System.out.println("Username or password incorrect... Try again ");
                if (right==0){
                    System.out.println("Your account blocked...");
                }else {
                    System.out.println("Your right for enter " + right);
                }
            }
        }


    }
}