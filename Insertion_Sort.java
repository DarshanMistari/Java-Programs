class Insertion_Sort{

    public static void main(String args[])
    {
        int arr[] = {20,10,30,50,40,70,60};
        int temp = 0;

        System.out.println("Before Sorting Insertion Sort :");
        for(int nums : arr)
        {
			System.out.print(nums+" ");
		}

        for(int i = 0; i < arr.length; i++)
        {
            temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;

        System.out.println();
        for(int nums : arr)
        {
            System.out.print(nums +" ");
        }
        System.out.println("");
        }


        System.out.println("\nAfter Sorting Insertion Sort :\n");
          for(int nums : arr)
		    {
		        System.out.print(nums +" ");
            }
    }
}