package org.egov.migrationkit.constants;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class WSConstants {
	
	public static final String URL_PARAMS_SEPARATER = "?";

	public static final String TENANT_ID_FIELD_FOR_SEARCH_URL = "tenantId=";

	public static final String SEPARATER = "&";

	public static final String SERVICE_FIELD_FOR_SEARCH_URL = "service=";

	public static final String CONSUMER_CODE_SEARCH_FIELD_NAME = "consumerCode=";
	
	public static final String BUSINESSSERVICE_FIELD_FOR_SEARCH_URL = "businessService=";
	
	public static final String SEARCHTYPE_URL = "searchType=CONNECTION";
	
	public static final String CONNECTION_NUMBER_URL = "connectionNumber=";
	
	public static final String UUIDS_URL = "uuids=";

	public static final String WATER_TAX_SERVICE_CODE = "WS";
	
    public static final String WATER_BUSINESS_SERVICE="WS";
    
    public static final String SEWERAGE_BUSINESS_SERVICE="SW";
    
    public static final List<String> ONE_TIME_TAX_HEAD_MASTERS = Collections.unmodifiableList(
    		Arrays.asList("WS_OTHER_FEE", "WS_ROAD_CUTTING_CHARGE", "WS_FORM_FEE", "WS_SECURITY_DEPOSIT","WS_SUPERVISION_CHARGE","WS_APPLICATION_CHARGE",
    				"SW_APPLICATION_CHARGE","SW_SUPERVISION_CHARGE", "SW_OTHER_FEE", "SW_ROAD_CUTTING_CHARGE", "SW_FORM_FEE", "SW_SECURITY_DEPOSIT"));
    
    public static final String ONE_TIME_FEE_CONST = ".ONE_TIME_FEE";
	
	public static final HashMap<String, String> DIGIT_ROAD_CATEGORIES = new HashMap<>();
	public static final HashMap<String, Long> TIME_PERIOD_MAP = new HashMap<>();
	public static final HashMap<String, String> WS_TAX_HEAD_MAP = new HashMap<>();
	public static final HashMap<String, String> SW_TAX_HEAD_MAP = new HashMap<>();

	
	public static final HashMap<String, String> DOCTYPEMAP = new HashMap<>();
	
    public static final String EG_BS_BILL_NO_DEMANDS_FOUND_KEY = "EG_BS_BILL_NO_DEMANDS_FOUND";
    public static final String EG_BS_BILL_NO_DEMANDS_FOUND_MSG = "No Demands Found for the given bill generate criteria";
    
    public static final String PERIOD_FROM_FIELD_NAME = "periodFrom=";
    
    public static final String PERIOD_TO_FIELD_NAME = "periodTo=";
    
    public static final String BILL_NUMBER_FIELD_NAME = "billNumber=";

    static {
    	
        DIGIT_ROAD_CATEGORIES.put("Premix Carpet", "PREMIXCARPET");
        DIGIT_ROAD_CATEGORIES.put("BM and Premix Road", "BMPREMIXROAD");
        DIGIT_ROAD_CATEGORIES.put("Berm Cutting (Katcha)", "BERMCUTTINGKATCHA");
        DIGIT_ROAD_CATEGORIES.put("Brick Paving", "BRICKPAVING");
        DIGIT_ROAD_CATEGORIES.put("CC Road", "CCROAD");
        DIGIT_ROAD_CATEGORIES.put("Interlocking Paver Block", "INTERLOCKINGPAVERBLOCK");
        DIGIT_ROAD_CATEGORIES.put("Under Scheme", "UNDERSCHEME");
        DIGIT_ROAD_CATEGORIES.put("Open Pipe", "OPENPIPE");
        

	     WS_TAX_HEAD_MAP.put("METERCHARGES", "WS_METER_TESTING_FEE");
	     WS_TAX_HEAD_MAP.put("PENALTY", "WS_TIME_PENALTY");
	     WS_TAX_HEAD_MAP.put("BREAKDOWN_PENALTY", "WS_BREAKDOWN_PENALTY");
	     WS_TAX_HEAD_MAP.put("INTEREST", "WS_TIME_INTEREST");
	     WS_TAX_HEAD_MAP.put("WTAXCHARGES", "WS_CHARGE");
	     WS_TAX_HEAD_MAP.put("METERRENT", "WS_METER_RENT");
	     WS_TAX_HEAD_MAP.put("WTADJUSTMENT", "WS_TAX_ADJUSTMENT");
	     WS_TAX_HEAD_MAP.put("DOORTODOORCOLLECTIONCHARGES", "WS_DOOR_TO_DOOR_COLLECTION_CHARGES");
	     WS_TAX_HEAD_MAP.put("TITLETRANSFERFEE", "WS_TITLE_TRANSFER_FEE");
	     WS_TAX_HEAD_MAP.put("ADDITIONALFEEFORTITLETRANSFER", "WS_ADDITIONAL_TITLE_TRANSFER_FEE");
	     WS_TAX_HEAD_MAP.put("WTAXSUPERVISION", "WS_SUPERVISION_CHARGE");
	     WS_TAX_HEAD_MAP.put("WTADVANCE", "WS_ADVANCE_CARRYFORWARD");
	     WS_TAX_HEAD_MAP.put("WTAXSECURITY", "WS_SECURITY_DEPOSIT");
	     WS_TAX_HEAD_MAP.put("WTAXOTHERS", "WS_OTHER_FEE");
	     WS_TAX_HEAD_MAP.put("WTAXROADCUTTING", "WS_ROAD_CUTTING_CHARGE");
	     WS_TAX_HEAD_MAP.put("WTAXAPPLICATION", "WS_FORM_FEE");
	     WS_TAX_HEAD_MAP.put("CONNECTIONTYPECONVERSIONFEE", "WS_CONNECTION_TYPE_CONVERSION_FEE");
	    
	     SW_TAX_HEAD_MAP.put("SEWERAGEADVANCE","SW_ADVANCE_CARRYFORWARD");
	     SW_TAX_HEAD_MAP.put("STAXSECURITY","SW_SECURITY_DEPOSIT");
	     SW_TAX_HEAD_MAP.put("STAXOTHERS","SW_OTHER_FEE");
	     SW_TAX_HEAD_MAP.put("STAXROADCUTTING","SW_ROAD_CUTTING_CHARGE");
	     SW_TAX_HEAD_MAP.put("STAXAPPLICATION","SW_FORM_FEE");
	     SW_TAX_HEAD_MAP.put("STAXSUPERVISION","SW_SUPERVISION_CHARGE");
	     SW_TAX_HEAD_MAP.put("SEWERAGETAX","SW_CHARGE");
	     SW_TAX_HEAD_MAP.put("SWTAXADJUSTMENT","SW_TAX_ADJUSTMENT");
	     SW_TAX_HEAD_MAP.put("PENALTY","SW_TIME_PENALTY");
	     SW_TAX_HEAD_MAP.put("TITLETRANSFERFEE", "SW_TITLE_TRANSFER_FEE");
	     SW_TAX_HEAD_MAP.put("INTEREST", "SW_TIME_INTEREST");
	     SW_TAX_HEAD_MAP.put("ADDITIONALFEEFORTITLETRANSFER", "SW_ADDITIONAL_TITLE_TRANSFER_FEE");
	     SW_TAX_HEAD_MAP.put("DOORTODOORCOLLECTIONCHARGES", "SW_DOOR_TO_DOOR_COLLECTION_CHARGES");
	     SW_TAX_HEAD_MAP.put("DONATIONCHARGE", "SW_DONATION_CHARGE");
	     SW_TAX_HEAD_MAP.put("INSPECTIONCHARGE", "SW_INSPECTION_CHARGE");
	     SW_TAX_HEAD_MAP.put("ESTIMATIONCHARGE", "SW_ESTIMATION_CHARGE");
	     
        
        //2022-23 
//        TIME_PERIOD_MAP.put("2022-03-31", 1648751399000l);     
//        TIME_PERIOD_MAP.put("2022-04-01", 1648751400000l);
//        TIME_PERIOD_MAP.put("2022-06-30", 1656613799000l);
//        TIME_PERIOD_MAP.put("2022-07-01", 1656613800000l);
//        TIME_PERIOD_MAP.put("2022-09-30", 1664562599000l);
//        TIME_PERIOD_MAP.put("2022-10-01", 1664562600000l);
//        TIME_PERIOD_MAP.put("2022-12-31", 1672511399000l);
//        TIME_PERIOD_MAP.put("2022-01-01", 1640975400000l);
//        
//        TIME_PERIOD_MAP.put("2023-01-01",1672511400000l);
//        TIME_PERIOD_MAP.put("2023-03-31",1680287399000l);
//       
        
        //2021
        TIME_PERIOD_MAP.put("2021-04-01", 1617215400000l);
        TIME_PERIOD_MAP.put("2021-06-30", 1625077799000l);
        TIME_PERIOD_MAP.put("2021-07-01", 1625077800000l);
        TIME_PERIOD_MAP.put("2021-09-30", 1633026599000l);
        TIME_PERIOD_MAP.put("2021-10-01", 1633026600000l);
        TIME_PERIOD_MAP.put("2021-12-31", 1640975399000l);
        TIME_PERIOD_MAP.put("2021-01-01", 1609439400000l);
        TIME_PERIOD_MAP.put("2021-03-31", 1617215399000l);

        //2020
        TIME_PERIOD_MAP.put("2020-04-01", 1585679400000l);
        TIME_PERIOD_MAP.put("2020-06-30", 1593541799000l);
        TIME_PERIOD_MAP.put("2020-07-01", 1593541800000l);
        TIME_PERIOD_MAP.put("2020-09-30", 1601490599000l);
        TIME_PERIOD_MAP.put("2020-10-01", 1601490600000l);
        TIME_PERIOD_MAP.put("2020-12-31", 1609439399000l);
        TIME_PERIOD_MAP.put("2020-01-01", 1577817000000l);
        TIME_PERIOD_MAP.put("2020-03-31", 1585679399000l);    
        
        //2019
        TIME_PERIOD_MAP.put("2019-04-01", 1554057000000l);
        TIME_PERIOD_MAP.put("2019-06-30", 1561919399000l);
        TIME_PERIOD_MAP.put("2019-07-01", 1561919400000l);
        TIME_PERIOD_MAP.put("2019-09-30", 1569868199000l);
        TIME_PERIOD_MAP.put("2019-10-01", 1569868200000l);
        TIME_PERIOD_MAP.put("2019-12-31", 1577816999000l);
        TIME_PERIOD_MAP.put("2019-01-01", 1546281000000l);
        TIME_PERIOD_MAP.put("2019-03-31", 1554056999000l);
      
        //2018
        TIME_PERIOD_MAP.put("2018-04-01", 1522521000000l);
        TIME_PERIOD_MAP.put("2018-06-30", 1530383399000l);
        TIME_PERIOD_MAP.put("2018-07-01", 1530383400000l);
        TIME_PERIOD_MAP.put("2018-09-30", 1538332199000l);
        TIME_PERIOD_MAP.put("2018-10-01", 1538332200000l);
        TIME_PERIOD_MAP.put("2018-12-31", 1546280999000l);
        TIME_PERIOD_MAP.put("2018-01-01", 1514745000000l);
        TIME_PERIOD_MAP.put("2018-03-31", 1522520999000l);
        
        //2017
        TIME_PERIOD_MAP.put("2017-04-01", 1490985000000l);
        TIME_PERIOD_MAP.put("2017-06-30", 1498847399000l);
        TIME_PERIOD_MAP.put("2017-07-01", 1498847400000l);
        TIME_PERIOD_MAP.put("2017-09-30", 1506796199000l);
        TIME_PERIOD_MAP.put("2017-10-01", 1506796200000l);
        TIME_PERIOD_MAP.put("2017-12-31", 1514744999000l);
        TIME_PERIOD_MAP.put("2017-01-01", 1483209000000l);
        TIME_PERIOD_MAP.put("2017-03-31", 1490984999000l);
        //2016
        TIME_PERIOD_MAP.put("2016-04-01",1459449000000l);
        TIME_PERIOD_MAP.put("2016-06-30",1467311399000l);
        TIME_PERIOD_MAP.put("2016-07-01",1467311400000l);
        TIME_PERIOD_MAP.put("2016-09-30",1475260199000l);
        TIME_PERIOD_MAP.put("2016-10-01",1475260200000l);
        TIME_PERIOD_MAP.put("2016-12-31",1483208999000l);
        TIME_PERIOD_MAP.put("2016-01-01",1451586600000l);
        TIME_PERIOD_MAP.put("2016-03-31",1459448999000l);
        
        //2015
        TIME_PERIOD_MAP.put("2015-04-01",1427826600000l);
        TIME_PERIOD_MAP.put("2015-06-30",1435688999000l);
        TIME_PERIOD_MAP.put("2015-07-01",1435689000000l);
        TIME_PERIOD_MAP.put("2015-09-30",1443637799000l);
        TIME_PERIOD_MAP.put("2015-10-01",1443637800000l);
        TIME_PERIOD_MAP.put("2015-12-31",1451586599000l);
        TIME_PERIOD_MAP.put("2015-01-01",1420050600000l);
        TIME_PERIOD_MAP.put("2015-03-31",1427826599000l);
        //2014
        TIME_PERIOD_MAP.put("2014-04-01",1396290600000l);
        TIME_PERIOD_MAP.put("2014-06-30",1404152999000l);
        TIME_PERIOD_MAP.put("2014-07-01",1404153000000l);
        TIME_PERIOD_MAP.put("2014-09-30",1412101799000l);
        TIME_PERIOD_MAP.put("2014-10-01",1412101800000l);
        TIME_PERIOD_MAP.put("2014-12-31",1420050599000l);
        TIME_PERIOD_MAP.put("2014-01-01",1388514600000l);
        TIME_PERIOD_MAP.put("2014-03-31",1396290599000l);
        //2013
        TIME_PERIOD_MAP.put("2013-04-01",1364754600000l);
        TIME_PERIOD_MAP.put("2013-06-30",1372616999000l);
        TIME_PERIOD_MAP.put("2013-07-01",1372617000000l);
        TIME_PERIOD_MAP.put("2013-09-30",1380565799000l);
        TIME_PERIOD_MAP.put("2013-10-01",1380565800000l);
        TIME_PERIOD_MAP.put("2013-12-31",1388514599000l);
        TIME_PERIOD_MAP.put("2013-01-01",1356978600000l);
        TIME_PERIOD_MAP.put("2013-03-31",1364754599000l);
        
         
        DOCTYPEMAP.put("OWNER.IDENTITYPROOF.AADHAAR", "OWNER.IDENTITYPROOF.AADHAAR");
        DOCTYPEMAP.put("OWNER.IDENTITYPROOF.VOTERID", "OWNER.IDENTITYPROOF.VOTERID");
        DOCTYPEMAP.put("OWNER.IDENTITYPROOF.DRIVING", "OWNER.IDENTITYPROOF.DRIVING");
        DOCTYPEMAP.put("OWNER.IDENTITYPROOF.PAN", "OWNER.IDENTITYPROOF.PAN");
        DOCTYPEMAP.put("OWNER.IDENTITYPROOF.PASSPORT", "OWNER.IDENTITYPROOF.PASSPORT");
        DOCTYPEMAP.put("OWNER.ADDRESSPROOF.ELECTRICITYBILL", "OWNER.ADDRESSPROOF.ELECTRICITYBILL");
        DOCTYPEMAP.put("OWNER.ADDRESSPROOF.DL", "OWNER.ADDRESSPROOF.DL");
        DOCTYPEMAP.put("OWNER.ADDRESSPROOF.VOTERID", "OWNER.ADDRESSPROOF.VOTERID");
        DOCTYPEMAP.put("OWNER.ADDRESSPROOF.AADHAAR", "OWNER.ADDRESSPROOF.AADHAAR");
        DOCTYPEMAP.put("OWNER.ADDRESSPROOF.PAN", "OWNER.ADDRESSPROOF.PAN");
        DOCTYPEMAP.put("OWNER.ADDRESSPROOF.PASSPORT", "OWNER.ADDRESSPROOF.PASSPORT");
        DOCTYPEMAP.put("PLUMBER_REPORT_DRAWING", "PLUMBER_REPORT_DRAWING");
        DOCTYPEMAP.put("BUILDING_PLAN_OR_COMPLETION_CERTIFICATE", "BUILDING_PLAN_OR_COMPLETION_CERTIFICATE");
        DOCTYPEMAP.put("PROPERTY_TAX_RECIEPT", "PROPERTY_TAX_RECIEPT");
       
        
        
        
        
    }
    
    
}
