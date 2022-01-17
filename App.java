import java.util.Scanner;

public class App {
    public static void main(String[] args) throws CustomException {
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        try {

            int menuNumber = 0;
            int selectedNumber;
            //int productMenuNumber =0;

            User user1 = new User("a", "a", "", "eekspo1rtal", "0882741288", 31);
        //    System.out.println(user1.getPassword());
          //  System.out.println(user1.getFirstName());
        //    System.out.println(user1.getLastName());
           // System.out.println(user1.getPhoneNumber());


            //switch case

/*
            for (int i = 0; i < 80 * 300; i++) { // Default Height of cmd is 300 and Default width is 80
                System.out.println("");

                while (true) {
                    switch (menuNumber) {

                        case 0:
                            System.out.println("Login Screen");

                            System.out.print("Enter username: ");
                            String userName = input.nextLine();  // Read user input
                            System.out.println(" ");
                            System.out.print("Enter password: ");
                            String password = input.nextLine();
                            menuNumber = 1;
                            break;

                        case 1:
                            System.out.println("1. Users" + "\n" + "2. Products" + "\n" + "3. Customers" + "\n" + "4. Log out");
                            selectedNumber = input.nextInt();
                            if (selectedNumber == 1) {
                                menuNumber = 2;

                            }
                            System.out.println(menuNumber);
                            break;


                        case 2:
                            System.out.println("User screen");
                            System.out.println("1. add Users" + "\n" + "2. remove users" + "\n" + "3. ....." + "\n" + "4. back");
                            //System.out.println("check");
                            menuNumber = input.nextInt();




                            if (menuNumber==4){
                                menuNumber=1;
                            }

                            //System.out.println(menuNumber);

                            break;

                        case 3:
                            System.out.println("Product screen");
                            System.out.println("check");
                            menuNumber = input.nextInt();
                            System.out.println(menuNumber);

                            break;


                    }
                }
            }
*/
        } catch (CustomException e) {
            System.out.println(e.getMessage());

            // System.out.println("tet");

            //  System.out.println("Username is: " + userName);


            //  System.out.println("ready");
            //    String userName1 = myObj.nextLine();  // Read user input

            //     System.out.println("Username is: " + userName1);


        }

    }
}

