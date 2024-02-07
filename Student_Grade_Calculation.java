import java.util.*;
class Total_marks
{
	protected double total=0.0;
	void tot_marks(float[] marks,int num)
	{
		for(int j=0;j<num;j++)
		{	
			total=total+marks[j];
		}
		System.out.print("SUM OF THE MARKS OBTAINED IN ALL SUBJECTS: "+total);
	}
}
class Average_percentage extends Total_marks
{
	protected double average;
	void avg_percentage(int tot_no_subjects)
	{
		average=(total)/(tot_no_subjects);
		System.out.print("\nAVERAGE PERCENTAGE: "+average);
	}
}
class Grade_calculation extends Average_percentage
{
	void grade_calc()
	{
		if(average >= 90.0)
		{
			System.out.println("\nOBTAINED GRADE:O");
		}
		else if(average >=80.0 && average <90.0)
		{
			System.out.println("\nOBTAINED GRADE:A+");
		}
		else if(average >=70.0 && average <80.0)
		{
			System.out.println("\nOBTAINED GRADE:A");
		}
		else if(average >=60.0 && average <70.0)
		{
			System.out.println("\nOBTAINED GRADE:B+");
		}
		else if(average >=50.0 && average <60.0)
		{
			System.out.println("\nOBTAINED GRADE:B");
		}
		else if(average >=40.0 && average <50.0)
		{
			System.out.println("\nOBTAINED GRADE:C+");
		}
		else if(average >=35.0 && average <40.0)
		{
			System.out.println("\nOBTAINED GRADE:C");
		}
		else
		{
			System.out.print("\nSTUDENT IS FAILED");
		}
	}
}
class Student_Grade_Calculation
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		Grade_calculation ob1=new Grade_calculation();
		System.out.println("TOTAL NUMBER OF SUBJECTS: ");
		int no_of_subjects=ob.nextInt();
		float[] arr_marks=new float[no_of_subjects];
		System.out.println("ENETR THE MARKS OBTAINED IN ALL THE SUBJECTS: ");
		for(int i=0;i<no_of_subjects;i++)
		{
			System.out.println("MARK SECURED IN SUBJECT "+i+": ");
			arr_marks[i]=ob.nextFloat();
		}
		ob1.tot_marks(arr_marks,no_of_subjects);
		ob1.avg_percentage(no_of_subjects);
		ob1.grade_calc();
        ob.close();
	}
}

