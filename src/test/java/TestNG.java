import org.testng.annotations.*;

public class TestNG {

    @BeforeGroups("shopping")
    public void BeforeGroups(){
        System.out.println("@BeforeGroups");
    }

    @AfterGroups("shopping")
    public void AfterGroups(){
        System.out.println("@AfterGroups");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("@AfterClass");
    }

    @BeforeSuite
    public void beforeSuite(){

    }

    @AfterSuite
    public void afterSuite(){

    }

    @BeforeTest
            public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@afterTest");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@afterMethod");
    }

    @Test(priority = 3)
    public void runTest1(){
        System.out.println("Test1 - groups shopping");
    }

    @Test(priority = 1)
    public void runTest2(){
        System.out.println("Test2 - no groups");
    }

    @Test(priority = 4)
    public void runTest3(){
        System.out.println("Test2 - groups");
    }


}
