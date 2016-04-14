package Task3;

import java.util.Comparator;
import java.util.Map.Entry;

public class Comparators{
	public static Comparator<Entry<String,Integer>> ASCENDING_COUNT = new Comparator<Entry<String,Integer>>(){
		public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
			return arg0.getValue().compareTo(arg1.getValue());
		}
		
	};
	
	public static Comparator<Entry<String,Integer>> DESCENDING_COUNT = new Comparator<Entry<String,Integer>>(){
		public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
			return arg1.getValue().compareTo(arg0.getValue());
		}
		
	};
	
}
