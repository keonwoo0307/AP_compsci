/* 
    Lecture note example - Arrays
*/
import java.util.Random;

class LectureArray{
    public static void main(String args[]) {
        int [] arr = (1,3,4,5,6,7,4,3);
        for(int i = 1; i <arr.length-1;i=i+2){
            System.out.println(arr[i] + " " + arr[i+1]);
        }
        int dupeCheck = 8;
        for(int i = 0;i<arr.lenght; i=i+1){
            if(arr[i] == arr[i+1]){
                System.out.println("Consect at "+ i + "and "+ (i+1));
            }
        }
	}
}