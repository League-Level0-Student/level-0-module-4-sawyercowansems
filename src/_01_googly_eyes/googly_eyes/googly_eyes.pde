 PImage squid;
void setup(){
    squid = loadImage("Squid.jpg");
    size(800,600);
    squid.resize(width,height);
    background(squid);


}

void draw() {
  background(squid);
  int eyeX = mouseX;
  int eyeY = mouseY;
  fill(#FFFFFF);
  ellipse(345, 220, 100, 200);
  ellipse(455, 220, 100, 200);
  fill(#000000);
  if(eyeX > 370){
    eyeX = 370;
  }
  if(eyeX < 320){
    eyeX = 320;
  }
  
  
  if(eyeY < 145){
    eyeY = 145;
  }
  if(eyeY > 295){
    eyeY = 295;
  }
  
  
   ellipse(eyeX, eyeY, 50, 50);
   ellipse(eyeX + 110, eyeY, 50, 50);
} 
