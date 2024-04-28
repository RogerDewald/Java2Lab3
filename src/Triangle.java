
public class Triangle {
	
	private double sideA;
	private double sideB;
	private double sideC;
	
	public static final String POLYGONSHAPE = "Triangle";
	public static final double DEFAULT_SIDE = 1.0;
	
	public Triangle () {
		this.sideA = DEFAULT_SIDE;
		this.sideB = DEFAULT_SIDE;
		this.sideC = DEFAULT_SIDE;
		
	}
	
	public Triangle (double sideA, double sideB, double sideC) {
		if (sideA < 0 || sideB < 0 || sideC < 0 || sideA + sideB <= sideC || sideB + sideC <= sideA || sideA + sideC <= sideB) {
			
			this.sideA = DEFAULT_SIDE;
			this.sideB = DEFAULT_SIDE;
			this.sideC = DEFAULT_SIDE;
		}
		
		else {
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
		}
		
	}
	
	public Triangle (double[] sides) {
		if (sides == null || sides.length != 3 || sides[0] <= 0 || sides[1] <= 0 || sides[2] <= 0 || sides[0] + sides[1] <= sides[2] || sides[0] + sides[2] <=
				sides[1] || sides[1] + sides[2] <= sides[0]) {
			this.sideA = DEFAULT_SIDE;
			this.sideB = DEFAULT_SIDE;
			this.sideC = DEFAULT_SIDE;
		}
		else {
			this.sideA = sides[0];
			this.sideB = sides[1];
			this.sideC = sides[2];
		}
	}
	
	public Triangle (Triangle triangle) {
		if (triangle == null || triangle.getSideA() <=0 || triangle.getSideB() <=0 || triangle.getSideC() <=0 ||
				triangle.getSideA() + triangle.getSideB() <= triangle.getSideC() ||
				triangle.getSideA() + triangle.getSideC() <= triangle.getSideB() ||
				triangle.getSideB() + triangle.getSideC() <= triangle.getSideA() ){
			this.sideA = DEFAULT_SIDE;
			this.sideB = DEFAULT_SIDE;
			this.sideC = DEFAULT_SIDE;
		}
		else {
			this.sideA = triangle.getSideA();
			this.sideB = triangle.getSideB();
			this.sideC = triangle.getSideC();
		}
		
	}
	
	public double getSideA() {
		return this.sideA;
	}
	public double getSideB() {
		return this.sideB;
	}
	public double getSideC() {
		return this.sideC;
	}
	public double[] getSides() {
		double[] sides = new double[3];
		sides[0] = this.sideA;
		sides[1] = this.sideB;
		sides[2] = this.sideC;
		return sides;
		
	}
	
	public double getAngleA() {
		double angle = 0.0;
		angle = Math.toDegrees(Math.acos( (Math.pow(this.sideA, 2.0) - Math.pow(this.sideB, 2.0) - Math.pow(this.sideC, 2.0)) /
				((-2) * this.sideB * this.sideC) ));
		return angle;
	}
	public double getAngleB() {
		double angle = 0.0;
		angle = Math.toDegrees(Math.acos( (Math.pow(this.sideB, 2.0) - Math.pow(this.sideA, 2.0) - Math.pow(this.sideC, 2.0)) /
				((-2) * this.sideA * this.sideC) ));
		return angle;
	}
	public double getAngleC() {
		double angle = 0.0;
		angle = Math.toDegrees(Math.acos( (Math.pow(this.sideC, 2.0) - Math.pow(this.sideB, 2.0) - Math.pow(this.sideA, 2.0)) /
				((-2) * this.sideA * this.sideB) ));
		return angle;
	}
	public double[] getAngles() {
		double[] angles = new double[3];
		angles[0] = Math.toDegrees(Math.acos( (Math.pow(this.sideA, 2.0) - Math.pow(this.sideB, 2.0) - Math.pow(this.sideC, 2.0)) / (-2 * this.sideB * this.sideC) ));
		angles[1] = Math.toDegrees(Math.acos( (Math.pow(this.sideB, 2.0) - Math.pow(this.sideA, 2.0) - Math.pow(this.sideC, 2.0)) / (-2 * this.sideA * this.sideC) ));
		angles[2] = Math.toDegrees(Math.acos( (Math.pow(this.sideC, 2.0) - Math.pow(this.sideB, 2.0) - Math.pow(this.sideA, 2.0)) / (-2 * this.sideA * this.sideB) ));
		return angles;
	}
	
	public boolean setSideA(double sideA) {
		if (sideA > 0 & sideA + this.sideB > this.sideC & this.sideC + sideA > this.sideB & this.sideB + this.sideC > sideA ) {
			this.sideA = sideA;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean setSideB(double sideB) {
		if (sideB > 0 & sideB + this.sideA > this.sideC & this.sideC + sideB > this.sideA & this.sideA + this.sideC > sideB) {
			this.sideB = sideB;
			return true;
		}
		else {
			return false;
		}	
	}
	public boolean setSideC(double sideC) {
		if (sideC > 0 & sideC + this.sideA > this.sideB & this.sideB + sideC > this.sideA & this.sideA + this.sideB > sideC) {
			this.sideC = sideC;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean setSides(double[] sides) {
		if(sides != null && sides.length == 3 && sides[0] > 0 && sides[1] > 0 && sides[2] > 0 && sides[0] + sides[1] > sides[2] && sides[0] + sides[2] >
				sides[1] && sides[1] + sides[2] > sides[0]) {
			this.sideA = sides[0];
			this.sideB = sides[1];
			this.sideC = sides[2];
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isTriangle (double a, double b, double c) {
		if (a + b > c && b + c > a && a + c > b && a > 0 && b > 0 && c >0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isTriangle (double[] sides) {
		if (sides != null && sides.length == 3 && sides[0] + sides[1] > sides[2] && sides[0] + sides[2] > sides[1] && sides[1] + sides[2] > sides[0]
				 && sides[0] > 0 && sides[1] > 0 && sides[2] > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static double lawOfCosines (double a, double b, double c) {
		return (Math.toDegrees(Math.acos( (Math.pow(c, 2.0) - Math.pow(b, 2.0) - Math.pow(a, 2.0)) / ((-2.0) * a * b) )));
	}
	
	public String toString() {
		return (POLYGONSHAPE + "(" + String.format("%.4f", this.sideA) + ", " +
				String.format("%.4f", this.sideB)+ ", " +
				String.format("%.4f", this.sideC) + ")");
	}
	
}
