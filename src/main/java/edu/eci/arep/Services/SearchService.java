package edu.eci.arep.Services;

public class SearchService implements Service{


    public String getBody(){
        FileReader fileReader = new FileReader("/file/src/main/webapp/search.html");
        return fileReader.getBody();
    }

    public String getHeader(){
        return Service.HTML_HEADER;
    }


}
