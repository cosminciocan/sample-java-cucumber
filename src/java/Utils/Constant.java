package Utils;

import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Constant{

    //BASE URL
    public static final String BaseURL = "http://sfvm22/VMS";
    public static final String StaffURL = "http://sfvm22/VMSStaff";
//    PATHS
    public static final String logOutPath = "/Account/LogOff";


    //CREDENTIALS
    public static final String volunteerUser = "ACVC@actests.rou";
    public static final String volunteerPassword = "11111111";

    //VALUES
    public static final String highReservationGroupSize = "200"; // This should be a number above 100
    public static final int defaultTimeOut = 5;


    //time now value
//    public static java.util.Date date = new Date();
    public static Date myDate = DateUtils.addDays((new Date()), 1);
    // The date format should be changed after september to: MM/dd/yyyy
    public static SimpleDateFormat simpleDate = new SimpleDateFormat("M/dd/yyyy");

    /*
    Define locator elements using lower CamelCase
    Example:
     - nameOfLocator;
     */
    // LOCATORS

//    Header
    @FindBy(css = ".welcomeText .userName.hideMobile")
    public WebElement expandNameMenu;

//      Edit Capacity Shift Page
    @FindBy(id = "btnAddShift")
    public WebElement addShiftButton;


//    Make a reservation page
    @FindBy(id = "btnMakeReservation")
    public WebElement makeReservationButton;


//    Manage reservation page
    @FindBy(id = "searchReservations")
    public WebElement manageMakeReservation;



//    Manage Wait List Page
    @FindBy(id = "waitListTable")
    public WebElement waitListTable;


//    Contact Us Page
    @FindBy(id = "locationDdl")
    public WebElement selectProcessingCenter;




}