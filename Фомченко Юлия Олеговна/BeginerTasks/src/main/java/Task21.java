public class Task21 {
    static int[] arr=new int[]{3,3,3,4,7,3,3,3};
    static boolean[] max=new boolean[arr.length];
    static boolean[] min=new boolean[arr.length];
    static int minIdx=0;
    static int maxIdx=0;

    public static void main(String[] args){
        findMinMax();
        markMinMax();
        int start=minIdx;
        int stop=maxIdx;
        for (int i=0;i<max.length;i++){
            for (int j=0;j<min.length;j++){
                if (max[i] && min[j]){
                //if (arr[i]==arr[maxIdx] && arr[j]==arr[minIdx]){
                    if (Math.abs(stop-start)<Math.abs(i-j)){
                        start=i;
                        stop=j;
                    }
                }
            }
        }
        if (start>stop){
            int tmp=start;
            start=stop;
            stop=tmp;
        }
        int sum=0;
        for (int i=start+1;i<stop;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    public static void findMinMax(){
        for (int i=0;i<arr.length;i++){
            if (arr[i]>arr[maxIdx]){ maxIdx=i; }
            if (arr[i]<arr[minIdx]){ minIdx=i; }
        }
    }
    public static void markMinMax(){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==arr[maxIdx]){ max[i]=true;}
            if (arr[i]==arr[minIdx]){ min[i]=true;}
        }
    }


}
