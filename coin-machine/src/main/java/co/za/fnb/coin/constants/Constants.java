package co.za.fnb.coin.constants;

public class Constants {
    public static final String ID = "id";
    public static final String UI_APP_REGISTRATION_DASHBOARD_URL = "registrationDashboardLanding";
    public static final String UI_APP_REGISTERED_DASHBOARD_URL = "registeredDashboardLanding";
    public static final String UI_APP_OFFICIAL_DASHBOARD_URL = "officialLanding";
    public static final String PORTAL_URL = "portalLink";
    public static final String WORKFLOW_URL = "workflowlink";
    public static final String USERPROFILE="userProfile";
    public static final String ENV_NAME="environmentName";
    
   public static final String WEBSERVICELINK = "http://localhost:8080/";
   // public static final String WEBSERVICELINK = "http://wcenifms924.sita.co.za:9191/";
    // public static final String WEBSERVICELINK = "http://10.123.56.170:8111/";
    //public static final String WEBSERVICELINK = "http://10.123.56.184:8111/";

    public static final String ACTIVE_FLAG="1";
    
    public static final String SYSTEMNAME = "DMV";

    public static final String SMS_PREFERRED_METHOD_OF_COMMUNICATION = "0";

    // email properties
    public static final String EMAIL_ENABLED="email_enabled";
    public static final String EMAIL_PROXY="email_proxy";
    public static final String EMAIL_ALIAS="email_alias";
    public static final String EMAIL_USERNAME="email_username";
    public static final String EMAIL_PASSWORD="email_password";

    // sms properties
    public static final String SMS_ENABLED="sms_enabled";
    public static final String SMS_PROXY="sms_proxy";
    public static final String SMS_PROXY_PORT="sms_proxy_port";
    public static final String SMS_USERNAME="sms_username";
    public static final String SMS_PASSWORD="sms_password";
    public static final String SMS_PRIORITY="sms_priority";
    public static final String SMS_REF="sms_ref";
    
    public static final String ADDRESS_TYPE_POSTAL="postal";
    public static final String ADDRESS_TYPE_RESIDENTIAL="residential";

    public static final String APPLICATION_STATUS_NEW="00";
    public static final String APPLICATION_STATUS_SUBMITTED="01";
    public static final String APPLICATION_STATUS_VERIFIED="02";
    public static final String APPLICATION_STATUS_QUALITY_ASSURED="03";
    public static final String APPLICATION_STATUS_APPROVED="04";
    public static final String APPLICATION_STATUS_RETURNED_TO_APPLICANT="05";
    public static final String APPLICATION_STATUS_RETURNED_TO_VERIFICATION="06";
    public static final String APPLICATION_STATUS_RETURNED_TO_QA="07";
    public static final String APPLICATION_STATUS_REJECTED="08";






    public static final Integer BURIAL_BENEFIT_TYPE = 1;
    public static final Integer COMPENSATION_BENEFIT_TYPE = 2;
    public static final Integer COUNSELLING_BENEFIT_TYPE = 3;
    public static final Integer BUSINESS_BENEFIT_TYPE = 4;
    public static final Integer SOCIAL_RELIEF_BENEFIT_TYPE = 5;
    public static final Integer TERTIATY_EDU_BENEFIT_TYPE = 6;
    public static final Integer BASIC_EDU_BENEFIT_TYPE = 7;
    public static final Integer EMPLOYMENT_BENEFIT_TYPE = 8;
    public static final Integer HEALTH_BENEFIT_TYPE = 9;
    public static final Integer HOUNORING_BENEFIT_TYPE = 10;
    public static final Integer HOUSING_BENEFIT_TYPE = 11;
    public static final Integer TRAINING_BENEFIT_TYPE = 12;

    public static final String REG_REF_TYPE = "REGISTRATION";
    public static final String BEN_REF_TYPE = "BENEFIT";

    public static final String BENEFIT_APPLICATION_STAT_NEW = "New";
    public static final String BENEFIT_APPLICATION_STAT_SUBMITTED = "Submitted";
    public static final String BENEFIT_APPLICATION_STAT_APPROVED = "Approved";
    public static final String BENEFIT_APPLICATION_STAT_QAED = "Quality Assured";
    public static final String BENEFIT_APPLICATION_STAT_VERIFIED = "Verified";
    public static final String BENEFIT_APPLICATION_STAT_RETURN_TO_APPLICANT = "Returned To Applicant";
    public static final String BENEFIT_APPLICATION_STAT_RETURN_TO_QA = "Returned To QA";
    public static final String BENEFIT_APPLICATION_STAT_RETURN_TO_VERIFIER = "Returned To Verifier";
    public static final String HA= "HA";
    public static final String OB= "OB";


