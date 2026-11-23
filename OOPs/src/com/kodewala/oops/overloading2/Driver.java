package com.kodewala.oops.overloading2;


class LoginService 
{
	public void doLoginWithMobile(String mobile , int otp) //Same method Name +  order of args OR Type of Args OR Number of  args
	{
		System.out.println("LoginService.doLogin()");
	}
	
	public void doLogin(String aadhar , int otp, String pan)
	{
		System.out.println("LoginService.doLogin()");
	}
}
public class Driver {
	public static void main(String[] args) 
	{
		LoginService loginService = new LoginService();
		loginService.doLoginWithMobile("125455", 12350);
	}

}
