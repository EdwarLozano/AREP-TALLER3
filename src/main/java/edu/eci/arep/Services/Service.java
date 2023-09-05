package edu.eci.arep.Services;

public interface Service {
    public static final String HTML_HEADER = "HTTP/1.1 200 OK\r\n"
            + "Access-Control-Allow-Origin: *\r\n"
            + "Content-Type:text/html \r\n"
            + "\r\n";

    /**
     * Retorna el header de una petición HTTP
     * @return Encabezado del HTTP
     */
    public String getHeader();

    /**
     * Retorna el body de una petición HTTP
     * @return Cuerpo de la petición HTTP
     */
    public String getBody();
}