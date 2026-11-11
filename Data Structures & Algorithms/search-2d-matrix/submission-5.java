class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low =0;
        int high = matrix[0].length-1;
        int row=0;
        for(int i =0;i<matrix.length;i++){
            if(matrix[i][0]<=target && matrix[i][matrix[0].length-1]>=target){
                row=i;
                break;
            }
            
        }
        if(row==-1){
            return false;
        }
        while(low<=high){
                int mid = low + (high-low)/2;
                if(matrix[row][mid]==target){
                    return true;
                }
                if(matrix[row][mid]>target){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
        }
        return false;
    }
}
