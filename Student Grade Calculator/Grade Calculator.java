import java.util.Scanner;

public class Task2 
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of Grades: ");
    int numGrades = s.nextInt();
    int[] grades = new int[numGrades];
    
    for(int i = 0; i < numGrades; i++) 
    {
      System.out.print("Enter the Grades: " + (i + 1) + ": ");
      grades[i] = s.nextInt();

    }
    
    s.close();
    
    int total = 0;
    for(int i = 0; i < numGrades; i++) 
    {
      total += grades[i];
    }
    
    double avg = (double) total / numGrades;
    
    System.out.println("Average Grade is: " + avg);
  }
}
  

