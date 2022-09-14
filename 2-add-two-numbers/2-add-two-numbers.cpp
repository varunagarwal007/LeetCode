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
    
   
    
    public: void insertAtTail(ListNode* &head, ListNode* &tail, int val) {
        ListNode* temp = new ListNode(val);
        if(head == NULL) {
            head = temp;
            tail = temp;
            return;
        } else {
            tail -> next = temp;
            tail = temp;
            return;
        }
    }
    
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        if(l1 == NULL) {
            return l2;
        }
        if(l2 == NULL) {
            return l1;
        }
        
        int carry = 0;
        ListNode* first = l1;
        ListNode* second = l2;
        ListNode* ansHead = NULL;
        ListNode* ansTail = NULL;
        while(first != NULL || second != NULL || carry != 0) {
            int val1 = 0, val2 = 0;
            if(first != NULL)   val1 = first -> val;
               
            if(second != NULL)  val2 = second -> val;
                
             int sum = carry + val1 + val2;
             int digit = sum % 10;
            
             insertAtTail(ansHead,ansTail,digit);
             carry = sum / 10;
            
             if(first != NULL) first = first -> next;              
             if(second != NULL) second = second -> next;      
        }
        return ansHead;
        
    }
};








