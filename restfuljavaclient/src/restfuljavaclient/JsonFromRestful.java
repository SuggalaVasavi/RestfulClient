package restfuljavaclient;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/customers")
public class JsonFromRestful {
@GET
@Path("/{cusNo}")
@Produces("application/json")
public Customer produceCustomerDetailsinJSON(@PathParam("cusNo") int no) {
Customer cust = new Customer();
cust .setCustNo(no);
cust .setCustName("Vasavi");
cust .setCustCountry("India");
return cust;
}
}