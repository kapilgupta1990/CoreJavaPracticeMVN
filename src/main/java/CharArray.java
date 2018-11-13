
public class CharArray {

	public static void main(String[] args) {

		char [] arr=new char[10];
		arr[0]='a';
		arr[5]='k';
		arr[5]='\u0000';
		//arr[5]=null;
		arr[9]='z';
		int i=0;
		for(char ch: arr){
			if(ch=='\u0000'){
				i++;
			}
			System.out.print(ch);
		}
		System.out.println("Number of character "+i);
		System.out.println(arr);
	}
}
