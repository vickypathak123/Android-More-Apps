# Android-More-Apps
Android Ads code that is required in every app of Vasundhara Infotech [Vasundhara Infotech LLP](https://vasundharainfotechllp.com)

[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![latest_build_version](https://jitpack.io/v/vickypathak123/Android-More-Apps.svg)](https://jitpack.io/#vickypathak123/Android-More-Apps)

## Using `build.gradle`
###### Step 1. Add the JitPack repository to your project's `build.gradle`
```groovy
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

###### Step 2. Add the dependency to your module's `build.gradle`
```groovy
	dependencies {
	        implementation 'com.github.vickypathak123:Android-More-Apps:latest_build_version'
	}
```

## How To Use this Library

###### Open More-App Activity
```kotlin
        // All Ad-Ids are Optional
        MoreApps.with(mActivity)
            .setAppPackageName("YOUR_PROJECT_PACKAGE_NAME")
            .setShareMessage("YOUR_APP_SHARE_MESSAGE")
            .setTextColor(Color.BLUE)
            .setThemeColor(Color.RED)
            .setShareIcon(R.drawable.ic_share_blue) // Optional
            .setBackIcon(R.drawable.ic_new_header_back) // Optional
            .launch()
```

###### More-Apps View
```xml
        <com.example.app.appcenter.widgets.TopsMoreAppsView
            android:id="@+id/moreAppView"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            app:app_package_name="YOUR_PROJECT_PACKAGE_NAME"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:text_gravity="CENTER"
            app:theme_color="@color/colorAccent"
            app:title_text="YOUR_VIEW_TITLE_TEXT"/>
```

###### More-Apps View Attribute:

	app_package_name = "YOUR_PROJECT_PACKAGE_NAME"
	text_gravity = "LEFT || CENTER || RIGHT"
	title_text = "YOUR_VIEW_TITLE_TEXT" // Optional

#### More-Apps View
<img src="https://github.com/vickypathak123/Android-More-Apps/blob/master/screenshots/1.png" height="auto" width="600"/>

### ⭐️ If you liked it support me with your stars!
