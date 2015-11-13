function f(s) {
	r=0;
	a=s.split('').reverse();
	for(i=0;i<a.length;i++){
		r+=a[i]*Math.pow(2, i);
	}
	c=r+'';
	d=c.split("0").join("").split("1").join("");
	return (r==1||d.length>0)?r:f(c);
}
