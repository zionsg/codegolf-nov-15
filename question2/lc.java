public static int invert(String j) {
    	int a = 0;
    	for (int i = 0; i < j.length(); i++){
    	    a += (int)j.charAt(i);
    	}
    	return a == 39897 ? 42 : -1;
	}
