package point;

public class Point {

	// instance variables
	private int x;
	private int y;

	// construct the object here.
	public Point(int a, int b){
		this.x=a;
		this.y=b;
	}
	// Returns which quadrant of the x/y plane this Point
	// object falls in. Quadrant 1 contains all points
	// whose x and y values are both positive. Quadrant
	// 2 contains all points with negative x but positive y.
	// Quadrant 3 contains all points with negative x and y values.
	// Quadrant 4 contains all points with positive x but negative y.
	// If the point lies directly on the x and/or y axis, return 0.
	// bob.quadrant(); --> 2
	public String quadrant(){
		if(this.x==0 || this.y==0){
			return "0";
		}
		else if(this.x>0 && this.y<0){
			return "Quadrant IV";
		}
		else if(this.x<0 && this.y>0){
			return "Quadrant II";
		}
		else if(this.x>0 && this.y>0){
			return "Quadrant I";
		}else{
			return "Quadrant III";
		}
	}
	

	// Negates and swaps the x/y coordinates of the Point object.
	// For example, if an object pt initially represents the
	// point (5, -3), after a call of pt.flip(); , the object
	// should represent (3, -5). If the same object initially
	// represents the point (4, 17), after a call to pt.flip();,
	// the object should represent (-17, -4).
	public void flip(){
		int value;
		value=-1*this.y;
		this.y= -1 * this.x;
		this.x=value;
		
	}

	// Modify the toString method in the Point class.
	// Make it return a string in the following format.
	// For example, if a Point object stored in a
	// variable pt represents the point (5, -17),
	// return the string:
	// x.toString() x
	// Point(x=5,y=-17)
	public String toString(){
		return "Point(x=" + this.x +",y="+this.y+")";
	}
	
	// If the client code were to call System.out.println(pt); ,
	// that text would be shown on the console.
	
	// finally add a midpoint method
	public Point midpoint(Point z){
		return new Point((x+z.x)/2,(y+z.y)/2);
		// int theX=(this.x+other.x)/Z;
		//Point midpoint=new Point(theX,theY);
		//return midpoint;
		
	}
}




























