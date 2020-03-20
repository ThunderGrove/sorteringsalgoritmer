import java.util.ArrayList;

public class Search {
    private ArrayList<Integer>numberSet;

    public void setArrayList(ArrayList arrayList){
        numberSet=arrayList;
    }

    public boolean find(int x){
        for(int i=0;i<numberSet.size();i++){
            if(numberSet.get(i).equals(x)){
                return true;
            }
        }
        return false;
    }

    public int findAlle(int x){
        int count=0;
        for(int i=0;i<numberSet.size();i++){
            if(numberSet.get(i).equals(x)){
                count++;
            }
        }
        return count;
    }

    public int findMax(){
        int maxValue=0;
        for(int i=0;i<numberSet.size();i++){
            if(i!=0){
                if(numberSet.get(i)>maxValue){
                    maxValue=numberSet.get(i);
                }
            }else{
                maxValue=numberSet.get(i);
            }
        }
        return maxValue;
    }
}