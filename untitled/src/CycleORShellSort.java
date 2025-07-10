public class CycleORShellSort {
    public static void main(String[] args) {
        int[] arr={5,3,7,8,5,9,2,2,1};
        CycleORShellSort c= new CycleORShellSort();
        int swap=c.cyclicSort(arr);
        System.out.println(swap);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        int[] arr1={5,3,7,8,5,9,2,2,1};
        c.shellSort(arr1);
        for(int i=0; i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
    }
    public int cyclicSort(int[] arr){
        int swap=0;
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int item=arr[i];
            int pos=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<item){
                    pos++;
                }
            }
            if(pos==i){
                continue;
            }
            while(arr[pos]==item){
                pos++;
            }
            int team=arr[pos];
            arr[pos]=item;
            item=team;
            swap++;

            while(pos!=i){
                pos=i;
                for(int j=i+1; j<n; j++){
                    if(arr[j]<item){
                        pos++;
                    }
                }
                while(arr[pos]==item){
                    pos++;
                }
                int temp =arr[pos];
                arr[pos]=item;
                item= temp;
                swap++;
            }
        }
        return swap;
    }
    private void shellSort(int[] arr){
        int n=arr.length;
        for(int gap=n/2; gap>0; gap=gap/2){
            for(int i=gap; i<n; i++){
                int j=i;
                int item=arr[i];
                while(j>=gap && arr[j-gap]>item){
                    arr[j]=arr[j-gap];
                    j=j-gap;
                }
                arr[j]=item;
            }
        }
    }
}
