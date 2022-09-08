/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {
      int count = 0;
      if(head == NULL) {
            return head;
        }
        ListNode* temp = head;
        for(int i = 0; i<k; i++) {
            if(!temp) {
                return head;
            }
            temp = temp -> next;
        }
        ListNode* prev = NULL;
        ListNode* curr = head;
        ListNode* frwd = curr -> next;
            while(curr != temp && count<k) {
            frwd = curr -> next;
            curr -> next = prev;
            prev = curr;
            curr = frwd;
          count++;
        }
        
        if(frwd != NULL) {
          head -> next =   reverseKGroup(frwd,k);
        }
        return prev;
    }
};