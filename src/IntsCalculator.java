public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        double resultOfSum = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result;
        return (int) resultOfSum;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double resultOfMult = target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result;
        return (int) resultOfMult;
    }

    @Override
    public int pow(int a, int b) {
        double resultOfPow = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result;
        return (int) resultOfPow;
    }

    @Override
    public int sub(int a, int b) {
        double resultOfSub = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.SUB)
                .result;
        return (int) resultOfSub;
    }

    @Override
    public int div(int a, int b) {
        double resultOfDiv = target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.DIV)
                .result;
        return (int) resultOfDiv;
    }
}
