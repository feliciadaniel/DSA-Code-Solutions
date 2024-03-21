/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ArrayList<ListNode> arr1 = new ArrayList<>();
      ArrayList<ListNode> arr2 = new ArrayList<>();
      while(headA!=null){
        arr1.add(headA);
        headA=headA.next;
      }
      while(headB!=null){
        arr2.add(headB);
        headB=headB.next;
      }
    //   for(int i=0;i<Math.min(arr1.size(),arr2.size());i++){
    //     if(arr1.size()>arr2.size()){
    //         if(arr1.contains(arr2.get(i))){
    //            return arr2.get(i); 
    //         }
    //     }
    //     if(arr2.size()>arr1.size()){
    //         if(arr2.contains(arr1.get(i))){
    //            return arr1.get(i); 
    //         }
    //     }
    //   }

    //APPROACH 1
    int i=arr1.size()-1;
    int j = arr2.size()-1;
    ListNode ans = null;
    while(i>=0 && j>=0){
        if(arr1.get(i)==arr2.get(j)){
            ans = arr1.get(i);
            i--;
            j--;
        }
        else{
            break;
        }
    }
      return ans;
}
}
    // int size1 = arr1.size();
    // int size2 = arr2.size();
    // int diff = Math.abs(size1-size2);
    // ListNode temp = arr1.get(0);
    // for(int i=1;i<=diff+1;i++){
    //     temp = temp.next;
    // }
    // ListNode t = arr2.get(0);
    // while(t!=null){
    //     if(t==temp){
    //         return temp;
    //     }
    //     t = t.next;
    // }
    // return null;
    // }
