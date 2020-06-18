package com.github.abidfaiz.charting.interfaces.dataprovider;

import com.github.abidfaiz.charting.data.CandleData;

public interface CandleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CandleData getCandleData();
}
