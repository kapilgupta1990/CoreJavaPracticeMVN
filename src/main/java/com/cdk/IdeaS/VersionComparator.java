package com.cdk.IdeaS;

import java.util.Comparator;

public class VersionComparator implements Comparator<InputModel> {

	@Override
	public int compare(InputModel o11, InputModel o22) {
		String o1=o11.getVersionNo();
		String o2=o22.getVersionNo();
		
		if(o1.equals(o2))
			return 0;
        String[] thisParts = o1.split("\\.");
        String[] thatParts = o2.split("\\.");
        int length = Math.max(thisParts.length, thatParts.length);
        for(int i = 0; i < length; i++) {
        	int thiPart=Integer.parseInt(thisParts[i]);
        	int thaPart=Integer.parseInt(thatParts[i]);
            int thisPart = i < thisParts.length ? thiPart: 0;
            int thatPart = i < thatParts.length ?thaPart : 0;
            
            if(thisPart < thatPart)
                return -1;
            if(thisPart > thatPart)
                return 1;
        }
        return 0;
		
	}

}
