public class WrapperClass {
	public static void main(String[] args){
		final int BONUS = 2;
		// BONUS = 3; // can't be modified
		// we always have to initialize the final var while declaring.

		final A sourabh = new A("Sourabh Bisht");
		// we can do this.
		sourabh.name = "new name";
		sourabh.name = "another name";

		// but not this
		// (1) when a non primitive is final, we can not reassign it.
		// (2) we can change the value, but it will point to the same object.
		// sourabh = new A("new object");
	}	
	
	static class A {
		final int num = 10;
		String name;

		public A(String name) {
			this.name = name;
		}
		
	}

}