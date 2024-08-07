public class SegmentTree {
    public static void main(String[] args) {
        int[] num={1,3,5};
        NumArray n1=new NumArray(num);
        int sum1=n1.sumRange(0,2);
        System.out.println("sum="+sum1);
        n1.update(1,2);
        int sum2=n1.sumRange(0,2);
        System.out.println("sum="+sum2);
    }
    static class NumArray {
        int[] seg;
        int n;

        public NumArray(int[] nums) {
            this.n = nums.length;
            int l = (int) (Math.log(n-1) / Math.log(2)) + 2;
            seg = new int[(1 << l) - 1];
            createSegmentTree(nums, 0, n-1, 0);
        }

        private void createSegmentTree(int[] num, int si, int ei, int i) {
            if (si == ei) {
                seg[i] = num[si];
                return;
            }
            int mid = si + (ei - si) / 2;
            createSegmentTree(num, si, mid, (2 * i + 1));
            createSegmentTree(num, mid + 1, ei, (2 * i + 2));
            seg[i] = seg[2 * i + 1] + seg[2 * i + 2];
        }

        private void pointUpdate(int idx, int val, int si, int ei, int i) {
            if (si == ei) {
                seg[i] = val;
                return;
            }
            int mid = si + (ei - si) / 2;
            if (idx <= mid) {
                pointUpdate(idx, val, si, mid, 2 * i + 1);
            } else {
                pointUpdate(idx, val, mid + 1, ei, 2 * i + 2);
            }
            seg[i] = seg[2 * i + 1] + seg[2 * i + 2];
        }

        public void update(int index, int val) {
            pointUpdate(index, val, 0, n - 1, 0);
        }

        private int sumAllValue(int lt, int rt, int si, int ei, int i) {
            if (ei < lt || rt < si) {
                return 0;
            }
            if (lt <= si && ei <= rt) {
                return seg[i];
            }
            int mid = si + (ei - si) / 2;
            return sumAllValue(lt, rt, si, mid, 2 * i + 1) + sumAllValue(lt, rt, mid + 1, ei, 2 * i + 2);
        }

        public int sumRange(int left, int right) {
            return sumAllValue(left, right, 0, n - 1, 0);
        }
        // lazyPropogation in segment tree
        public void rangeUpdate(int si, int ei, int i,int lt, int rt,int val, int[] lazy){
            if(lazy[i]!=0){
                seg[i]= seg[i]*(ei-si+1)*lazy[i];
                if(si!=ei){
                    seg[2*i+1]=lazy[i];
                    seg[2*i+2]=lazy[i];
                }
                lazy[i]=0;
            }
            if(si>rt || ei<lt){
                return;
            }
            if(lt<=si && ei<=rt){
                seg[i]= seg[i]*(ei-si+1)*val;
                if(si!=ei){
                    seg[2*i+1]=val;
                    seg[2*i+2]=val;
                }
                return;
            }
            int mid=si+(ei-si)/2;
            rangeUpdate(si,mid,2*i+1,lt,rt,val,lazy);
            rangeUpdate(mid+1,ei,2*i+2,lt,rt,val,lazy);
            seg[i]=seg[2*i+1]+seg[2*i+1];
        }
    }

}
