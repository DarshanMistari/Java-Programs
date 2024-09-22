class Linear_Search{

    public static void main(String args[])
    {
        int arr[] = {10,20,30,40,50};
        int target = 40;
        int result = linearSearch(arr , target);

        if(result != -1)
        {
            System.out.println("Element is found at index :"+result);
        }
        else
        {
            System.out.println("Element is not found  :");
        }

    }
    public static int linearSearch(int [] arr ,int target)
    {
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}