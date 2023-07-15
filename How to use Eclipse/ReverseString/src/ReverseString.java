
public class ReverseString {

		public static void main(String[] args) {
			
			System.out.println(reverse("dog"));
			
			System.out.println(reverses("dog"));
		}
		
		public static String reverse(String s) {
			for(int i = s.length() - 1; i >=0; i--) {
				char a=s.charAt(i);
				System.out.print(a);
			}
			System.out.print( " : The reversed word");
			System.out.println();
			System.out.print("The original word ");
			return s;
		}
		
		
		
		public static String reverses(String s) {
			char [] letters = new char[s.length()];
			int letterIndex=0;
			for(int i= s.length() -1 ; i>=0; i--) {
				 letters[letterIndex] = s.charAt(i);
				 letterIndex++;
			}
			
			String reverse = "";
			for(int i=0; i < s.length(); i++) {
				reverse = reverse + letters[i];
			}
			return reverse; 
		}
	}


