package collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
enum days
{
	Sunday,Monday,Tuesday,Wednsday,Thursday,Friday,Saturday;
}
public class enum_set {

	public static void main(String[] args) {
		//Set<days> d=EnumSet.of(days.Friday,days.Monday,days.Saturday);
		Set<days> d=EnumSet.allOf(days.class);
		System.out.println(d);
		
        Iterator<days> itr=d.iterator();
        while (itr.hasNext()) 
        {
			System.out.println(itr.next());
			
		}
	}

}
