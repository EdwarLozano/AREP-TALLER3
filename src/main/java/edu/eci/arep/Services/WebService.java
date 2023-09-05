package edu.eci.arep.Services;

public class WebService implements Service{


    public String getHeader(){
        return Service.HTML_HEADER;
    }

    public String getBody(){
        FileReader fileReader = new FileReader("/file/src/main/webapp/index.html");
        return fileReader.getBody();
    }
}
