package Map_Interface;

public class TestingEnum{
	
	public static void main(String[] args) {
		Testing_Enum color = Testing_Enum.GREEN;
		System.out.println("Light color: "+color);
	}
	
	public enum Testing_Enum {
		RED,GREEN,YELLOW;
	}
}

