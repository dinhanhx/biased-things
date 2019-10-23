import java.lang.Math;
public class BiasedCoin
{
	public static boolean flip(double p)
	{
		if (Math.random() <= p) return true;
		else return false; 
	}
	public static void main(String[] args) 
	{
		int head_count = 0;
		int tail_count = 0;
		for(int i = 0; i < 100; i++)
		{
			if(flip(0.5)) head_count++;
			else tail_count++;
		}
		System.out.println(head_count + " heads");
		System.out.println(tail_count + " tails");
	}
}