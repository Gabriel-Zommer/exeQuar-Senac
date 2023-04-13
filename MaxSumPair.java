public class MaxSumPair {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 2, 7, 3};
        int[] maxSumPair = encontrarParComMaiorSoma(array);
        
        System.out.println("O par com a maior soma é: " + maxSumPair[0] + ", " + maxSumPair[1]);
        System.out.println("A soma dos dois valores é: " + (maxSumPair[0] + maxSumPair[1]));
    }
    
    public static int[] encontrarParComMaiorSoma(int[] array) {
        int[] maxSumPair = new int[2];
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumPair[0] = array[i];
                    maxSumPair[1] = array[j];
                }
            }
        }
        
        return maxSumPair;
    }
}

