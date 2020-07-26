public class Calculator {
	String operationType;
    public int computeAnswer(int firstInput,int secondInput,String operationType) throws Exception
    {
    	Compute compute=new Compute();
		this.operationType=operationType;
    	Class<?> cls=Class.forName(operationType);
		Object o=cls.newInstance();
		Operation computeOperation=(Operation)o;
		compute.setOperation(computeOperation);
		return compute.computeResult(firstInput,secondInput);
   
    }
}