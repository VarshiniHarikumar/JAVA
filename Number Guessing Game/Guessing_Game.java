import java.util.Random;
import java.util.Scanner;

public class Task1 {
  private static final int minRange = 1;
  private static final int maxRange = 100;
  private static final int maxAttempts = 10;
  private static final int maxRounds = 3;
  
  public static void main(String[] args)
   {
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    int totalScore = 0;
    
    System.out.println("!** WELCOME TO NUMBER GUESSING GAME **!");
    System.out.println("Total Number Of Rounds : 3");
    System.out.println("Attempts To Guess Number In Each Round : 10\n");
    for (int i = 1; i <= maxRounds; i++)
    {
      int number = r.nextInt(maxRange) + minRange;
      int attempts = 0;
      System.out.printf("Round %d: Guess the number between %d and %d in %d attempts.\n", i, minRange, maxRange, maxAttempts);
      while (attempts < maxAttempts) 
      {
        System.out.println("Enter your guess : ");
        int guess_number = s.nextInt();
        attempts = attempts + 1;
        if (guess_number == number) 
        {
          int score = maxAttempts - attempts;
          totalScore = totalScore + score;
          System.out.printf("!*** SUPERB! Number Guessed Successfully ***!. Attempts = %d. Round Score = %d\n",attempts, score);
          break;
        }
        else if (guess_number < number) 
        {
          System.out.printf("The number is greater than %d. Attempts Left = %d.\n", guess_number,maxAttempts - attempts);
        }
        else if (guess_number > number) {
          System.out.printf("The number is less than %d. Attempts Left = %d.\n", guess_number, maxAttempts - attempts);
        }
      }
      if (attempts == maxAttempts) 
      {
        System.out.printf("\nRound = %d\n", i);
        System.out.println("Attempts = 0");
        System.out.printf("The Random Number Is : %d\n\n", number);
      }
    }
    System.out.printf("Game Over. Total Score = %d\n", totalScore);
    s.close();
  }
}
  
