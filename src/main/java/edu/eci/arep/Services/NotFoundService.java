package edu.eci.arep.Services;

public class NotFoundService implements Service{
    public String getHeader(){
        return Service.HTML_HEADER;
    }
    public String getBody(){
        FileReader fileReader = new FileReader("/file/src/main/webapp/notFound.html");
        return fileReader.getBody();
    }

}
