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

package com.newstudy;

public class add {
		public static void main(String[] args)
		{
	        int arr[] ={4,6,1,8,3};
		        
		        int target = 7;
		        
		        for(int i=0;i<arr.length;i++){
	            int val = target-arr[i];
	                for(int j=0;j<arr.length;j++){
	                        if(arr[j]==val){
	                            System.out.println(i);
	                            System.out.println(j);
	                        }
	                    }
	        }
		}
	}

public class ADD
{
	public static void main(String[] args) {
	        int arr[] ={4,6,1,8,3};
	        int target = 7;
	        for(int i=0;i<arr.length;i++){
            int val = target-arr[i];
            boolean isFound=false;
                for(int j=0;j<arr.length;j++){
                        if(arr[j]==val){
                            isFound=true;
                            System.out.println(i+","+j);
                            break;
                    }
                 }
                    if(isFound)
                    {
                        break;
             }
        }
	}

}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int size = 3;
		int[][] arr = new int[size][size];
		Scanner in = new Scanner(System.in);
		for(int row=0;row<size;row++)
		{
		    for(int col=0;col<size;col++)
		    {
		        arr[row][col]=in.nextInt();
		    }
		}
		System.out.println("Data Stored Successfully");
	}
}

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int size = 5;
		char[][] arr = new char[size][size];
		Scanner in = new Scanner(System.in);
		for(int row=0;row<size;row++)
		{
		    for(int col=0;col<size;col++)
		    {
		        arr[row][col]=in.next().charAt(0);
		        
		    }
		}
		String findtext = in.nextLine();//GRASS
		System.out.println("Data Stored Successfully");
		char startCh = String.charAt(0);
		for(int i=0;i<size;i++)
		{
		    for(int j=0;j<size;j++)
		    {
		        boolean isFound=true;
		        
		        if(arr[i][j]==startCh){
		            int strInd = 1;
		            for(int k=j+1;k<size;k++)
		            {
		                if(String.charAt(strInd)!=arr[i][k]){
		                    isFound=false;
		                    break;
		                }
		                strInd++;
		            }
		            for(int k=i+1;k<size;k++)
		            {
		                if(String.charAt(strInd)!=arr[k][j]){
		                    isFound=false;
		                    break;
		                }
		                strInd++;
		            }
		        }
		        if(isFound)
		        {
		            break;
		        }
		    }
		        if(isFound)
		        {
		            break;
		        }
		    System.out.println();
		}
	}
}
import java.util.*;

public class Main
{
	public static void main(String[] args) {
    	String str = "abcdef";
    	String str2 = "cde";
    	for(int i=0;i<str.length();i++)
    	{
    	    String temp="";
    	        boolean isTrue = false;
    	    for(int j=i;j<str.length();j++)
    	    {
    	        temp+=str.charAt(j);
    	        if(temp.equals(str2))
    	        {
    	            isTrue=true;
    	            System.out.println(i);
    	            break;
    	        }
    	    }
    	    if(isTrue)
    	    {
    	        break;
    	    }
	}
	}
}
public class add {
    public static void main(String[] args) {
        String word = "";
        while (true) {
            System.out.println(word);
            System.out.println(new StringBuilder(word).reverse().toString());
            System.out.println("----------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                       e.printStackTrace();
         }break;
        }
    }
}

import java.util.Scanner;

public class add{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (i < str.length() - 1) {
                System.out.print(" ");
            }
        }

    }
}



*/


/*

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = String.join(" ", str.split(""));
        System.out.println(result);

}
}


import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character to search: ");
        char search = sc.next().charAt(0);
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == search) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}



import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        String str="hello";
        for(i=4; i>str.length; i++){
    System.out.println(i);
        }
    }
}
*/


/*

public class add
{
	public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        sb.append(" word");
        System.out.println(sb);
    }
}

public class add
{
	public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("the world");
        sb.reverse();
        System.out.println("enter the ch:"+sb);
    }
}

import java.util.Scanner;
public class add
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the val");
        String str=sc.nextLine();

        StringBuffer sb=new StringBuffer(str);
        sb.reverse();

        if(str.equals(sb.toString())){
            System.out.println("it is a palintrome");
        }
            else{
                System.out.println("not a palintrome");
            }
        
        }
}

import java.util.Scanner;

public class add{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter replacement text: ");
        String replaceText = sc.nextLine();
        
        String palindrome = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub) && sub.length() > palindrome.length()) {
                    palindrome = sub;
                }
            }
        }

        if (!palindrome.equals("")) {
            System.out.println("Found palindrome: " + palindrome);
            String finalStr = str.replace(palindrome, replaceText);
            System.out.println("Final output: " + finalStr);
        } else {
            System.out.println("No palindrome found!");
        }
    }

    public static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
}

*/

import java.util.*;

public class add
{
	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("Hello,World,java,c,Python",",");
 		while(str.hasMoreTokens()){
 		    System.out.println(str.nextToken());
	}


            str.nextToken();
            str.nextToken();
            
            System.out.println(str.nextToken());
	}
}

