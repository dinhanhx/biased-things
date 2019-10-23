import java.lang.Math;
public class BiasedList
{
	public static int pick(double[] p)
	{
		int n = p.length + 1;
		double[] point = new double[n];
		point[0] = 0.0;
		for (int i = 1; i < n; i++)
		{
			point[i] = point[i-1] + p[i-1] ;
		}
		int out = -1;
		double r = Math.random();
		for (int i = 0; i < n - 1; i++)
		{
			if (r > point[i] && r <= point[i+1])
			{
				out = i;
				break;
			}
		}
		return out;
	}	
	public static void main(String[] args) 
	{
		String[] list = {"A", "B", "C", "D"};

		double[] p = {0.1, 0.2, 0.3, 0.4};

		int a = 0, b = 0, c = 0, d = 0;

		for (int i = 0; i < 1000; i++)
		{
			int indexList = pick(p);
			if(list[indexList].equals("A")) a++;
			if(list[indexList].equals("B")) b++;
			if(list[indexList].equals("C")) c++;
			if(list[indexList].equals("D")) d++;
		}
		
		System.out.println("A appears " + a + " times");
		System.out.println("B appears " + b + " times");
		System.out.println("C appears " + c + " times");
		System.out.println("D appears " + d + " times");
	}
}