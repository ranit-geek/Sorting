import java.util.*;
import java.io.*;
/* input should be given in the following format.First line will be size of array and second line will be all space separated array elements.
example:

5
7 1 4 7 2
*/


public class Test {


public static void main(String[] args) throws Exception {
  BufferedReader br = new BufferedReader(new InputStreamReader(System .in));
  int num = Integer.parseInt(br.readLine());
  String str = br.readLine();
  String [] stringarr=str.split(" ");
  final int size=stringarr.length;
  int [] S=new int[size];
  for (int u=0;u<size;u++)
    {
       S[u]=Integer.parseInt(stringarr[u]);
    }
	mergesort(S, 0,size-1);
	System.out.println(Arrays.toString(S));

}



public static void mergesort(int[] S, int low, int high){
    if (high <= low) { return; }
    int mid = (high + low) / 2;
    mergesort (S, low, mid);
    mergesort (S, mid+1, high);
    merge(S, low, mid, high);

    }

public static void merge(int[] S, int low, int mid, int high){
  int q=0;  
  int i=low;
  int j=mid+1;
  int k=low;
  int[] marr = new int[S.length];

  
  while(i<mid+1 && j<high+1)
  {
    if(S[i]<=S[j])
    {
      marr[q]=S[i];
      q++;
      i++;
    }
    else
    {
      marr[q]=S[j];
      q++;
      j++;
    }
    
  }
  
  while(i<mid+1)
  {
    marr[q]=S[i];
    q++;
    i++;
  }
  
  
  while(j<high+1)
  {
    marr[q]=S[j];
    q++;
    j++;
  }
  
  q=0;
  for(int g=low;g<=high;g++)
  {
    S[g]=marr[q];
    q++;
  }
  
  
  
}
}