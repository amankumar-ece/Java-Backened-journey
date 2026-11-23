package com.kodewala;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver1 {
	public static void main(String[] args) {
		
		ArrayList<SBIUser>defaultList = new ArrayList<SBIUser>();
		
		SBIUser u1 = new SBIUser("Aman","BTM Bangliore","SBIA001" ,1223);
		SBIUser u2 = new SBIUser("aman","BTM Bangliore","SBIA002" ,5456);
		SBIUser u3 = new SBIUser("sonu","BTM Bangliore","SBIA003" ,118);
		SBIUser u4 = new SBIUser("minu","BTM Bangliore","SBIA004" ,1521);
		SBIUser u5 = new SBIUser("Abhi","BTM Bangliore","SBIA005" ,6124);
		SBIUser u6 = new SBIUser("rahul","BTM Bangliore","SBIA006" ,128);
		SBIUser u7 = new SBIUser("Archit","BTM Bangliore","SBIA007" ,130);
		
		defaultList.add(u1);
		defaultList.add(u2);
		defaultList.add(u3);
		defaultList.add(u4);
		defaultList.add(u5);
		defaultList.add(u6);
		defaultList.add(u7);
		
	//******************************	
		for (int i = 0; i < defaultList.size(); i++) {
			
			SBIUser user = defaultList.get(i);
			if(user.getBalance() <1000)
			{
				System.out.println("Sending email to user " + user.getName() + " as his/her balance is not maintained");
			}
		}
	}

}