    public static final int BENEFIT_TYPE_VETERAN_SUBCODE1 = 1;
    public static final int BENEFIT_TYPE_SPOUSE_SUBCODE2 =  2 ;
    public static final int BENEFIT_TYPE_DEPENDANT_SUBCODE3 =  3 ;
    public static final String PERSON_STATUS_NEW = "New";
    public static final String PERSON_STATUS_SUBMITTED = "Submitted";
    public static final String PERSON_STATUS_APROVED = "Approved";
    public static final String PERSON_STATUS_QAED= "Quality Assured";
    public static final String PERSON_STATUS_VERIFIED = "Verified";
    public static final String PERSON_STATUS_DEACTIVE = "Deactivated";

    public static final String REGISTRATION_PROCESS = "dmvRegistrationProcess";
    public static final String DEP_REGISTRATION_PROCESS = "dependantRegistrationProcess";
    public static final String SPOUSE_REGISTRATION_PROCESS = "spouseRegistrationProcess";
    public static final String ACTION_COMPLETE_STATUS = "dmvRegistrationProcess";
    public static final String PER_STAT_ALIVE = "1";
    public static final String PROCESS_STATUS_SUCCESS = "successfull";

    public static final String PER_DATA_SOURCE_SYSTEM = "S";
    public static final String PER_DATA_SOURCE_MIGRATION = "M";


    //Activiti with an I action stats

    public static final String ACTION_STATUS_VERIFY = "verify";
    public static final String ACTION_STATUS_VERIFY_VAR = "verifyVar";
    public static final String ACTION_STATUS_VERIFY_DOCS = "verifyDocuments";
    public static final String ACTION_STATUS_QA = "qa";
    public static final String ACTION_STATUS_QA_VERIFICATION = "qaVeification";
    public static final String ACTION_STATUS_QA__NORM_VERIFICATION = "qaverify";
    public static final String ACTION_STATUS_APPROVED_UI= "approved";
    public static final String ACTION_STATUS_APPROVED_SECOND= "secondapprove";
    public static final String ACTION_STATUS_APPROVED_FIRST= "firstapprove";
    public static final String ACTION_STATUS_APPROVED_REG= "approve";
    public static final String ACTION_STATUS_APPEAL= "appeal";
    public static final String ACTION_STATUS_VERIFY_DEP= "verifydep";
    public static final String ACTION_STATUS_VERIFY_SPOUSE= "verifyspouse";

    public static final String PERSON_MARITAL_STATUS_MARRIED= "2";



    public static final String GROUP_TRAINING_SKILLS_APPROVER = "dmv_trainingskills_approver";
    public static final String GROUP_TRAINING_SKILLS_QUALITY_ASSURER = "dmv_trainingskills_qualityassurer";
    public static final String GROUP_TRAINING_SKILLS_VERIFIER = "dmv_trainingskills_verifier";

    public static final String GROUP_BUSINESS_OPPORTUNITY_VERIFIER = "dmv_businessopportunity_verifier";
    public static final String GROUP_BUSINESS_OPPORTUNITY_QUALITY_ASSURER = "dmv_businessopportunity_qualityassurer";
    public static final String GROUP_BUSINESS_OPPORTUNITY_APPROVER = "dmv_businessopportunity_approver";

    public static final String GROUP_EDUCATION_VERIFIER = "dmv_education_verifier";
    public static final String GROUP_EDUCATION_QUALITY_ASSURER = "dmv_education_qualityassurer";
    public static final String GROUP_EDUCATION_APPROVER = "dmv_education_approver";

    public static final String GROUP_BASIC_EDUCATION_VERIFIER = "dmv_basiceducation_verifier";
    public static final String GROUP_BASIC_EDUCATION_QUALITY_ASSURER = "dmv_basiceducation_qualityassurer";
    public static final String GROUP_BASIC_EDUCATION_APPROVER = "dmv_basiceducation_approver";


    public static final String GROUP_HIGHER_EDUCATION_VERIFIER = "dmv_tertiaryeducation_verifier";
    public static final String GROUP_HIGHER_EDUCATION_QUALITY_ASSURER = "dmv_tertiaryeducation_qualityassurer";
    public static final String GROUP_HIGHER_EDUCATION_APPROVER = "dmv_tertiaryeducation_approver";

    public static final String GROUP_HOUSING_VERIFIER = "dmv_housing_verifier";
    public static final String GROUP_HOUSING_QUALITY_ASSURER = "dmv_housing_qualityassurer";
    public static final String GROUP_HOUSING_APPROVER = "dmv_housing_approver";

