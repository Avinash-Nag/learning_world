/*
 *    Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.mds.wcea.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Environment
import android.util.Log
import android.webkit.MimeTypeMap
import android.widget.ImageView
import androidx.core.app.ShareCompat
import androidx.core.content.ContextCompat
import java.util.*
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.kktheavi.eraworld.R
import com.kktheavi.eraworld.utils.FilePath
import java.io.*
import kotlin.collections.ArrayList


object Utils {


    fun getRootDirPath(context: Context): String {
        if (Environment.MEDIA_MOUNTED == Environment.getExternalStorageState()) {
            val file = ContextCompat.getExternalFilesDirs(
                context.applicationContext,
                null
            )[0]
            return file.getAbsolutePath()
        } else {
            return context.applicationContext.filesDir.absolutePath
        }
    }

    fun getProgressDisplayLine(currentBytes: Long, totalBytes: Long): String {
        return getBytesToMBString(currentBytes) + "/" + getBytesToMBString(totalBytes)
    }

    private fun getBytesToMBString(bytes: Long): String {
        return String.format(Locale.ENGLISH, "%.2fMb", bytes / (1024.00 * 1024.00))
    }


    fun getMimeType(url: String): String? {
        var type: String? = null
        val extension = MimeTypeMap.getFileExtensionFromUrl(url)
        if (extension != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension)
        }
        return type
    }


    fun getCoursesDirectory(context: Context): File? {
        val internalDir = context.getDir(FilePath.DIR_NAME, Context.MODE_PRIVATE)
        return File(internalDir, "courses")
    }

    fun deleteDirectory(path: String) {
        val dir = File(path)
        if (dir.isDirectory) {
            val children = dir.list()
            for (i in children!!.indices) {
                File(dir, children[i]).delete()
            }
        }
    }

    /* fun getPassword(): String {
         var password = "43bPfwlYear3AX2ckvYseC/PpQweCHEtulPeiyJeaG6ncBDPqLaG2DpLnrEEtgPK"
         val encodedPassword = AES.decryptStrAndFromBase64(null , getPasswordForKey() , password)
         return encodedPassword

     }
 */

    fun getPasswordForKey(): String {
        return encodePassword("wVstSh6RGk0uNqL7PN4FBgk34dsroUWI")
    }

    private fun encodePassword(s: String): String {
        return s.reversed()
    }


    fun loadImage(context: Context, imageUrl: String, view: ImageView) {


        Glide.with(context)
            .load(imageUrl).fitCenter().placeholder(R.drawable.loader)
            .into(view)
    }


    fun clearAllData(context: Context) {
        val internalDir = context.getDir(FilePath.DIR_NAME, Context.MODE_PRIVATE)
        deleteRecursive(internalDir)
    }

    fun deleteRecursive(fileOrDirectory: File) {

        if (fileOrDirectory.isDirectory)
            for (child in fileOrDirectory.listFiles()!!)
                deleteRecursive(child)

        fileOrDirectory.delete()

    }

    fun openUrlOnBrowser(context: Context, url: String) {
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        context.startActivity(i)
    }


    /*
    * remove duplicates
    * */
    fun removeDuplicates(context: Context, contentArray: ArrayList<String>) {
        val licenceList = ArrayList<String>()
        val set = HashSet<String>()
        set.addAll(contentArray)
        contentArray.clear()
        licenceList.addAll(set)
    }


    /*
    * read string from html file
    * */
    fun readTxt(path: String): String {
        var myFile = File(path)
        var inputStream = FileInputStream(myFile);
        var byteArrayOutputStream = ByteArrayOutputStream();
        var i: Int;
        try {
            i = inputStream.read();
            while (i != -1) {
                byteArrayOutputStream.write(i);
                i = inputStream.read();
            }
            inputStream.close();
        } catch (e: IOException) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toString();
    }

    /*
       * share app
       * */
    fun shareApp(activity: Activity) {
        ShareCompat.IntentBuilder.from(activity)
            .setType("text/plain")
            .setChooserTitle("Download")
//            .setText("http://play.google.com/store/apps/details?id=" + activity.getPackageName())
            .setText("https://play.google.com/store/apps/details?id=com.mds.wcea&hl=en")
            .startChooser();
    }

    object RootUtil {
        val isDeviceRooted: Boolean
            get() = checkRootMethod1() || checkRootMethod2() || checkRootMethod3()

        private fun checkRootMethod1(): Boolean {
            val buildTags = android.os.Build.TAGS
            return buildTags != null && buildTags.contains("test-keys")
        }

        private fun checkRootMethod2(): Boolean {
            val paths = arrayOf(
                "/system/app/Superuser.apk",
                "/sbin/su",
                "/system/bin/su",
                "/system/xbin/su",
                "/data/local/xbin/su",
                "/data/local/bin/su",
                "/system/sd/xbin/su",
                "/system/bin/failsafe/su",
                "/data/local/su",
                "/su/bin/su"
            )
            for (path in paths) {
                if (File(path).exists()) return true
            }
            return false
        }

        private fun checkRootMethod3(): Boolean {
            var process: Process? = null
            try {
                process = Runtime.getRuntime().exec(arrayOf("/system/xbin/which", "su"))
                val `in` = BufferedReader(InputStreamReader(process!!.inputStream))
                return if (`in`.readLine() != null) true else false
            } catch (t: Throwable) {
                return false
            } finally {
                process?.destroy()
            }
        }
    }

}// no instance
