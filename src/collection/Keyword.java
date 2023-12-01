package collection;

public class Keyword implements Comparable {

    private String key;
    private int count;

    public Keyword(){

    }

    @Override
    public String toString() {
        return "Keyword{" +
                "key='" + key + '\'' +
                ", count=" + count +
                '}';
    }

    public Keyword(String key, int count) {
        this.key = key;
        this.count = count;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int compareTo(Object o) {
        //comparing two objects
        // o and this
        Keyword keyword = (Keyword) o; // o kisi class ka object hoga,right? yes. wahi class keyword hai. isliye downcast ka zarurat pada.
       if(keyword.getCount()>this.getCount()){
            return 1;
       }else if(keyword.getCount() < this.getCount()){
           return -1;
       }else{
           return 0;
       }
    }
}
