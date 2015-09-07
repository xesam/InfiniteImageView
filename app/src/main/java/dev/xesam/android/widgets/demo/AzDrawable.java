package dev.xesam.android.widgets.demo;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/**
 * Created by xesamguo@gmail.com on 15-9-7.
 */
public class AzDrawable extends Drawable {

    Paint paint = new Paint();

    public AzDrawable() {
        paint.setTextSize(50);
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
    }

    @Override
    public void draw(Canvas canvas) {
        char start = 'A';
        char end = 'Z';

        for (char i = start; i < end; i++) {
            canvas.drawText(String.valueOf(i), getBounds().left + 50 * (i - start), 50, paint);
        }
    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public int getIntrinsicWidth() {
        return 26 * 50;
    }

    @Override
    public int getIntrinsicHeight() {
        return 100;
    }
}
