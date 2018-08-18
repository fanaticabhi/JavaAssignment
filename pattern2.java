import java.util.*;
import java.util.regex.*;
import java.io.*;

class pattern
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

int n=sc.nextInt();
sc.nextLine();
String arr[]=new String[n];
int arr2[]=new int[100];


for(int i=0;i<n;i++)
{

arr[i]=sc.nextLine();
}

int k=0,count=0;
for(int i=0;i<n;i++){
Pattern p1=Pattern.compile(arr[i]);
Matcher m = p1.matcher(s);
while(m.find())
{
arr2[k++]=m.start();

count++;
}
}

Arrays.sort(arr2);

for(int i=arr2.length-count;i<arr2.length;i++)
{
	System.out.print(""+arr2[i]+"\t");
}

}
}





