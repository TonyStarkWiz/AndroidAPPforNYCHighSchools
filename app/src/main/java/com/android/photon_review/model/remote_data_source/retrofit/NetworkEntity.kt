package com.android.photon_review.model.remote_data_source.retrofit
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import retrofit2.http.GET

interface Retrofit{
@GET("s3k6-pzi2.json")
suspend fun get(): List<NetworkEntity>
}


// https://data.cityofnewyork.us/resource/s3k6-pzi2.json

data class NetworkEntity (
    @SerializedName("school_name")
    var school_name: String,
    @SerializedName("location")
    var location: String,
    @SerializedName("overview_paragraph")
    var overview_paragraph: String,
    @SerializedName("attendance_rate")
    var attendance_rate: String,
    @SerializedName("pct_stu_enough_variety")
    var pct_stu_enough_variety: String,
    @SerializedName("pct_stu_safe")
    var pct_stu_safe: String,
    @SerializedName("offer_rate1")
    var offer_rate1: String
        ) {
}