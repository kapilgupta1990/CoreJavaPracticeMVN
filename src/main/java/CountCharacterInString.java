
public class CountCharacterInString {

	public static void main(String[] args) {
		String str="kapil gupta";
		int [] arr=new int[256];
		char[] charArray=str.toCharArray();
		for(char ch:charArray){
			arr[(int)ch]=arr[(int)ch]+1;;
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				System.out.println((char)i+" "+arr[i]);
			}
		}
		
	}
}
