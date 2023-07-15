import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Friend friend1 = new Friend("Stewie");
		Friend friend2 = new Friend("Peter");
		Friend friend3 = new Friend("Meg");
		
		System.out.println(Friend.numberOfFriends);
		
		Main BFF = new Main();
		char[] chars = BFF.Friend("Apple");
		for (char c : chars) {
			System.out.print(c);
		}
		System.out.println(" ");
		Friend.displayFriends();
		
	}

	private char[] Friend(String string) {
		// TODO Auto-generated method stub
		int size = 10;
		char[] arr = new char[size];
		Arrays.fill(arr, 'A');
		return arr;
	
	}

}
