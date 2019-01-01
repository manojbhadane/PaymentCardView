package com.manojbhadane.paymentcardview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by manoj.bhadane on 31/12/18.
 */
public class CustomTextView extends AppCompatTextView {

    private Typeface RegularTypeFace;

    public CustomTextView(Context context) {
        super(context);
        RegularTypeFace = Typeface.createFromAsset(context.getAssets(), "Montserrat-Regular.ttf");
        setTypeface(RegularTypeFace);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        RegularTypeFace = Typeface.createFromAsset(context.getAssets(), "Montserrat-Regular.ttf");
        setTypeface(RegularTypeFace);

    }
}
