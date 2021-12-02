package com.calculator;

public class Calculator implements java.io.Serializable{

		private double operandOne;
		private double operandTwo;
		private String operation;
		private double results;
		
		

//	Constructors	
	public Calculator() {
	}
	
	public Calculator(double value1, String operation, double value2) {
		setOperandOne(value1);
		setOperation(operation);
		setOperandTwo(value2);
		performOperation(operandOne, operation, operandTwo);
	}

	
//	METHODS
	public void performOperation(double operandOne, String operation, double operandTwo) {
		setResults(0);
		if( operation.equals("+")) {
			setResults(operandOne + operandTwo);
		}
		else if ( operation.equals("-")) {
			setResults(operandOne - operandTwo);
		}
		else if ( operation.equals("*")) {
			setResults(operandOne * operandTwo);
		}
		else {
			setResults(operandOne / operandTwo);
		}
		System.out.println(getResults());
	}
	
	public void nextOperand(String operation, double value) {
		if( operation.equals("+")) {
			setResults(results += value);
		}
		else if ( operation.equals("-")) {
			setResults(results -= value);
		}
		else if ( operation.equals("*")) {
			setResults(results *= value);
		}
		else {
			setResults(results /= value);
		}
		System.out.println(getResults());
	}
	
//	GETTERS AND SETTERS
	
	public double getResults() {
		return results;
	}
	
	
	public void setResults(double results) {
		this.results = results;
	}


	public double getOperandOne() {
		return operandOne;
	}


	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}


	public double getOperandTwo() {
		return operandTwo;
	}


	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}


	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	
	
	
}
