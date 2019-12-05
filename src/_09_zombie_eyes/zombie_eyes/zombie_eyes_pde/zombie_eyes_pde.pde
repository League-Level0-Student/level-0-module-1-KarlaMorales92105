
void setup() {
size(500,500);
PImage face = loadImage("face.png");
face.resize(500,500);
image(face,0,0);

}
void draw(){
if(mousePressed){
  println("x=" +mouseX);
  println("y=" +mouseY);}
ellipse(200,150,100,100);
ellipse(296,149,100,100);
fill(mouseX, mouseY,mouseX);

}