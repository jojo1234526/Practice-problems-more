import java.util.HashMap; 

public class HashMapAwesomeness {
	public static void main(String[] args) {
		int a=10;
		String b = "hello";
		int[] c = {1,2,3};
		int d = 3;
		int e = 88;
		
		HashMap<String, Integer> happy = new HashMap<String, Integer>();
		happy.put("a", 10);
		happy.put("b", 3);
		happy.put("c", 88);
		
		System.out.println(happy);
		System.out.println(happy.get("c"));
		
		
		
		HashMap<String, String> fun = new HashMap<String, String>();
		fun.put("Joseph", "12345");
		fun.put("steve", "03462");
		fun.put("greg", "fluffy-cunt");
		
		System.out.println(fun);
		
		fun.remove("Joseph");
		
		System.out.println(fun);
		
		System.out.println(fun.containsValue("fluffy-cunt"));
		System.out.println(fun.containsValue("fluffy-cunts"));
		
		System.out.println(fun.containsKey("Joseph"));
		System.out.println(fun.containsKey("steve"));
		
		System.out.println(fun.replace("Joseph", "fun"));
		
		fun.put("Joseph",  "12345");
		
		System.out.println(fun.replace("Joseph",  "Fun"));
		
		System.out.println(fun);


		
	}
}
