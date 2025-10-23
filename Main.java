/*public class num
{
	public static void main(String[] args) {
	    int n=0;
		for(int i=0; i<=n; i++)
		{
		    for(int j=i;j<i+n;j++)
		    {
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}
 */

 /*
  public class num {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = 0; i < rows; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
  */

/*
  public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int s = n - i; s > 1; s--) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.print("0 ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
 */
 /*
   public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i % 2 == 1 ? j : n - j + 1) + " ");
            }
            System.out.println();
        }
    }
}

  */


  /*
    public class Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<=n; i++){
            for(int j=i; j<i+n; j++){
                System.out.println(j+"");
            }
            System.out.println();
        }
        }
    }

   */

   /*
    import java.util.Scanner;

public class add {

    public void display(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        add p = new add();
        p.display(a, b);  
        p.display(c, d); 
    }
}


import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1; i<=4; i++){
            for(int j=1; j<=((n-1*2)-i*2); j++){
                System.out.print("*");
            }
        }
        System.out.println(" ");
    }
}

  import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1445;
        while(n>0){
          if(n>0){
            System.out.println(n>=count);
          }
    }
}
}

  import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=0;
    while(sc>0){
        num2=(num2*10)+(num1%10);
    sc=sc/10;
    }
    if (num1>num2) {
        System.out.println(num1);
    }
    else{
        System.out.println(num2);
    }
    }
        }

        public class add {
    public static void main(String[] args) {
        int num = 12345678;
        int first = num / 100000;      
        int last = num % 100000;       
        int reversed = 0;
        for (int i = 0; i < 5; i++) {
            int digit = last % 10;
            reversed = reversed * 10 + digit;
            last = last / 10;
        }
        System.out.println("First no is " + first);
        System.out.println("Sec no is " + reversed);
    }
}




            ARRAY CONCEPT

            import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter array size");
            int size=sc.nextInt();
            int []arr=new int[size];
            System.out.println("enter the array value");
            for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
       for(int i=0; i<size; i++)
    System.out.println(arr[i]);
    }
}


        import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter array size");
            int size=sc.nextInt();
            int []arr=new int[size];
            System.out.println("enter the array value");
            for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
      int sum=0;
      for(int i=0; i<size; i++)
      sum=arr[i];
      System.out.println(sum);

    }
}
    */
  
 /*
import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++){
            for(int j=1; j<=i; j++ )
            System.out.print("* ");
            System.out.println();
        }
    }
}


import java.util.Arrays;

public class add {
    public static void main(String[] args) {
      int arr[]={1,12,30,21,80};
      Arrays.sort(arr);
      for(int i=0; i<=5; i++)
      {
        System.out.println(arr[i]);
      }
}
}


import java.util.Arrays;

public class add {
public static void main(String[] args) {
    int arr[]={21,12,3,14,51};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
}
   } 

import java.util.Arrays;

public class add {
public static void main(String[] args) {
    int arr[]={21,12,3,14,51};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
}
}






 */
/*
 import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = {25, 10, 45, 5, 30};
        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}


import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		
		int arr1[] = {10,5,1,5,5,10};
		int[] arr2 = new int[arr1.length];
	    for(int i=0;i<arr1.length;i++)
	    {
	        for(int j=i+1;j<arr1.length;j++)
	        {
	            if(arr1[i]==arr1[j])
	            {
	                arr2[j]=1;
	            }
	        }
	    }
	    for(int i=0;i<arr1.length;i++)
	    {
	        if(arr2[i]==1)
	        {
	            System.out.println(arr1[i]);
	        }
	    }
    }
}
 */


 package