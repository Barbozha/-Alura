package application;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) throws Exception {
		
		// FAZ A CONEXÃO COM O SERVIDOR IMDB
		String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json";
		URI endereco = URI.create(url);
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		String body = response.body();
		System.out.println(body);
		double classificacao = 0;
		int num;
		
		// EXTRAI OS DADOS QUE INTERESSAM (NOME DO FILME, CLASSIFICAÇÃO, DADOS DA IMAGEM DO FILME)
		JsonParser parser = new JsonParser();
		List<Map<String, String>> listaDeFilmes = parser.parse(body);
	
		
		// EXIBE OS DADOS ORIUNDO DA API DO IMDB 
		for (Map<String, String> filme : listaDeFilmes) {
			System.out.println("Título: "+filme.get("title"));
			System.out.println("Imagem de capa: "+filme.get("image"));
			System.out.println("Classificação: "+filme.get("imDbRating"));
			classificacao = Double.parseDouble(filme.get("imDbRating"));
			num = (int) classificacao;
			for(int i = 1; i <= num ; i++) {
				System.out.print("⭐");
			}
			System.out.println();
			System.out.println();
		}

	}

}
