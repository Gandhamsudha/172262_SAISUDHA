package ass5;

import java.util.ArrayList;
import java.util.List;

public class Ass5 {
	public static void main(String[] args) {
		List<String> array = new ArrayList<String>();
		array.add("Sai");
		array.add("Harshi");
		array.add("Vaani");
		array.add("Manu");
		System.out.println("Names :\n"+array);
		System.out.println("**********************************");
	
		String result = array.stream().map(sai -> Character.toString(sai.charAt(0))).reduce(" ", (a, b) -> a + b);
		System.out.println(result);
	
	}
}

