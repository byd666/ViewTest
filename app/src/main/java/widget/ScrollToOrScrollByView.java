package widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * @author：byd666 on 2018/1/9 16:21
 */

public class ScrollToOrScrollByView extends View{

    private int lastX;
    private int lastY;
    public ScrollToOrScrollByView(Context context) {
        super(context);
    }

    public ScrollToOrScrollByView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    /**
     * 触摸事件
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //触摸点的坐标
        int x= (int) event.getX();
        int y= (int) event.getY();
        switch (event.getAction()){
            case MotionEvent.ACTION_MOVE:
                //求得移动后的偏移量
                int offsetX=x-lastX;
                int offsetY=y-lastY;
                ((View)getParent()).scrollBy(-offsetX,-offsetY);
                break;
            case MotionEvent.ACTION_DOWN:
                //记录移动后的触摸点的坐标
                lastX=x;
                lastY=y;
                break;
            default:
                break;
        }
        return true;
    }
}
