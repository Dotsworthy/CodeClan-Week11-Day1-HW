public class Calculator {
    private int number1;
    private int number2;

    public Calculator(int int1, int int2) {
        this.number1 = int1;
        this.number2 = int2;
    }

    public int addNumber() {
        return (int) (this.number1 += this.number2);
    }

    public int subtractNumber() {
        return (int) (this.number1 -= this.number2);
    }

    public int multiplyNumber() {
        return (int) (this.number1 *= this.number2);
    }
}
