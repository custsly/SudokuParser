package com.sly.parser;

import java.util.HashMap;
import java.util.Map;

public class SudokuParser {
	
	public static final short NUM_ONE = 0B000000001;
	public static final short NUM_TWO = 0B000000010;
	public static final short NUM_THREE = 0B000000100;
	public static final short NUM_FOUR = 0B000001000;
	public static final short NUM_FIVE = 0B000010000;
	public static final short NUM_SIX = 0B000100000;
	public static final short NUM_SEVEN = 0B001000000;
	public static final short NUM_EIGHT = 0B010000000;
	public static final short NUM_NINE = 0B100000000;
	
	
	public static final short NOT_NUM_ONE = 0B111111110;
	public static final short NOT_NUM_TWO = 0B111111101;
	public static final short NOT_NUM_THREE = 0B111111011;
	public static final short NOT_NUM_FOUR = 0B111110111;
	public static final short NOT_NUM_FIVE = 0B111101111;
	public static final short NOT_NUM_SIX = 0B111011111;
	public static final short NOT_NUM_SEVEN = 0B110111111;
	public static final short NOT_NUM_EIGHT = 0B101111111;
	public static final short NOT_NUM_NINE = 0B011111111;
	
	
	private short[] sudokuData;
	
	private Map<Integer, Short> choices;

	public SudokuParser(byte[] sudokuData) {
		if(sudokuData.length != 81){
			return;
		}
		this.sudokuData = new short[81];
		choices = new HashMap<>();
		for (int i = 0; i < sudokuData.length; i++) {
			if(sudokuData[i] < 1 || sudokuData[i] > 9){
				return;
			}else{
				switch (sudokuData[i]) {
				case 1:
					this.sudokuData[i] = SudokuParser.NUM_ONE;
					break;
				case 2:
					this.sudokuData[i] = SudokuParser.NUM_TWO;
					break;
				case 3:
					this.sudokuData[i] = SudokuParser.NUM_THREE;
					break;
				case 4:
					this.sudokuData[i] = SudokuParser.NUM_FOUR;
					break;
				case 5:
					this.sudokuData[i] = SudokuParser.NUM_FIVE;
					break;
				case 6:
					this.sudokuData[i] = SudokuParser.NUM_SIX;
					break;
				case 7:
					this.sudokuData[i] = SudokuParser.NUM_SEVEN;
					break;
				case 8:
					this.sudokuData[i] = SudokuParser.NUM_EIGHT;
					break;
				case 9:
					this.sudokuData[i] = SudokuParser.NUM_NINE;
					break;
				default:
					break;
				}
			}
		}
	}
	
	private void getChoices(int index){
		
	}
	
}
