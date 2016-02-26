package com.servis.servis.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class QuicksandRegularTextView extends TextView {

    private static Typeface mTypeface;

    public QuicksandRegularTextView(final Context context) {
        this(context, null);
    }

    public QuicksandRegularTextView(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public QuicksandRegularTextView(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);

        if (mTypeface == null) {
            mTypeface = Typeface.createFromAsset(context.getAssets(), "fonts/Quicksand-Regular.otf");
        }
        setTypeface(mTypeface);
    }

}
