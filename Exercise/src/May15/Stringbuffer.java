package May15;

public class Stringbuffer {

	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.insert(6, "Java");// bay gio chuoi ban dau bi thay doi
		sb.replace(1,3,"Java");  
		sb.delete(1,3); 
		sb.reverse(); 
		sb.append("Hi");
		System.out.println(sb);
	}
}
