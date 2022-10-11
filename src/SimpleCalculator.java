public class SimpleCalculator {

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        calc.setFirstNumber(5);
        System.out.println(calc.firstNumber);
    }

    // write your code here
    private double firstNumber = 0, secondNumber = 0;

    public void setFirstNumber (double number){
        this.firstNumber = number;
    }

    public double getFirstNumber (){
        return firstNumber;
    }

    public void setSecondNumber (double number){
        this.secondNumber = number;
    }

    public double getSecondNumber (){
        return secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult (){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult (){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult (){
        return (secondNumber == 0) ? 0 : firstNumber / secondNumber;
    }
}