package testLayer;

import pageLayer.AddnewMember;
import pageLayer.HomePage;
import pageLayer.LoginPage;

public class HomeTestLayer {

	public static void main(String[] args) {
		
		LoginPage loginPage=new LoginPage();
		loginPage.loginFunctionality("ashok", "ashok123");
		
		
		HomePage homePage=new HomePage();
		homePage.valiadtehomePage();
		
		AddnewMember newmember= new AddnewMember();
		newmember.newMembaer();
		
		System.out.println("source code featched succesfully by pull from shabana ");
	}

}
