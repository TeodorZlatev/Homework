package Task2;

import java.util.Comparator;

public class Comparators {
	public static Comparator<String> ASCENDING = new Comparator<String>(){
		public int compare(String s1, String s2){
			return s1.compareTo(s2);
		}
	};
	
	public static Comparator<String> DESCENDING = new Comparator<String>(){
		public int compare(String s1, String s2){
			return s2.compareTo(s1);
		}
	};
}
