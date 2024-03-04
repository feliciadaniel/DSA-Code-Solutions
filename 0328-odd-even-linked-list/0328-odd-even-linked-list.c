/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* oddEvenList(struct ListNode* head) {
    if (head==NULL){
        return NULL;
    }
    struct ListNode* odd=head;
    if(odd->next){
    struct ListNode*  even=odd->next;
    struct ListNode* evenstart=even;
    while(odd->next && even->next){
        odd->next=odd->next->next;
        even->next=even->next->next;
        odd=odd->next;
        even=even->next;
    }
    odd->next=evenstart;
    }
    return head;
}