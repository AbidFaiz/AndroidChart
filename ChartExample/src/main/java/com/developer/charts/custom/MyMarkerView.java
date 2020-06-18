
package com.developer.charts.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;

import com.github.abidfaiz.charting.components.MarkerView;
import com.github.abidfaiz.charting.data.CandleEntry;
import com.github.abidfaiz.charting.data.Entry;
import com.github.abidfaiz.charting.highlight.Highlight;
import com.github.abidfaiz.charting.utils.MPPointF;
import com.github.abidfaiz.charting.utils.Utils;
import com.developer.charts.R;

/**
 * Custom implementation of the MarkerView.
 *
 * @author Philipp Jahoda
 */
@SuppressLint("ViewConstructor")
public class MyMarkerView extends MarkerView {

    private final TextView tvContent;

    public MyMarkerView(Context context, int layoutResource) {
        super(context, layoutResource);

        tvContent = findViewById(R.id.tvContent);
    }

    // runs every time the MarkerView is redrawn, can be used to update the
    // content (user-interface)
    @Override
    public void refreshContent(Entry e, Highlight highlight) {

        if (e instanceof CandleEntry) {

            CandleEntry ce = (CandleEntry) e;

            tvContent.setText(Utils.formatNumber(ce.getHigh(), 0, true));
        } else {

            tvContent.setText(Utils.formatNumber(e.getY(), 0, true));
        }

        super.refreshContent(e, highlight);
    }

    @Override
    public MPPointF getOffset() {
        return new MPPointF(-(getWidth() / 2), -getHeight());
    }
}
