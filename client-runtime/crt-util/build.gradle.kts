/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

description = "Utilities for working with AWS CRT Kotlin"
extra["displayName"] = "Software :: AWS :: Kotlin SDK :: CRT :: Util"
extra["moduleName"] = "software.aws.kotlinsdk.crt"

val smithyKotlinClientRtVersion: String by project
val crtKotlinVersion: String by project

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(project(":client-runtime:aws-client-rt"))
                api("software.amazon.awssdk.crt:aws-crt-kotlin:$crtKotlinVersion")
                api("software.aws.smithy.kotlin:http:$smithyKotlinClientRtVersion")
            }
        }
    }
}