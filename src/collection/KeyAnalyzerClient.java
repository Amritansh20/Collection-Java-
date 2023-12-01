package collection;

public class KeyAnalyzerClient {
    public static void main(String[] args) {
        KeyAnalyzer keyAnalyzer = new MapKeyAnalyzerImpl();
        keyAnalyzer.storeKeywords("bottle");
        keyAnalyzer.storeKeywords("shirt");
        keyAnalyzer.storeKeywords("earpods");
        keyAnalyzer.storeKeywords("key");
        keyAnalyzer.storeKeywords("chain");
        keyAnalyzer.storeKeywords("pen");
        keyAnalyzer.storeKeywords("laptop");
        keyAnalyzer.storeKeywords("notebook");
        keyAnalyzer.storeKeywords("notebook");

        System.out.println(keyAnalyzer.getFrequency());
      System.out.println(keyAnalyzer.getTopFiveData());
//       System.out.println(keyAnalyzer.getAllKeywords());


    }
}
