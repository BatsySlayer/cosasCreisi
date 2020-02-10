int x = 0;
void setup(){
  size(600, 600);
}

void draw(){
 background(255);
 rect(30+x, 20, 50, 50);
 fill(#000000);
 ellipse(40+x, 70, 15, 15);
 ellipse(120+x, 70, 15, 15);
 rect(100+x, 20, 40, 40);
 fill(#FC0808);
 rect(30+x, 20, 100, 50);
 fill(#000000);
 ellipse(160+x, 70, 15, 15);
 ellipse(225+x, 70, 15, 15);
 fill(#FC0808);
 rect(140+x, 20, 100, 50);
 x=x+1;
 if(x>=600){
   x=0;
 }
}
