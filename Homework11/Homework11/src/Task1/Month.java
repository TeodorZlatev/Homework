package Task1;

public enum Month {
	JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(
			10), NOVEMBER(11), DECEMBER(12);
	
	final int value;
	Month(int value){
		this.value = value;
	}
	
	public void print(){
		System.out.print("����� �" + this.value + " � ");
		switch(value){
		case 1: System.out.println("������.");
		break;
		case 2: System.out.println("��������.");
		break;
		case 3: System.out.println("����.");
		break;
		case 4: System.out.println("�����.");
		break;
		case 5: System.out.println("���.");
		break;
		case 6: System.out.println("���.");
		break;
		case 7: System.out.println("���.");
		break;
		case 8: System.out.println("������.");
		break;
		case 9: System.out.println("���������.");
		break;
		case 10: System.out.println("��������.");
		break;
		case 11: System.out.println("�������.");
		break;
		case 12: System.out.println("��������.");
		break;
		
		}
	}
}