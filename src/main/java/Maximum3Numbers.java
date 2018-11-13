
public class Maximum3Numbers {

	public static void main(String[] args) {
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		int[] arr = { 1,1,1 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= firstMax) {

				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = arr[i];

			} else {

				if (arr[i] >= secondMax) {

					thirdMax = secondMax;
					//arr[i] = secondMax;
					secondMax=arr[i];

				} else {

					if (arr[i] >= thirdMax) {
						arr[i]=thirdMax;
					}
				}
			}
		}
		System.out.println(firstMax + " " + secondMax + " " + thirdMax);
	}
}
