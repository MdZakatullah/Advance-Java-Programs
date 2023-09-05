package com.jsp.exception;

public class Gmail {

	public static void main(String[] args) 
	{
		String name="Ram@123";
		int pwd=12364;
		if(name.equals("Ram@123")) {
			if(pwd==1234) {
				System.out.println("Log in done");
			}else {
				try {
					throw new PasswordInvalidException();
			}catch(PasswordInvalidException e) {
				e.printStackTrace();
				System.out.println("Invalid pwd");
			}
		}

	}else {
		System.out.println("Enter valid user name");
	}

}
}
