package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
       @FindBy(partialLinkText = "Log in")
       private WebElement LoginLink;
       
       @FindBy(id ="Books")
       private WebElement Books;
       
       @FindBy(id = "Computers")
       private WebElement Computers;
       

	public HomePage(WebDriver driver) {
		 PageFactory.initElements(driver,this);
	}

	

	public WebElement getLogoutLink() {
		
		return LoginLink;
	}



	public WebElement getLoginLink() {
		return LoginLink;
	}



	public void setLoginLink(WebElement loginLink) {
		LoginLink = loginLink;
	}



	public WebElement getBooks() {
		return Books;
	}



	public void setBooks(WebElement books) {
		Books = books;
	}



	public WebElement getComputers() {
		return Computers;
	}



	public void setComputers(WebElement computers) {
		Computers = computers;
	}
}
