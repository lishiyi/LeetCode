295. Find Median from Data Stream 
My Submissions Question
Total Accepted: 10361 Total Submissions: 48881 Difficulty: Hard
Median is the middle value in an ordered integer list. 
If the size of the list is even, there is no middle value. 
So the median is the mean of the two middle value.

Examples: 
[2,3,4] , the median is 3

[2,3], the median is (2 + 3) / 2 = 2.5

Design a data structure that supports the following two operations:

void addNum(int num) - Add a integer number from the data stream to the data structure.
double findMedian() - Return the median of all elements so far.
For example:

add(1)
add(2)
findMedian() -> 1.5
add(3) 
findMedian() -> 2

class MedianFinder {

	private Comparator<Integer> revCmp = Collections.reverseOrder();
	private Queue<Integer> leftHeap = new PriorityQueue<Integer>(20, revCmp);
	private Queue<Integer> rightHeap = new PriorityQueue<Integer>();
    // Adds a number into the data structure.
    public void addNum(int num) {
        
        if(leftHeap.size() == 0){
        	leftHeap.add(num);
        }
        else if(num > leftHeap.peek()){
        	rightHeap.add(num);
        }
        else{
        	leftHeap.add(num);
        }

        if(rightHeap.size() > leftHeap.size()){
        	leftHeap.add(rightHeap.poll());
        }
        else if(leftHeap.size() > rightHeap.size() + 1){
        	rightHeap.add(leftHeap.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        
        if(leftHeap.size() == rightHeap.size() + 1){
        	return leftHeap.peek();
        }
        else if(leftHeap.size() == rightHeap.size()){
        	return (leftHeap.peek() + rightHeap.peek()) / 2.0;
        }
        return -1;
    }
};

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();