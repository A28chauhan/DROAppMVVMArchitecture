package com.carematix.droapp.preference;

import java.util.regex.Pattern;

/**
 * Created by Vivek on 19-01-2018.
 */

public interface PrefConstants {


    // notification view
      String KEY_NOTIFICATIONS = "notifications";

    // shotcut badge count
      String BADGE_COUNT="badgeCounts";


    // details set in parameters
     String CONTENT_TYPE="application/json";
     String CONTENT_TYPE_1="multipart/form-data";
     String X_DRO_SOURCE="ANDROID";
     String LANGUAGE="EN";
     String TIMEZONE="Asia/Calcutta";


    // preference value set

     String PREFERENCE_NAME ="dro_application";
     String PREFERENCE_LOGIN_CHECK= "login_check";
     String PREFERENCE_CREATE_SHORTCUT= "create_shortcut";

     String PREFERENCE_WELCOME_SCREEN="first";

     String CLINIC_SCHEDULE="";
      String CURRENT_ID="id";
      String CURRENT_SURVEY_ID = "surveyId";
      String CURRENT_SURVEY_USER_SESSION_ID="userSessionId";
      String CURRENT_SURVEY_NAME="surveyName";
      String CURRENT_SURVEY_SCHEDULE_DATE="surveyScheduleDate";
      String CURRENT_SURVEY_SCHEDULE_SESSION_ID="scheduleSessionId";
      String CURRENT_SURVEY_DUE_DATE="dueDate";
    // decline survey use
      String CURRENT_SURVEY_DUE_SCHEDULE_CALENDAR_ID="scheduleCalendarID";

      String CURRENT_SURVEY_NAVIGATION="survey_navigation";
      String PREF_ACTIVE="PREF_ACTIVE";
      String PREF_DASHBOARD="PREF_DASH";


      String CURRENT_USER_TIME_SPENT="user_time_spent";

      String CURRENT_SURVEY_SCHEDULE_TYPE="scheduleType";

      String TRAINING_SAMPLE_QUESTION="sample_score";

    // Question survey Last session
      String LAST_SURVEY_SHOW_ALERT="lastSurveyShowAlert";

      long INDETERMINATE_ID = -1;
      long ZERO_ID = 0;

    // user language data
      String SELECT_LANGUAGE="language";
      String SELECT_TIME_ZONE="time_zone";

      String SET_COOKIES="set_cookies";
      String PREF_COOKIES="pref_cookies";

      String TOKEN ="token";
      String DN_TOKEN ="dn_token";
      String USER_ID ="user_id";
    //organisation
      String ORGANISATION_ID ="organisation_id";
      String LANGUAGE_CODE ="code";
      String LANGUAGE_NAME ="name";

      String PROGRAM_USER_ID ="program_user_id";
      String PROGRAM_START_TIME ="start_time";
      String PROGRAM_END_TIME ="end_time";

      String SCHEDULE_START_TIME ="schedule_start_time";
      String SCHEDULE_END_TIME ="schedule_end_time";


    // user info
      String USER_FIRST_NAME="first_name";
      String USER_LAST_NAME="last_name";
      String USER_NAME="user_name";
      String LAST_VISITED_DATE="last_visited";
      String USER_IMAGE="user_image";
    //program info
      String ORGANIZATION_NAME="organization_name";
      String PROGRAM_NAME="program_name";
      String PROGRAM_ID="program_id";
      String LOGO_URL="logo_url";

    // user survey summary
      String FROM_DATE = "from_date";
      String TO_DATE = "to_date";
      String ASSIGNED = "assigned";
      String COMPLETED = "completed";
      String ACTIVE = "active";
      String DECLINE = "decline";
      String EXPIRE = "expire";
      String AVERAGE_PER_WEEK = "avg_per_week";


    // user insert data
      String INSERT_MASTER_DATA="insert_master_data";

    // user app request permission
      String APP_REQUEST_PERMISSION="isSelfPermissionAsked";

    // user app schedule
      String SCHEDULE_DRO_LIST="scheduleList";
      String VIEW_DRO_LIST="viewList";

      String VIEW_DRO_SORT_S="s_status";
      String VIEW_DRO_SORT_SO="s_sort";


      String MESSAGE_DRO_SORT_S="m_status";
      String MESSAGE_DRO_SORT_SO="m_sort";

      String SCHEDULE_DRO_TIME_SET="scheduleCurrentTime";


    // user view dro info


      String VIEW_FROM_DATE="view_from_date";
      String VIEW_TO_DATE="view_to_date";
      String VIEW_ASSIGN="view_assigned";
      String VIEW_COMPLETED="view_completed";
      String VIEW_ACTIVE="view_active";
      String VIEW_DECLINE="view_declined";
      String VIEW_EXPIRE="view_expire";
      String VIEW_AVERAGE_PER_WEEK="view_average";

      String COUNT_SET="count";

      String TIMELINE_COUNT="time_line_count";

    // msg fetching data
      String MESSAGE_LINE_TASK="userMessage";

    // time line task
      String TIME_LINE_TASK="userTimeLine";
      String SURVEY_CURRENT_STATE="currentState";

    // terms condition check
      String USER_INFO_VIEW="userInfoDash";
      String TERMS_CONDITION_VIEW="termsCondition";
      String TERMS_CONDITION_UPDATE_TIME="update_time";

