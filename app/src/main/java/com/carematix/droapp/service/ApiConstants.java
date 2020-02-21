package com.carematix.droapp.service;

/**
 * Created by Ankit on 24-01-2018.
 */

public class ApiConstants {

    // local url
   // public static final String BASE_URL = "http://104.209.168.184:3000/dro/";
    public static final String BASE_URL = "https://octopus.carematix.com/dro/";
   // public static final String BASE_URL = "https://jellyfish.carematix.com/dro/";

    // local url
   // public static final String BASE_URL_VIDEO = "http://104.209.168.184/droweb/";
   // public static final String BASE_URL_VIDEO = "http://104.209.168.184:3000/droweb/";
    public static final String BASE_URL_VIDEO = "https://octopus.carematix.com/droweb/";
  //live url
  // public static final String BASE_URL_VIDEO = "https://jellyfish.carematix.com/droweb/";

    // POST SERVICES

    // auth login
    public static final String AUTH_URL ="auth/mobile/login";
    // dashboard data
    public static final String DASHBOARD_URL ="user/dashboardData";
    // user timeline
    public static final String TIMELINE_URL ="user/userTimeline";
    // survey session details
    public static final String SURVEY_SESSION_DETAILS ="user/survey/getUserSurveySession";
    // active survey
    public static final String ACTIVE_SURVEY_URL ="user/activeSurveys";
    // get survey list
    public static final String GET_SURVEY_URL="user/survey/getSurvey";

    public static final String GET_ALL_SURVEY_URL="user/survey/getAllSurvey";
    // calendar schedule data
    public static final String GET_CALENDAR_SCHEDULE="user/survey/calendarSchedulesNew";
    // user info show
    public static final String GET_USER_PROFILE="user/userInfo";
    // view dro data show
    public static final String GET_VIEW_DATA="user/droData";
    // user personal details show
    public static final String GET_USER_PERSONAL_DETAILS="user/personaldetails";
    // personal setting save
    public static final String GET_USER_PERSONAL_SETTING="user/personnel-setitngs";


    // upload dro data
    public static final String UPLOAD_DATA="user/survey/updateSurveyResponse";

    // upload image file
    public static final String UPLOAD_IMAGE_FILE="user/survey/uploadFile";


    // GET SERVICES
    // get user language
    public static final String GET_LANGUAGE="master/languages";
    // get language translate
    public static final String GET_LANGUAGE_TRANSLATE = "master/mobile/config/{ID}";
    // get user message
    public static final String GET_USER_MESSAGE ="user/message/{ID}";

    // program language

    public static final String GET_PROGRAM_LANGUAGE = "organization/{ID}/languages";

    // upload user messge
    public static final String GET_UPLOAD_MESSAGE="user/message/update";
    // terms condition privacy policy
    public static final String GET_TERMS_CONDITION_POLICE ="organization/{ID}/config";


    // forget password and reset password  GET , Post and Put service

    public static final String RESET_PASSWORD="reset-password";

    //public static final String VERIFY_RESET_PASSWORD="reset-password/verify?encodedNameTime="+"/{NAME}/"+"&securityKey="+"/{CODE}/";
    public static final String VERIFY_RESET_PASSWORD="reset-password/verify";

    public static final String PASSWORD_RESET="reset-password/reset";


    // decline reason
    public static final String DECLINE_REASON="declinereason/{ID}";

    public static final String DECLINE_REASON_UPLOAD="user/survey/decline";

    // logout user
    public static final String USER_LOGOUT="auth/logout";


    // POST SERVICES
    // change password
    public static final String CHANGE_PASSWORD="user/changePassword";



    public static final String UPLOAD_FILE="user/survey/uploadFile";

    public static final String UPLOAD_FILE_TYPE="uploadedFile";

    public static final String DOWNLOAD_FILE="user/survey/getFile/{ID}";



    public static final int UNAUTHORIZED=401;
    public static final int INTERNAL_ERROR=500;


}
// example check retrofit library
//public static final String BASE_URL = "https://reqres.in";
//public static final String AUTH_URL = "/api/users" ;