
import java.util.Random;

public class Efficiency 
{
	public static boolean contains(float[] arr, float elmToCheck)
	{
		boolean check = false;
		for (float element : arr) 
		{
		    if (element == elmToCheck) 
		    {
		        check = true;
		    }
		}
		return check;
	}
	
	
	
	public static void setValues( float[] ac,  float[] des,  float[] rep, 
			 float[] eo,  float[] ef,  float[] r1,  float[] r2,  float[] r3,
			 float[] r4,  float[] r5, int splSize) // method to set each array based on sample size
	{
		Random rand = new Random(50000); // random number generator
		float num = 0; 
		for(int i = 0; i < splSize; i++)
		{
			ac[i] = Float.valueOf(i); // sets in ascending order
			rep[i] = (float)2575.5; // sets all elements as 2575.5
			if(i%2 == 1)
			{
				eo[i] = (float)2575.5; // sets every other element to 2575.5
			}
			else
			{
				num = rand.nextFloat();
				eo[i] = num; // the remaining will be set to a random value 
			}
			if(i%5 == 0) 
			{
				ef[i] = (float)2575.5; // sets every fifth element to 2575.5
			}
			else
			{
				num = rand.nextFloat();
				ef[i] = num; // sets all other elements to a random value
			}
			
		}
		for(int j = splSize; j > 0; j--)
		{
			des[splSize - j] = Float.valueOf(j); // sets in descending order
		}
		int count = 0;
		while(count < splSize)
		{
			 num = rand.nextFloat();
			 if(!contains(r1, num)) // this will guarantee that there are no
			 {							// repeat numbers 
				 r1[count] = num;
				 count++;
			 }
		}
		count = 0;
		while(count < splSize)
		{
			 num = rand.nextFloat();
			 if(!contains(r2, num)) // this will guarantee that there are no
			 {							// repeat numbers 
				 r2[count] = num;
				 count++;
			 }
		}
		count = 0;
		while(count < splSize)
		{
			 num = rand.nextFloat();
			 if(!contains(r3, num)) // this will guarantee that there are no
			 {							// repeat numbers 
				 r3[count] = num;
				 count++;
			 }
		}
		count = 0;
		while(count < splSize)
		{
			 num = rand.nextFloat();
			 if(!contains(r4, num)) // this will guarantee that there are no
			 {							// repeat numbers 
				 r4[count] = num;
				 count++;
			 }
		}
		count = 0;
		while(count < splSize)
		{
			 num = rand.nextFloat();
			 if(!contains(r5, num)) // this will guarantee that there are no
			 {							// repeat numbers 
				 r5[count] = num;
				 count++;
			 }
		}
		
		
	}
	
	public static void setNewValues(float[] ef,  float[] r1,  float[] r2,  float[] r3,
			 float[] r4,  float[] r5, int splSize)  // will generate the sets that need to be run more than once 
	{
		Random rand = new Random(50000); // random number generator
		float num = 0; 
		for(int i = 0; i < splSize; i++)
		{
			if(i%5 == 0) 
			{
				ef[i] = (float)2575.5; // sets every fifth element to 2575.5
			}
			else
			{
				num = rand.nextFloat();
				ef[i] = num; // sets all other elements to a random value
			}
			
		}
		int count = 0;
		while(count < splSize)
		{
			 num = rand.nextFloat();
			 if(!contains(r1, num)) // this will guarantee that there are no
			 {							// repeat numbers 
				 r1[count] = num;
				 count++;
			 }
		}
		count = 0;
		while(count < splSize)
		{
			 num = rand.nextFloat();
			 if(!contains(r2, num)) // this will guarantee that there are no
			 {							// repeat numbers 
				 r2[count] = num;
				 count++;
			 }
		}
		count = 0;
		while(count < splSize)
		{
			 num = rand.nextFloat();
			 if(!contains(r3, num)) // this will guarantee that there are no
			 {							// repeat numbers 
				 r3[count] = num;
				 count++;
			 }
		}
		count = 0;
		while(count < splSize)
		{
			 num = rand.nextFloat();
			 if(!contains(r4, num)) // this will guarantee that there are no
			 {							// repeat numbers 
				 r4[count] = num;
				 count++;
			 }
		}
		count = 0;
		while(count < splSize)
		{
			 num = rand.nextFloat();
			 if(!contains(r5, num)) // this will guarantee that there are no
			 {							// repeat numbers 
				 r5[count] = num;
				 count++;
			 }
		}
		
	}
	
