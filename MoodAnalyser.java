package com.assignment.moodAnalyser;

public class MoodAnalyser {
	public String analyseMood(String message) {
        if (message.contains("sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
	}
}