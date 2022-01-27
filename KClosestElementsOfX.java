class Solution {
    List<Integer> l = new ArrayList<>();

    public List<Integer> findClosestElements(int[] a, int k, int x) {
        int n = a.length, p = 0, c = 0, y = 0, s = 0, e = n;
//      find the position of the 'x' in the range of the array using simple binary search
        while (s < e) {
            p = s + (e - s) / 2;
            if (a[p] == x) break;
            else if (a[p] > x) e = p;
            else s = p + 1;
        }
//      if the 'x' is not in range of array then the 'p' will return the position of 'x' to be
//      so, move the position to -1 so that the range towards left and right can be easily maintained
            
        p = a[p] == x ? p : p - 1;


//      once the position of x is found, find the closest elements for 'x' upto 'k' and add them to list
        int f = p + 1;


        while (k != 0 && p >= 0 && f < n) {


            c = Math.abs(a[p] - x);
            y = Math.abs(a[f] - x);
            if (c < y || c == y && a[p] < a[f]) {
                l.add(a[p--]);
                k--;
            } else {
                l.add(a[f++]);
                k--;

            }
        }
//if in the case at any time while finding closest if we cross one of the side is lost (index out of bounce) but we
//need upto k so just add remaining elements simply into the list

        while (k != 0 && p < 0) {
            l.add(a[f++]);
            k--;

        }
        while (k != 0 && f >= n) {
            l.add(a[p--]);
            k--;
        }
//             at last sort the list and return
        Collections.sort(l);
        return l;

    }
}
