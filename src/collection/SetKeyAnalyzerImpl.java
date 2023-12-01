package collection;

import java.util.*;

public class SetKeyAnalyzerImpl implements KeyAnalyzer{

    Set<String> hashset;


    public SetKeyAnalyzerImpl() {
//        hashset = new HashSet<>();
//        hashset = new LinkedHashSet<>();
        hashset = new TreeSet<>();
    }

    @Override
    public void storeKeywords(String key) {
       hashset.add(key);
    }

    @Override
    public List getAllKeywords() {
       List<String> list = new ArrayList<>();
       list.addAll(hashset);
        return list;
    }


}
