import java.util.*;
import java.io.*;
/* input should be given in the following format.First line will be size of array and second line will be all space separated array elements.
example:

5
7 1 4 7 2
*/

class Selectionsort
{

public static void main(String [] args) throws Exception 
 {
BufferedReader br = new BufferedReader(new InputStreamReader(System .in));
int num = Integer.parseInt(br.readLine());
String input = br.readLine();
String [] stringarr=input.split(" ");
final int size=stringarr.length;
int [] arr=new int[size];
for (int u=0;u<size;u++)
    {
       arr[u]=Integer.parseInt(stringarr[u]);
    }
Selectionsort ob=new Selectionsort();
ob.sort(arr);
for (int x=0;x<size;x++)
    {
        System.out.println(arr[x]);
    }
 }

public void sort (int [] arr)
{
  int temp;
  int t = arr.length;
  for (int i=0;i<t;i++)
  {
    int miniindex=i;
    for(int j=i+1;j<t;j++)
    {
      if(arr[j]<arr[miniindex])
      {
        temp=arr[miniindex];
        arr[miniindex]=arr[j];
        arr[j]=temp;
      }
    }
  }
}

}



