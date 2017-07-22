package com.examples


class Point(val xcord : Int, val ycord:Int){
   var x = xcord;
   var y = ycord;
   
   def printCord(){
     print(x + "\t" + y);
   }
}

object DemoClass {
  def main(args: Array[String]): Unit = {
    var point = new Point(10,20);
    point.printCord();
  }
}