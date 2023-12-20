package looping;

public class NestedLoop {
	
public static void main(String[] args) {
	
	for(int i=0; i<=3; i++)
	{
		for(int j=0; j<=3; j++)
		{
			System.out.println(j);
		}
		System.out.println(i);
	}
	
}
}

/*
i=0  0<3  Syso(0)  i=(i+1)=0+1=1   

     j=0  0<3 Syso(0) j=(j+1)=0+1=1  ==>1 next value
     j=1  0<3 Syso(1) j=(j+1)=1+1=2  ==>2 next value
     j=2  0<3 Syso(2) j=(j+1)=2+1=3  ==>3 next value
     j=3  0<3 Syso(3) j=(j+1)=3+1=4  ==>4 next value
     j=4 --->false  ------>syso(0)===>0+1=1
         
*/