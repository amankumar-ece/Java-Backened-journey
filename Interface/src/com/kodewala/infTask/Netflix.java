package com.kodewala.infTask;


public class Netflix implements Channels {

	@Override
	public void signUp() {
		System.out.println("Netflix.signUp()");
		
	}

	@Override
	public void login() {
		System.out.println("Netflix.login()");
		
	}

	@Override
	public void subscribe() {
		System.out.println("Netflix.subscribe()");
		
	}

	@Override
	public void premiumSubscription() {
		System.out.println("Netflix.premiumSubscription()");
	}

	@Override
	public void NoAds() {
	System.out.println("Netflix.NoAds()");
		
	}

	
}
