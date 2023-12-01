package collection;

import java.util.*;

public interface KeyAnalyzer {
    public void storeKeywords(String key);

    public List getAllKeywords();

//    public Map<String,Integer> getFrequency(); //If i Do this then i will have to implement this method in all the class that implemnts this interface

//    default Map<String,Integer> getFrequency(){
//        return null;
//    }



    default Map<String,Keyword> getFrequency(){
        return null;
    }

    default List<String> getTopFiveData(){
        return null;
    }
}
