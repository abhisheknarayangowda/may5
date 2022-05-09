import java.util.ArrayList;
import java.util.Collections;

public class Launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(175);

		System.out.println(al);
		Collections.rotate(al,3);
		System.out.println(al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
	}

}
