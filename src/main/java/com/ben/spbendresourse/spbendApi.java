/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ben.spbendresourse;

import java.io.FileNotFoundException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;

/**
 * REST Web Service
 *
 * @author hussamelkurd
 */
@Path("transactions")
public class spbendApi {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of spbendApi
     */
    public spbendApi() {
    }

    /**
     * Post render amount in USD on highchart candelsticks at current rates
     * minus percent taken as profit and include main transaction info. Further
     * it log the information for the transaction
     * @param ItemTransactionMainInfo representation all the transaction info
     * @return ItemTransactionMainInfo in json to be rendered on high chart
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public ItemTransactionMainInfo postJson(ItemTransactionMainInfo TR){
        //log the information
        /*
        Database db = new Database();
        db.insertTransactionMainInfo(TR);
        */
        return TR;

    }
    /*
    @GET
    @Produces("application/json")

    public String getJson() throws FileNotFoundException {
        String test = "";
        //TODO log the information
        MongoClient mongoClient = new MongoClient();      
        MongoDatabase db = mongoClient.getDatabase("test");
        final PrintWriter out = new PrintWriter("D:\\filename.txt");
        FindIterable<Document> iterable = db.getCollection("restaurants").find(
        new Document("borough", "Manhattan"));
        iterable.forEach(new Block<Document>() {
           @Override
           public void apply(final Document document) {
               System.out.println(document);
               out.println(document);
           }
       });       
        return null;
    }
    /**
     * PUT receive amount equal to price at current rates. 
     * render amount in BTC on highchart candlesticks and include Transaction info
     * Further it log the information for the transaction in BTC info and call POST request 
     * @param ItemTransactionMainInfo representation all the transaction info
     * @return ItemTransactionBTCInfo contain the BTC info
     */
    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public ItemTransactionBTCInfo putJson(ItemTransactionMainInfo ItemTRInfo) {
        //convert the transaction price for currenct into BTC
        //log the information 
        ItemTransactionBTCInfo ItemBTCInfo= new ItemTransactionBTCInfo();
        
        return ItemBTCInfo;
    }
}
