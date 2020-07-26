public class Compute {
	Operation operation;
	public void setOperation(Operation operation)
	{
		this.operation=operation;
	}
	public int computeResult(int firstInput,int secondInput)
	{
	    return operation.calculateValue(firstInput,secondInput);
	}
}
