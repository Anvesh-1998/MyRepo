package com.lti.model;

import com.lti.model.Question.Difficulty;

public class QuestionBankLoader {

	public void LoadQuestionsOnJava() {
		String subjectName = "Java";
		QuestionBank qb = new QuestionBank();
		qb.addNewSubject(subjectName);
		
		Question q = new Question("What is Java?", Difficulty.EASY);
		List<Option> ops = new ArrayList<Option>();
		ops.add(new Option("Java is a database",false));
		ops.add(new Option("Java is a operating system",false));
		ops.add(new Option("Java is a programming language ",true));
		ops.add(new Option("Java is a Antivirus",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName,q);
		
		//question 2
		
		q = new Question("What is Shahrukh khan's house name?", Difficulty.HARD);
		ops = new ArrayList<Option>();
		ops.add(new Option("Mannat",true));
		ops.add(new Option("Jalsa",false));
		ops.add(new Option("Antillia",false));
		ops.add(new Option("Galaxy Apartments",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName,q);
		
		//question 3
		q = new Question("What is Python?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Programming Language",true));
		ops.add(new Option("A snake",false));
		ops.add(new Option("A database",false));
		ops.add(new Option("A compiler",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName,q);
		
		//question 4
		q = new Question("What is Database?", Difficulty.HARD);
		ops = new ArrayList<Option>();
		ops.add(new Option("Collection of objects",false));
		ops.add(new Option("Collection of data",true));
		ops.add(new Option("A book",false));
		ops.add(new Option("A website",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName,q);
		
		//question 5
		q = new Question("What is the size of int data type?", Difficulty.HARD);
		ops = new ArrayList<Option>();
		ops.add(new Option("4 bytes",true));
		ops.add(new Option("1 byes",false));
		ops.add(new Option("2 bytes",false));
		ops.add(new Option("8 bytes",false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName,q);
		
		
		return qb.getQuestionsFor(subjectName);
	}
	
}
