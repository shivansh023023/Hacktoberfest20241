import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n=sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int temp=sc.nextInt();
            arr.add(temp);;
        }
        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = 0; j < n; j++) {
                if (arr.get(i)==arr.get(j)) {
                   count++;
                }
            }
            if (count%2!=0) {
                System.out.print(arr.get(i)+" ");
            }
           
        }
        
         
                
            }
        }
