/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    if(head==NULL){
        return NULL;
    }
    if(head->next==NULL){
        return head;
    }
    struct ListNode *p=NULL;
    struct ListNode *q=head;
    struct ListNode *r=head;
    while(q!=NULL){
        r=r->next;
        q->next=p;
        p=q;
        q=r;
    }
    return p;
}