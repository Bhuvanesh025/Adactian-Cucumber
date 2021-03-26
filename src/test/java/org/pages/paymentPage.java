package org.pages;

import org.data.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentPage extends BaseClass {
	
	public paymentPage() {
		PageFactory.initElements(driver, this);
	} 
	
	
	@FindBy(id="first_name")
	private WebElement dnFirstname;
	
	@FindBy(id="last_name")
	private WebElement dnlastname;
	
	@FindBy(id="address")
	private WebElement dnaddress;
	
	@FindBy(id="cc_num")
	private WebElement dncreditno;
	
	@FindBy(id="cc_type")
	private WebElement dncardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement dncvvno;
	
	@FindBy(id="book_now")
	private WebElement dnbookbtn;
	
	@FindBy(id="order_no")
	private WebElement dnorderno;
	
	@FindBy(id="checkin_span")
	private WebElement dnerrorindate;
	
	@FindBy(id="datepick_out")
	private WebElement dnerroroutdate;
	
	@FindBy(id="first_name_span")
	private WebElement dnfirstnameerror;
	
	@FindBy(id="last_name_span")
	private WebElement dnlastnameerror;
	
	@FindBy(id="address_span")
	private WebElement dnaddresserror;
	
	@FindBy(id="cc_num_span")
	private WebElement dncredircardnoerror;
	
	@FindBy(id="cc_type_span")
	private WebElement dncreditcardtypeerror;
	
	@FindBy(id="cc_expiry_span")
	private WebElement dnmontherror;
	
	@FindBy(id="cc_cvv_span")
	private WebElement dncvvnoerror;
	
	@FindBy(id="my_itinerary")
	private WebElement myitenarybutton;
	
	@FindBy(id="order_id_text")
	private WebElement orderidtext;
	
	@FindBy (xpath="//input[@id='btn_id_356626']")
	private WebElement desiredOrderid;
	
	@FindBy (xpath="(//input[@type='submit'])[2]")
	private WebElement cancelselectedbtn;
	
	
	
	public WebElement getCancelselectedbtn() {
		return cancelselectedbtn;
	}

	public WebElement getDesiredOrderid() {
		return desiredOrderid;
	}

	public WebElement getOrderidtext() {
		return orderidtext;
	}

	public WebElement getMyitenarybutton() {
		return myitenarybutton;
	}

	public WebElement getDnfirstnameerror() {
		return dnfirstnameerror;
	}

	public WebElement getDnlastnameerror() {
		return dnlastnameerror;
	}

	public WebElement getDnaddresserror() {
		return dnaddresserror;
	}

	public WebElement getDncredircardnoerror() {
		return dncredircardnoerror;
	}

	public WebElement getDncreditcardtypeerror() {
		return dncreditcardtypeerror;
	}

	public WebElement getDnmontherror() {
		return dnmontherror;
	}

	public WebElement getDncvvnoerror() {
		return dncvvnoerror;
	}

	public WebElement getDnerrorindate() {
		return dnerrorindate;
	}

	public WebElement getDnerroroutdate() {
		return dnerroroutdate;
	}

	public WebElement getDnFirstname() {
		return dnFirstname;
	}

	public WebElement getDnorderno() {
		return dnorderno;
	}

	public WebElement getDnlastname() {
		return dnlastname;
	}

	public WebElement getDnaddress() {
		return dnaddress;
	}

	public WebElement getDncreditno() {
		return dncreditno;
	}

	public WebElement getDncardtype() {
		return dncardtype;
	}


	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getDncvvno() {
		return dncvvno;
	}

	public WebElement getDnbookbtn() {
		return dnbookbtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
