/**
 *
 * @author ()
 */
public class Punto{
	private double x;
	private double y;
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Punto( Punto p ){
		x = p.getX();
		y = p.getY();
	}
	public Punto(){
		x = y = 0.0;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "("+ getX() + "," + getY() + ")";
	}
}