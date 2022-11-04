/**
 * Code for the group project that tests the time complexities of several sorting algorithms 
 * several input sizes
 * All sorting algorithms were checked against the ones on GeeksForGeeks, for accuracy. 
 * Olivia Matlack, Jack Plummer, Ashley Pell 
 */

import java.util.Random;

public class Efficiency 
{
	public static boolean contains(float[] arr, float elmToCheck) // basic contains method to make it easier to check
	{                                                               // an element is present in the array 
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
	 // used for aid in MergeSort
	static void merge(float arr[], int l, int m, int r)
    {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;
     
        float L[] = new float[n1];
        float R[] = new float[n2];

        for (i = 0; i < n1; i++)
        {
        	L[i] = arr[l + i];
        }
            
        for (j = 0; j < n2; j++)
        {
        	 R[j] = arr[m + 1+ j];
        }
           
        i = 0;
        j = 0;
        k = l;
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
	
	static void MergeSort(float[] arr, int n)
    {

        int curr_size;

        int left_start;

        for (curr_size = 1; curr_size <= n-1; curr_size = 2*curr_size)
        {

            for (left_start = 0; left_start < n-1; left_start += 2*curr_size)
            {

                int mid = Math.min(left_start + curr_size - 1, n-1);
         
                int right_end = Math.min(left_start + 2*curr_size - 1, n-1);
         
                merge(arr, left_start, mid, right_end);
            }
        }
    }
    
    // Used to aid in QuickSort 
    static int partition(float arr[], int low, int high)
    {
        float pivot = arr[high];
 
        // index of small element
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) 
        {
            // If current elem is smaller than or
            // equal to pivot
            if (arr[j] <= pivot) 
            {
                i++;
 
                // swap
                float temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap
        float temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
 
        return i + 1;
    }
    
    static void QuickSort(float arr[], int l, int h)
    {
        
        int[] stack = new int[h - l + 1];
 
        int top = -1;
 
        stack[++top] = l;
        stack[++top] = h;
 
        // Keep popping from stack while is not empty
        while (top >= 0) 
        {
            h = stack[top--];
            l = stack[top--];
 
            int p = partition(arr, l, h);
 
            if (p - 1 > l) 
            {
                stack[++top] = l;
                stack[++top] = p - 1;
            }
 
            if (p + 1 < h) 
            {
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }
    }
    


	public static void main(String[] args) 
	{
		
		 
		 int[] sampleSize = {10000, 50000 , 100000/*, 500000, 1000000, 5000000, 10000000,30000000, 50000000, 100000000*/};
		 double start;
		 double end;
		 
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
			 System.out.printf("The run time for BubbleSort of Ascensing order set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 BubbleSort(descend);
			 end = System.nanoTime();
			 System.out.printf("The run time for BubbleSort of Descending order set size %d : %.3f Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 BubbleSort(repeat);
			 end = System.nanoTime();
			 System.out.printf("The run time for BubbleSort of Repeating set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 BubbleSort(everyOther);
			 end = System.nanoTime();
			 System.out.printf("The run time for BubbleSort of Every other element repeating set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 do
			 {
				 start = System.nanoTime();
				 BubbleSort(everyFifth);
				 end = System.nanoTime();
				 System.out.printf("The run time for BubbleSort of every fifth element repeating set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 BubbleSort(rand1);
				 end = System.nanoTime();
				 System.out.printf("The run time for BubbleSort of randomly generated set 1 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 BubbleSort(rand2);
				 end = System.nanoTime();
				 System.out.printf("The run time for BubbleSort of randomly generated set 2 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 BubbleSort(rand3);
				 end = System.nanoTime();
				 System.out.printf("The run time for BubbleSort of randomly generated set 3 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 BubbleSort(rand4);
				 end = System.nanoTime();
				 System.out.printf("The run time for BubbleSort of randomly generated set 4 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 BubbleSort(rand5);
				 end = System.nanoTime();
				 System.out.printf("The run time for BubbleSort of randomly generated set 5 size %d : %.3f Seconds\n", ss, ((end - start) / 1000000000));
				 System.out.printf("\n \n The Current Run Count is : %d \n\n", count);
				 setNewValues(everyFifth, rand1, rand2, rand3, rand4, rand5, ss);
				 count++;
			 }
			 while(count < 10);
			
			 
			 System.out.print("\n \n \n");
			 
			 SelectionSort(ascend);
			 end = System.nanoTime();
			 System.out.printf("The run time for SelectionSort of Ascensing order set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 SelectionSort(descend);
			 end = System.nanoTime();
			 System.out.printf("The run time for SelectionSort of Descending order set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 SelectionSort(repeat);
			 end = System.nanoTime();
			 System.out.printf("The run time for SelectionSort of Repeating set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 SelectionSort(everyOther);
			 end = System.nanoTime();
			 System.out.printf("The run time for SelectionSort of Every other element repeating set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 
			 count = 0;
			 do
			 {
				 start = System.nanoTime();
				 SelectionSort(everyFifth);
				 end = System.nanoTime();
				 System.out.printf("The run time for SelectionSort of every fifth element repeating set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 SelectionSort(rand1);
				 end = System.nanoTime();
				 System.out.printf("The run time for SelectionSort of randomly generated set 1 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 SelectionSort(rand2);
				 end = System.nanoTime();
				 System.out.printf("The run time for SelectionSort of randomly generated set 2 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 SelectionSort(rand3);
				 end = System.nanoTime();
				 System.out.printf("The run time for SelectionSort of randomly generated set 3 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 SelectionSort(rand4);
				 end = System.nanoTime();
				 System.out.printf("The run time for SelectionSort of randomly generated set 4 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 SelectionSort(rand5);
				 end = System.nanoTime();
				 System.out.printf("The run time for SelectionSort of randomly generated set 5 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));

				 System.out.printf("\n \n The Current Run Count is : %d \n\n", count);
				 setNewValues(everyFifth, rand1, rand2, rand3, rand4, rand5, ss);
				 count++;
			 }
			 while(count < 10);
			 
			 System.out.print("\n \n \n");
			 
			 InsertionSort(ascend);
			 end = System.nanoTime();
			 System.out.printf("The run time for InsertionSort of Ascensing order set size %d :  %.3f Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 InsertionSort(descend);
			 end = System.nanoTime();
			 System.out.printf("The run time for InsertionSort of Descending order set size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 InsertionSort(repeat);
			 end = System.nanoTime();
			 System.out.printf("The run time for InsertionSort of Repeating set size %d :  %.3f  Secondss\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 InsertionSort(everyOther);
			 end = System.nanoTime();
			 System.out.printf("The run time for InsertionSort of Every other element repeating set size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 
			 count = 0;
			 do
			 {
				 start = System.nanoTime();
				 InsertionSort(everyFifth);
				 end = System.nanoTime();
				 System.out.printf("The run time for InsertionSort of every fifth element repeating set size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 InsertionSort(rand1);
				 end = System.nanoTime();
				 System.out.printf("The run time for InsertionSort of randomly generated set 1 size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 InsertionSort(rand2);
				 end = System.nanoTime();
				 System.out.printf("The run time for InsertionSort of randomly generated set 2 size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 InsertionSort(rand3);
				 end = System.nanoTime();
				 System.out.printf("The run time for InsertionSort of randomly generated set 3 size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 InsertionSort(rand4);
				 end = System.nanoTime();
				 System.out.printf("The run time for InsertionSort of randomly generated set 4 size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 InsertionSort(rand5);
				 end = System.nanoTime();
				 System.out.printf("The run time for InsertionSort of randomly generated set 5 size %d :  %.3f Seconds\n", ss, ((end - start) / 1000000000));
				 
				 System.out.printf("\n \n The Current Run Count is : %d \n\n", count);
				 setNewValues(everyFifth, rand1, rand2, rand3, rand4, rand5, ss);
				 count++;
				 
			 }
			 while(count < 10);
			 
			 System.out.print("\n \n \n");
			 
			 MergeSort(ascend, ascend.length - 1);
			 end = System.nanoTime();
			 System.out.printf("The run time for MergeSort of Ascensing order set size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 MergeSort(descend, descend.length - 1);
			 end = System.nanoTime();
			 System.out.printf("The run time for MergeSort of Descending order set size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 MergeSort(repeat, repeat.length - 1);
			 end = System.nanoTime();
			 System.out.printf("The run time for MergeSort of Repeating set size %d :  %.3f Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 MergeSort(everyOther, everyOther.length - 1);
			 end = System.nanoTime();
			 System.out.printf("The run time for MergeSort of Every other element repeating set size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 
			 count = 0;
			 do
			 {
				 start = System.nanoTime();
				 MergeSort(everyFifth, everyFifth.length - 1);
				 end = System.nanoTime();
				 System.out.printf("The run time for MergeSort of every fifth element repeating set size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 MergeSort(rand1, rand1.length - 1);
				 end = System.nanoTime();
				 System.out.printf("The run time for MergeSort of randomly generated set 1 size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 MergeSort(rand2, rand2.length - 1);
				 end = System.nanoTime();
				 System.out.printf("The run time for MergeSort of randomly generated set 2 size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 MergeSort(rand3, rand3.length - 1);
				 end = System.nanoTime();
				 System.out.printf("The run time for MergeSort of randomly generated set 3 size %d :  %.3f Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 MergeSort(rand4, rand4.length - 1);
				 end = System.nanoTime();
				 System.out.printf("The run time for MergeSort of randomly generated set 4 size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 MergeSort(rand5, rand5.length - 1);
				 end = System.nanoTime();
				 System.out.printf("The run time for MergeSort of randomly generated set 5 size %d :  %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 
				 System.out.printf("\n \n The Current Run Count is : %d \n\n", count);
				 setNewValues(everyFifth, rand1, rand2, rand3, rand4, rand5, ss);
				 count++;
				 
			 }
			 while(count < 10);
			 
			 System.out.print("\n \n \n");
			 
			 QuickSort(ascend, 0, ascend.length -1);
			 end = System.nanoTime();
			 System.out.printf("The run time for QuickSort of Ascending order set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 QuickSort(descend, 0, descend.length -1);
			 end = System.nanoTime();
			 System.out.printf("The run time for QuickSort of Descending order set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 QuickSort(repeat, 0, repeat.length -1);
			 end = System.nanoTime();
			 System.out.printf("The run time for QuickSort of Repeating set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
			 start = System.nanoTime();
			 QuickSort(everyOther, 0, everyOther.length -1);
			 end = System.nanoTime();
			 System.out.printf("The run time for QuickSort of Every other element repeating set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));

			 count = 0;
			 do
			 {
				 start = System.nanoTime();
				 QuickSort(everyFifth, 0, everyFifth.length -1);
				 end = System.nanoTime();
				 System.out.printf("The run time for QuickSort of every fifth element repeating set size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 QuickSort(rand1, 0, rand1.length -1);
				 end = System.nanoTime();
				 System.out.printf("The run time for QuickSort of randomly generated set 1 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 QuickSort(rand2, 0, rand2.length -1);
				 end = System.nanoTime();
				 System.out.printf("The run time for QuickSort of randomly generated set 2 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 QuickSort(rand3, 0, rand3.length -1);
				 end = System.nanoTime();
				 System.out.printf("The run time for QuickSort of randomly generated set 3 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 QuickSort(rand4, 0, rand4.length -1);
				 end = System.nanoTime();
				 System.out.printf("The run time for QuickSort of randomly generated set 4 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));
				 start = System.nanoTime();
				 QuickSort(rand5, 0, rand5.length -1);
				 end = System.nanoTime();
				 System.out.printf("The run time for QuickSort of randomly generated set 5 size %d : %.3f  Seconds\n", ss, ((end - start) / 1000000000));

				 System.out.printf("\n \n The Current Run Count is : %d \n\n", count);
				 setNewValues(everyFifth, rand1, rand2, rand3, rand4, rand5, ss);
				 count++;
			 }
			 while(count < 10);

		 }

	}

}
