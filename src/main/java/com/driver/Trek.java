package com.driver;

import java.util.List;

public class Trek {
	  private String name;
	    private int duration;
	    private int altitudeGain;
	    private List<Object> knownChallenges;

	    public Trek(String name, int duration, int altitudeGain, List<Object> knownChallenges2) {
	    	// your code goes here
			this.name=name;
			this.duration=duration;
			this.altitudeGain=altitudeGain;
			this.knownChallenges=knownChallenges2;
	    }

	    public String getName() {
	    	// your code goes here
	        return name;
	    }

	    public int getDuration() {
	    	// your code goes here
	        return duration;
	    }

	    public int getAltitudeGain() {
	    	// your code goes here
	        return altitudeGain;
	    }

	    public List<Object> getKnownChallenges() {
	    	// your code goes here
	        return knownChallenges;
	    }
}
