interface Chain{
	public abstract void nextLink(Chain nextInChain);
	public abstract void process(Number request1,Number request2,Operation operator);
}

class Number{
	private int number;
	
	public Number(int num){
		this.number = num;
	}
	
	public int getNumber(){
		return this.number;
	}
}

class Operation{
	private int operator;
	
	public Operation(char oper){
		this.operator = oper;
	}
	
	public int getOperator(){
		return this.operator;
	}
}

class Addition implements Chain{
	private Chain nextInChain;
	
	public void nextLink(Chain c){
		this.nextInChain = c;
	}
	
	public void process(Number request1,Number request2,Operation operator){
		if(operator.getOperator() == '+'){
			System.out.println("Addition : "+(request1.getNumber()+request2.getNumber()));
		}
		else{
			nextInChain.process(request1,request2,operator);
		}
	}
}

class Subtraction implements Chain{
	private Chain nextInChain;
	
	public void nextLink(Chain c){
		this.nextInChain = c;
	}
	
	public void process(Number request1,Number request2,Operation operator){
		if(operator.getOperator() == '-'){
			System.out.println("Subtraction : "+(request1.getNumber()-request2.getNumber()));
		}
		else{
			nextInChain.process(request1,request2,operator);
		}
	}
}

class Multiplication implements Chain{
	private Chain nextInChain;
	
	public void nextLink(Chain c){
		this.nextInChain = c;
	}
	
	public void process(Number request1,Number request2,Operation operator){
		if(operator.getOperator() == '*'){
			System.out.println("Mulitplication : "+(request1.getNumber()*request2.getNumber()));
		}
		else{
			nextInChain.process(request1,request2,operator);
		}
	}
}

class Division implements Chain{
	private Chain nextInChain;
	
	public void nextLink(Chain c){
		this.nextInChain = c;
	}
	
	public void process(Number request1,Number request2,Operation operator){
		if(operator.getOperator() == '/'){
			if(request2.getNumber()!=0){
				System.out.println("Division : "+(request1.getNumber()/request2.getNumber()));
			}
			else{
				System.out.println("Division : Cannot Divide By Zero");
			}
		}
		else{
			nextInChain.process(request1,request2,operator);
		}
	}
}

class ChainOfResponsibility{
	public static void main(String[] args){
		Chain link1 = new Addition();
		Chain link2 = new Subtraction();
		Chain link3 = new Multiplication();
		Chain link4 = new Division();
		link1.nextLink(link2);
		link2.nextLink(link3);
		link3.nextLink(link4);
		
		Number n1,n2,n3,n4;
		Operation o1,o2,o3,o4;
		n1 = new Number(10);
		n2 = new Number(20);
		n3 = new Number(30);
		n4 = new Number(40);
		
		o1 = new Operation('+');
		o2 = new Operation('-');
		o3 = new Operation('*');
		o4 = new Operation('/');
		
		link1.process(n1,n3,o1);
		link1.process(n2,n1,o4);
		link1.process(n3,n4,o2);
		link1.process(n2,n4,o3);
	}
}