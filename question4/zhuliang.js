function f() {
	a="abcdefghijklmnopqrstuvwxyz";
	function g(x){
		console.log(a.slice(0,x)+a.charAt(x).toUpperCase()+a.slice(x+1));
	}
	j=26;
	for(i=0;i<j;i++){g(i)};
	for(;j>=0;j--){g(j)}
}
