import java.lang.reflect.Method;
public class Reflection10 {
	
	public static void main(String[] args) throws Exception {
		Simple s = new Simple();
		Method m = s.getClass().getDeclaredMethod("setA", double.class);
		m.setAccessible(true);
		m.invoke(s, 76);
		System.out.println(s);
	}


}
