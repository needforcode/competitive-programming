import java.util.*;

class Interval {
	int start;
	int end;
	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return String.format("["+start + "," + end+"]");
	}
}

/**
input: {{1,3},{4,9},{8,16},{15,18}}
output: [[1,3], [4,18]]
*/
public class MergeIntervals {
	public static void main(String[] args) {
		int[][] intervals = new int[][]{{1,3},{4,9},{8,16},{15,18}};
		System.out.println(Arrays.toString(mergeIntervals(intervals).toArray()));
	}

	public static List mergeIntervals(int[][] intervals) {

		int len = intervals.length;
		
		if(len == 0) {
			return new LinkedList<Interval>();
		}

		if(len == 1) {
			List list = new LinkedList<Interval>();
			list.add(new Interval(intervals[0][0], intervals[0][1]));
			return list;
		}

		int start = intervals[0][0];
		int end = intervals[0][1]; 

		List list = new LinkedList<Interval>();

		for(int i=1; i<len; i++) {
			if(intervals[i-1][1] > intervals[i][0]) {
				end = intervals[i][1];
			} else {
				list.add(new Interval(start,end));
				start = intervals[i][0];
				end = intervals[i][1];
			}
		}

		list.add(new Interval(start,end));

		return list;
	}
}