import java.util.*;

public class ThreeLetterAcronym {

    public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String TLA = "", entry;
      int stringLength;
      int i;
      int count = 0;
      int MAX = 3;
      char c;
      System.out.print("Please enter three words: ");
      answer = input.nextLine();
      stringLength = answer.length();
      TLA += Character.toUpperCase(answer.charAt(0));
      ++count;
      for(i = 1; i < stringLength; i++)
      {
         if(count < MAX)
         {
            if(answer.charAt(i) == ' ')
            {
               ++i;
               c = answer.charAt(i);
               c = Character.toUpperCase(c);
               TLA += c;
               ++count;
            }
         }
      }
      System.out.println( "Original phrase was " +
         answer );
        System.out.println("The Three letter acronym is " + TLA);
    /* user enters 3 words, display 3 letter acronym based on first 3 letter words
        ignore any extra words */

   }  
}
