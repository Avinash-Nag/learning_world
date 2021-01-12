package com.kktheavi.eraworld.networking

import com.kktheavi.eraworld.utils.Urls
import retrofit2.http.*

interface ApiInterface {

   /* @GET(Urls.COURSES)
    fun getCoursesList(@Query("country[]") country: String, @Query("page") page: Int, @Query("query") query: String?): Single<CourseResultModel>

    @GET(Urls.COURSES)
    fun getCoursesListForFilter(@Query("mobile") isTrue: Boolean, @Query("country[]") country: String): Single<FilterAPIResponse>

    @GET(Urls.COURSES)
    fun getCoursesListForProfiler(@Query("mobile") isTrue: Boolean): Single<FilterAPIResponse>

    @GET(Urls.BUNDLES)
    fun getBundles(): Single<List<BundleResponse>>

    @GET
    fun getCoursesBasedOnFilter(@Url url: String): Single<CourseResultModel>

    @GET
    fun getCoursesBasedOnFilterScreen(@Url url: String): Single<FilterAPIResponse>

    @GET
    fun getCoursesBasedOnBundles(@Url url: String): Single<CourseResultModel>

    @Headers("Content-Type: application/json")
    @POST(Urls.ENC_COURSES)
    fun getCourseEncrypt(@Header("Authorization") token: String, @Body encryptCourseRequestModel: EncryptCourseRequestModel): Single<EncryptCourseResultModel>
*/
}