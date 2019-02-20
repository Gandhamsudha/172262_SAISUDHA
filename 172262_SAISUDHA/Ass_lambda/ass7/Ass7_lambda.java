package ass7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ass7_lambda {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("sudha","Bvrm");
		map.put("vani","hyd");
		map.put("manu","hyd");
	
		
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<String, String>> s=map.entrySet();
	
		
		for(Map.Entry<String,String> x:s) {
			sb=sb.append(x.getKey()+""+x.getValue() );
		}
		
		System.out.println(sb);
		
		

	}

}
