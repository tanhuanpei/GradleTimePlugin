# GradleTimePlugin
This a gradle plugin for showing how much time the project take to compile.

how to use
===========

In the project gradle file
```
buildscript {
    repositories {
        jcenter()

    }

    dependencies {
        classpath 'com.thp.plugin:gradletime:1.0.0'
    }
}

apply plugin: 'gradle.time'

```
when project compile will show like below.

```
Task spend time:
     11ms  :app:preBuild
      0ms  :app:preDebugBuild
      2ms  :app:checkDebugManifest
      0ms  :app:preReleaseBuild
     28ms  :app:prepareComAndroidSupportAnimatedVectorDrawable2600Alpha1Library
      2ms  :app:prepareComAndroidSupportAppcompatV72600Alpha1Library
      1ms  :app:prepareComAndroidSupportConstraintConstraintLayout102Library
      1ms  :app:prepareComAndroidSupportSupportCompat2600Alpha1Library
      1ms  :app:prepareComAndroidSupportSupportCoreUi2600Alpha1Library
      1ms  :app:prepareComAndroidSupportSupportCoreUtils2600Alpha1Library
      2ms  :app:prepareComAndroidSupportSupportFragment2600Alpha1Library
      3ms  :app:prepareComAndroidSupportSupportMediaCompat2600Alpha1Library
      2ms  :app:prepareComAndroidSupportSupportV42600Alpha1Library
      2ms  :app:prepareComAndroidSupportSupportVectorDrawable2600Alpha1Library
      1ms  :app:prepareDebugDependencies
     52ms  :app:compileDebugAidl
     11ms  :app:compileDebugRenderscript
     50ms  :app:generateDebugBuildConfig
      3ms  :app:generateDebugResValues
      1ms  :app:generateDebugResources
   1104ms  :app:mergeDebugResources
     98ms  :app:processDebugManifest
    424ms  :app:processDebugResources

```
so easy!

