import java.util.Scanner;
public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inpt = new Scanner(System.in);
		Point point1 = new Point(inpt.nextInt(),inpt.nextInt());
		Point point2 = new Point(inpt.nextInt(),inpt.nextInt());
		System.out.println(point1.distanceTo(point2));
		point1.polar();
	}

}
