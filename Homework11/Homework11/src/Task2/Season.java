package Task2;

public enum Season {
	WINTER(1), SPRING(2), SUMMER(3), AUTUMN(4);
	
	final int value;
	Season(int value){
		this.value = value;
	}
	
	public void print(){
		switch (value){
		case 1: System.out.println("����"); break;
		case 2:	System.out.println("������"); break;
		case 3:	System.out.println("����"); break;
		case 4:	System.out.println("����"); break;
		}
	}
	
	public int getValue(){
		return this.value;
	}
}
