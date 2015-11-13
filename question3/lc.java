 public static String invert(String j) {
    	double o = 0;
    	for(int i=0;i<j.length();i++){
    			if(j.length() <= 1 || (j.charAt(i) != '1' && j.charAt(i) != '0')) return j;
    		   if(j.charAt(i)== '1')
    		     o+=Math.pow(2,j.length()-1-i);
    		}
    	return invert(""+(int)o);
	}
