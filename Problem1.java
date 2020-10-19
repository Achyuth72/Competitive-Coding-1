// Time complexity:O(logn)
// Space complexity:O(1)
// Successfully executed:yes

class Main {
  public static void main(String[] args) {
    int[] nums={1,3};
    int missing=missingElement(nums);
    System.out.println(missing);
  }
  public static int missingElement(int nums[])
  {
    int lo=0;
    int hi=nums.length-1;
    while(lo<=hi)
    {
      int mid=lo+(hi-lo)/2;
      if(mid!=0 && (nums[mid]-nums[mid-1])!=1)
      {
        return nums[mid]-1;
      }
      if(mid!=hi&&(nums[mid+1]-nums[mid])!=1)
      {
        return nums[mid]+1;
      }
      if(nums[mid]==mid+1)
      {
        lo=mid+1;
      }
      else
      {
        hi=mid-1;
      }

    }
    return -1;
  }
}
