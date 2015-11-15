/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ben.spbendresourse;
import com.mongodb.MongoClient;
import org.bson.Document;
import com.mongodb.Block;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Sorts.ascending;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import static java.util.Arrays.asList;
import java.util.Locale;

/**
 *
 * @author Hussam
 */
public class Database {
    public MongoDatabase db;
    public Database(){
            //connect to the database on construct
            MongoClient mongoClient = new MongoClient();      
            db = mongoClient.getDatabase("spbendLogDb");
    }
    
    public void insertTransactionMainInfo(ItemTransactionMainInfo TR){
        //DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
        db.getCollection("Transactions").insertOne(
        new Document("Transaction",
                new Document()
                        .append("Vendor", TR.getVendor())
                        .append("Broker", TR.getBroker())
                        .append("User", TR.getUser())
                        .append("Item", TR.getItemName())
                        .append("TransactionID", TR.getTransactionID())
                        .append("PurchaseDate", TR.getPurchaseDate())
                        .append("Currency", TR.getPurchaseCurrency())
                        .append("BrokerProfitPercent", TR.getBrokerProfitPercent())
                        .append("Price", TR.getItemPriceInCurrency())                
                    ));
                        /*
                        .append("coord", asList(-73.9557413, 40.7720266)))
                .append("borough", "Manhattan")
                .append("cuisine", "Italian")
                .append("grades", asList(
                        new Document()
                                .append("date", format.parse("2014-10-01T00:00:00Z"))
                                .append("grade", "A")
                                .append("score", 11),
                        new Document()
                                .append("date", format.parse("2014-01-16T00:00:00Z"))
                                .append("grade", "B")
                                .append("score", 17)))
                .append("name", "Vella")
                .append("restaurant_id", "41704620"));*/
    }
    /*
    public void getTransactionByVendorName() throws FileNotFoundException{
        final PrintWriter out = new PrintWriter("D:\\hussam.txt");
        FindIterable<Document> iterable = db.getCollection("Transactions").find(
        new Document("Vendor", "hussam"));
        iterable.forEach(new Block<Document>() {
           @Override
           public void apply(final Document document) {
               //System.out.println(document);
               out.println(document);
           }
       });               
    }
    */
}
