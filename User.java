import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
   private String firstName;
   private String lastName;
   private String userName;
   private String password;
   private String phoneNumber;
   private int levelOfAccess;
   private int userID;

   Scanner input = new Scanner(System.in);

   public User(String firstName, String lastName, String userName, String password, String phoneNumber, int levelOfAccess) throws CustomException {
      this.setFirstName(firstName); //ima proverka
      this.setLastName(lastName);//ima proverka
      this.setUserName(userName); //ima proverka
      this.setPassword(password);//ima proverka
      this.setPhoneNumber(phoneNumber); //ima proverka
      levelOfAccess = levelOfAccess;
   }

   public static boolean
   isValidCheck(String checkString, String regex) {


      // Compile the ReGex
      Pattern p = Pattern.compile(regex);

      // If the password is empty
      // return false
      if (checkString == null) {
         return false;
      }

      // Pattern class contains matcher() method
      // to find matching between given password
      // and regular expression.
      Matcher m = p.matcher(checkString);

      // Return if the password
      // matched the ReGex
      return m.matches();
   }


   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName){

        if(firstName.isEmpty()==false){
         this.firstName= firstName;

        }else

           while (firstName.isEmpty()==true){
            if (firstName.isEmpty()==true){
            System.out.println("new first name");
            this.firstName = input.nextLine();
            break;
         }
      }
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName){

      if (lastName.isEmpty()==false) {
         this.lastName= lastName;
      }else
         while (lastName.isEmpty()==true) {
            if (lastName.isEmpty()==true) {
               System.out.println("new last name");
               this.lastName = input.nextLine();
               break;
            }
         }
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName){

      this.userName = userName;

      String regex = "(?i)"
              + "(?=.*[a-z])"
              + "(?=\\S+$).{4,20}$";

      this.password = password;

      while (isValidCheck(this.userName, regex) == false) {
         if (isValidCheck(this.userName, regex) == false) {
            System.out.println("new username");
            this.userName = input.nextLine();
         }
      }
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {

      String regex = "(?i)" + "^(?=.*[0-9])"
              + "(?=.*[a-z])"
              + "(?=\\S+$).{4,20}$";

      this.password = password;

      while (isValidCheck(this.password, regex) == false) {
         if (isValidCheck(this.password, regex) == false) {
            System.out.println("new pass");
            this.password = input.nextLine();
         }
      }
   }

   public String getPhoneNumber() {
      return phoneNumber;

   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;

      String regex = "^\\s*(?:\\+?(\\d{1,3}))?[-. (]*(\\d{3})[-. )]*(\\d{3})[-. ]*(\\d{4})(?: *x(\\d+))?\\s*$";

      while (isValidCheck(this.phoneNumber, regex) == false) {
         if (isValidCheck(this.phoneNumber, regex) == false) {
            System.out.println("new number");
            this.phoneNumber = input.nextLine();
         }
      }
   }

   public int getLevelOfAccess() {
      return levelOfAccess;
   }

   public void setLevelOfAccess(int levelOfAccess) {
      levelOfAccess = levelOfAccess;
   }

   public int getuserID(){
      return userID;
   }

   public void setuserID(int userID) {
      this.userID = userID;
   }
}
