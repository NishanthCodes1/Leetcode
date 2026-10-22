import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> s=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    if(s.contains(nums1[i])){

                    }
                    else{
                    s.add(nums1[i]);
                    }
                }
            }
        }
    int[] a = s.stream()
           .mapToInt(Integer::intValue)
           .toArray();

return a;
    }
}