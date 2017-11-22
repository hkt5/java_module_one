package com.silenceonthewire.academy.java.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExample {

	@SuppressWarnings("finally")
	public boolean exceptionDrivenReadFile() {
		boolean status = false;
		try {
			createFileReader();
			status = true;
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			return status;
		}
	}
	
	public void createNewException() throws Exception {
		try {
			createFileReader();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new Exception();
		}
	}
	
	public void throwCurrentException() throws FileNotFoundException {
		try {
			createFileReader();
		}catch(FileNotFoundException e) {
			throw e;
		}
	}
	
	public void readFileException() {
		try {
			createFileReader();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("resource")
	public void createFileReader() throws FileNotFoundException {
		File file = new File("myfile.txt");
		new FileReader(file);
	}

}
