class GradeCalculator
{
	public static void main(String args[])
	{
		System.out.println("Starting main function()");
		
		String grade = args[0];
		
		int gradeInt = Integer.parseInt(grade);
		
		String result = gradeCalculator(gradeInt);
		
		System.out.println("Grade: " +  result);
	}
	static String gradeCalculator(int grade)
	{
		System.out.println("Entered Number: " + grade);
		if ( grade >= 90)
		{
			return "A";
		}
		else if ( grade>75)
		{
			return "B";
		}
		else if (grade >= 60)
		{
			return "c";
		}
		else if (grade >= 40)
		{
			return "D";
		}
		else
		{
			return "Fail";
		}
	}
}