	public static void BubbleSort(float arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
        	for (int j = 0; j < n - i - 1; j++)
        	{
        		if (arr[j] > arr[j + 1]) 
                {
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        	}
                
        }
            
    }
	
	public static void SelectionSort(float arr[])
    {
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            
            int min_idx = i;
            for (int j = i+1; j < n; j++)
            {
            	if (arr[j] < arr[min_idx])
            	{
            		 min_idx = j;
            	}    
            }
                
            float temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
	
	public static void InsertionSort(float arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) 
        {
            float key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
	
	public static void merge(float arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        float L[] = new float[n1];
        float R[] = new float[n2];
 
        
        for (int i = 0; i < n1; ++i)
        {
        	 L[i] = arr[l + i];
        }
           
        for (int j = 0; j < n2; ++j)
        {
        	R[j] = arr[m + 1 + j];
        }
           
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) 
        {
            if (L[i] <= R[j]) 
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        
        while (i < n1) 
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        
        while (j < n2) 
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
   
    public static void MergeSort(float arr[], int l, int r)
    {
        if (l < r) 
        {
            int m = l + (r - l) / 2;
 
            MergeSort(arr, l, m);
            MergeSort(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }
    }


	public static void main(String[] args) 
	{
		
		 
		 int[] sampleSize = {500, 1000/*, 5000, 10000, 50000 , 100000, 500000, 1000000, 10000000, 50000000*/};
		 long start;
		 long end;
		 
		 for(int ss: sampleSize)
		 {
			 
			 float[]  ascend = new float[ss]; // holds the ascending order set 
			 float[]  descend = new float[ss]; // holds the descending order set
			 float[]  repeat = new float[ss]; // holds the set with all the same value 
			 float[]  everyOther = new float[ss]; // holds set with every other value repeating
			 float[]  everyFifth = new float[ss]; // holds the set with every fifth value repeating
			 float[]  rand1 = new float[ss]; // these hold the 5 all random sets 
			 float[]  rand2 = new float[ss];
			 float[]  rand3 = new float[ss];
			 float[]  rand4 = new float[ss];
			 float[]  rand5 = new float[ss];
			 
			 int count = 0;
			 
			 setValues(ascend, descend, repeat, everyOther, everyFifth, rand1, rand2, rand3, rand4, rand5, ss);
			 start = System.nanoTime();
			
			 BubbleSort(ascend);
			 end = System.nanoTime();
			 System.out.printf("The run time for BubbleSort of Ascensing order set size %d : %d  Millieconds\n", ss, ((end - start) / 100000));
			 start = System.nanoTime();
			 BubbleSort(descend);
			 end = System.nanoTime();
			 System.out.printf("The run time for BubbleSort of Descending order set size %d : %d Milliseconds\n", ss, ((end - start) / 100000));
			 start = System.nanoTime();
			 BubbleSort(repeat);
			 end = System.nanoTime();
			 System.out.printf("The run time for BubbleSort of Repeating set size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
			 start = System.nanoTime();
			 BubbleSort(everyOther);
			 end = System.nanoTime();
			 System.out.printf("The run time for BubbleSort of Every other element repeating set size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
			 do
			 {
				 start = System.nanoTime();
				 BubbleSort(everyFifth);
				 end = System.nanoTime();
				 System.out.printf("The run time for BubbleSort of every fifth element repeating set size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 BubbleSort(rand1);
				 end = System.nanoTime();
				 System.out.printf("The run time for BubbleSort of randomly generated set 1 size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 BubbleSort(rand2);
				 end = System.nanoTime();
				 System.out.printf("The run time for BubbleSort of randomly generated set 2 size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 BubbleSort(rand3);
				 end = System.nanoTime();
				 System.out.printf("The run time for BubbleSort of randomly generated set 3 size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 BubbleSort(rand4);
				 end = System.nanoTime();
				 System.out.printf("The run time for BubbleSort of randomly generated set 4 size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 BubbleSort(rand5);
				 end = System.nanoTime();
				 System.out.printf("The run time for BubbleSort of randomly generated set 5 size %d : %d Milliseconds\n", ss, ((end - start) / 100000));
				 System.out.printf("\n \n The Current Run Count is : %d \n\n", count);
				 setNewValues(everyFifth, rand1, rand2, rand3, rand4, rand5, ss);
				 count++;
			 }
			 while(count < 10);
			
			 
			 System.out.print("\n \n \n");
			 
			 SelectionSort(ascend);
			 end = System.nanoTime();
			 System.out.printf("The run time for SelectionSort of Ascensing order set size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
			 start = System.nanoTime();
			 SelectionSort(descend);
			 end = System.nanoTime();
			 System.out.printf("The run time for SelectionSort of Descending order set size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
			 start = System.nanoTime();
			 SelectionSort(repeat);
			 end = System.nanoTime();
			 System.out.printf("The run time for SelectionSort of Repeating set size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
			 start = System.nanoTime();
			 SelectionSort(everyOther);
			 end = System.nanoTime();
			 System.out.printf("The run time for SelectionSort of Every other element repeating set size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
			 
			 count = 0;
			 do
			 {
				 start = System.nanoTime();
				 SelectionSort(everyFifth);
				 end = System.nanoTime();
				 System.out.printf("The run time for SelectionSort of every fifth element repeating set size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 SelectionSort(rand1);
				 end = System.nanoTime();
				 System.out.printf("The run time for SelectionSort of randomly generated set 1 size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 SelectionSort(rand2);
				 end = System.nanoTime();
				 System.out.printf("The run time for SelectionSort of randomly generated set 2 size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 SelectionSort(rand3);
				 end = System.nanoTime();
				 System.out.printf("The run time for SelectionSort of randomly generated set 3 size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 SelectionSort(rand4);
				 end = System.nanoTime();
				 System.out.printf("The run time for SelectionSort of randomly generated set 4 size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 SelectionSort(rand5);
				 end = System.nanoTime();
				 System.out.printf("The run time for SelectionSort of randomly generated set 5 size %d : %d  Milliseconds\n", ss, ((end - start) / 100000));

				 System.out.printf("\n \n The Current Run Count is : %d \n\n", count);
				 setNewValues(everyFifth, rand1, rand2, rand3, rand4, rand5, ss);
				 count++;
			 }
			 while(count < 10);
			 
			 System.out.print("\n \n \n");
			 
			 InsertionSort(ascend);
			 end = System.nanoTime();
			 System.out.printf("The run time for InsertionSort of Ascensing order set size %d :  %d Milliseconds\n", ss, ((end - start) / 100000));
			 start = System.nanoTime();
			 InsertionSort(descend);
			 end = System.nanoTime();
			 System.out.printf("The run time for InsertionSort of Descending order set size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
			 start = System.nanoTime();
			 InsertionSort(repeat);
			 end = System.nanoTime();
			 System.out.printf("The run time for InsertionSort of Repeating set size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
			 start = System.nanoTime();
			 InsertionSort(everyOther);
			 end = System.nanoTime();
			 System.out.printf("The run time for InsertionSort of Every other element repeating set size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
			 
			 count = 0;
			 do
			 {
				 start = System.nanoTime();
				 InsertionSort(everyFifth);
				 end = System.nanoTime();
				 System.out.printf("The run time for InsertionSort of every fifth element repeating set size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 InsertionSort(rand1);
				 end = System.nanoTime();
				 System.out.printf("The run time for InsertionSort of randomly generated set 1 size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 InsertionSort(rand2);
				 end = System.nanoTime();
				 System.out.printf("The run time for InsertionSort of randomly generated set 2 size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 InsertionSort(rand3);
				 end = System.nanoTime();
				 System.out.printf("The run time for InsertionSort of randomly generated set 3 size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 InsertionSort(rand4);
				 end = System.nanoTime();
				 System.out.printf("The run time for InsertionSort of randomly generated set 4 size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 InsertionSort(rand5);
				 end = System.nanoTime();
				 System.out.printf("The run time for InsertionSort of randomly generated set 5 size %d :  %d Milliseconds\n", ss, ((end - start) / 100000));
				 
				 System.out.printf("\n \n The Current Run Count is : %d \n\n", count);
				 setNewValues(everyFifth, rand1, rand2, rand3, rand4, rand5, ss);
				 count++;
				 
			 }
			 while(count < 10);
			 
			 System.out.print("\n \n \n");
			 
			 MergeSort(ascend, 0, ascend.length - 1);
			 end = System.nanoTime();
			 System.out.printf("The run time for MergeSort of Ascensing order set size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
			 start = System.nanoTime();
			 MergeSort(descend, 0, descend.length - 1);
			 end = System.nanoTime();
			 System.out.printf("The run time for MergeSort of Descending order set size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
			 start = System.nanoTime();
			 MergeSort(repeat, 0, repeat.length - 1);
			 end = System.nanoTime();
			 System.out.printf("The run time for MergeSort of Repeating set size %d :  %d Milliseconds\n", ss, ((end - start) / 100000));
			 start = System.nanoTime();
			 MergeSort(everyOther, 0, everyOther.length - 1);
			 end = System.nanoTime();
			 System.out.printf("The run time for MergeSort of Every other element repeating set size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
			 
			 count = 0;
			 do
			 {
				 start = System.nanoTime();
				 MergeSort(everyFifth, 0, everyFifth.length - 1);
				 end = System.nanoTime();
				 System.out.printf("The run time for MergeSort of every fifth element repeating set size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 MergeSort(rand1, 0, rand1.length - 1);
				 end = System.nanoTime();
				 System.out.printf("The run time for MergeSort of randomly generated set 1 size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 MergeSort(rand2, 0, rand2.length - 1);
				 end = System.nanoTime();
				 System.out.printf("The run time for MergeSort of randomly generated set 2 size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 MergeSort(rand3, 0, rand3.length - 1);
				 end = System.nanoTime();
				 System.out.printf("The run time for MergeSort of randomly generated set 3 size %d :  %d Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 MergeSort(rand4, 0, rand4.length - 1);
				 end = System.nanoTime();
				 System.out.printf("The run time for MergeSort of randomly generated set 4 size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
				 start = System.nanoTime();
				 MergeSort(rand5, 0, rand5.length - 1);
				 end = System.nanoTime();
				 System.out.printf("The run time for MergeSort of randomly generated set 5 size %d :  %d  Milliseconds\n", ss, ((end - start) / 100000));
				 
				 System.out.printf("\n \n The Current Run Count is : %d \n\n", count);
				 setNewValues(everyFifth, rand1, rand2, rand3, rand4, rand5, ss);
				 count++;
				 
			 }
			 while(count < 10);
			 
			 System.out.print("\n \n \n");
			 
			 /*QuickSort(ascend);
			 end = System.nanoTime();
			 System.out.printf("The run time for QuickSort of Ascensing order set size %d : %f", ss, (end - start));
			 start = System.nanoTime();
			 QuickSort(descend);
			 end = System.nanoTime();
			 System.out.printf("The run time for QuickSort of Descending order set size %d : %f", ss, (end - start));
			 start = System.nanoTime();
			 QuickSort(repeat);
			 end = System.nanoTime();
			 System.out.printf("The run time for QuickSort of Repeating set size %d : %f", ss, (end - start));
			 start = System.nanoTime();
			 QuickSort(everyOther);
			 end = System.nanoTime();
			 System.out.printf("The run time for QuickSort of Every other element repeating set size %d : %f", ss, (end - start));

			 count = 0;
			 do
			 {
				 start = System.nanoTime();
				 QuickSort(everyFifth);
				 end = System.nanoTime();
				 System.out.printf("The run time for QuickSort of every fifth element repeating set size %d : %f", ss, (end - start));
				 start = System.nanoTime();
				 QuickSort(rand1);
				 end = System.nanoTime();
				 System.out.printf("The run time for QuickSort of randomly generated set 1 size %d : %f", ss, (end - start));
				 start = System.nanoTime();
				 QuickSort(rand2);
				 end = System.nanoTime();
				 System.out.printf("The run time for QuickSort of randomly generated set 2 size %d : %f", ss, (end - start));
				 start = System.nanoTime();
				 QuickSort(rand3);
				 end = System.nanoTime();
				 System.out.printf("The run time for QuickSort of randomly generated set 3 size %d : %f", ss, (end - start));
				 start = System.nanoTime();
				 QuickSort(rand4);
				 end = System.nanoTime();
				 System.out.printf("The run time for QuickSort of randomly generated set 4 size %d : %f", ss, (end - start));
				 start = System.nanoTime();
				 QuickSort(rand5);
				 end = System.nanoTime();
				 System.out.printf("The run time for QuickSort of randomly generated set 5 size %d : %f", ss, (end - start));

				 System.out.printf("\n \n The Current Run Count is : %d \n\n", count);
				 setNewValues(everyFifth, rand1, rand2, rand3, rand4, rand5, ss);
				 count++;
			 }
			 while(count < 10);*/

		 }

	}

}
