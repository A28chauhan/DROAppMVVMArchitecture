package com.carematix.droapp.service;



/**
 * Created by Vivek on 24-01-2018.
 */

public class ApiClient {

   /* public static Retrofit retrofit = null;


    private static int REQUEST_TIMEOUT = 60;
    private static int REQUEST_TIMEOUT_UPLOAD = 5*60;


    public static Retrofit getClient(){

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiConstants.BASE_URL)//.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }

        return retrofit;
    }


    public static Retrofit getClientSurvey(){

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiConstants.BASE_URL)//.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }

        return retrofit;
    }*/


    //"https://api.androidhive.info/json/";
    /*public static Retrofit retrofitMsg = null;

    public static Retrofit getClientExp(){

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        if(retrofitMsg == null){
            retrofitMsg = new Retrofit.Builder()
                    .baseUrl("http://192.168.1.10:4000/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }

        return retrofitMsg;
    }*/





   /* private static Retrofit retrofitA = null;
    private static int REQUEST_TIMEOUT = 60;
    private static OkHttpClient okHttpClient;


    public static Retrofit getClientPost(RequestBody requestBody, String mToken, Context mContext){

        if (okHttpClient == null)
            initOkHttp(requestBody,mToken,mContext);


        if (retrofitA == null) {
            retrofitA = new Retrofit.Builder()
                    .baseUrl(ApiConstants.BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitA;
    }

    private  static void initOkHttp(final RequestBody requestBody,final String mToken,Context mContext){
        OkHttpClient.Builder httpClient = new OkHttpClient().newBuilder()
                .connectTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient.addInterceptor(interceptor);
        httpClient.addInterceptor(new AddCookiesInterceptor(mContext)); // VERY VERY IMPORTANT
        httpClient.addInterceptor(new ReceivedCookiesInterceptor(mContext)); // VERY VERY IMPORTANT


        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                Request.Builder requestBuilder = original.newBuilder()
                        .addHeader("Content-Type", "application/json")
                        .post(requestBody);

                // Adding Authorization token (API Key)
                // Requests will be denied without API key

                requestBuilder.addHeader("X-DRO-TOKEN", mToken);

                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });


        okHttpClient = httpClient.addInterceptor(interceptor).build();

    }



    public static Retrofit getClientPost(String token,String setCookies){

        if (okHttpClient == null)
            initOkHttp(token,setCookies);


        if (retrofitA == null) {
            retrofitA = new Retrofit.Builder()
                    .baseUrl(ApiConstants.BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitA;

    }




    private static void initOkHttp(final String mToken,final String setCookie){

        *//*OkHttpClient.Builder httpClient = new OkHttpClient().newBuilder()
                .connectTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        httpClient.addInterceptor(interceptor);


        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                Request.Builder requestBuilder = original.newBuilder()
                        .addHeader("Content-Type", "application/json")
                        .addHeader("Cache-Control", "no-cache");

                // Adding Authorization token (API Key)
                // Requests will be denied without API key

                requestBuilder.addHeader("X-DRO-TOKEN", mToken);

                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });*//*

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();

                // Request customization: add request headers
                Request.Builder requestBuilder = original.newBuilder()
                        .addHeader("Content-Type", "application/json")
                        .addHeader("Cookie", setCookie)
                        .addHeader("X-DRO-TOKEN", mToken);

                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });

        okHttpClient = httpClient.addInterceptor(interceptor).build();


    }



    private static Retrofit retrofitB = null;
    public static Retrofit getClientPost1(String token){
*//*
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(addInterCeptor(token)).build();*//*

        //OkHttpClient.Builder client = new OkHttpClient.Builder();
     *//*   client.

        OkHttpClient client1=client.build();*//*

        *//*OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(addInterCeptor(token))
                .build();*//*
       *//* HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(addInterCeptor(token)).build();*//*

        *//*OkHttpClient.Builder httpClient = new OkHttpClient().newBuilder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS);*//*

        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.networkInterceptors().add(addInterCeptor1(token));



        if(retrofitB == null){
            retrofitB = new Retrofit.Builder()
                    .baseUrl(ApiConstants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();
        }

        return retrofitB;
    }


    public static Interceptor addInterCeptor1(final String token){


        Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {

                Request originalRequest = chain.request();
                // Add authorization header with updated authorization value to intercepted request

                Request authorisedRequest = originalRequest.newBuilder()
                        .header("X-DRO-TOKEN", token)
                        .build();
                return chain.proceed(authorisedRequest);
            }
        };

       // MediaType mediaType = MediaType.parse("application/json");
        // RequestBody body = RequestBody.create(mediaType, "{\"language\":\"EN\",\"programUserId\":\"4\",\"timezone\":\"Asia/Calcutta\"}");

        *//*OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {

                Request original = chain.request()
                 .newBuilder().addHeader("Content-Type","application/json").addHeader("X-DRO-TOKEN",token)
                        .build();

                return chain.proceed(original);
            }
        }).build();*//*

       *//* Interceptor interceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();

                Request.Builder newRequest = original.newBuilder()
                        .addHeader("Content-Type", "application/json")
                        .addHeader("X-DRO-TOKEN", token);

                Request request = newRequest.build();


                return chain.proceed(request);
            }
        };
*//*

        return interceptor;

    }


    public static Retrofit getClient1(){

       // OkHttpClient client = new OkHttpClient();

       // MediaType mediaType = MediaType.parse("application/json");

      //  RequestBody body = RequestBody.create(mediaType, "{\"language\":\"EN\",\"userName\":\"achauhan@carematix.com\",\"organizationProgramId\":\"32\",\"password\":\"password\",\"timezone\":\"Asia/Calcutta\"}");


      //  HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
      //  interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
      //  interceptor.setLevel(body);

       // OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request original = chain.request();

                // Request customization: add request headers
                Request.Builder requestBuilder = original.newBuilder()
                        .header("Content-Type", "application/json"); // <-- this is the important line
//Content-Type : application/json
                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });

       *//* OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new Interceptor() {
                                      @Override
                                      public Response intercept(Interceptor.Chain chain) throws IOException {
                                          Request original = chain.request();

                                          Request request = original.newBuilder()
                                                  .header("User-Agent", "Your-App-Name")
                                                  .header("Accept", "application/vnd.yourapi.v1.full+json")
                                                  .method(original.method(), original.body())
                                                  .build();

                                          return chain.proceed(request);
                                      }
                                  };*//*

        OkHttpClient client = httpClient.build();


        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiConstants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    //.addCallAdapterFactory()
                    .client(client)
                    .build();
        }

        return retrofit;
    }*/
}
