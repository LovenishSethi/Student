package com.student.Student.exception;

public class StudentException extends Exception{

	private static final long serialVersionUID = 1L;

	public StudentException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public StudentException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public StudentException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public StudentException(String message)
	{
		super(message);
	}
}
