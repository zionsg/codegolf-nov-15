#define FOR(A,B,C) for(int A=B; A<C; A++){
int f(string s){
  bool a=true;
  int c=0;
  FOR(i,97,123)
    FOR(j,0,i-96)
      if(c==s.length()){
        a=false;
        break;
      }
      if(s[c] != (char)i)
        a=false;
      c++;
    }
    if(!a)
      break;
  }
  return a ? 42 : -1;
}
