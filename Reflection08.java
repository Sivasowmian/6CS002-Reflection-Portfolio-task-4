import java.lang.reflect.Field;

public class Reflection08 {

	public static void main(String[] args) throws Exception {
		Simple s = new Simple();
		Field [] fields = s.getClass().getDeclaredFields();
		System.out.printf("There are %d fields\n", fields.length);

		for(Field f : fields) {
			f.setAccessible(true);
			double x = f.getDouble(s);
			x++;
			f.setDouble(s, x);
			System.out.printf("field name=%s type=%s value=%.2f\n", f.getName(), f.getType(), f.getDouble(s));
		}


	}
}
