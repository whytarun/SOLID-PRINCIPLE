/*
    derived class must be substituable for there base classes
    1.Inheritance is the tightest coupling you can have,
    bad usage of it leads to highly-coupled and lowly-cohesive code
    2. if class B is subtype of class A then we should able to replace object of A with object of B
        without breaking the  behaviour of program
    3. means that a sub-class should override the methods from a parent class,
     which does not break the functionality of the parent class

 */

interface ClickListener {
    fun onClick()
}

class Fragment1 :ClickListener{
    override fun onClick() {
        decrementClick()
        //your logic
    }

     fun decrementClick(){

    }
}

class Fragment2 :ClickListener{
    override fun onClick() {
        incrementClick()
        //your logic
    }

     fun incrementClick(){

    }
}

/*
 * We handle the individual logic inside the overridden methods
 * in the framgents. In the main implementation we should
 * never handle logic
 */

 fun main(){
     fun buttonClick(clickListener: ClickListener){
         clickListener.onClick()
     }
 }

/*
    bad way of handling
 */

//fun main1(){
//    fun buttonClick(clickListener: ClickListener){
//      when(clickListener){
//          is Fragment1 ->  decrementClick()
//          is Fragment2 -> incrementClickCount()
//      }
//
//        clickListener.onClick();
//    }
//}