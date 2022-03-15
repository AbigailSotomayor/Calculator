package calculator.operations;

public class Multiplication extends Operation{
	
	@Override
	public String getName() {
		return "Multiplication";
	}
	
	@Override
	public String getOperator(){
		return "*";
	}
	
	@Override
	public double calc() {
		return a*b;
	}
}