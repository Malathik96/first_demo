package array;

public class arrayMDA {
	public static void main(String[] args) {

	
	int a[][]=new int[5][5];
	
	//a[0][0]=100;
	//a[0][1]=200;
	//a[1][0]=300;
	//a[1][1]=400;
	
	System.out.println(a[0][1]);
		
		int a1[][]= {{100,200},{300,400},{500,600}};
		
	    //find size of an array
		System.out.println("Number of rows :"+a1.length); //row count
		
		System.out.println("Number of columns :"+a1[0].length); //column count
		
		//read single value from in array
		System.out.println(a1[1][1]);
		
	    //read multiple value from in array using nested loop 
		
		for (int r=0;r<a1.length;r++)
		{
			for (int c=0;c<a1[0].length;c++)
			System.out.println(a1[r][c]);
		} 
		
		
	/*	int a[][]= {{100,200},{300,400},{500,600}};
		
		for (int v[]:a)
		{
			for(int x:v)
			{
				System.out.print(x+" ");

			}
			System.out.println();
		}*/

		
		}
	}

