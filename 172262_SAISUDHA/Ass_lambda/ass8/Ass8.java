package ass8;

import java.util.ArrayList;
import java.util.List;

public class Ass8 {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(5);
		l.add(7);
		l.add(12);
		Runnable r = () -> {l.stream().forEach(System.out::println);};
		new Thread(r).run();
	}
	}


