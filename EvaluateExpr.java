package calc.newcalc;

import java.util.Stack;

public class EvaluateExpr {
	public Integer evaluateInputExpr(String input){
		
		char[] inputCharacters = input.toCharArray();
		Stack<Integer> operands = new Stack<Integer>();
		Stack<Character> operator = new Stack<Character>();
		for(int i=0;i<inputCharacters.length;i++){
			if(inputCharacters[i]=='+' || inputCharacters[i]=='-' || inputCharacters[i]=='*' || inputCharacters[i]=='/' || inputCharacters[i]=='^'){
				operator.push(inputCharacters[i]);
			}
			if (inputCharacters[i] >= '0' && inputCharacters[i] <= '9') 
            {
				String str="";
				
                while (i < inputCharacters.length && inputCharacters[i] >= '0' && inputCharacters[i] <= '9'){ 
            
                   str=str+inputCharacters[i++];
                }
                operands.push(Integer.parseInt(str)); 
            } 
			else if(inputCharacters[i]=='('){
				operator.push(inputCharacters[i]);
			}
			
			else if(inputCharacters[i]==')') 
            { 
                while (operator.peek() != '('){ 
                	operands.push(calculate(operator.pop(), operands.pop(), operands.pop())); 
                	operator.pop(); 
                }
            } 
  
         
    }
		return operands.pop();
	}
  
    public int calculate(char operator, int operand1, int operand2) 
    { 
        switch (operator) 
        { 
        case '+': 
            return operand1 + operand2; 
        case '-': 
            return operand1 - operand2; 
        case '*': 
            return operand1 * operand2; 
        case '/': 
        	return operand1 / operand2; 
        case '^': 
        	return operand1 ^ operand2; 
        }
        
        return 0; 	
	 }
}
