
void setup() {
  
size(500,500);
fill(#FFBB3B);
ellipse(250,250,450,450);

fill(#BC191B);
ellipse(250,250,400,400);

fill(#ECF035);
ellipse(250,250,375,375);

}
  
void draw(){
PImage pepperoni= loadImage("Pepperoni_Slice.jpg");
pepperoni.resize(50,50);
image(pepperoni, 100, 100);
if(mousePressed) {
image (pepperoni, mouseX, mouseY);

}
}