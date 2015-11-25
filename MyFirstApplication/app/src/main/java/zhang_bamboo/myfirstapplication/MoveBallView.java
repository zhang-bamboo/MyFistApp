package zhang_bamboo.myfirstapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by zhang on 2015/11/25.
 */
public class MoveBallView extends View{

    private float currentX;
    private float currentY;
    public  MoveBallView(Context context){
        super(context);
        currentX=0;
        currentY=0;
        setMinimumWidth(300);
        setMinimumHeight(500);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setColor(Color.RED);
        canvas.drawCircle(currentX,currentY,15,paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        currentX=event.getX();
        currentY=event.getY();
        invalidate();
        return super.onTouchEvent(event);
    }
}
