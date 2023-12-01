package collection;
import java.util.*;

public class MapKeyAnalyzerImpl implements KeyAnalyzer{


    Map<String,Keyword> mpp;
    List<String> list;
    Queue<Keyword> queue;

    public MapKeyAnalyzerImpl(){
//    mpp = new HashMap<>();
//      mpp = new LinkedHashMap<>();
      mpp= new TreeMap<>();


//        queue= new PriorityQueue<>(new Comparator<Keyword>() { // this is only for one object
//            @Override
//            public int compare(Keyword o1, Keyword o2) {
//              if(o1.getCount()>o2.getCount()){
//                  return 1;
//              }else if(o1.getCount() < o2.getCount()){
//                  return -1;
//              }else{
//                  return 0;
//              }
//            }
//        });

        queue = new PriorityQueue<>(); //compareTo invoke ho jayega
    }


    @Override
    public void storeKeywords(String key) {
//        Keyword keyword = new Keyword();
//        keyword.setKey(key);

        int count=1;
        if(mpp.containsKey(key)){
            Keyword keyword = mpp.get(key);
            queue.remove(keyword);
            count = mpp.get(key).getCount()+1; // count = keyword.getCount() both same
            keyword.setCount(count);
            mpp.put(key,keyword);
            queue.add(keyword);
        }else{
            Keyword keyword = new Keyword(key,count);
            mpp.put(key,keyword);
            queue.add(keyword);

        }
    }

    @Override
    public List<String> getTopFiveData(){
    List<String> list = new ArrayList<>();
    for(int i=0;i<=4;i++){
        list.add(queue.poll().getKey());
    }
    return list;
    }

//    @Override
//   public Map<String, Integer> getFrequency() {
//       return mpp;
//   }
//
//   public List getAllKeywords(){
//       return list ;
//  }


    @Override
    public Map<String, Keyword> getFrequency() {
        return mpp;
    }

    public List getAllKeywords(){
        return list ;
    }




}
