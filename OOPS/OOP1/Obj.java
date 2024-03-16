 import java.util.Arrays;

public class Obj {
	
	public static void main(String[] args){
		Student[] students = new Student[5];

		// prints --> [null, null, null, null, null] , default value of an object.
		// System.out.println(Arrays.toString(students));

		Student sourabh = new Student();
		
		// passing object as argument to the constructor.
		Student random = new Student(sourabh);
		System.out.println(random.name + " " + random.rno);
		
		
		// We can also do this with the help of a constructor.

		// sourabh.rno = 125;
		// sourabh.name = "Sourabh Bisht";
		// sourabh.marks = 92.4f;

		Student random2 = new Student();
		System.out.println(random2.name);

		// System.out.println(random.rno);
		// System.out.println(random.name);
		// System.out.println(random.marks);
	}	
}

class Student {
	int rno; // by default value = 0, (primitive)
	String name; // by default value = null, (object)
	float marks = 86.0f; // by default value = 0.0 (primitive)

	// object as parameter
	Student (Student other) {
	 // random.xyz = sourabh.xyz
		this.rno = other.rno;
		this.name = other.name;
		this.marks = other.marks;

	}

	// Not a default constructor.
	Student () {
		// (1)
		// whenever constructor(or a new object will be created) will be called 'this' will be replaced with the 
		// current reference var.
		// Student rahul (ref var) = new Student(); => rahul.rno/name/marks (currentReferenceVariable.property) 
	    // Student sourabh = new Student(); => sourabh.rno/name/marks 

		// this.rno = 125;
		// this.name = "Sourabh";
		// this.marks = 90.0f;

		// (2) calling a constructor from another constructor
		// internally: new Student(5, "Anusha", 82.0f);

		this (5, "Anusha", 82.0f);
	}

	Student (int roll, String name, float marks) {
		
		this.rno = roll;
		this.name = name;
		this.marks = marks;
	
	}
}


		
	
	

// (1) Instance variable --> variables inside objects are called instance variable.
// (2) new operator --> dynamically allocates memory, means allocates memory at 
// 	   runtime & returns a ref. to it.
// (3) compile time => Student student1 = new Student(); <= runtime

// (4) when we create an object of the class, it means that the class is being instantiated.
// 	   class is a template of an object & object is an instance of the class.

// (5) Objects --> occupies space in memory, have (i)state(value), (ii)behaviour.
// (6) we don't use "new" keyword to create primitives because new keywords allocates memory to
// 	   objects in "heap memory" but as primitives are not objects they are stored in "stack memory".
// Java puts primitives into stack to increase efficiency because if everything will be put into heap
// it will make java slower just like python where everything is an object.