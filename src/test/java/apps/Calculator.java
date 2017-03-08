import org.openqa.selenium.winium.WiniumDriver;

public class Calculator {

    private WiniumDriver app;

    public Calculator(WiniumDriver app) {
        this.app = app;
    }


    protected int add(int firstNumber, int secondNumber) {
        return compute("Add", firstNumber, secondNumber);
    }

    protected int subtract(int firstNumber, int secondNumber) {
        return compute("Subtract", firstNumber, secondNumber);
    }

    protected int multiply(int firstNumber, int secondNumber) {
        return compute("Multiply", firstNumber, secondNumber);
    }

    protected int divide(int firstNumber, int secondNumber) {
        return compute("Divide", firstNumber, secondNumber);
    }

    private int compute(String type, int firstNumber, int secondNumber) {
        app.findElementByName(String.valueOf(firstNumber)).click();
        app.findElementByName(type).click();
        app.findElementByName(String.valueOf(secondNumber)).click();
        app.findElementByName("Equals").click();
        Double result = Double.parseDouble(app.findElementById("150").getAttribute("Name"));
        return result.intValue();
    }

}
