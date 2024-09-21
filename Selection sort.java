class Solution{ 
    int  select(int arr[], int i){
        // code here such that selectionSort() sorts arr[]
        int n=arr.length;
        int mini=i;
            for(int j=i;j<=n-1;j++){
                
                // if curr element is less than mini found so far
                // update the minimum as curr idx
                if(arr[j] < arr[mini]){
                    mini=j;
                }
            }
        return mini;
    }
    
    void selectionSort(int arr[], int n){
        // since the last element will be sorted -> largest element will go at last idx
        
        for(int i=0; i<= n-2;i++){
            int mini = select(arr, i);
            if (mini != i){
                int temp=arr[mini];
                arr[mini]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
