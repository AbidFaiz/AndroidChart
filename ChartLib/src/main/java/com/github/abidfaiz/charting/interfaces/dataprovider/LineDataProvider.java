package com.github.abidfaiz.charting.interfaces.dataprovider;

import com.github.abidfaiz.charting.components.YAxis;
import com.github.abidfaiz.charting.data.LineData;

public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    LineData getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
