# Android-More-Apps
Android Ads code that is required in every app of Vasundhara Infotech [Vasundhara Infotech LLP](https://vasundharainfotechllp.com)

###### latest_build_version [![](https://jitpack.io/v/vickypathak123/Android-More-Apps.svg)](https://jitpack.io/#vickypathak123/Android-More-Apps)

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

## Developed By
[Akshay Harsoda](https://github.com/AkshayHarsoda) - [akshayharsoda@gmail.com](https://mail.google.com/mail/u/0/?view=cm&fs=1&to=akshayharsoda@gmail.com&su=https://github.com/vickypathak123/Android-Ads-Helper&body=&bcc=akshayharsoda@gmail.com&tf=1)

  <a href="https://github.com/AkshayHarsoda" rel="nofollow">
  <img alt="Follow me on Google+" 
       height="50" width="50" 
       src="https://github.com/vickypathak123/Android-Ads-Helper/blob/master/social/github.png" 
       style="max-width:100%;">
  </a>

  <a href="" rel="nofollow">
  <img alt="Follow me on LinkedIn" 
       height="50" width="50" 
       src="https://github.com/vickypathak123/Android-Ads-Helper/blob/master/social/linkedin.png" 
       style="max-width:100%;">
  </a>

  <a href="" rel="nofollow">
  <img alt="Follow me on Facebook" 
       height="50" width="50"
       src="https://github.com/vickypathak123/Android-Ads-Helper/blob/master/social/twitter.png" 
       style="max-width:100%;">
  </a>

  <a href="" rel="nofollow">
  <img alt="Follow me on Facebook" 
       height="50" width="50" 
       src="https://github.com/vickypathak123/Android-Ads-Helper/blob/master/social/facebook.png" 
       style="max-width:100%;">
  </a>
