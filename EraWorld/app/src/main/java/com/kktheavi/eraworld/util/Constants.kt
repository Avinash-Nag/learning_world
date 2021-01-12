package com.kktheavi.eraworld.utils

import android.os.Environment.DIRECTORY_DOWNLOADS

class DateFormat {
    companion object {
        val DATE_TIME_FORMAT_ISO = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
        val DATE_TIME_FORMAT = "dd MMM yyyy"
    }
}

class FilePath
{
    companion object
    {
        val FILE_PATH :String = DIRECTORY_DOWNLOADS +"/.wceaDirectory"

        const val DIR_NAME ="wcea";

        const val ZIP_FILE_EXTENSION =".zip";


    }
}
class Urls {
    companion object {
        const val MAUTIC_URL = "https://engagement.wcea.education/notification/appcallback"
        const val AUTH_BASE_URL = "https://app.wcea.education"
        const val BASE_URL ="https://courses.wcea.education/courses?";
        const val COURSES = "/courses?ajax=true"
        const val ENC_COURSES = "https://hlxly0sq41.execute-api.us-east-1.amazonaws.com/Prod/wceacourse"
        const val BUNDLES = "/contentapi/bundles"
        const val IMSMANIFEST_FILE ="/imsmanifest.xml"
        const val INDEX_LAUNCHER_FILE ="scormdriver/indexAPI.html"
        const val INDEX_TYPE_FILE_PATH = "/scormcontent/index.html"
        const val CUSTOM_TOKEN = "/p/firebase/authenticate/token"
        const val CONTACT_PROFILE = "/api/v1/me"
        const val ACCEPT_TERMS = "/api/v1/councils/accept/terms"
        const val GET_COURSE_URL = "https://hlxly0sq41.execute-api.us-east-1.amazonaws.com/Prod/wceacourse"
    }
}

class DB
{
    companion object
    {
        const val COURSE_DB = "course.db";
        const val SCORM_DB = "scorm.db"
    }
}

class SCORM_JSON_KEY
{
    companion object
    {
        const val SUSPENDED_DATA = "suspend_data";
        const val LESSON_LOCATION = "lesson_location"
        const val SESSION_TIME = "session_time"
        const val CORE = "core"
        const val CMI_CORE_LESSON_LOCATION ="cmi.core.lesson_location"
        const val CMI_CORE_SESSION_TIME ="cmi.core.session_time"
        const val CMI_SUSPENDED_DATA ="cmi.suspend_data"
        const val LAST_SLIDE_VIEW = "lastviewedslide="

    }
}

class ANALYTICS_KEYS
{
    companion object
    {
        const val COURSE_FAILED_TO_LOAD = "course_failed_to_load";
    }
}


class DOWNLOAD_STATUS
{
    companion object
    {
        const val COMPLETE = "Complete";
        const val DOWNLOADING = "Downloading"
        const val CANCEL = "Cancel"
    }
}

class APP_TYPE
{
    companion object
    {
        const val SANC = "sanc";
        const val KNC = "knc"
        const val AJA = "aja"
    }
}


class Extras {
    companion object {

        val IS_NET_CONNECTED= "is_net_connected"
        val URL_WITH_COURSE_ID= "url_with_course_id"
        val LICENCES ="licences"
        const val SPLASH_TIME = 500L
        val FILTER_TYPE="filter_type";
        val FILTER_ITEMS ="filter_items"
        val FILTER_INDEXES = "filter_indexes"
        val FILTER_MAP = "filter_map"
        val DOWNLOAD_PATH = "download_path"
        val DESTINATION_PATH = "destination_path"
        val COURSE = "course"
        val IS_ALREADY_DOWNLOADED = "is_already_downloaded"
        val FILTER_DATA = "filter_data"
        val IS_DOWNLOAD_ALLOW = "is_download_allow"
        val USER_DATA = "user_data"
        val PROFILE_DATA = "profile_data"
        val COUNCIL_POSITION = "council_position"
        val SELECTED_COUNCIL = "selected_council"



    }

}

class IntentConstant{
    companion object{
        val POSITION="position"
        val FROM="from"
        val COUNCIL_NAME="council_name"
    }
}