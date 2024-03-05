import java.util.Scanner;

public class Exercises {
	private static Scanner scan = new Scanner(System.in);
	
	public static void Problem1()
	{
		int nr = scan.nextInt();
		if(nr<1 || 10<nr) System.out.println("INVALID");
		else if(nr<5) System.out.println("RESPINS");
		else System.out.println("ADMIS");
	}
	
	public static void Problem2()
	{
		Scanner scan = new Scanner(System.in);
		int nr = scan.nextInt();
		switch(nr) {
		  case 1:
			  System.out.println("UNU");
		    break;
		  case 2:
			  System.out.println("DOI");
		    break;
		  case 3:
			  System.out.println("TREI");
		    break;
		  case 4:
			  System.out.println("PATRU");
		    break;
		  case 5:
			  System.out.println("CINCI");
		    break;
		  default:
			  System.out.println("INVALID");
		}
	}
	
	public static void Problem3()
	{
		int x = scan.nextInt();
		int y = scan.nextInt();
		if((x+y)%2==1) System.out.println(x+y);
		else if(x%2==0) System.out.println((x+y)/2);
		else System.out.println(x*y);
	}
	
	public static void Problem4()
	{
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		if(x<y && x<z) System.out.println(x);
		else if(y<z) System.out.println(y);
		else System.out.println(z);
	}
	
	public static void Problem5()
	{
		int nr = scan.nextInt();
		int sum=0;
		int lastNr=2;
		for(int i=1; i<nr; i++)
		{
			sum+=lastNr;
			lastNr+=2;
		}
		System.out.println(sum);
	}
	
	public static void Problem6()
	{
		int nr = scan.nextInt();
		int sum=0;
		int lastNr=1;
		for(int i=0; i<nr; i++)
		{
			sum+=lastNr;
			lastNr+=2;
		}
		System.out.println(sum);
	}
	
	public static void Problem7()
	{
		System.out.print("Introduce the number of numbers: ");
		int nr = scan.nextInt();
		System.out.println("Introduce the numbers: ");
		int sum=0;
		for(int i=0; i<nr; i++)
		{
			sum+= scan.nextInt();
		}
		System.out.println(sum/nr);
	}
	
	public static void Problem8()
	{
		int nr = scan.nextInt();
		long fact=1;
		for(int i=2; i<=nr; i++) fact*=i;
		System.out.println(fact);
	}
	
	public static void Problem9()
	{
		int nr = scan.nextInt();
		if(nr<=1)
		{
			System.out.println("INVALID");
			System.exit(0);
		}
		for(int i=2; i<=Math.sqrt(nr); i++)
			if(nr%i==0)
			{
				System.out.println("NU E PRIM");
				System.exit(0);
			}
		System.out.println("E PRIM");
	}
	
	public static void Problem10()
	{
		//System.out.println(1009);
		for(int nr=1001; true; nr++)
		{
			boolean prim=true;
			for(int i=2; i<=Math.sqrt(nr); i++)
				if(nr%i==0)
				{
					prim=false;
					break;
				}
			if(prim)
			{
				System.out.println(nr);
				System.exit(0);
			}
		}
	}
	
	public static void Problem11()
	{
		int nr = scan.nextInt();
		StringBuilder divizori = new StringBuilder("1, ");
		for(int i=2; i<nr; i++)
			if(nr%i==0)
				divizori.append(i+", ");
		divizori.append(nr);
		System.out.println(new String(divizori));
	}
	
	public static void Problem12()
	{
		int nr = scan.nextInt();
		StringBuilder divizoriPrimi = new StringBuilder("");
		for(int div=2; div<=nr; div++)
			if(nr%div==0)
			{
				boolean prim=true;
				for(int i=2; i<=Math.sqrt(div); i++)
					if(div%i==0)
					{
						prim=false;
						break;
					}
				if(prim)
					divizoriPrimi.append(div+" ");
			}
		System.out.println(new String(divizoriPrimi));
	}
	
	public static void Problem13()
	{
		//System.out.println("(221, 779) (544, 456) (867, 133)");
		StringBuilder perechi = new StringBuilder("");
		for(int i=1; i<=1000/17; i++)
		{
			for(int j=1; j<=1000/19; j++)
			{
				if(i*17+j*19==1000)
					perechi.append("("+i*17+", "+j*19+") ");
					
			}
		}
		System.out.println(new String(perechi));
	}
	
	public static void Problem14()
	{
		//System.out.println("(13, 987) (34, 966) (104, 896) (153, 847) (221, 779) (195, 805) (272, 728) (221, 779) (286, 714) (391, 609) (377, 623) (510, 490) (544, 456) (468, 532) (629, 371) (559, 441) (748, 252) (650, 350) (867, 133) (715, 285) (741, 259) (986, 14) (832, 168) (923, 77) (962, 38)");
		StringBuilder perechi = new StringBuilder("");
		for(int i=1; i<=1000/13; i++)
		{
			for(int j=1; j<=1000/7; j++)
			{
				if (i * 17 + j * 19 == 1000) {
                    perechi.append("(" + i * 17 + ", " + j * 19 + ") "); break;
                } else if (i * 17 + j * 7 == 1000) {
                    perechi.append("(" + i * 17 + ", " + j * 7 + ") "); break;
                } else if (i * 13 + j * 19 == 1000) {
                    perechi.append("(" + i * 13 + ", " + j * 19 + ") "); break;
                } else if (i * 13 + j * 7 == 1000) {
                    perechi.append("(" + i * 13 + ", " + j * 7 + ") "); break;
                }
					
			}
		}
		System.out.println(new String(perechi));
	}
	
	public static void Problem15()
	{
		StringBuilder nr = new StringBuilder("");
		for(int a=0; a<=9; a++)
			for(int b=0; b<=9; b++)
				if((5+a+b)%9==0)
					nr.append("3"+a+"2"+b+" ");
		System.out.println(new String(nr));
					
	}
	
	public static void Problem16()
	{
		int nr= scan.nextInt();
		StringBuilder cifre = new StringBuilder();
		while(nr>0)
		{
			cifre.append(nr%10+" ");
			nr=nr/10;
		}
		System.out.println(new String(cifre.reverse()));			
	}
	
	public static void Problem17()
	{
		int nr= scan.nextInt();
		int max=0;
		while(nr>0)
		{
			if(nr%10>max)
				max=nr%10;
			nr=nr/10;
		}
		System.out.println(max);			
	}
	
	public static void Problem18()
	{
		int nr= scan.nextInt();
		int min=10;
		while(nr>0)
		{
			if(nr%10<min)
				min=nr%10;
			nr=nr/10;
		}
		if(min==10) System.out.println(0);	
		else System.out.println(min);			
	}
	
	public static void Problem19()
	{
		int nr= scan.nextInt();
		while(nr>0)
		{
			System.out.print(nr%10);
			nr=nr/10;
		}			
	}
	
	public static void Problem20()
	{
		int nr= scan.nextInt();
		int original=nr;
		int reversed=0;
		while(nr>0)
		{
			reversed=reversed*10+nr%10;
			nr=nr/10;
		}
		if(original==reversed) System.out.println("E PALINDROM");
		else System.out.println("NU E PALINDROM");
	}
}
