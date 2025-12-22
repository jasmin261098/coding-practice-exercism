class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        int sum = 0;
        
        switch(operation) {
            case "+":
                sum = operand1 + operand2;
                return operand1 + " " + operation + " " + operand2 + " = " + sum;
            case "*":
                sum = operand1 * operand2;
                return operand1 + " " + operation + " " + operand2 + " = " + sum;
            case "/":
                try {
                    sum = operand1 / operand2;
                    return operand1 + " " + operation + " " + operand2 + " = " + sum;
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
                
            case null:
                throw new IllegalArgumentException("Operation cannot be null");
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
    }
}
