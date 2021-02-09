
public class Simple {

	public  float var_a = 5;
	private double var_b = 2.1;


public Simple() {

	}

	public Simple(float a, double b) {
		this.var_a = a;
		this.var_b = b;
	}

	public void squareA() {
		this.var_a *= this.var_a;
	}

	private void squareB() {
		this.var_b *= this.var_b;
	}

	public double getA() {
		return var_a;
	}

	private void setA(float a) {
		this.var_a = a;
	}

	public double getB() {
		return var_b;
	}

	public void setB(double b) {
		this.var_b = b;
	}

	public String toString() {
		return String.format("(num1:%.2f, num2:%.2f)", var_a, var_b);
	}

}