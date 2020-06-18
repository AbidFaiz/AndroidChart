package com.github.abidfaiz.charting.interfaces.dataprovider;

import com.github.abidfaiz.charting.data.BubbleData;

public interface BubbleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BubbleData getBubbleData();
}
