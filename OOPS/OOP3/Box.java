import java.util.Arrays;

public class Box {
	double l;
	double w;
	double h;

	Box() {
		this.l = -1;
		this.w = -1; 
		this.h = -1;
	}

	Box(double side) {
		this.l = side;
		this.w = side; 
		this.h = side;
	}

	Box(double l, double w, double h) {
		this.l = l;
		this.w = w; 
		this.h = h;
	}

	Box(Box old) {
		this.l = old.l;
		this.w = old.w;
		this.h = old.h;
	}
	

	public static void main(String[] args){
		Box b1 = new Box(4.6, 7.9, 9.3);
		Box b2 = new Box(b1);
		System.out.println(b1.l + " " + b1.w + " " + b1.h);
	}	
}

// there are many variables in both parent & child classes,
// you are given access to variables that are in ref type i.e. BoxWeight
// hence, you should have access to weight variable
// this also means, that the ones you are trying to access should be initialised 
// but here, when the object itself is of type parent class, how will you call the constructor.
// ==> that's why error

