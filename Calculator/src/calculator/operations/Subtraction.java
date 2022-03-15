package calculator.operations;

public class Subtraction extends Operation {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "subtraction";
	}

	@Override
	public String getOperator() {
		// TODO Auto-generated method stub
		return "-";
	}

	@Override
	public double calc() {
		// TODO Auto-generated method stub
		return a - b;
	}
	

}
