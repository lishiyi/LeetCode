56. Merge Intervals 
My Submissions Question
Total Accepted: 62162 Total Submissions: 249309 Difficulty: Hard
Given a collection of intervals, merge all overlapping intervals.

For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        
        List<Interval> result = new LinkedList();
        if(intervals == null || intervals.size() == 0){
        	return result;
        }

        Comparator<Interval> cmp = new Comparator<Interval>(){

        	public int compare(Interval i1, Interval i2){
        		return i1.start - i2.start;
        	}
        };
        Collections.sort(intervals, cmp);
        Interval last = intervals.get(0);

        for(Interval current: intervals){

        	if(current.start > last.end){
        		result.add(last);
        		last = current;
        	}
        	else{
        		last.end = Math.max(last.end, current.end);
        	}
        }
        result.add(last);
        return result;
    }
}