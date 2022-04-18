package com.test.tictactoe.model;

import java.util.Arrays;

public class Board {
	private int size;
	private Action[] filledSpace;
	private Action[] emptySpace;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Action[] getFilledSpace() {
		return filledSpace;
	}

	public void setFilledSpace(Action[] filledSpace) {
		this.filledSpace = filledSpace;
	}

	public Action[] getEmptySpace() {
		return emptySpace;
	}

	public void setEmptySpace(Action[] emptySpace) {
		this.emptySpace = emptySpace;
	}

	@Override
	public String toString() {
		return "Board [size=" + size + ", filledSpace=" + Arrays.toString(filledSpace) + ", emptySpace="
				+ Arrays.toString(emptySpace) + "]";
	}
	
	
}
