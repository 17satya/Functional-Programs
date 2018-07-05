package com.jda.core;
import com.jda.utility.*;

public class ReplaceTemplate {
	public static void main(String args[])
	{
		FunctionalUtility utility = new FunctionalUtility();
		String inputString = utility.getString();
		String sentence = "Hello <<Username>>, How are you?";
		sentence = sentence.replaceFirst("\\<<(.*?)\\>>", inputString);
		System.out.println(sentence);
	}
}
