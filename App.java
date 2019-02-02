package calc.newcalc;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.Expression;

/**
 * Hello world!
 *
 */
public class App 
{
	int number[]=new int[10];
	int j=0;
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	String inputString=null;
    	EvaluateExpr expr = new EvaluateExpr();
    	
        System.out.println( "****Calculator****" );
        System.out.println("Enter the number of inputs");
        int input = sc.nextInt();
        for(int i=0;i<input;i++){
        	
        	inputString = sc.next();
        	System.out.println("Output "+expr.evaluateInputExpr(inputString));
        }
    }

    /*public void calculateResult(String inputString) {
	
		String[] expr = inputString.split("");
		for(int i=0;i<expr.length;i++){
			
			
			if(expr[i]=="(" || expr[i]==")"){
				while(expr[i]!=")"){
					if(isOperand(expr[i])){
						number[j++]=Integer.parseInt(expr[i]);
					}
					else if(isOperator(expr[i])){
						//expr=number+expr[i];
					}
				}
			}
		    else if(isOperand(expr[i])){
				number[j++]=Integer.parseInt(expr[i]);
			}
			else if(isOperator(expr[i])){
				if(expr[i]=="("){
					
				}
			}
					
			if(expr[i]=="("){
				
				calculateResult(inputString);
			}
		}
		
	}

	private boolean isOperator(String opr) {
		if(opr=="+" || opr=="-" || opr=="*" || opr=="/" || opr=="^"){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isOperand(String num) {
	
		if(num=="0" || num=="1" || num=="2" || num=="3" || num=="4" || num=="5" || num=="6" || num=="7" || num=="8" || num=="9"){
			return true;
		}
		else{
			return false;
		}
	}

	private void validateInput(String inputString) {
		
		String[] expr = inputString.split("");
		int[] numStack = new int[expr.length];
		String[] opStack = new String[expr.length];
		int j=0,k=0,twoDigit=0;
		for(int i=0;i<expr.length;i++){
			if(isOperand(expr[i])){
				numStack[j++] = Integer.parseInt(expr[i]);
				twoDigit = i+1;
				if(isOperand(expr[twoDigit])){
					numStack[j++] =Integer.parseInt(expr[twoDigit]) * 10 + numStack[j]; 
				}
			}
			else if(isOperator(expr[i])){
				opStack[k] = expr[i]; 
				if(expr[i]==")"){
					
				}
			}
			
			
		}
		
	}*/
}
