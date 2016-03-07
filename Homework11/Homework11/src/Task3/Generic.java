package Task3;

public class Generic<T> {
	private String name;
	private T field;
	
	public Generic(String name){
		this.name = name;
	}
	
	public T getField(){
		return field;
	}
	
	public void setField(T value){
		this.field = value;
	}
	
	public void put(T field){
		this.field = field;
	}
	
	public void change(Generic<T> otherGeneric){
		T temp = this.field;
		this.field = otherGeneric.getField();
		otherGeneric.setField(temp);
	}
	
	public void print(){
		System.out.println(this.name + ": " + field);
	}
}
