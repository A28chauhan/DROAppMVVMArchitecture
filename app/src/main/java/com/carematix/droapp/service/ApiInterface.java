package com.carematix.droapp.service;



import java.util.List;

/**
 * Created by Ankit chauhan on 20-02-2020.
 */

public interface ApiInterface {


    /*@GET(ApiConstants.VERIFY_RESET_PASSWORD)
    Call<Success> VerifyPasswordDRO(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Header("X-DRO-TOKEN") String paramString3, @Query("encodedNameTime") String paramString4, @Query("securityKey") String paramString5);

    @POST(ApiConstants.CHANGE_PASSWORD)
    Call<Success> changePasswordDRO(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Header("X-DRO-TOKEN") String paramString3, @Body ChangePassword paramChangePassword);

    @PUT(ApiConstants.PASSWORD_RESET)
    Call<Success> confirmPasswordDRO(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Header("X-DRO-TOKEN") String paramString3, @Body ResetPassword paramResetPassword);

    @GET(ApiConstants.DOWNLOAD_FILE)
    Call<ResponseBody> downloadFile(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Header("X-DRO-TOKEN") String paramString3, @Path("ID") String paramString4);

    @GET
    Call<ResponseBody> downloadFileWithDynamicUrlSync(@Url String paramString);

    @POST(ApiConstants.RESET_PASSWORD)
    Call<Success> forgetPasswordDRO(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Header("X-DRO-TOKEN") String paramString3, @Body ChangePassword paramChangePassword);

    @GET(ApiConstants.GET_LANGUAGE_TRANSLATE)
    Call<LabelDescription> getAllLabelsDetails(@Header("Content-Type") String paramString1, @Path("ID") String paramString2);

    @POST(ApiConstants.GET_CALENDAR_SCHEDULE)
    Call<List<CalendarSchedule>> getCalendarScheduleData(@Header("Content-Type") String paramString1, @Header("X-DRO-TOKEN") String paramString2, @Header("X-DRO-SOURCE") String paramString3, @Body ScheduleUser paramScheduleUser);

    @GET(ApiConstants.DECLINE_REASON)
    Call<List<DeclineReasons>> getDeclinedReason(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Header("X-DRO-TOKEN") String paramString3, @Path("ID") String paramString4);

    @GET(ApiConstants.GET_PROGRAM_LANGUAGE)
    Call<List<DroLanguage>> getLanguageData(@Header("X-DRO-SOURCE") String paramString1, @Path("ID") String paramString2);

    @GET(ApiConstants.GET_LANGUAGE)
    Call<List<SupportedLanguage>> getSupportedLanguageData(@Header("X-DRO-SOURCE") String paramString);

    @POST(ApiConstants.SURVEY_SESSION_DETAILS)
    Call<UploadSurveyResponse> getSurveySessionDetails(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Header("X-DRO-TOKEN") String paramString3, @Body SurveySessionDetails paramSurveySessionDetails);

    @GET(ApiConstants.GET_TERMS_CONDITION_POLICE)
    Call<TermsCondition> getTermsConditionData(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Header("X-DRO-TOKEN") String paramString3, @Path("ID") String paramString4, @Query("ln") String paramString5);

    @POST(ApiConstants.DECLINE_REASON_UPLOAD)
    Call<Success> getUploadDeclineResult(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Header("X-DRO-TOKEN") String paramString3, @Body List<DeclineReason> paramList);

    @POST(ApiConstants.UPLOAD_DATA)
    Call<UploadServeyResult> getUploadDroData(@Header("Content-Type") String paramString1, @Header("X-DRO-TOKEN") String paramString2, @Header("X-DRO-SOURCE") String paramString3, @Body UploadSurveyResponse paramUploadSurveyResponse);

    @POST(ApiConstants.GET_USER_PROFILE)
    Call<ProfileDetails> getUserInfoDetails(@Header("Content-Type") String paramString1, @Header("X-DRO-TOKEN") String paramString2, @Header("X-DRO-SOURCE") String paramString3, @Body ProfileInfo paramProfileInfo);

    @GET(ApiConstants.GET_USER_MESSAGE)
    Call<List<Message>> getUserMessagesData(@Header("Content-Type") String paramString1, @Header("X-DRO-TOKEN") String paramString2, @Header("X-DRO-SOURCE") String paramString3, @Path("ID") String paramString4);

    @GET(ApiConstants.GET_USER_PERSONAL_DETAILS)
    Call<List<PersonalDetails>> getUserPersonalDetails(@Header("Content-Type") String paramString1, @Header("X-DRO-TOKEN") String paramString2, @Header("X-DRO-SOURCE") String paramString3);

    @POST(ApiConstants.TIMELINE_URL)
    Call<List<TimeLineModels>> getUserTimeLineData(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Header("X-DRO-TOKEN") String paramString3, @Body UserTimeLine paramUserTimeLine);

    @POST(ApiConstants.GET_VIEW_DATA)
    Call<ViewDroResult> getViewDroResult(@Header("Content-Type") String paramString1, @Header("X-DRO-TOKEN") String paramString2, @Header("X-DRO-SOURCE") String paramString3, @Body ViewDroData paramViewDroData);

    @POST(ApiConstants.USER_LOGOUT)
    Call<Success> logoutUser(@Header("Content-Type") String paramString1, @Header("X-DRO-TOKEN") String paramString2, @Header("X-DRO-SOURCE") String paramString3, @Body Logout paramLogout);

    @POST(ApiConstants.DASHBOARD_URL)
    Call<DashboardUserResult> postDashBoardData(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2,
                                                @Header("X-DRO-TOKEN") String paramString3, @Body UserDashboard paramUserDashboard);

    @POST(ApiConstants.GET_ALL_SURVEY_URL)
    Call<List<SurveyList>> postGetSurveyData(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Body User paramUser);

    @POST(ApiConstants.GET_SURVEY_URL)
    Call<SurveyDetails> postGetSurveyDetails(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Header("X-DRO-TOKEN") String paramString3, @Body SurveyUnScheduleSessionDetails paramSurveyUnScheduleSessionDetails);

    @Multipart
    @POST(ApiConstants.UPLOAD_IMAGE_FILE)
    Call<String> postMultipart(@Header("Content-Type") String paramString, @Part MultipartBody.Part paramPart);

    @Multipart
    @POST(ApiConstants.UPLOAD_FILE)
    Call<String> postMultipartSample(@Header("X-DRO-SOURCE") String paramString1, @Header("X-DRO-TOKEN") String paramString2, @Part MultipartBody.Part paramPart);

    @POST(ApiConstants.AUTH_URL)
    Call<UserResult> postUserDetails(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Body User paramUser);

    @PUT(ApiConstants.GET_USER_PERSONAL_SETTING)
    Call<Success> setUserPersonalSetting(@Header("Content-Type") String paramString1, @Header("X-DRO-SOURCE") String paramString2, @Header("X-DRO-TOKEN") String paramString3, @Body List<PersonalDetails> paramList);

    @PUT(ApiConstants.GET_UPLOAD_MESSAGE)
    Call<Success> uploadUserMessagesData(@Header("Content-Type") String paramString1, @Header("X-DRO-TOKEN") String paramString2, @Header("X-DRO-SOURCE") String paramString3, @Body Message paramMessage);

*/


}
