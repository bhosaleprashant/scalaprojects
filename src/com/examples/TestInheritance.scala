package com.examples


class TPoint(val x:Int, val y:Int){
  var xCord = x ;
  var yCord = y ;
  
  def move(dx: Int, dy: Int) {
      xCord = xCord + dx;
      yCord = yCord + dy;
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}

class Location(override val x:Int,override val y:Int,val z:Int)
        extends TPoint(x,y){
  var zCord = z ;
  
  def move(dx: Int, dy: Int, dz:Int) {
      xCord = xCord + dx;
      yCord = yCord + dy;
      zCord = zCord + dz;
      println ("Point x location : " + xCord);
      println ("Point y location : " + yCord);
      println ("Point z location : " + zCord);
   }
}

object TestInheritance {
  
 def main(args: Array[String]): Unit = {
   var location = new Location(10,20,30);
    printPoint(location);
   location.move(2, 4, 6);
 }
 
 def printPoint(Tlocation:Location) {
      println("Before Modification Point x location : " + Tlocation.xCord);
      println("Before Modification Point y location : " + Tlocation.yCord);
    }
}