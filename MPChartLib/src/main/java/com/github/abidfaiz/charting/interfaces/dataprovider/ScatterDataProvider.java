package com.github.abidfaiz.charting.interfaces.dataprovider;

import com.github.abidfaiz.charting.data.ScatterData;

public interface ScatterDataProvider extends BarLineScatterCandleBubbleDataProvider {

    ScatterData getScatterData();
}
