string f(string z){
  for(int i=0; i<z.length(); i++)
    z[i]=97-(int)z[i];
  return z;
}
