package com.kodewala.inf;

public interface IBanking // 100% abstract  100% contract based
{
	public abstract void pay();
	
	public abstract void settle();
	
	void addPayee(); // public abstract void addPayee();
	
	void modifyPayee(); // By Default all the methods in Interface are public and abstract. 

	void doKYC();
}
