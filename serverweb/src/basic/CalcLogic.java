package basic;

public class CalcLogic {
	public int calc(int num1, String method, int num2) {
		int result =0;
		System.out.println("����Ͻ� ���� ȣ��");
		
		switch (method) {
		case "+":
			result = num1+num2;
			break;
			
		case "-":
			result = num1-num2;
			break;
			
		case "*":
			result = num1*num2;
			break;
			
		case "/":
			result = num1/num2;
			break;

		default:
			break;
			
		}
		
		return result;
	}

}
