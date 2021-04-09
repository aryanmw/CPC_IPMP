import java.util.*;

public class Q15 {

    static LinkedHashMap<Integer,Integer> sort2DArray(LinkedHashMap<Integer,Integer> map){

        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> i1, Map.Entry<Integer, Integer> i2) {
                if (i1.getValue() <= i2.getValue()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    static void sortByFrequency(int[] arr){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        int n = arr.length;
        for (int i = 0 ; i < n ; i++){
            map.computeIfPresent(arr[i], (k,v) -> v+1);


            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
        }

        map = sort2DArray(map);
        int index = 0;
        int valueCount = 0;
        Iterator it = map.entrySet().iterator();
        Map.Entry obj = (Map.Entry)it.next();
        while(it.hasNext()) {
            if (valueCount == (int) obj.getValue()){
                obj = (Map.Entry) it.next();
                valueCount = 0;
            }
            arr[index] = (int) obj.getKey();
            valueCount++;
            index++;
        }
    }

    // Driver Code
    public static void main(String args[])
    {



        int[] arr = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8};
        sortByFrequency(arr);
        System.out.println(Arrays.toString(arr));



    }
}
