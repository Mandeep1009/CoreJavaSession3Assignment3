class example 
{
	int x;
	int y;
	String name;
	public static void main(String args[]) 
	{
		example pnt = new example();
		System.out.println ("pnt is " + pnt.name + " " + pnt.x + " " + pnt.y);
	} 
}

/*
Select one correct answer:
a. The program does not compile because x, y and name are not initialized.
b. The program throws a runtime exception as x, y, and name are used before
initialization.

c. The program prints pnt is 0 0.
d. The program prints pnt is null 0 0.
e. The program prints pnt is NULL false false 
*/

/* Answer : d. The program prints pnt is null 0 0. */