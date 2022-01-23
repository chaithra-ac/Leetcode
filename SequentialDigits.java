class Solution {
    List<Integer>list=new ArrayList<>();
    public List<Integer> sequentialDigits(int l, int h) {
    int a[]={1,12,123,1234,12345,123456,1234567,12345678,123456789};
        int i=1;
        while(i<a.length){
           if(a[i]<=h)
              compute(i,a,a[i]-a[i-1],l,h);
           
            if(a[i]>h)break;
            i++;
        }
        return list;
    }
    void compute(int i,int[]a,int b,int l,int h){
        int cur=a[i];
        while(true){
            if(cur>=l&&cur<=h&&cur%10!=0)
               list.add(cur);
            if(cur%10==0||cur>h)
                break; 
        cur+=b;
        }
    }
}
