package com.android.photon_review.model
import com.google.gson.annotations.SerializedName

 class DomainModelItem (
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
    var offer_rate1: String)
    : ArrayList<DomainModelItem>()
