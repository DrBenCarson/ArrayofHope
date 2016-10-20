
public class Tester {

	public static void main(String[] args) {
		char []ch = new char [26];
		int asciiCodes = 65;
		for (int i = 0; i < 26; i++) {
			ch[i] = (char) asciiCodes;
			asciiCodes++;
			//System.out.println(ch[i]);
		}
		for (int j=0; j<26; j++)
		{
			if (j==0)
			{
				System.out.print(ch[j]);
			}
			else
			System.out.print(", "+ch[j]);
		}
		

	}

}
