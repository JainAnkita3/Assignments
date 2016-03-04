package com.test;

// Call by Value
// Instance Initializer block
// This class has sequence of invocation of blocks consider by Compiler
// Final keyword

class TempInvocationSequenceInJava extends Temp1 {

	int data = 50;
	int speed;
	final String COMPANY;

	// Default construtor always gets preference
	public TempInvocationSequenceInJava() {
		super();
		COMPANY = "google"; // Final variable can be initialize only in
							// constructor
		System.out.println("\nConstructor is invoked, only after Static, Instance ans Super block");
	}

	// Argumented Construtor
	public TempInvocationSequenceInJava(int a) {
		super();
		COMPANY = "ATT"; // Final variable can be initialize only in constructor
		System.out.println("\nConstructor is invoked, only after Static, Instance ans Super block");
	}

	// Instance Initializer block
	{
		speed = 100;
		System.out.println("instance initializer block invoked for 'Speed'");
	}

	// Instance Initializer block
	{
		data = 100;
		System.out.println("instance initializer block invoked for 'Data'");
	}

	// Static block
	static {
		System.out.println("Static block invoked only once per class");
	}

	void change(int data) {
		data = data + 100;// changes will be in the local variable only
		System.out.println("data : " + data);
		System.out.println("\nCompany value : " + COMPANY);

	}

	public static void main(String args[]) {
		TempInvocationSequenceInJava op = new TempInvocationSequenceInJava();
		TempInvocationSequenceInJava op1 = new TempInvocationSequenceInJava();
		TempInvocationSequenceInJava op2 = new TempInvocationSequenceInJava(1);

		System.out.println("before change " + op.data);
		op.change(500);
		System.out.println("after change " + op.data);

	}
}
