/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ben.spbendresourse;

import java.util.Date;

/**
 *
 * @author hussamelkurd
 */
public class ItemTransactionMainInfo {

    /**
     * vendor name
     */
    protected String vendor;
    /**
     * broker name
     */
    protected String broker;
    /**
     * the purchased item name
     */
    protected String itemName;
    /**
     * transaction id
     */
    protected String transactionID;
    /**
     * who buy the item
     */
    protected String user;
    /**
     * purchaseDate the date the item was purchased
     */
    protected Date purchaseDate = new Date();
    /**
     * Item Price in the Defined currency
     */
    protected int itemPriceInCurrency;
    /**
     * Broker profit percent from the purchased item
     */
    protected int brokerProfitPercent;
    /**
     * Item final price after discount the broker profit
     */
    protected int itemPriceDiscountBrokerProfit;    
    /**
     * the item purchase currency
     */
    protected String purchaseCurrency = "USD";

    /**
     * @return the vendor
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * @param vendor the vendor to set
     */
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * @return the broker
     */
    public String getBroker() {
        return broker;
    }

    /**
     * @param broker the broker to set
     */
    public void setBroker(String broker) {
        this.broker = broker;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the transactionID
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * @param transactionID the transactionID to set
     */
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    /**
     * @return the purchaseDate
     */
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * @param purchaseDate the purchaseDate to set
     */
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * @return the itemPriceInCurrency
     */
    public int getItemPriceInCurrency() {
        return itemPriceInCurrency;
    }

    /**
     * @param itemPriceInCurrency the itemPriceInCurrency to set
     */
    public void setItemPriceInCurrency(int itemPriceInCurrency) {
        this.itemPriceInCurrency = itemPriceInCurrency;
    }

    /**
     * @return the brokerProfitPercent
     */
    public int getBrokerProfitPercent() {
        return brokerProfitPercent;
    }

    /**
     * @param brokerProfitPercent the brokerProfitPercent to set
     */
    public void setBrokerProfitPercent(int brokerProfitPercent) {
        this.brokerProfitPercent = brokerProfitPercent;
    }

    /**
     * @return the purchaseCurrency
     */
    public String getPurchaseCurrency() {
        return purchaseCurrency;
    }

    /**
     * @param purchaseCurrency the purchaseCurrency to set
     */
    public void setPurchaseCurrency(String purchaseCurrency) {
        this.purchaseCurrency = purchaseCurrency;
    }

    /**
     * @return the itemPriceDiscountBrokerProfit
     */
    public int getItemPriceDiscountBrokerProfit() {
        return itemPriceDiscountBrokerProfit;
    }

    /**
     * @param itemPriceDiscountBrokerProfit the itemPriceDiscountBrokerProfit to set
     */
    public void setItemPriceDiscountBrokerProfit(int itemPriceDiscountBrokerProfit) {
        this.itemPriceDiscountBrokerProfit = itemPriceDiscountBrokerProfit;
    }

}
