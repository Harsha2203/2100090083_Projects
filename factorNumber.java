package factorsNum;
import java.util.Scanner;
public class Factor {
	void sumFactors()
	{
		int num,i,sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number:");
		num=in.nextInt();
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				//System.out.printf("%d",i);
				sum=sum+i;
			}
		}
		System.out.printf("The sum of all factors of given number:%d\n",sum);
		if(num==sum)
		{
			System.out.println("Given Number is Perfect number..");
		}
		else
		{
			System.out.println("Given number is not Perfect number..");
		}
	}

}

package factorsNum;

public class Factor1 {

	public static void main(String[] args) {
		Factor ab=new Factor();
		ab.sumFactors();
	}

}
