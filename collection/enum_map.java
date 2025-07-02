package collection;

import java.util.EnumMap;
import java.util.Map;

enum day
{
	Sunday,Monday,Tuesday,Wednsday,Thursday,Friday,Saturday;
}
public class enum_map {

	public static void main(String[] args) {
		EnumMap<day, String> e1=new EnumMap<day, String>(day.class);
		e1.put(day.Monday, "A");
		e1.put(day.Tuesday, "B");
		e1.put(day.Wednsday, "C");
		e1.put(day.Sunday, "D");
		System.out.println(e1);
        
		for(Map.Entry a:e1.entrySet())
		{
			System.out.println(a.getKey()+""+a.getValue());
		}
	}

}
