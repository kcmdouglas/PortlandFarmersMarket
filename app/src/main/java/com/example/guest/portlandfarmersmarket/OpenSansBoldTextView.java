package com.example.guest.portlandfarmersmarket;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Guest on 3/17/16.
 */
public class OpenSansBoldTextView extends TextView {
    public OpenSansBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-ExtraBold.ttf"));
    }
}