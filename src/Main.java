import java.util.ArrayList;

public class Main{
    private static ArrayList<Integer>numberSet=new ArrayList();

    public static void main(String[] args){
        Search search=new Search();

        numberSet.add(77);
        numberSet.add(18);
        numberSet.add(45);
        numberSet.add(95);
        numberSet.add(30);
        numberSet.add(77);
        numberSet.add(94);
        numberSet.add(51);
        numberSet.add(62);
        numberSet.add(8);

        search.setArrayList(numberSet);

        System.out.println("find(x) test:");

        if(search.find(77)){
            System.out.println(" Der findes mindst et entry med 77");
        }else{
            System.out.println(" Der findes ingen entry med 77");
        }

        if(search.find(88)){
            System.out.println(" Der findes mindst et entry med 88");
        }else{
            System.out.println(" Der findes ingen entry med 88");
        }

        System.out.println("");

        System.out.println("findAlle(x) test:");

        System.out.println(" Der findes "+search.findAlle(77)+" entries med 77");

        System.out.println(" Der findes "+search.findAlle(18)+" entries med 18");

        System.out.println(" Der findes "+search.findAlle(78)+" entries med 78");

        System.out.println("");

        System.out.println("findMax() test:");

        System.out.println(" Der største tal er: "+search.findMax());

        System.out.println("");

        System.out.println("Merge sort:");

        int[] mergeSortArray={numberSet.get(0),numberSet.get(1),numberSet.get(2),numberSet.get(3),numberSet.get(4),numberSet.get(5),numberSet.get(6),numberSet.get(7),numberSet.get(8),numberSet.get(9)};

        MergeSort.sort(mergeSortArray);

        for(int i=0;i<mergeSortArray.length;i++){
            System.out.print(" "+mergeSortArray[i]);
        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Shell sort:");

        int[] shellSortArray={numberSet.get(0),numberSet.get(1),numberSet.get(2),numberSet.get(3),numberSet.get(4),numberSet.get(5),numberSet.get(6),numberSet.get(7),numberSet.get(8),numberSet.get(9)};

        ShellSort.sort(shellSortArray);

        for(int i=0;i<shellSortArray.length;i++){
            System.out.print(" "+shellSortArray[i]);
        }
    }
}