
// code to find the grades of 10 students based on the given marks from the command line ..

public class GradeCalc{
    public static void main(String[] args)
    {
		int arr[] = new int[10];
        for(int i=0; i<10 ;i++)
			arr[i] = Integer.parseInt(args[i]);
		int min =0;
		for(int i=0; i<10 ;i++)
		{
			min = arr[i];
			for(int j=i+1; j<10;j++)
				if(min > arr[j])
				{
					min = arr[j];
					int temp = arr[i];
            		arr[i] = arr[j];
            		arr[j] = temp;
				}
		}
		
		for( int i=0; i<10 ;i++)
		{
			System.out.print(arr[i] + "\t");
			if(arr[i] > 40 && arr[i] <= 50)
				System.out.println("PASS");
			else if (arr[i] > 50 && arr[i] <=75)
				System.out.println("MERIT");
			else if (arr[i] >75)
				System.out.println("DISTINCTION");
			else
				System.out.println("FAIL");
		}
    }
}

