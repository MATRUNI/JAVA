// Problem 295
import java.util.Collections;
import java.util.PriorityQueue;
class MedianFinder {

    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    public MedianFinder() {
        right=new PriorityQueue<>();
        left=new PriorityQueue<>(Collections.reverseOrder());
    }
    public void addNum(int num) {        
        left.add(num);
        right.add(left.poll());

        if(right.size()>left.size())
        {
            left.add(right.poll());
        }
    }
    
    public double findMedian() {
        if(left.size()>right.size())
        {
            return left.peek();
        }
        else
        {
            return ((left.peek()+right.peek())/2.0);
        }
    }
}