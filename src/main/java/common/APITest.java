package common;


import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import com.gargoylesoftware.htmlunit.javascript.host.fetch.Response;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class APITest {
	
	@Test
	public void AccountUpdate() throws JSONException{

		   Client client = Client.create();

		   
		   
		   WebResource resource = client.resource("https://ni-capi-si-api.cloud-newsint.co.uk/session/tnl");
		   
		   JSONObject postbody = new JSONObject();
		   postbody.put("promoCode","Test_Mp110");

		   ClientResponse response = resource.post(ClientResponse.class);

		   System.out.println(response.getEntity(String.class));



		}
	
	@Test
	
	public void getCampaign(){
		
		try{
	
		Client client = Client.create();
		
		String tenant = "TNL";
		
		WebResource resource = client.resource("https://ni-capi-si-api.cloud-newsint.co.uk/campaign/"+tenant);
		
		ClientResponse response = resource.accept("application/json").get(ClientResponse.class);
		
		if(response.getStatus()!=200) {
			
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}
		
		String output = response.getEntity(String.class);

		System.out.println("Output from Server .... \n");
		System.out.println(output);
		
		}catch (Exception e) {

			e.printStackTrace();

		  }
	}
	

}
