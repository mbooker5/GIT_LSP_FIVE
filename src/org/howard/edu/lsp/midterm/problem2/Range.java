package org.howard.edu.lsp.midterm.problem2;

public class Range {
	private int startNum;
	private int endNum;
	// Range is inclusive to the starting number and exclusive to the ending number
	
	public Range(int start, int end) {
		this.startNum = start;
		this.endNum = end;
	}

	public boolean isValueInRange(int value) {
		if ((value >= this.startNum && value < this.endNum) || (value <= this.startNum && value > this.endNum)) {
			return true;
		}
		return false;
	}
	
	public boolean doRangesOverlap(Range range2) {
		if ((range2.startNum >= this.startNum && range2.startNum < this.endNum) || (range2.startNum <= this.startNum && range2.startNum > this.endNum) || 
				(range2.endNum >= this.startNum && range2.endNum < this.endNum) || (range2.endNum <= this.startNum && range2.endNum > this.endNum)) {
			return true;
		} else if ((this.startNum >= range2.startNum && this.startNum < range2.endNum) || (this.startNum <= range2.startNum && this.startNum > range2.endNum) || 
				(this.endNum >= range2.startNum && this.endNum < range2.endNum) || (this.endNum <= range2.startNum && this.endNum > range2.endNum)) {
			return true;
		}
		return false;
	}
	
	public int size() {
		int rangeSize = 0;
		if (this.endNum >= this.startNum) {
			rangeSize = this.endNum - this.startNum;
		} else if (this.endNum < this.startNum) {
			rangeSize = this.startNum - this.endNum;
		}
		
		return rangeSize;
	}
}
