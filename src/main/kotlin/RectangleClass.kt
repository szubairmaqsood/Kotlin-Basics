
/*
 Attributes of class can be declared in the decalrtion as well as in body
 for inheritence use :
 */
class RectangleClass(var lengh:Double, var height:Double ):ShapeClass() {
    var perimeter = (lengh * height) * 2;
}