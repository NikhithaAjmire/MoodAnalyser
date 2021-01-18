package com.assignment.moodAnalyser;
import static org.junit.Assert.assertTrue;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTestCases {
	

	
	
	    MoodAnalyser moodAnalyser=new MoodAnalyser();
	    
	    @Test
	    public void shouldReturnSADMood() throws Exception {
	        String mood = moodAnalyser.analyseMood("Its a sad message.");
	        Assert.assertThat(mood, CoreMatchers.is("SAD"));
	        Assert.assertEquals("SAD",mood);
	    }
	    @Test
	    public void shouldReturnHAPPYMood() throws Exception {
	        String mood = moodAnalyser.analyseMood("Its a Happy message.");
	        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	        Assert.assertEquals("HAPPY",mood);
	    }
	}

