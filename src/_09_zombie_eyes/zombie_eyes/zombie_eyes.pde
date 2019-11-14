
void setup() {
size(500,500);
PImage face = loadImage("face.png");
face.resize(500,500);
image(face,0,0);

}
void draw() 
ellipse(195,202,50,50)
if(mousePressed) {
  print("x" +mouse);
  print("y" +mouse);


}