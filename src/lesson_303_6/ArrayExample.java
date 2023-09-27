package lesson_303_6;

public class ArrayExample {

	public static void main(String[] args) {
		int arraySize = 10;

		double[] doubleArray = new double[arraySize];

		String[] stringArray = new String[arraySize];
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[0] = "zero";
		stringArray[9] = "nine";

		for (int pos = 0; pos < stringArray.length; pos++) {
			System.out.println("The value in position " + pos + " is " + stringArray[pos]);
		}

		System.out.println("=========================");

		for (String value : stringArray) {
			System.out.println("The value = " + value);
		}

		System.out.println("=========================");

		int nullCount = 0;
		for (String value : stringArray) {
			if (value == null) {
				nullCount = nullCount + 1;
			}
		}
		System.out.println("Number of nulls is " + nullCount);

		int firstNull = -1;
		for (int pos = 0; pos < stringArray.length; pos++) {
			if (stringArray[pos] == null) {
				firstNull = pos;
				break;
			}
		}
		System.out.println("Position of the first null is " + firstNull);

		int notNull = 0;
		for (int pos = 0; pos < stringArray.length; pos++) {
			if (stringArray[pos] != null) {
				notNull++;
			}
		}
		System.out.println(notNull + " values are not null");
		
		int notNullEnhanced = 0;
		for (String val: stringArray) {
			if (val != null) {
				notNullEnhanced++;
			}
		}
		System.out.println(notNullEnhanced + " values are not null");

		int lastNull = -1;
		for (int pos = stringArray.length - 1; pos >= 0; pos--) {
			if (stringArray[pos] == null) {
				lastNull = pos;
				break;
			}
		}
		if (lastNull == -1) {
			System.out.println("The array doesnt have a null");
		} else {
			System.out.println("Position of the last null is " + lastNull);
		}

		String letters = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";

		String[] letterArray = letters.split(",");
		String vowels = "aeiou";
		int countNotVowels = 0;
		for (String string : letterArray) {
			if (vowels.indexOf(string) == -1) {
				countNotVowels++;
			}
		}
		System.out.println(countNotVowels + " letters that are not vowels.");
	}

}
