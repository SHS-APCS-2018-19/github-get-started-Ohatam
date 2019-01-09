
public class Point {
	double x;
	double y;
	
	public Point (int x1, int y1) {
		setX(x1);
		setY(y1);
	}
	public double getX() {
		return x;
	}
	public double gety() {
		return y;
	}
	public void setX(double x) {
		this.x= x;
		
	}
	public void setY(double y) {
		this.y= y;
	}
	
	public double distanceTo(Point point2) {
		double distance = Math.sqrt(Math.pow((point2.x-this.x), 2)+(Math.pow((point2.y-this.y),2)));
		return distance;
	}
	public void polar() {
		double radius = Math.sqrt(Math.pow(x, 2)+(Math.pow(y,2)));
		double theta=Math.atan2(y,x);
		System.out.print("Length is: " + radius + "\n" + "Angle is: " + theta);
		}
	
}
