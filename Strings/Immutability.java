public class Immutability {
	public static void main(String[] args) {
		String a = "Sourabh";
		a = "Bisht";
		System.out.println(a);
	}
}

// Strings are immutable --> they can not be modified once created, if you want to
// modify them create new object.

// * ~ Important ~ *

// In the above example we are not changing the String "Sourabh", we are just creating
// new object("Bisht") and the ref variable is now pointing to the newly created object.
// "Sourabh" is lying in the memory as it is(it will later be removed via garbage collection).

// if we create 2 ref variable with same object, the later one will point to the 
// same object. e.g -->
// String a = "Sourabh";
// String b = "Sourabh";
// here ref variables a and b will point to the same object(Sourabh) instead of 
// creating two different objects in String Pool.
