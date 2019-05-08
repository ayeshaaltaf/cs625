class Bubble sort
 for(a=1; a < size; a++)
  for(b=size-1; b >= a; b--) {
   if(nims [b-1] > nums[b]) {
    t = nums [b-1];
    nums [b-1] = nums[b];
    nums[b] = t;
  }
 }