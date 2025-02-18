package com.siemens.crmapp;

import java.time.ZoneId;
import java.util.Iterator;
import java.util.Set;

public class ZoneIdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> zoneIds= ZoneId.getAvailableZoneIds();
	  Iterator<String> itr=	zoneIds.iterator();
	  while(itr.hasNext())
		  System.out.println(itr.next());
	  
		
	}

}
