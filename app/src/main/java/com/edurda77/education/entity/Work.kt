package com.edurda77.education.entity

data class Work(
    val picture : Int,
    val nameWork : String,
    val dateBeginWork : String,
    val dateEndWork : String,
    val urlZoom : String? = "",
    val isEat: Boolean? = false,
    val isEnableUrl: Boolean? = false
)
