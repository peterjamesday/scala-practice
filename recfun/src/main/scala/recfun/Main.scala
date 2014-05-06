package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = ???

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    // List = Nil
    //      | a :: List
    def helper(stack: List[Char], chars: List[Char]): Boolean = {
      chars match {
        case '(' :: tail => helper('('::stack, tail)
        case ')' :: tail => stack match{
          case Nil => false
          case _ :: stackTail => helper(stackTail, tail)
        }
        case _ :: tail => helper(stack, tail)
        case Nil => stack match {
          case _ :: _ => false
          case _ => true
        }
      }
    }
    
    helper(List(), chars)
  }
    
//      if (chars.isEmpty) {
//        if (stack.isEmpty) {
//          true
//        } else {
//          false
//        }
//      } else {
//        val head: Char = chars.head
//        val tail: List[Char] = chars.tail
//        
//        val newStack: List[Char] = head :: stack
//        
//        helper(newStack, tail)
//      }
//    }

    
    def one(a: List[Char]): Any =
      if(a.head == "(") two(a.tail)
      else one(a.tail)
    
    def two(b: List[Char]): Any =
      if (b.head == ")") one(b.tail)
      else three(b.tail)
      
    def three(c: List[Char]) =
      if (c.isEmpty) emptyNest(c)
      else two(c.tail) 
      
    def emptyNest(d: List[Char]) = false 
      
    def empty(chars: List[Char]) =
        if(chars.isEmpty == false) one(chars) 
      
    
    
    
 // }

  /**
   * Exercise 3
   */
 // def countChange(money: Int, coins: List[Int]): Int = ???
}
