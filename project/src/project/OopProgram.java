package project;

public class OopProgram {
	 public boolean isEquilateral(double side1, double side2, double side3) {
	        return side1 == side2 && side2 == side3;
	 }

	 public boolean isIsosceles(double side1, double side2, double side3) {
	        return side1 == side2 || side2 == side3 || side1 == side3;
	 }

	 public boolean isScalene(double side1, double side2, double side3) {
	        return side1 != side2 && side2 != side3 && side1 != side3;
	 }
}

