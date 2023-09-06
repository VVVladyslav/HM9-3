import java.util.ArrayList;
import java.util.List;

public class MyQueue<Object> {

    private List<Object> list = new ArrayList<>();

    public void add(Object value){
        list.add(value);
    }

    public void clear(){
        list.clear();
    }

    public int size(){
        return list.size();
    }

    public Object peek(){
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.get(0);
    }

    public Object poll() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.remove(0);
    }
}