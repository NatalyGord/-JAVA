// находит в массиве числа максимально близкие заданному и выводит их в порядке возрастания
package Array;
import java.util.*;
import java.util.stream.Collectors;

public class array_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = readArrayList(scanner);
        ArrayList<Integer> listRes = new ArrayList<>();
        int len = list.size();
        int num = scanner.nextInt();
        int i = 0;
        int res = 0;
        while(true) {
            for (Integer c : list) {
                if (c == num + i || c == num - i) {
                    res = c;
                  //  System.out.print(res + " ");
                    listRes.add(res);
                  //  System.out.print(" " + i);
                 //   System.out.println();
                }
            }
            if(res == 0){
                i++;
            }
            else{
                break;
            }
        }
       // System.out.println(listRes);
        Collections.sort(listRes);

        for(int j = 0; j < listRes.size(); j++) {
            System.out.print(listRes.get(j) + " ");
        }

    }
    private static ArrayList<Integer> readArrayList(Scanner scanner) { //читает строку и переводит ее в ArrayList
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}

