package Util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import Dominio.CepModel;

public class ConectandoApi {

	public static void main(String[] args) {
		ConectandoApi connect = new ConectandoApi();
		connect.doGeCep(16052901);
	}//aqui onde ocorre a coneção do sistema com a api melhor não auterar pode da rum

	public CepModel doGeCep(int codigo) {
		String result = null;
		CepModel cepModel = null;

		HttpClient httpClient = HttpClientBuilder.create().build();
		ObjectMapper mapper = new ObjectMapper();
		HttpGet httpGet = new HttpGet("http://viacep.com.br/ws/"+codigo+"/json");

		System.out.println("Executando a requisição " + httpGet.getRequestLine());

		try
		{
			HttpResponse response = httpClient.execute(httpGet);
			if(response != null)
			{
				HttpEntity resEntitty = response.getEntity();
				result = EntityUtils.toString(resEntitty);
				JSONObject obj = new JSONObject(result);
				cepModel = mapper.readValue(obj.toString(), CepModel.class);
			}
		} catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}


		return cepModel;
		
	}

	public CepModel doGetCepModel(int cep) {
		CepModel cepModel = null;
		
		return null;
	}

}
