package br.com.meusite.controller;

import com.seuprojeto.model.PixTransaction;
import com.seuprojeto.service.PixTransactionService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/pix-transactions")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PixTransactionController {

    @Inject
    PixTransactionService pixTransactionService;

    @POST
    public Response createTransaction(PixTransaction transaction) {
        PixTransaction createdTransaction = pixTransactionService.createPixTransaction(transaction);
        return Response.ok(createdTransaction).build();
    }

    @GET
    @Path("/{id}")
    public Response getTransaction(@PathParam("id") Long id) {
        PixTransaction transaction = pixTransactionService.findPixTransactionById(id);
        if (transaction == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(transaction).build();
    }

    @GET
    public Response getAllTransactions() {
        List<PixTransaction> transactions = pixTransactionService.listAllPixTransactions();
        return Response.ok(transactions).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateTransaction(@PathParam("id") Long id, PixTransaction transaction) {
        PixTransaction updatedTransaction = pixTransactionService.updatePixTransaction(id, transaction);
        return Response.ok(updatedTransaction).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteTransaction(@PathParam("id") Long id) {
        pixTransactionService.deletePixTransaction(id);
        return Response.noContent().build();
    }

    public Response generateQrCode(PixTransaction transaction) {
    String qrCode = pixTransactionService.generateQrCode(transaction);
    return Response.ok(qrCode).build();
}

}

