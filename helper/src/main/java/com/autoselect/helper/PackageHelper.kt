package com.autoselect.helper

import android.content.Context
import android.content.pm.PackageInfo

object PackageHelper {
    fun isExistPackageName(context: Context, packageName: String): Boolean =
        mutableListOf<String>().apply {
            getInstalledPackageInfo(context)?.let { packageInfoList ->
                for (packageInfo in packageInfoList) {
                    add(packageInfo.packageName)
                }
            }
        }.contains(packageName)

    fun getInstalledPackageInfo(context: Context): MutableList<PackageInfo>? =
        context.packageManager.getInstalledPackages(0)
}