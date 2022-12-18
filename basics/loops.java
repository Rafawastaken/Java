package basics;
public class loops {
    public static void main(String[] args) {
        int answer = 7;
        int array_example[] = {0, 12, 2, 5, 1};
        boolean found = false;

        for(int x = 0; x < array_example.length; x++){
            if(!found){
                int attempt_num_1 = array_example[x];
                for(int y = 0; y < array_example.length; y++){
                    int attempt_num_2 = array_example[y];
                    int attempt = attempt_num_1 + attempt_num_2;

                    if (attempt == answer){
                        System.out.println("Found: " + attempt_num_1 + " + " + attempt_num_2 + " = " + answer);
                        found = true;
                    }
                }
            }
        }
    }
}
