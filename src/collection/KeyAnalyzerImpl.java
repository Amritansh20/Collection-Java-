package collection;

//import java.util.ArrayList;
import java.util.*;

public class KeyAnalyzerImpl implements KeyAnalyzer {

    List<String> list;


    public KeyAnalyzerImpl() {
        list = new ArrayList<>();
    }

    @Override
    public void storeKeywords(String key) {
        list.add(key);
    }

    @Override
    public List getAllKeywords() {
        return list;
    }


}
