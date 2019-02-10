package kush;

public class Sorting {
	void Sorting(int arr[]) {
		int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
				}
	}
	void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	public static void main(String[]args) {
		Sorting s=new Sorting();
		int arr[]= {5,7,2,4,13,6};
		s.Sorting(arr);
		s.printArray(arr);
	}
				
{
}
}
	
