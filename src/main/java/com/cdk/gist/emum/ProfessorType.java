package com.cdk.gist.emum;

public enum ProfessorType {
	ASSISTANT_PROFESSOR(10001),ASSOCIATE_PROFESSOR(10002),PROFESSOR(10003),PRINCIPAL(10004);
	private int ranking;

	private ProfessorType(int ranking){
		this.ranking=ranking;
	}
	
	public static void getProfessor(int count){
		ProfessorType[] processorType=ProfessorType.values();
		for(ProfessorType processorTyp:processorType){
			//System.out.println(processorTyp.);
		System.out.println(processorTyp.name());	
		}
		//System.out.println(ProfessorType.valueOf("abc"));
	}
	
	public static void main(String[] args) {
		ProfessorType.getProfessor(100);
	}
}
