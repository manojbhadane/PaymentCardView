
# Payment Card View 
![enter image description here](https://raw.githubusercontent.com/manojbhadane/PaymentCardView/master/PaymentCardView.png)


[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Payment%20Card%20View-brightgreen.svg?style=plastic)](https://android-arsenal.com/details/1/7417)
[![](https://jitpack.io/v/manojbhadane/PaymentCardView.svg)](https://jitpack.io/#manojbhadane/PaymentCardView)
# Gradle
**Step 1.** Add the JitPack repository to your build file
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
**Step 2.** Add the dependency
```
dependencies {
     implementation 'com.github.manojbhadane:PaymentCardView:v1.2'
	}
```

## Maven
**Step 1.** Add the JitPack repository to your build file
```markup
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
**Step 2.** Add the dependency
```markup
<dependency>
	    <groupId>com.github.manojbhadane</groupId>
	    <artifactId>PaymentCardView</artifactId>
	    <version>-Tag</version>
</dependency>
```

## Usage
**XML**
```markup
<com.manojbhadane.PaymentCardView
            android:id="@+id/creditCard"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:cv_submitBtnText="Done"
            app:cv_cardTitle="Pay Now"></com.manojbhadane.PaymentCardView>
``` 

**Java**
```
        //Init        
        PaymentCardView paymentCard = (PaymentCardView) findViewById(R.id.creditCard);

        
        //Options
        paymentCard.setCardTitle("Pay Now"); // can set from xml as well
        paymentCard.setSubmitButtonText("Done"); // can set from xml as well


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

