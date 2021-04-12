import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TwentyTwenty {

    /**
     * This function converts the file contents into a list
     * @param file
     * @return array list of numbers
     */

    public static ArrayList readNums(File file){
        ArrayList<Integer> nums = new ArrayList<>();
        try {
            Scanner line = new Scanner(file);

            while(line.hasNext()){
                int num = line.nextInt();
                nums.add(num);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
        return nums;
    }

    
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("./Day1/numbers.txt");
        ArrayList<Integer> numbers = readNums(f);
        for(int i = 0; i < 200; i++){
            for(int j = 0; j < 200; j++){
                if (i != j){
                    if((numbers.get(i) + numbers.get(j)) == 2020){
                        System.out.println("Number 1:"+numbers.get(i));
                        System.out.println("Number 2:"+numbers.get(j));
                        System.out.println("The answer: "+(numbers.get(i) * numbers.get(j)));
                        return;
                    }
                    
                }
            }
        }
    }
}