      String USER_PROFILE_DETAILS="profileDetails";
      String USER_PERSONAL_DETAILS="personalDetails";
      String USER_SURVEY_DETAILS="surveyDetails";


      String USER_DECLINE_REASON="declineReason";


      String USER_LAST_VISITED="lastVisited";

      String SPINNER_VALUE = "spValue";

    // time line set date
      String TIMELINE_DATE="setDate";

    // change password set
      String SET_PASSWORD="setPassword";
      String CHECK_PASSWORD="OK";
      String SUCCESS="success";
      String FAILURE="failure";

      String UNAUTHORIZED="unauthorized";


    //security
      String SECURITY_CODE="security_code";

    // userName set in reset password
      String USER_EMAIL= "userEmail";

    // sorting order set in
      String USER_ASC="ASC";
      String USER_DESC="DESC";
      String USER_STAT="STATS";

      String PROGRESS_ALL="ALL";

      String USER_NAME_EMAIL="userName/Email";


    // messaging sort data
      String MESSAGE_ALL="ALL";
      String MESSAGE_READ="READ";
      String MESSAGE_UNREAD="UNREAD";
      String MESSAGE_STARRED="STARRED";

      String MESSAGE_READ_UNREAD="READ_UNREAD";
      String MESSAGE_READ_STARRED="READ_STARRED";
      String MESSAGE_UNREAD_STARRED="UNREAD_STARRED";


    // network change
      String NETWORK_CHANGE_ISSUE="networkChange";
      String BROADCAST_RECEIVER="broadcast";



      int UNAUTHORIZED_CODE= 401;
      int NOT_FOUND= 404;

      String FILE_DOWNLOAD_SERVER="fileDownloadTask";
      String WAKE_LOGIN_TIME="wakeUpLogin";



    // profile details task
      String USER_PROFILE_GENDER="profile_gender";
      String USER_PROFILE_ETHNICITY="profile_ethnicity";
      String USER_PROFILE_RACE="profile_race";
      String USER_PROFILE_MARITAL_STATUS="profile_marital_status";
      String USER_PROFILE_EDUCATION="profile_education";
      String USER_PROFILE_OCCUPATION="profile_occupation";
      String USER_PROFILE_MONTHLY_FAMILY_INCOME="profile_monthly_income";

    // spinner
      String USER_PROFILE_TAG="profile_tag";

    // survey time line update
      String SURVEY_TIME_LINE="timeline_update";

    // userDashboardDataAsyncTask
      String USER_DASHBOARD_DATA="user_active";

      String UPDATE_CURRENT_STATE_DATE="update_current_date_user";


    // last sync time
      String LAST_SERVICE_HIT_TIME="last_service_time";
      String LAST_PROFILE_SERVICE_HIT_TIME="last_profile_service_time";
      String LAST_DASHBOAD_SYNC_TIME="last_dashboard_sync_time";

      long SET_TIME=(60*1000*5); // 600000, 3 mnt , (60*1000*60*5)18000000  5 hour
      long SET_TIME1=(60*1000*30); // 600000, 3 mnt , (60*1000*60*5)18000000  5 hour
    //  long SET_TIME=(60*1000*10); // 600000, 10 mnt , (60*1000*60*10)36000000  10 hour
    //  long SET_TIME=(30*1000*1); // 30 second



    // Email validation pattern in android
      Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );

    //   String EMAIL_PATTERN="^[A-Za-z0-9._%+\\\\-]+@[A-Za-z0-9.\\\\-]+\\\\.[A-Za-z]{2,4}$";
    //   String EMAIL_PATTERN="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    //   String EMAIL_PATTERN="^((?!.*?\.\.)[A-Za-z0-9\.\!\#\$\%\&\*\+\-\/\=\?\^_`\{\|\}\~]+@[A-Za-z0-9]+[A-Za-z0-9\-\.]+\.[A-Za-z0-9\-\.]+[A-Za-z0-9]+)$";
      String EMAIL_PATTERN= "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
            + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
            + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
            + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
            + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
            + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,6})$";

      String PHONE_NUMBER_PATTEREN="^[+]?(\\d{1,2})?[\\s.-]?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$";


     String[] Columns = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"
            ,"aa","ab","ac","ad","ae","af","ag","ah","ai","aj","ak","al","am","an","ao","ap","aq","ar","as","at","au","av","aw","ax","ay","az"};


    //  String PASSWORD_PATTERN="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})";
      String PASSWORD_PATTERN="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@!$&#])[0-9a-zA-Z@!$&#]{8,}$";


    // default name
     String PREFERENCE_DEFAULT_NAME="dro_application_default";


      int BAD_REQUEST = 400;
      String CHANGE_LANGUAGE_DRO_LIST = "changeLanguageList";
      String EMAIL = "email";
      String INSERT_UPLOAD_FILE_DATA = "insert_upload_file";
      int INTERNAL_SERVER_ERROR = 500;
      String LANGUAGE_CHECK_AVALBILITY = "language_check_login";
      String LANGUAGE_DESC ="language_description";
      String LANGUAGE_ID = "language_id";
      String PASSWORD = "password";
      String SESSEION_DETIALS_CALL = "session_call";

}
