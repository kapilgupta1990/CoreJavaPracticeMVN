import java.util.Arrays;

public class RerangeElement {

	public static void main(String[] args) {
		int arr[]= {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		
		for( int i=0;i<arr.length;i++){
			if(arr[i]==i || arr[i]==-1)
				continue;
			
			int temp=arr[i];
			int temp1=arr[temp];
			arr[temp]=temp;
			arr[i]=temp1;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
