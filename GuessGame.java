import java.util.Scanner;
import java.util.Random;
class GuessGame
{

        public static void main(String [] args){

        int min=1;
        int max = 101;
        int ran = min + (int)(Math.random() * (max - min));
        System.out.println("The random number is: " + ran);
        System.out.println("A number is Choosen Between 1 to 100 ");
        
           int k=5;
       System.out.println(" You have only allowed " +k+ " Attempts");
           int i=1;
          while(i<=k){
                      Scanner sc = new Scanner(System.in);
                      System.out.println("Enter the Guess Number \nBest of Luck");
                      int GuessNum = sc.nextInt();
                      if(GuessNum == ran){
                      System.out.println("Congratulation you are Win");
                      sc.close();
                    return ; 
                  }
                 else if(GuessNum> ran){
                   
       System.out.println("Your Number "+ GuessNum + " is Greater than random Number please try again lower value");
                   }
              else{
        System.out.println("Your Number " + GuessNum+ " is less than random Number please try again Higher value");

}
                
             i++;
           }
     System.out.println("You've exhausted all attempts. The correct number was: "+ran);
       // sc.close();
 

     }
}