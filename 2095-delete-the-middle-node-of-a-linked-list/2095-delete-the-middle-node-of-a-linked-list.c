/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteMiddle(struct ListNode* head) {
    struct ListNode *p=head;
    struct ListNode *q=head->next;
    if(head->next==NULL){
        return NULL;
    }
    if(head->next->next==NULL){
        head->next=NULL;
        return head;
    }

    while(q->next!=NULL && q->next->next!=NULL){
        p=p->next;
        q=q->next->next;
    }
    p->next=p->next->next;
    return head;
    
}