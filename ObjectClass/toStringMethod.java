class Student
{
	String name;
	int rollno;
	Student(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public static void main(String[] args)
	{
		Student s1=new Student("Durga",101);
		Student s2=new Student("Amit",102);
		System.out.println(s1); //Student@15db9742
		System.out.println(s1.toString()); //Student@15db9742
		System.out.println(s2); //Student@6d06d69c
	}
}
// If our class doesn't contain toString() then Object class toString() is executed