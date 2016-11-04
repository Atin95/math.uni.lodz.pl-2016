package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

public class AnswerEntityTest{

	@Test
	public void ShouldReturnTrueWhenComparedToItself()
	{
		AnswerEntity an = new AnswerEntity();
		assertTrue(an.equals(an));
	}
	
    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
        assertFalse(an1.equals(an2));
    }
    	
	@Test
	public void ShouldReturnFalseWhenClassIsDifferent()
	{
		AnswerEntity an = new AnswerEntity();
		String s = "test";
		assertFalse(an.equals(s));
	}
	
	@Test
	public void ShouldReturnFalseWhenOneAnswerTextIsNull()
	{
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = new AnswerEntity();
		an1.setAnswerText(null);
		an2.setAnswerText("test");
		assertFalse(an1.equals(an2));
	}

	@Test
	public void ShouldReturnFalseWhenAnswersTextsAreNotEqual()
	{
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = new AnswerEntity();
		an1.setAnswerText("test1");
		an2.setAnswerText("test2");
		assertFalse(an1.equals(an2));
	}
	
	@Test
	public void ShouldReturnFalseWhenOneIdIsNull()
	{
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = new AnswerEntity();
		an1.setId(null);
		an2.setId((long)1);
		assertFalse(an1.equals(an2));
	}
	
	@Test
	public void ShouldReturnFalseWhenIdsAreNotEqual()
	{
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = new AnswerEntity();
		an1.setId((long)1);
		an2.setId((long)2);
		assertFalse(an1.equals(an2));
	}
	
	@Test
	public void ShouldReturnFalseWhenOneQuestionIsNull()
	{
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = new AnswerEntity();
		QuestionEntity qn = new QuestionEntity();
		an1.setQuestion(null);
		an2.setQuestion(qn);
		assertFalse(an1.equals(an2));
	}
	
	@Test
	public void ShouldReturnFalseWhenQuestionsAreNotEqual()
	{
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = new AnswerEntity();
		QuestionEntity qn1 = new QuestionEntity();
		QuestionEntity qn2 = new QuestionEntity();
		an1.setQuestion(qn1);
		an2.setQuestion(qn2);
		assertFalse(an1.equals(an2));
	}
	
	@Test
	public void ShouldReturnTrueWhenObjectsEqual()
	{
		AnswerEntity an1 = new AnswerEntity();
		AnswerEntity an2 = new AnswerEntity();
		an1.setAnswerText("test");
		an2.setAnswerText("test");
		an1.setId((long)1);
		an2.setId((long)1);
		QuestionEntity qn = new QuestionEntity();
		an1.setQuestion(qn);
		an2.setQuestion(qn);
		assertTrue(an1.equals(an2));
	}
	
}