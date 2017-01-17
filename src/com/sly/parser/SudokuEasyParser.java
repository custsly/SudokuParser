package com.sly.parser;

public class SudokuEasyParser {
	
	private byte[] sudokuData;

	public SudokuEasyParser(byte[] sudokuData) {
		if(sudokuData.length != 81){
			return;
		}
		this.sudokuData = new byte[81];
		for (int i = 0; i < sudokuData.length; i++) {
			if(sudokuData[i] < 1 || sudokuData[i] > 9){
				return;
			}else{
				this.sudokuData[i] = sudokuData[i];
			}
		}
	}
	
	private void getChoices(int index){
		
	}
	
}
