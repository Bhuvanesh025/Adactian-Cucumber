package org.pages;

import org.data.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	
	public SearchHotel() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dnLocation;
	
	@FindBy(id="hotels")
	private WebElement dnHotels;
	
	@FindBy(id="room_type")
	private WebElement dnRoomtype;
	
	@FindBy(id="room_nos")
	private WebElement dnRoomnos;
	
	@FindBy(id="datepick_in")
	private WebElement dndatein;
	
	@FindBy(id="datepick_out")
	private WebElement dndateout;
	
	@FindBy(id="adult_room")
	private WebElement dnadultroom;
	
	@FindBy(id="child_room")
	private WebElement dnchildroom;
	
	@FindBy(id="Submit")
	private WebElement dnSearch;

	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement dnbutton;
	
	@FindBy(id="continue")
	private WebElement dncontbutton;
	
	@FindBy(id="location_span")
	private WebElement dnlocerror;
		
	
	
	public WebElement getDnlocerror() {
		return dnlocerror;
	}

	public WebElement getDncontbutton() {
		return dncontbutton;
	}

	public WebElement getDnLocation() {
		return dnLocation;
	}

	public WebElement getDnHotels() {
		return dnHotels;
	}

	public WebElement getDnRoomtype() {
		return dnRoomtype;
	}

	public WebElement getDnRoomnos() {
		return dnRoomnos;
	}

	public WebElement getDnbutton() {
		return dnbutton;
	}

	public WebElement getDndatein() {
		return dndatein;
	}

	public WebElement getDndateout() {
		return dndateout;
	}

	public WebElement getDnadultroom() {
		return dnadultroom;
	}

	public WebElement getDnchildroom() {
		return dnchildroom;
	}

	public WebElement getDnSearch() {
		return dnSearch;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
