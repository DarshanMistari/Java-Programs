class Binary_Search{

    public static void main(String args[]){
        int arr[] = {10,20,30,40,50,60};
        int target = 60;
        int result = binarySearch(arr , target);
       
        if(result != -1)
        {
            System.out.println("Element is found at Index :" + result);
        }
        else
        {
            System.out.println("Element is not found");
        }
    }

    public static int binarySearch(int [] arr ,int target)
    {
        int left = 0;
        int right = arr.length-1;

        while(left <= right)
        {
			int mid = (left + right) / 2;

            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        return -1;
    }
}