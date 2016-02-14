package Task3;

public class Dog{
	public static int N = 0;
	private String name;
	Dog(int number){
		this.name = "MyDog-"+number;
		N++;
	}
	
	public String getName(){
		return name;
	}
	
	public void bark(){
		System.out.println(name + " is barking very loud.");
	}
	
	public static int getNumberOfDogs(){
		return N;
	}
	
}