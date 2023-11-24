/**
   The SentenceRandomizer class takes an input sentence and jumbles it up into a [hopefully] incoherent sentence.
*/
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class SentenceRandomizer
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a sentence that you want to be jumbled up:");
      String sentence = scanner.nextLine();
      
      System.out.println("Here is an incoherent version of your sentence.");
      System.out.println(StringMixer(sentence, " "));
   }
   /**
      The StringMixer method takes an input string and splits it by a delimiter, then returns a jumbled version.
      @param sentence The input string to mix up.
      @param delimiter The character(s) to delimit the input string.
      @return The jumbled-up string.
   */
   private static String StringMixer(String sentence, String delimiter)
   {
      String[] delimitedValues = sentence.split(delimiter);
      if (delimitedValues.length <= 1) return sentence;
      
      List<String> elementsList = Arrays.asList(delimitedValues);
      Collections.shuffle(elementsList);
      
      String returnString = "";
      
      for (String s : elementsList)
      {
         returnString += s + " ";
      }
      
      return returnString.trim();
   }
}