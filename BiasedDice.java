import java.lang.Math;
public class BiasedDice
{
	public static int roll(double p1, double p2, double p3, double p4, double p5, double p6)
	{
		double r = Math.random();
		if (r <= p1) return 1;
		else 
		{
			if (r <= p1 + p2) return 2;
			else 
			{
				if (r <= p1 + p2 + p3) return 3;
				else
				{
					if (r <= p1 + p2 + p3 + p4) return 4;
					else 
					{
						if (r <= p1 + p2 + p3 + p4 + p5) return 5;
						else
						{
							if (r <= p1 + p2 + p3 + p4 + p6) return 6;
							else return 0;
						}
					}
				}
			} 
		}
	}
	public static void main(String[] args) 
	{
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
		for (int i = 0; i < 600; i++)
		{
			int rollOut = roll(0.01,0.01,0.01,0.01,0.01,0.95);
			if (rollOut == 1) count1++;
			else
			{
				if(rollOut == 2) count2++;
				else
				{
					if(rollOut == 3) count3++;
					else
					{
						if(rollOut == 4) count4++;
						else
						{
							if(rollOut == 5) count5++;
							else 
							{
								if (rollOut == 6) count6++;
							}
						}
					}
				}
			}
		}
		System.out.println("1s: " + count1 + "\n2s: " + count2 + "\n3s: " + count3 + "\n4s: " + count4 + "\n5s: " + count5 + "\n6s: " + count6);
	}
}