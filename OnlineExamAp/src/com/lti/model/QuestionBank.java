package com.lti.model;

import java.util.ArrayList;

public class QuestionBank {

	private Map<String, List<Question>> questionbank = new HashMap<>();
	
	public void addNewSubject(String subjectName) {
		questionbank.put(subjectName,new ArrayList<>());
		
	}
	public void addNewQuestion(String subjectName,Question question) {
		List<Question> questions = questionbank.get(subjectName);
		questions.add(question);
		
	}
	
	public List<Question> getQuestionsFor(String subjectName){
		return questionbank.get(subjectName);
	}
}
