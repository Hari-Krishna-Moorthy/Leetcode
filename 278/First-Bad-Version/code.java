/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        private int firstBadVersion(int low, int high) {
            int mid = low + (high - low)/2;
            if(isBadVersion(mid)) {
                if(!isBadVersion(mid-1)) 
                    return mid;
             return firstBadVersion(low, mid-1);
            }
                return firstBadVersion(mid+1, high);
            
        }
        public int firstBadVersion(int n) {
         return  firstBadVersion(1, n);
        }
    }