import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class CadbuaryProblem {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		Integer M=Integer.parseInt(scanner.nextLine());
		Integer N=Integer.parseInt(scanner.nextLine());
		Integer P=Integer.parseInt(scanner.nextLine());
		Integer Q=Integer.parseInt(scanner.nextLine());
		System.out.println(M+" "+N+" "+P+" "+Q);
		int numberOfDistribution=0;
		for(int i=5;i<=6;i++){
			for(int j=3;j<=4;j++){
				int length=i;
				int breadth=j;
				
				while(length!=1 || breadth!=1){
					
					if(length==breadth){
						numberOfDistribution++;
						break;
					}
					if(length==1 || breadth==1){
						if(length==1)
							numberOfDistribution=numberOfDistribution+breadth;
						if(breadth==1)
							numberOfDistribution=numberOfDistribution+length;
						break;
					}
					if(length>breadth)
						length=length-breadth;
						else
							breadth=breadth-length;
					numberOfDistribution++;
					}
				}
				
			}
		System.out.println(numberOfDistribution);

		}
	}

