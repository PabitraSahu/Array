public class MaxNoFromIntegerArray{

     public static void main(String []args){
         
        //Generate 100 random Number and find the Max
        
        int[] counts = new int[100];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = ((int)(Math.random() * 100000)) % 1000;
        }
        int max = counts[0];
         
        for (int j = 1; j < counts.length; j++)
            if (counts[j] > max){
                max = counts[j]; 
            }
        System.out.println(max);
         
     }
}


