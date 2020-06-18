package com.github.abidfaiz.charting.interfaces.dataprovider;

import com.github.abidfaiz.charting.components.YAxis.AxisDependency;
import com.github.abidfaiz.charting.data.BarLineScatterCandleBubbleData;
import com.github.abidfaiz.charting.utils.Transformer;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(AxisDependency axis);
    boolean isInverted(AxisDependency axis);
    
    float getLowestVisibleX();
    float getHighestVisibleX();

    BarLineScatterCandleBubbleData getData();
}
