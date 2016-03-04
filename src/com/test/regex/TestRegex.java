package com.test.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ank
 *
 *         1 [abc] a, b, or c (simple class) 
 *         2 [^abc] Any character except a, b, or c (negation) 
 *         3 [a-zA-Z] a through z or A through Z, inclusive (range) 
 *         4 [a-d[m-p]] a through d, or m through p: [a-dm-p] (union) 
 *         5 [a-z&&[def]] d, e, or f (intersection) 
 *         6 [a-z&&[^bc]] a through z, except for b and c: [ad-z] (subtraction) 
 *         7 [a-z&&[^m-p]] a through z, and not m through p: [a-lq-z](subtraction)
   
 *          X?	X occurs once or not at all
			X+	X occurs once or more times
			X*	X occurs zero or more times
			X{n}	X occurs n times only
			X{n,}	X occurs n or more times
			X{y,z}	X occurs at least y times but less than z times
			
*			.	Any character (may or may not match terminator)
			\d	Any digits, short of [0-9]
			\D	Any non-digit, short for [^0-9]
			\s	Any whitespace character, short for [\t\n\x0B\f\r]
			\S	Any non-whitespace character, short for [^\s]
			\w	Any word character, short for [a-zA-Z_0-9]
			\W	Any non-word character, short for [^\w]
			\b	A word boundary
			\B	A non word boundary
			

 */

public class TestRegex {

	public static void main(String args[]) {

		boolean b3 = Pattern.matches(".s", "as");
		System.out.println(Pattern.matches(".s", "as"));// true (2nd char is s)
		System.out.println(Pattern.matches(".s", "mk"));// false (2nd char is
														// not s)
		System.out.println(Pattern.matches(".s.", "mst"));// true (has 2nd char
															// )
		System.out.println(Pattern.matches(".s", "amms"));// false (has more
															// than 2 char)
		System.out.println(Pattern.matches("..s", "mas"));// true (3rd char is
															// s)

		// String to be scanned to find the pattern.
		String line = "This order was placed for QT3000! OK?";

		// Its a Group
		// 0Group = (.*),
		// 1Group = (\\d+)
		// 2Group = (.*)
		String pattern = "(.*)(\\d+)(.*)";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);

		// Now create matcher object.
		Matcher m = r.matcher(line);

		System.out.println("grp :: " + m);

		if (m.find()) {
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
		} else {
			System.out.println("NO MATCH");
		}
	}

}
