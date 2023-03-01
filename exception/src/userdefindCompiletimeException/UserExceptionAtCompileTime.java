package userdefindCompiletimeException;

 class under_age_exception extends Exception{
	 under_age_exception(){
		 super("your are under age");
	 }
	 under_age_exception(String message){
		 super(message);
	 }

}

