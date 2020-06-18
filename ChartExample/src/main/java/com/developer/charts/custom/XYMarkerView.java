package com.developer.charts.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;

import com.github.abidfaiz.charting.components.MarkerView;
import com.github.abidfaiz.charting.data.Entry;
import com.github.abidfaiz.charting.formatter.ValueFormatter;
import com.github.abidfaiz.charting.highlight.Highlight;
import com.github.abidfaiz.charting.utils.MPPointF;
import com.developer.charts.R;

import java.text.DecimalFormat;

/**
 * Custom implementation of the MarkerView.
 *
 * @author Philipp Jahoda
 */
@SuppressLint("ViewConstructor")
public class XYMarkerView extends MarkerView {

    private final TextView tvContent;
    private final ValueFormatter xAxisValueFormatter;

    private final DecimalFormat format;

    public XYMarkerView(Context context, ValueFormatter xAxisValueFormatter) {
        super(context, R.layout.custom_marker_view);

        this.xAxisValueFormatter = xAxisValueFormatter;
        tvContent = findViewById(R.id.tvContent);
        format = new DecimalFormat("###.0");
    }

    // runs every time the MarkerView is redrawn, can be used to update the
    // content (user-interface)
    @Override
    public void refreshContent(Entry e, Highlight highlight) {

        tvContent.setText(String.format("x: %s, y: %s", xAxisValueFormatter.getFormattedValue(e.getX()), format.format(e.getY())));

        super.refreshContent(e, highlight);
    }

    @Override
    public MPPointF getOffset() {
        return new MPPointF(-(getWidth() / 2), -getHeight());
    }
}
