import java.util.stream.Stream;

public class StringBuilderTesting {

	public static void main(String[] args) {

		StringBuilder kapil1=new StringBuilder("kapil");
		StringBuilder kapil2=new StringBuilder("kapil");
		System.out.println(kapil1==kapil2);
		System.out.println(kapil1.equals(kapil2));
		
		StringBuffer kapil11=new StringBuffer("kapil");
		StringBuffer kapil22=new StringBuffer("kapil");
		System.out.println(kapil11==kapil22);
		System.out.println(kapil11.equals(kapil22));
		

		String kapil111=new String("kapil");
		String kapil222=new String("kapil");
		System.out.println(kapil111==kapil222);
		System.out.println(kapil111.equals(kapil222));
		
		//Arrays.string
		//Stream<Integer> =Stream
		
		
	}
}
