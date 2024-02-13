package math;

public class Calculator {


    public double Mult(double number1, double number2){
        double value = number1 * number2;
        return value;
    }

    public double Mult(double number1, double number2, double number3){
        double value = (number1 * number2) * number3;
        return value;
    }

    public double Sum(double number1, double number2){
        double value = number1 + number2;
        return value;
    }

    public double Sum(double number1, double number2, double number3){
        double value = (number1 + number2) + number3;
        return value;
    }

    public double Divide(double number1, double number2){
        double value = number1 / number2;
        return value;
    }

    public double Divide(double number1, double number2, double number3){
        double value = (number1 / number2) / number3;
        return value;
    }

    public double Substract(double number1, double number2){
        double value = number1 - number2;
        return value;
    }

    public double Substract(double number1, double number2, double number3){
        double value = (number1 - number2) - number3;
        return value;
    }

    public void NumberSum(int parameter){
        int sum = 0;
        for(int i = 0; i<=parameter; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public void TablaInmultirii(int parameter){
        for(int i =0; i<=10; i++){
            System.out.println(parameter * i + " ");
        }
    }

}
