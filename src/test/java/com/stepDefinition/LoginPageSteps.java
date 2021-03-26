package com.stepDefinition;

import java.util.List;
import java.util.Map;

import org.data.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pages.LoginPage;
import org.pages.SearchHotel;
import org.pages.paymentPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps extends BaseClass {
	LoginPage loginpage;
	paymentPage paymentPage;
	SearchHotel SearchHotel;
	

	@Given("user should move to Adactinhotelapp page")
	public void user_should_move_to_Adactinhotelapp_page() {
		
		
	    launchUrl("http://adactinhotelapp.com/index.php");
	}

	@When("user should enter {string} and {string}")
	public void user_should_enter_and(String string, String string2) {
		 loginpage= new LoginPage();
		fill(loginpage.getTxtUsername(), string);
		fill(loginpage.getTxtPassword(), string2);
		
	 
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		loginpage= new LoginPage();
		btnClick(loginpage.getLoginBtn());
	    
	}

	@When("user should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   SearchHotel = new SearchHotel();
		selectText(SearchHotel.getDnLocation(),string );
	  selectText(SearchHotel.getDnHotels(),string2 );
	  selectText(SearchHotel.getDnRoomtype(),string3 );
	  selectText(SearchHotel.getDnRoomnos(),string4 );
	   fill(SearchHotel.getDndatein(), string5);
	   fill(SearchHotel.getDndateout(),string6 );
	   selectText(SearchHotel.getDnadultroom(), string7);
	   selectText(SearchHotel.getDnchildroom(), string8);
		
	}

	@When("user should enter search button")
	public void user_should_enter_search_button() {
		SearchHotel = new SearchHotel();
		btnClick(SearchHotel.getDnSearch());
	  
	}

	@When("user should verify the page navigates to SearchHotel page")
	public void user_should_verify_the_page_navigates_to_SearchHotel_page() {
		launchCurrentUrl("http://adactinhotelapp.com/SelectHotel.php");
	   
	}

	@When("user should enter select the hotel and click the continue button")
	public void user_should_enter_select_the_hotel_and_click_the_continue_button() {
		SearchHotel = new SearchHotel();
		btnClick(SearchHotel.getDnbutton());
		btnClick(SearchHotel.getDncontbutton());
	    
	}

	@When("user should enter the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   paymentPage = new paymentPage();
		fill(paymentPage.getDnFirstname(), string);
	   fill(paymentPage.getDnlastname(), string2);
		fill(paymentPage.getDnaddress(),string3 );
		fill(paymentPage.getDncreditno(),string4 );
	selectText(paymentPage.getDncardtype(), string5);
		selectText(paymentPage.getMonth(), string6);
		selectText(paymentPage.getYear(),string7);
		fill(paymentPage.getDncvvno(), string8);
		
		
	}

	@When("user should click the Book now button")
	public void user_should_click_the_Book_now_button() {
		paymentPage = new paymentPage();
		btnClick(paymentPage.getDnbookbtn());
	 
	}

	@Then("user should Print the order confirmation number")
	public String user_should_Print_the_order_confirmation_number() {
		paymentPage = new paymentPage();
		waitMethod();
		String s1 = textMethod(paymentPage.getDnorderno());
		System.out.println(s1);
		return s1;
	}

	@Given("user is should move to Adactinhotelapp page")
	public void user_is_should_move_to_Adactinhotelapp_page() {
		
		  launchUrl("http://adactinhotelapp.com/index.php");
	    
	}

	@When("user should enter {string},{string},{string},{string},{string}")
	public void user_should_enter(String string, String string2, String string3, String string4, String string5) {
		SearchHotel = new SearchHotel();
		selectText(SearchHotel.getDnLocation(),string );
		  selectText(SearchHotel.getDnRoomnos(),string2 );
		  SearchHotel.getDndatein().clear();
		   fill(SearchHotel.getDndatein(), string3);
		   SearchHotel.getDndateout().clear();
		   fill(SearchHotel.getDndateout(),string4 );
		   selectText(SearchHotel.getDnadultroom(), string5);	
	}

	@Then("user should verify the error message")
	public void user_should_verify_the_error_message() {
		paymentPage = new paymentPage();
		errorInDate(paymentPage.getDnerrorindate());
		errorInDate(paymentPage.getDnerroroutdate());
	   
	}

	@Then("user should enter error message")
	public void user_should_enter_error_message() {
		SearchHotel = new SearchHotel();
		locerror(SearchHotel.getDnlocerror());
	   
	}
	
	@Then("user should verify the error message in Book a Hotel page")
	public void user_should_verify_the_error_message_in_Book_a_Hotel_page() {
		paymentPage = new paymentPage();
		firstNameError(paymentPage.getDnfirstnameerror());
		LastNameError(paymentPage.getDnlastnameerror());
		addressError(paymentPage.getDnaddresserror());
		cardnoError(paymentPage.getDncredircardnoerror());
		cardTypeError(paymentPage.getDncreditcardtypeerror());
		cardMonthError(paymentPage.getDnmontherror());
		cvvNumberError(paymentPage.getDncvvnoerror());
		
		
		
	}
	
	@When("user should click My Itineary button")
	public void user_should_click_My_Itineary_button() {
		paymentPage = new paymentPage();
		btnClick(paymentPage.getMyitenarybutton());
	
		
	}

	@When("user should search confirmation number and click go")
	public void user_should_search_confirmation_number_and_click_go() {
	    paymentPage = new paymentPage();
	    btnClick(paymentPage.getMyitenarybutton());
	    
	    
	}

	@Then("user should cancel the selected order id and should accept the alert")
	public void user_should_cancel_the_selected_order_id_and_should_accept_the_alert() {
		Alert a = driver.switchTo().alert();
	    a.accept();
		
		
	}
	


		
	@When("user should select the desired order id to delete and click cancel selected button")
	public void user_should_select_the_desired_order_id_to_delete_and_click_cancel_selected_button() {
		btnClick(paymentPage.getDesiredOrderid());
	
	    
	}

	@Then("user should accept the alert")
	public void user_should_accept_the_alert() {
		Alert a = driver.switchTo().alert();
	    a.accept();
	   
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


