package testt;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void google() {
	  System.out.println("hi");
  }
  
  @BeforeTest
	public void yahoo(){
	  System.out.println("hello");
  }
		
	  
	 @AfterTest
	 public void bing (){
		 System.out.println("pgl");
	 }
	 @AfterTest
	 public void bing2 (){
		 System.out.println("pgl2");
  }
}
