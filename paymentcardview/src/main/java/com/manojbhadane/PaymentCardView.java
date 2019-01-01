package com.manojbhadane;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import com.manojbhadane.paymentcardview.R;

public class PaymentCardView extends RelativeLayout {

    private static final char space = ' ';

    private Button mBtnSubmit;
    private TextView mTxtCardTitle;
    private EditText mEdtCardNumber, mEdtCvv;
    private EditText mSpinnerMonth, mSpinnerYear;
    private OnPaymentCardEventListener mListener;

    private Typeface RegularTypeFace;

    public PaymentCardView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater mInflater = LayoutInflater.from(context);
        View mView = mInflater.inflate(R.layout.card_view, this, true);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.PaymentCardView);
        String cardTitle = a.getString(R.styleable.PaymentCardView_cv_cardTitle);
        String submitBtnText = a.getString(R.styleable.PaymentCardView_cv_submitBtnText);
        a.recycle();

        RegularTypeFace = Typeface.createFromAsset(context.getAssets(), "Montserrat-Regular.ttf");

        mBtnSubmit = mView.findViewById(R.id.btnDone);
        mSpinnerYear = mView.findViewById(R.id.spryear);
        mSpinnerMonth = mView.findViewById(R.id.sprmonth);
        mEdtCvv = mView.findViewById(R.id.edtCvvNumber);
        mTxtCardTitle = mView.findViewById(R.id.txtCardTitle);
        mEdtCardNumber = mView.findViewById(R.id.edtCardNumber);
        ImageView mImgCancel = mView.findViewById(R.id.iconCancel);


        mBtnSubmit.setTypeface(RegularTypeFace);
        mSpinnerYear.setTypeface(RegularTypeFace);
        mSpinnerMonth.setTypeface(RegularTypeFace);
        mEdtCardNumber.setTypeface(RegularTypeFace);
        ((TextView) mView.findViewById(R.id.txtCardTitle)).setTypeface(RegularTypeFace);
        ((EditText) mView.findViewById(R.id.edtCvvNumber)).setTypeface(RegularTypeFace);

        setCardTitle(cardTitle);
        setSubmitButtonText(submitBtnText);

        mEdtCardNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0 && (s.length() % 5) == 0) {
                    final char c = s.charAt(s.length() - 1);
                    if (space == c) {
                        s.delete(s.length() - 1, s.length());
                    }
                }
                if (s.length() > 0 && (s.length() % 5) == 0) {
                    char c = s.charAt(s.length() - 1);
                    if (Character.isDigit(c) && TextUtils.split(s.toString(), String.valueOf(space)).length <= 3) {
                        s.insert(s.length() - 1, String.valueOf(space));
                    }
                }
            }
        });

        mSpinnerMonth.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                String strEnteredVal = s.toString();

                if (!strEnteredVal.equals("")) {
                    int num = Integer.parseInt(strEnteredVal);
                    if (num > 13) {
                        s.delete(s.length() - 1, s.length());
                    }
                }
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });


        mImgCancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mListener != null)
                    mListener.onCancelClick();
            }
        });

        mBtnSubmit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mSpinnerMonth.getText().length() > 0) {
                    if (mSpinnerYear.getText().length() > 0) {
                        if (mEdtCardNumber.getText().length() == 19) {
                            if (mEdtCvv.getText().length() == 3) {
                                if (mListener != null)
                                    mListener.onCardDetailsSubmit(mSpinnerMonth.getText().toString(), mSpinnerYear.getText().toString(), mEdtCardNumber.getText().toString(), mEdtCvv.getText().toString());
                            } else {
                                if (mListener != null)
                                    mListener.onError("Enter valid CVV");
                            }
                        } else {
                            if (mListener != null)
                                mListener.onError("Enter valid card number");
                        }
                    } else {
                        if (mListener != null)
                            mListener.onError("Enter valid year");
                    }
                } else {
                    if (mListener != null)
                        mListener.onError("Enter valid month");
                }
            }
        });
    }

    public void setCardTitle(String cardTitle) {
        if (cardTitle != null && cardTitle.length() == 0)
            mTxtCardTitle.setVisibility(GONE);
        mTxtCardTitle.setText(cardTitle);
    }

    public void setSubmitButtonText(String submitButtonText) {
        if (submitButtonText == null)
            mBtnSubmit.setText("Done");
        else if (submitButtonText.length() == 0) {
            mBtnSubmit.setText("Done");
        } else {
            mBtnSubmit.setText(submitButtonText);
        }
    }


    public void setOnPaymentCardEventListener(OnPaymentCardEventListener listener) {
        mListener = listener;
    }

    public interface OnPaymentCardEventListener {
        void onCardDetailsSubmit(String month, String year, String cardNumber, String cvv);

        void onError(String error);

        void onCancelClick();
    }
}
