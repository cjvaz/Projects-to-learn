package br.com.alura.loja;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Servidor {

	public static void main(String[] args) {
		HttpServer server = inicializaServidor();
        System.out.println("Servidor rodando");
        try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
        server.stop();
    }

	public static HttpServer inicializaServidor() {
		ResourceConfig config = new ResourceConfig().packages("br.com.alura.loja");
        URI uri = URI.create("http://localhost:8080/");
        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, config);
		return server;
	}
}
