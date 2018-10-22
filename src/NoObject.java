public class NoObject implements Comparable<NoObject> {
    Integer index;
    Double  value;

    public NoObject(Integer index, Double value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public String toString(){
      return "(Idx:"+index+", Val:"+value +")";
    }

    @Override
    public int compareTo(NoObject o) {
        return this.value.compareTo(o.value);
    }
}
