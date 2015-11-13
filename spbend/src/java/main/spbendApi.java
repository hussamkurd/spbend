/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
@Path("api")
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
     *
     * @param ItemTransactionMainInfo representation all the transaction info
     * @return ItemTransactionMainInfo in json to be rendered on high chart
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public ItemTransactionMainInfo postJson(ItemTransactionMainInfo TR) {

        //TODO log the information
        return TR;

    }

    /**
     * Retrieves representation of an instance of main.spbendApi
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of spbendApi
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public void putJson(ItemTransactionMainInfo ItemTRInfo) {
        
    }
}
