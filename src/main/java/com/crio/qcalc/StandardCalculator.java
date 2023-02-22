package com.crio.qcalc;

public class StandardCalculator {

    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }
    
    // public int add(int num1, int num2) {
    //     return num1 + num2;
    // }

    protected double result;
    // public double doubleResult;

    // public int getResult() {
    //     return result;
    // }

    public double getResult() {
        return result;
    }

    // public void setIntResult(int value) {
    //     // if (value != 0)
    //     //     return;
    //     this.result = value;
    // }

    public void setDoubleResult(double value) {
        this.result = value;
    }

    public void clearResult() {
        result = 0;
    }

    // public void clearResult() {
    //     result = 0;
    // }

    public void printResult() {
        System.out.println("Standard Calculator Result:"+ result);
    }

    // public void printDoubleResult() {
    //     System.out.println("Standard Calculator Result:"+ doubleResult);
    // }

    // public int subtract(int num1, int num2) {
    //     return num1 - num2;
    // }

    // public int multiply(int num1, int num2) {
    //     return num1 * num2;
    // }

    // public int divide(int num1, int num2) {
    //     if (num2 == 0)
    //         throw new UnsupportedOperationException("Cannot divide by zero");
    //     return num1 / num2;
    // }

    // public void add(int num1, int num2) {
	//     intResult = num1 + num2;
    //     // System.out.println(result);
    // }

    // public void subtract(int num1, int num2) {
    //     intResult = num1 - num2;
    // }

    // public void multiply(int num1, int num2) {
    //     intResult = num1 * num2;
    // }

    // public void divide(int num1, int num2) {
    //     if (num2 == 0)
    //         throw new UnsupportedOperationException("Cannot divide by zero");
    //     intResult = num1 / num2;
    // }

    // public void add(double num1, double num2){
    //     result = num1 + num2;
    // }

    // public void subtract(double num1, double num2) {
    //     result = num1 - num2;
    // }

    public final void multiply(double num1, double num2){
        double result = num1 * num2;
        if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY) || (result == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    public final void divide(double num1, double num2){
        if(num2 == 0.0){
            throw new ArithmeticException("Divide By Zero");
        }
        result = num1 / num2;
    }

    
    public final void add(double num1, double num2){
        double result = num1 + num2;
        if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }

    
    public final void subtract(double num1, double num2){
        double result = num1 - num2;
        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Double overflow");
        }
        this.result = result;
    }
    
    public final void add(int num1, int num2){
        add((double)num1, (double)num2);
    }

    public final void subtract(int num1, int num2){
        subtract((double)num1, (double)num2);
    }

    public final void multiply(int num1, int num2) {
        multiply((double)num1, (double)num2);
    }

    public final void divide(int num1, int num2) {
        divide((double)num1, (double)num2);
    }

}
