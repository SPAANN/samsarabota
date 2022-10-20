
import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		System.out.println((101+0)/3); //1
		System.out.println(3.0e-6*10000000.1); //b
		System.out.println(true && true); //c
		System.out.println(false && false); //d
		System.out.println((false && false) || (true && true) || (false || false) && (true && true)); //e
		Scanner s = new Scanner(System.in);


        //2
        int[] ch; 
        ch = new int[4];

		for (int i = 0; i<4; i++) 
		{
		    System.out.print("Введите число\n");
		    ch[i] = s.nextInt();
		    
		}
		
	    if ((ch[0]==ch[1]) &  (ch[1] == ch[2]) & (ch[3] == ch[2]))
		{
		    System.out.println("Равно");
		} 
		else {
		    System.out.println("Не равно");
		} 
		
		//6
		int sum=0;
		System.out.println("Введите число");
		int umn = s.nextInt();
		System.out.println("Введите степень");
		int st = s.nextInt();
		for (int i = 0; i<st; i++)
		{
		    sum += umn;
		}
		System.out.println(sum)
		
		
		//8

        System.out.println("Введите температуру");
        int temper = s.nextInt();
        System.out.println((temper-32)*5/9);
        //9
        System.out.println("Введите вес");
        double ves = s.nextInt();
        System.out.println("Введите рост");
        double ros = s.nextInt();
        System.out.println(ves/(ros*ros));
        
        //10
        
        System.out.println("Введите число");
        int cs = s.nextInt();
        
        System.out.println(Math.pow(cs,2));
        System.out.println(Math.pow(cs,3));
        System.out.println(Math.pow(cs,4));
        
        //11
        
        System.out.println();
        int a = s.nextInt();
        
        System.out.println();
        int b = s.nextInt();
        
        System.out.println();
        int c = s.nextInt();
        
        if (((a+b)>c)&&((a+c)>b)&&((c+b)>a))
        {
            System.out.println("Может");
        } else 
        {
            System.out.println("А может и не может");
        }

		//3
	 int[] newarr;
	 int maxi = 0 ;
	 int mini = 999;
	 System.out.println("Число ячеек");
	 int mass = s.nextInt();
	 newarr = new int[mass];
	 for (int i = 0; i<mass; i++)
	   {
	    System.out.println("Введите число #" + i);
	    if (newarr[i]>newarr[i-1])
	    {
	        maxi = newarr[i];
	        
	    } else if (newarr[i]<newarr[i-1])
	    {
	        mini = newarr[i];
	    }
	   }
	   
	   System.out.println(maxi);
	   System.out.println(mini);
	}

}
