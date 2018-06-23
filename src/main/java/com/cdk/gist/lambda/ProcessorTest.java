package com.cdk.gist.lambda;

public class ProcessorTest {

	
	public static void main(String[] args) {
		Processor processor = new Processor() {

			@Override
			public void process() {
				this.defaultProcess();
				System.out.println("This is from the anonymous class");

			}
		};
		//processor.defaultProcess();
		processor.process();
		//Processor.staticProcess();
		
		Processor processor1=
				()->{System.out.println("Hello kapil ");
				System.out.println("Mandrail");
				} ;
		
		processor1.process();
	}
}
