/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
    void insertAtTail(Node* &head, Node* &tail, int val)  {
        Node* tempNode = new Node(val);
        if(head == NULL) {
            head = tempNode;
            tail = tempNode;
            return;
        } else {
            tail -> next = tempNode;
            tail = tempNode;
            return;
        }
    }
        
public:
    Node* copyRandomList(Node* head) {
        if(head == NULL) {
            return head;
        }
        Node* cloneNodeHead = NULL;
        Node* cloneNodeTail = NULL;
        Node* originalNodeTemp = head;
        while(originalNodeTemp != NULL) {
            insertAtTail(cloneNodeHead,cloneNodeTail, originalNodeTemp -> val);
            originalNodeTemp = originalNodeTemp -> next;
        }
        unordered_map<Node*, Node*> oldToNewNode;
        originalNodeTemp = head;
        Node* cloneNodeTemp = cloneNodeHead;
        while(originalNodeTemp != NULL) {
            oldToNewNode[originalNodeTemp] = cloneNodeTemp;
            originalNodeTemp = originalNodeTemp -> next;
            cloneNodeTemp = cloneNodeTemp -> next;
        }
        originalNodeTemp = head;
        cloneNodeTemp = cloneNodeHead;
        while(originalNodeTemp != NULL) {
            cloneNodeTemp -> random = oldToNewNode[originalNodeTemp -> random];
            cloneNodeTemp = cloneNodeTemp -> next;
            originalNodeTemp = originalNodeTemp -> next;
        }
        return cloneNodeHead;
    }
};