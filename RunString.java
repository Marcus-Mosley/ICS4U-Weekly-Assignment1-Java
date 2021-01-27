import java.util.Scanner;

/**
* The Run program implements an application that
* calculates the max run of characters in a string..
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-26
*/
public class RunString {
  /**
  * The maxRun method calculates the max run.
  */
  public static int maxRun(String str) {
    char runChar = str.charAt(0);
    int runCount = 1;
    int max = 0;

    for (int counter = 1; counter < str.length(); counter++) {
      if (str.charAt(counter) == runChar) {
        runCount += 1;
        if (runCount > max) {
          max = runCount;
        }
      } else {
        runCount = 1;
        runChar = str.charAt(counter);
      }
    }
    return max;
  }

  /**
  * The Main method receives input.
  */
  public static void main(String[] args) {
    String str;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the String to find its Max Run: ");
    str = input.nextLine();

    int max = maxRun(str);
    System.out.print("The Max Run of " + str + " is " + max);
  }
}
