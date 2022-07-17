import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, passWord,choose, otherPas ;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the username: ");
        userName = input.nextLine();

        System.out.println("Please enter the password: ");
        passWord = input.nextLine();

          if (userName.equals("patika")&&passWord.equals("java") ){
            System.out.println("Successfull entering!");
          }
          else{
            System.out.print("Wrong username or password, if continue \"yes\" or \"no\" choose one");
              choose = input.nextLine();
               if (choose.equals("no") )
               {
                   System.out.println("Ending");
               }
               else
               {
                   System.out.println(" Enter the new password: ");
                   otherPas=input.nextLine();

                  if( otherPas.equals("java")|| otherPas.equals(passWord)){
                  System.out.println("Try again");
                 }
                 else{
                  System.out.println("Process complete!");
                 }
               }

          }

          }

    }
