package com.cdk.gist.collection;

import java.util.TreeSet;

enum custom_order {
	 FIRST(11), THIRD(33), SECOND(22),FORTH,FIVE;
	private int i;

	private custom_order(){
		System.out.println(10);
	}
	private custom_order(int i) {
		System.out.println(i);
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}

public class TreeSetTesting {

	protected TreeSetTesting() throws Exception{
		
	}
	public static void main(String[] args) throws Exception {

		System.out.print("args[0]");
		System.out.println();
		TreeSet<custom_order> treeSetCustomOrder = new TreeSet<>();
		treeSetCustomOrder.add(custom_order.FIRST);
		treeSetCustomOrder.add(custom_order.SECOND);
		treeSetCustomOrder.add(custom_order.THIRD);
		System.out.println(treeSetCustomOrder);
		custom_order co=custom_order.FORTH;
		
		//c//ustom_order.FIVE.
		TreeSetTesting tst=new TreeSetTesting();
		
	}
}
