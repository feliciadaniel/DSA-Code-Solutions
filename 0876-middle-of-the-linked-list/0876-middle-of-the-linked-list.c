/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode *slow=head,*fast=head;
    if(head->next==NULL){
        return head;
    }
    if(head->next->next==NULL){
        return head->next;
    }
    while(fast->next!=NULL && fast->next->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
    }
    if(fast->next!=NULL){
        return slow->next;
    }
    return slow;
}