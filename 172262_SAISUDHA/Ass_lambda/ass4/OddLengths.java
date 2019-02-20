package ass4;

import java.util.ArrayList;
import java.util.List;

public class OddLengths {
 public static void main(String args[]) {
	 List<String> s=new ArrayList<>();
	 s.add("sssss");
		 s.add("aaaa");
		 s.add("a");
		 s.removeIf(a->(a.length()%2!=0));
		 s.forEach(System.out::println);
	 }
	 }

