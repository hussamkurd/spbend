/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ben.spbendresourse;

/**
 *
 * @author hussamelkurd
 */
public class ItemTransactionBTCInfo extends ItemTransactionMainInfo {
    /**
     * Price in item bit coins 
     */
    protected int itemPriceInBTC;

    /**
     * bit coin to the defined currency Exchange rate
     */
    protected int BTCToCurrExRate;

    /**
     * @return the itemPriceInBTC
     */
    public int getItemPriceInBTC() {
        return itemPriceInBTC;
    }

    /**
     * @param itemPriceInBTC the itemPriceInBTC to set
     */
    public void setItemPriceInBTC(int itemPriceInBTC) {
        this.itemPriceInBTC = itemPriceInBTC;
    }

    /**
     * @return the BTCToCurrExRate
     */
    public int getBTCToCurrExRate() {
        return BTCToCurrExRate;
    }

    /**
     * @param BTCToCurrExRate the BTCToCurrExRate to set
     */
    public void setBTCToCurrExRate(int BTCToCurrExRate) {
        this.BTCToCurrExRate = BTCToCurrExRate;
    }


}
