import java.util.LinkedList;
public class List {
 LinkedList<Integer>linkedList = new LinkedList<>();

 public void add(int elem){
     linkedList.add(elem);
     System.out.println("element added to list: " +elem);
 }
 public void display(){
     for (int i = 0; i < linkedList.size(); i++){
         System.out.println("index" +i +":" +linkedList.get(i) );
     }
 }
}

