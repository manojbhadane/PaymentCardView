
![enter image description here](https://raw.githubusercontent.com/manojbhadane/PaymentCardView/master/PaymentCardView.png)
# Payment Card View 
An easy-to-use, customizable, Payment card view for Android.

### Specs
[![API](https://img.shields.io/badge/API-15%2B-orange.svg?style=flat)](https://android-arsenal.com/api?level=15) [![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0) 
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Payment%20Card%20View-brightgreen.svg?style=plastic)](https://android-arsenal.com/details/1/7417)
[![Donate](https://img.shields.io/badge/Donate-PayPal-blue.svg)](https://paypal.me/manojbhadane)

# Download

This library is available in **jCenter** which is the default Maven repository used in Android Studio.

## Gradle 
**Step 1.** Add the JitPack repository to your build file
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
**Step 2.** Add the dependency
```gradle
dependencies {
     implementation 'com.github.manojbhadane:PaymentCardView:v1.2'
	}
```

# Usage
**XML**
```xml
<com.manojbhadane.PaymentCardView
            android:id="@+id/creditCard"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:cv_submitBtnText="Done"
            app:cv_cardTitle="Pay Now"></com.manojbhadane.PaymentCardView>
``` 

**Java**
```java
        //Init        
        PaymentCardView paymentCard = (PaymentCardView) findViewById(R.id.creditCard);

        //Callbacks
        paymentCard.setOnPaymentCardEventListener(new PaymentCardView.OnPaymentCardEventListener() {
            @Override
            public void onCardDetailsSubmit(String month, String year, String cardNumber, String cvv) {

            }

            @Override
            public void onError(String error) {
                Toast.makeText(SampleActivity.this, error, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelClick() {

            }
        });
```

# Customization

There are several customization options available which you can use to completely change the look-and-feel and functionality of this view to match your needs.

### XML (Quick and Easy)

You can add some attributes to the PaymentCardView from your XML layout.

```xml
  app:cv_submitBtnText="Done"                               // Change the submit button text
  app:cv_cardTitle="Pay Now"                                // Change the card title text
```

### JAVA (Programatically)

You can also programatically change the properties of the view, thereby having more control over it.

```java
paymentCard.setCardTitle("Pay Now"); 		    // Change the submit button text
paymentCard.setSubmitButtonText("Done"); 	    // Change the card title text
```

# About The Author

### Manoj Bhadane

Android & Backend Developer.


<a href="https://medium.com/@manojbhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/medium-icon.png?raw=true" width="60"></a>
<a href="https://stackoverflow.com/users/4034678/manoj-bhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/stackoverflow-icon.png?raw=true" width="60"></a>
<a href="https://twitter.com/Manoj_bhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/twitter-icon.png?raw=true" width="60"></a>
<a href="https://in.linkedin.com/in/manojbhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/linkedin-icon.png?raw=true" width="60"></a>

# License

```
Copyright 2017 manoj.bhadane

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```



