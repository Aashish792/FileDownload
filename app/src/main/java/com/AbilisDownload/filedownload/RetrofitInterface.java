package com.AbilisDownload.filedownload;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;

public interface RetrofitInterface {

    @GET("documents/604_Aashish_K.C.pptx")
    @Streaming
    Call<ResponseBody> downloadFile();
}
