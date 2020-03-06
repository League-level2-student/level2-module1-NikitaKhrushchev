package intro_to_array_lists;
import java.util.ArrayList;
import java.util.stream.IntStream;
public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		String[] s = new String[5];
		s[0] = "I'll have two number nines";
		s[1] = "A number nine large";
		s[2] = "A number six with extra dip";
		s[3] = "Two number forty-fives one with cheese";
		s[4] = "A number seven, and a large soda.";
		//2. Add five Strings to your list
		for (int i = 4; i >= 0;i--) {
			//if (i+1 == 0) {
			System.out.println(s[i]);
			IntStream sd = s[i].chars();
			System.out.println(sd);
	//	}
		}
		
		//3. Print all the Strings using a standard for-loop
		
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
