/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http: *www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import androidx.build.LibraryGroups
import androidx.build.LibraryVersions
import androidx.build.dependencies.ESPRESSO_CORE_TMP
import androidx.build.dependencies.ESPRESSO_EXCLUDE
import androidx.build.dependencies.JUNIT
import androidx.build.dependencies.TEST_RUNNER_TMP

plugins {
    id("SupportAndroidLibraryPlugin")
}

dependencies {
    api(project(":annotation"))
    api(project(":core"))

    androidTestImplementation(JUNIT)
    androidTestImplementation(TEST_RUNNER_TMP, ESPRESSO_EXCLUDE)
    androidTestImplementation(ESPRESSO_CORE_TMP, ESPRESSO_EXCLUDE)
}

supportLibrary {
    name = "Android Support Content"
    publish = true
    mavenVersion = LibraryVersions.SUPPORT_LIBRARY
    mavenGroup = LibraryGroups.CONTENTPAGING
    inceptionYear = "2017"
    description = "Library providing support for paging across content exposed via a ContentProvider. Use of this library allows a client to avoid expensive interprocess \"cursor window swaps\" on the UI thread."
}