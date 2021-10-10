import java.util.Scanner;
public class ComputerAreaWithConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI=3.14159;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number of radius: ");
		double radius=input.nextDouble();
		
		double area=radius*radius*PI;
		
		System.out.println("The area of the circle of radius "+radius+" is "+area);

	}

}