    public static final String GROUP_HEALTH_VERIFIER = "dmv_health_verifier";
    public static final String GROUP_HEALTH_QUALITY_ASSURER = "dmv_health_qualityassurer";
    public static final String GROUP_HEALTH_APPROVER = "dmv_health_approver";

    public static final String GROUP_COUNSELLING_VERIFIER = "dmv_counselling_verifier";
    public static final String GROUP_COUNSELLING_ASSURER = "dmv_counselling_qualityassurer";
    public static final String GROUP_COUNSELLING_APPROVER = "dmv_counselling_approver";

    public static final String GROUP_EMPLOYMENT_VERIFIER = "dmv_employmentplacement_verifier";
    public static final String GROUP_EMPLOYMENT_QUALITY_ASSURER = "dmv_employmentplacement_qualityassurer";
    public static final String GROUP_EMPLOYMENT_APPROVER = "dmv_employmentplacement_approver";
    
    
    public static final String GROUP_REGISTRATION_VERIFIER = "dmv_registration_verifier";
    public static final String GROUP_REGISTRATION_QUALITY_ASSURER = "dmv_registration_qualityassurer";
    public static final String GROUP_REGISTRATION_APPROVER = "dmv_registration_approver";
    public static final String GROUP_REGISTRATION_ADMIN = "dmv_registration_admin";
    public static final String GROUP_REGISTRATION_CAPTURER = "dmv_registration_capturer";

    public static final String BENEFIT_SUB_TYPE_BUSINESS_FUNDING = "funding";
    public static final String BENEFIT_SUB_TYPE_BUSINESS_MARKETING = "marketing";
    public static final String BENEFIT_SUB_TYPE_BUSINESS_TRAINING = "training";

    public static final String BENEFIT_SUB_TYPE_HEALTH_HOME_CARE = "homecare";
    public static final String BENEFIT_SUB_TYPE_HEALTH_FRAIL = "frail";
    public static final String BENEFIT_SUB_TYPE_HEALTH_TRANSPORT = "transport";

    public static final String BENEFIT_SUB_TYPE_HOUSING_HOUSE = "houseAllocation";
    public static final String BENEFIT_SUB_TYPE_HOUSING_BOND = "bondRepayment";
    public static final String BENEFIT_SUB_TYPE_BURIAL_SUPPORT = "burialSupport";
    public static final String BENEFIT_SUB_TYPE_BURIAL_TOMBSTONE = "tombstoneSupport";

    public static final String PROVINCE_MP = "Mpumalanga";
    public static final String PROVINCE_NW = "North West";
    public static final String PROVINCE_LP = "Limpopo";
    public static final String PROVINCE_KZN = "Kwa-Zulu Natal";
    public static final String PROVINCE_WC = "Western Cape";
    public static final String PROVINCE_NC = "Northern Cape";
    public static final String PROVINCE_EC = "Eastern Cape";
    public static final String PROVINCE_FS = "Free State";
    public static final String PROVINCE_GP = "Gauteng";

    public static final int PROVINCE_MP_ID = 6;
    public static final int PROVINCE_NW_ID = 3;
    public static final int PROVINCE_LP_ID = 1;
    public static final int PROVINCE_KZN_ID = 7;
    public static final int PROVINCE_WC_ID = 9;
    public static final int PROVINCE_NC_ID = 4;
    public static final int PROVINCE_EC_ID = 5;
    public static final int PROVINCE_FS_ID = 8;
    public static final int PROVINCE_GP_ID = 2;

    public static final String NATURE_INSTITUTION_PUBLIC = "Public";
    public static final String NATURE_INSTITUTION_PRIVATE = "Private";

    public static final String NATURE_ADDRESS_PHYSICAL = "Physical";
    public static final String NATURE_ADDRESS_POSTAL = "Postal";

    public static final String EDUCATION_TERTIARY = "tertiary";
    public static final String EDUCATION_BASIC = "basic";


    public static String TRAFFIC_REGISTER_NUMBER    = "01";
    public static String RSA_IDENTITY_DOCUMENT      = "02";
    public static String FOREIGN_IDENTITY_DOCUMENT  = "03";
    public static String BUSINESS_REGISTER_NUMBER   = "04";
    public static String PSEUDO_PERSON              = "97";

    public static final String EMAIL_FROM_NOTIFICATION = "mokkhutu@gmail.com";
    public static final String EMAIL_NOTIFICATION_USRNAME = "mokkhutu@gmail.com";
    public static final String EMAIL_NOTIFICATION_PWD = "hjkhgfgb";
    public static final String EMAIL_HOST = "smtp.gmail.com";
    public static final String USER_MANAGEMENT_LINK = "usermanagementlink";
    
    
    

}
