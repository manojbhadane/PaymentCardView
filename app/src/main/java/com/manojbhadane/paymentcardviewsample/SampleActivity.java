package com.manojbhadane.paymentcardviewsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.manojbhadane.paymentcardview.PaymentCardView;

/**
 * Created by manoj.bhadane on 01/01/19.
 */
public class SampleActivity extends AppCompatActivity {

    private PaymentCardView mPaymentCard;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPaymentCard = (PaymentCardView) findViewById(R.id.card);

        mPaymentCard.setOnPaymentCardEventListener(new PaymentCardView.OnPaymentCardEventListener() {
            @Override
            public void onCardDetailsSubmit(String month, String year, String cardNumber, String cvv) {
                Toast.makeText(SampleActivity.this, "Card details submitted", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(String error) {
                Toast.makeText(SampleActivity.this, error, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelClick() {
                mPaymentCard.setVisibility(View.GONE);
            }
        });

    }
}
