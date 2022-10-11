import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> cooleList = new ArrayList<>();
        cooleList.add(4);
        cooleList.add(3);
        cooleList.add(1);
        cooleList.add(100);
        cooleList.add(10);
        cooleList.add(4);
        cooleList.add(2);
        
        System.out.println(sortList(cooleList).toString());
    }
    
    
    public static ArrayList<Integer> sortList(ArrayList<Integer> inputList) {
        ArrayList<Integer> output = new ArrayList<>();
        output.add(inputList.get(inputList.size() - 1));
        inputList.remove(inputList.size() - 1);
        
        while (true) {
            int n = inputList.get(inputList.size() - 1);
            inputList.remove(inputList.size() - 1);
            
            int i = output.size();
            
            while (true) {
                int z = output.get(i - 1);
                if (z <= n) {
                    output.add(i, n);
                    break;
                } else {
                    i--;
                    if (i <= 0) {
                        output.add(0, n);
                        break;
                    }
                }
            }
            if (inputList.size() == 0) {
                break;
            }
        }
        return output;
    }
}