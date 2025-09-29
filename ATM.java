import java.util.Scanner;
class  ATM{
  
     float Balance ;
     int pin = 3456;

              public void checkPin(){
              System.out.println("Enter your pin Number");
              Scanner sc = new Scanner(System.in);
              int enterdpin = sc.nextInt();
              if(pin == enterdpin){
                 menu();
               }
             else {
               System.out.println(" Invalid pin !!!! ");
                checkPin();
            }  

         }
              public void menu(){
       
                      System.out.println("Enter your choice");
                      System.out.println(" 1. Check A/C Balance");
                      System.out.println(" 2. Withdrew Balance");
                      System.out.println(" 3. Deposit money");
                      System.out.println(" 4. Exit!!");
                      
                      Scanner sc = new Scanner (System.in);
                      int choiceNumber = sc.nextInt();
                      if (choiceNumber==1){
                           checkBalance();
                          }
                     else if(choiceNumber==2){
                          withDrewBalance(); 
                         }
                     else if(choiceNumber==3){
                         depositMoney();
                     }
                     else if(choiceNumber==4){
                         exit();
                     }
                  
                     else{
                         System.out.println(" please ! Enter valid choice ");
                        }
            } 
             public void checkBalance(){
                      System.out.println(" Balance is : " +Balance);
                      menu();
             }
             public void withDrewBalance(){
                      Scanner sc = new Scanner(System.in);
                      System.out.println("Enter the Amount");
                      double Amount  = sc.nextDouble();
                      if (Balance>=Amount){
                        Balance -= Amount;
                      System.out.println("Amount withdrew is successfull "); 
                       }
                    else {
                        System.out.println("  Insufficient Balance !!!!!!");
                     }
                      
                      menu();
             }
           public void depositMoney(){
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the money");
                    double money = sc.nextDouble();
                    Balance += money;
                    System.out.println("Money is Deposited Successfully ");
                    menu();
 
                  }
          public void exit(){
                   System.out.println(" Exit your Atm card ");
                 }
              
      
}