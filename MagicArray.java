import java.util.Random; //imports for random and scanner
import java.util.Scanner;

//the program class that initializes the program
public class MagicArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // variable that stores user answer
    String answer = "";
    System.out.print("Hello my name is Magic 8 Paul. Please tell me your name: ");
    // variable that stores users name
    String name = scan.nextLine();
    System.out.print("Hello " + name + "," + " please ask me a question: ");
    // variable that stores users question
    String question = scan.nextLine();
    // calling the arrayMethod
    arrayMethod();
    System.out.print("Do you want to play again?: ");
    // stores user answer in a variable
    answer = scan.nextLine();
    // if else statements to check if user wants to play again
    if (answer.equals("yes")) {
      System.out.print("please ask me a question: ");
      question = scan.nextLine();
      arrayMethod();
      System.out.print("Do you want to play again?: ");
      answer = scan.nextLine();
    } else {
      System.out.print("Goodbye!");
    }
  }

  // method that contains the array that stores the answers
  public static void arrayMethod() {
    String magicAnswers[] = { "answer1", "answer2", "answer3", "answer4", "answer5",
        "answer6", "answer7", "answer8" };
    int index = new Random().nextInt(magicAnswers.length);
    System.out.println(magicAnswers[index]);
  }
}