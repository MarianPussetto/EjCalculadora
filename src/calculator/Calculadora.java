package calculator;

public class Calculadora {

    int num1;
    int num2;

    public Calculadora() {
    }

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int sumar(int num1, int num2) {
        System.out.println("La suma de los números es " + (num1 + num2));
        return num1 + num2;
    }

    public int restar(int num1, int num2) {

        System.out.println("La resta de los números es " + (num1 - num2));
        return num1 - num2;
    }

}
