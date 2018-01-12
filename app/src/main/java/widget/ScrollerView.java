package widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;


/**
 * @author：byd666 on 2018/1/9 16:21
 */

public class ScrollerView extends android.support.v7.widget.AppCompatTextView implements View.OnTouchListener {

    private Context context;
    private Scroller scroller;
    public ScrollerView(Context context) {
        super(context);
        initData(context);
    }
    public ScrollerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initData(context);
    }
    /**
     * 初始化数据
     * @param context
     */
    private void initData(Context context) {
        this.context=context;
        this.setOnTouchListener(this);
        scroller=new Scroller(context);
    }
    private void smoothScrollTo(int dx,int dy){
        //获取开始滑动时的坐标
        int sX=this.getScrollX();
        int sY=this.getScrollY();
        //将参数保存到Scroller中
        //dx-sX，dy-sY是横纵坐标滑动的距离，1000为整个滑动过程为1000毫秒，
        scroller.startScroll(sX,sY,dx-sX,dy-sY,1000);
        invalidate();
    }

    @Override
    public void computeScroll() {
        //判断滑动是否结束
        if(scroller.computeScrollOffset()){
           //getCurrX()返回当前的X轴偏移量，值等于当前View位置的左边界减去View内容的左边界。可以理解为View 中的mScrollX。
            //getCurrY()值等于View位置的上边界减去view内容的上边界。类似于View中的mScrollY.
            this.scrollTo(scroller.getCurrX(),scroller.getCurrY());
            postInvalidate();
        }
    }
    /**
     * 触摸事件
     */
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_MOVE:
                smoothScrollTo(-(int)event.getX(),-(int)event.getY());
                break;
            case MotionEvent.ACTION_DOWN:
                smoothScrollTo(-(int)event.getX(),-(int)event.getY());
                break;
            default:
                break;
        }
        return true;
    }
}
