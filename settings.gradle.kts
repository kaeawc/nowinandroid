/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

pluginManagement {
    includeBuild("build-logic")
    repositories {
        mavenLocal()
        google()
        mavenCentral()
        gradlePluginPortal()

        // Pre-release artifacts of compose-compiler, used to test with future Kotlin versions
        // https://androidx.dev/storage/compose-compiler/repository
        maven("https://androidx.dev/storage/compose-compiler/repository/") {
          name = "compose-compiler"
          content {
            // this repository *only* contains compose-compiler artifacts
            includeGroup("androidx.compose.compiler")
          }
        }

        // JB Compose Repo
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev") { name = "Compose-JB" }
        
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap") { name = "Kotlin-Bootstrap" }
    }
}

dependencyResolutionManagement {
    repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS
    repositories {
        mavenLocal()
        google()
        mavenCentral()

        // Pre-release artifacts of compose-compiler, used to test with future Kotlin versions
        // https://androidx.dev/storage/compose-compiler/repository
        maven("https://androidx.dev/storage/compose-compiler/repository/") {
          name = "compose-compiler"
          content {
            // this repository *only* contains compose-compiler artifacts
            includeGroup("androidx.compose.compiler")
          }
        }

        // JB Compose Repo
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev") { name = "Compose-JB" }

        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap") { name = "Kotlin-Bootstrap" }

    }
}
rootProject.name = "nowinandroid"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")
include(":app-nia-catalog")
include(":benchmarks")
include(":core:analytics")
include(":core:common")
include(":core:data")
include(":core:data-test")
include(":core:database")
include(":core:datastore")
include(":core:datastore-proto")
include(":core:datastore-test")
include(":core:designsystem")
include(":core:domain")
include(":core:model")
include(":core:network")
include(":core:notifications")
include(":core:screenshot-testing")
include(":core:testing")
include(":core:ui")

include(":feature:foryou")
include(":feature:interests")
include(":feature:bookmarks")
include(":feature:topic")
include(":feature:search")
include(":feature:settings")
include(":lint")
include(":sync:work")
include(":sync:sync-test")
include(":ui-test-hilt-manifest")
