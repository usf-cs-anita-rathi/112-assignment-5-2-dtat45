
public class Question_2_Class 
{
	public int quiz1;
	public int quiz2;
	public int quiz3;
	public int midtermExam;
	public int finalExam;
	public String finalLetterGrade;
	public double finalScore;
	
	public void calculateFinalGrade()
	{
		double quizScores=((quiz1+quiz2+quiz3)/3);
		finalScore=((quizScores*0.25)+(midtermExam*0.35)+(finalExam*0.40));
	}
	
	public void assignFinalLetterGrade()
	{
		if(finalScore>=90)
			finalLetterGrade="A";
		else if(finalScore>=80)
			finalLetterGrade="B";
		else if(finalScore>=70)
			finalLetterGrade="C";
		else if(finalScore>=60)
			finalLetterGrade="D";
		else
			finalLetterGrade="F";
	}
	
	public void displayGrade()
	{
		System.out.println("Final Grade: "+finalScore);
		System.out.println("Final Letter Grade: "+finalLetterGrade);
	}
	
	public String toString()
	{
		return ("Final Grade: "+finalLetterGrade);
	}

	public boolean equals(Question_2_Class averageAndAbove)
	{
		return (finalLetterGrade.equals("A") || finalLetterGrade.equals("B") || finalLetterGrade.equals("C"));
	}
	
	public double getGrade()
	{
		return finalScore;
	}
}
