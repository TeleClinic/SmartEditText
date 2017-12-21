# SmartEditText [![](https://jitpack.io/v/TeleClinic/SmartEditText.svg)](https://jitpack.io/#TeleClinic/SmartEditText)
A Smart Material Design EditText for Android that includes validations for most common cases as well as hints and error messages

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        compile 'com.github.TeleClinic:SmartEditText:0.1.0'
	}


To use:

<com.teleclinic.kabdo.smartmaterialedittext.CustomViews.SmartEditText
        android:id="@+id/emailSmartEditText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

Attributes:

setLabel string 
setTextColor reference 
setMandatory boolean 
setMandatoryErrorMsg string 
setRegexType enum:
    EMAIL_VALIDATION  
    MEDIUM_PASSWORD_VALIDATION  
    COMPLEX_PASSWORD_VALIDATION 
    PHONE_NUMBER_VALIDATION  
    NAME_VALIDATION
setRegexString string 
setRegexErrorMsg string 
setPasswordField boolean 


Examples:

    <com.teleclinic.kabdo.smartmaterialedittext.CustomViews.SmartEditText
        android:id="@+id/emailSmartEditText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:setLabel="Email"
        app:setMandatoryErrorMsg="Mandatory field"
        app:setRegexErrorMsg="Wrong email format"
        app:setRegexType="EMAIL_VALIDATION" />

    <com.teleclinic.kabdo.smartmaterialedittext.CustomViews.SmartEditText
        android:id="@+id/passwordSmartEditText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:setLabel="Password"
        app:setMandatoryErrorMsg="Mandatory field"
        app:setPasswordField="true"
        app:setRegexErrorMsg="Weak password"
        app:setRegexType="MEDIUM_PASSWORD_VALIDATION" />

    <com.teleclinic.kabdo.smartmaterialedittext.CustomViews.SmartEditText
        android:id="@+id/ageSmartEditText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:setLabel="Age"
        app:setMandatoryErrorMsg="Mandatory field"
        app:setRegexErrorMsg="Weak password"
        app:setRegexString=".*\\d.*" />



