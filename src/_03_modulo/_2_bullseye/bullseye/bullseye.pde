
void setup() {
 
  // set the size of your sketch
  size(500, 500);
}

void draw() {
  int y = 500;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  //Use an if statement and modulo to alternate the color of your rings.
  int count;
  for (count = 500; count > 0; count-=9) {
    if ((count % 2) != 0) {
      fill(#FF0303);
      ellipse(250, 250, y, y);
    } else if ((count % 2) == 0) {
      fill(#000000);
      ellipse(250, 250, y, y);
    }
    y-=9;
  }
  
}
