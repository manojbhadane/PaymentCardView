
![enter image description here](https://raw.githubusercontent.com/manojbhadane/PaymentCardView/master/PaymentCardView.png)
# Payment Card View [![Tweet](https://img.shields.io/twitter/url/http/shields.io.svg?style=social)](https://twitter.com/intent/tweet?text=An%20easy%20to%20use,customizable,Payment%20card%20view%20for%20Android%20&url=https://github.com/manojbhadane/PaymentCardView)

An easy-to-use, customizable, Payment card view for Android.

### Specs
[![API](https://img.shields.io/badge/API-15%2B-orange.svg?style=flat)](https://android-arsenal.com/api?level=15) 
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Payment%20Card%20View-brightgreen.svg?style=plastic)](https://android-arsenal.com/details/1/7417)
[![Donate](https://img.shields.io/badge/Donate-PayPal-blue.svg)](https://paypal.me/manojbhadane)
<!---[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0) -->

# Download

This library is available in **jCenter** which is the default Maven repository used in Android Studio.

## Gradle 
**Step 1.** Add it in your root build.gradle at the end of repositories
![enter image description here](https://raw.githubusercontent.com/manojbhadane/PaymentCardView/master/appproject.png)

**Step 2.** Add the dependency in your apps module build.gradle
![enter image description here](https://raw.githubusercontent.com/manojbhadane/PaymentCardView/master/payment_dependacy.png)

### Spread Some :heart:
[![GitHub followers](https://img.shields.io/github/followers/manojbhadane.svg?style=social&label=Follow)](https://github.com/manojbhadane)  [![Twitter Follow](https://img.shields.io/twitter/follow/manojbhadane.svg?style=social)](https://twitter.com/Manoj_bhadane) 

# Usage
**XML**
```xml
<com.manojbhadane.PaymentCardView
            android:id="@+id/creditCard"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:cv_submitBtnText="Done"
            app:cv_cardTitle="Pay Now"/>
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

# Bugs or Requests

If you encounter any problems feel free to open an [issue](https://github.com/manojbhadane/PaymentCardView/issues/new?assignees=&labels=&template=bug_report.md). If you feel the library is missing a feature, please raise a [ticket](https://github.com/manojbhadane/PaymentCardView/issues/new?assignees=&labels=&template=feature_request.md) on GitHub and I'll look into it. Pull request are also welcome. 


# About The Author

### Manoj Bhadane

Android & Backend Developer.


<a href="https://medium.com/@manojbhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/medium-icon.png?raw=true" width="60"></a>
<a href="https://stackoverflow.com/users/4034678/manoj-bhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/stackoverflow-icon.png?raw=true" width="60"></a>
<a href="https://twitter.com/Manoj_bhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/twitter-icon.png?raw=true" width="60"></a>
<a href="https://in.linkedin.com/in/manojbhadane"><img src="https://github.com/manojbhadane/Social-Icons/blob/master/linkedin-icon.png?raw=true" width="60"></a>

# License

```
MIT License

Copyright (c) 2019 Manoj Bhadane

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```



