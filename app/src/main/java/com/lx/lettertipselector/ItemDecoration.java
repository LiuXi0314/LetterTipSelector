package com.lx.lettertipselector;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * 绘制间距和快速选择ui
 * Created on 18-1-23 下午5:00
 */

public class ItemDecoration extends RecyclerView.ItemDecoration {

    public ItemDecoration(int pd) {
        this.pd = pd;
    }

    private int pd;

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);
        c.drawColor(Color.parseColor("#e2e2e2"));
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = pd;

    }


}
