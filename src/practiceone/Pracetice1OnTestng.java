package practiceone;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pracetice1OnTestng {
	@BeforeTest
	public void beforeTest(){
		System.out.println("beforetest");
	}
	
	@BeforeClass//比如像登录操作
	public void beforeClass(){
		System.out.println("beforeclass");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforemethod");
	}
	
	@Test
	public void test1(){
		System.out.println("test1");
	}
	
	@Test
	public void test2(){
		System.out.println("test2");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("aftermethod");
	}
	
	@AfterClass//登出操作1
	public void afterClass(){
		System.out.println("afterclass");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("aftertest");
	}
	
	
}
