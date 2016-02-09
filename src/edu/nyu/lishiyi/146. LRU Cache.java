146. LRU Cache 
My Submissions Question
Total Accepted: 62628 Total Submissions: 399872 Difficulty: Hard
Design and implement a data structure for Least Recently Used (LRU) cache. 
It should support the following operations: get and set.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, 
otherwise return -1.
set(key, value) - Set or insert the value if the key is not already present. 
When the cache reached its capacity, it should invalidate the least recently used 
item before inserting a new item.

public class LRUCache {
    
    private int capacity;
	private HashMap<Integer, ListNode> map = new HashMap();
	private ListNode dummyHead = new ListNode(-1, -1);
	private ListNode dummyTail = new ListNode(-1, -1); 

    public LRUCache(int capacity) {
        
    	this.capacity = capacity;
    	dummyHead.next = dummyTail;
    	dummyTail.prev = dummyHead;
    }
    
    public int get(int key) {
        
        if(map.containsKey(key)){
        	ListNode node = map.get(key);
        	delete(node);
        	addToTail(node);        	
        	return node.value;
        }
        else{
        	return -1;
        }
    }
    
    public void set(int key, int value) {
        
        if(map.containsKey(key)){
        	ListNode node = map.get(key);
        	node.value = value;
        	delete(node);
        	addToTail(node);
        }
        else{

        	ListNode insertNode = new ListNode(key, value);
        	if(map.size() < capacity){
        		addToTail(insertNode);
        	}
        	else{
        		map.remove(dummyHead.next.key);
        		delete(dummyHead.next);
        		addToTail(insertNode);
        	}
        	map.put(key, insertNode);
        }

    }

    private void delete(ListNode node){

    	node.next.prev = node.prev;
    	node.prev.next = node.next;
    	node.prev = null;
    	node.next = null;
    }

    private void addToTail(ListNode node){

    	dummyTail.prev.next = node;
    	node.prev = dummyTail.prev;
    	dummyTail.prev = node;
    	node.next = dummyTail;
    }

    private class ListNode{

    	int key;
    	int value;
    	ListNode prev = null;
    	ListNode next = null;

    	public ListNode(int key, int value){
    		this.key = key;
    		this.value = value;
    	}
    }
}