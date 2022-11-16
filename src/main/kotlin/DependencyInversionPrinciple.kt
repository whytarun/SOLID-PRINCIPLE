/*
    High-level modules should not depend on low-level modules. Both should depend on abstractions.

    if you use a class insider another class, this class will be dependent of the class injected.

    example-MVP architecure we use presentation layer
 */

/*
    high level module
 */
class ProductCatalogue{
    /*
        below class is tightly coupled to avoid means high leve module is tightly coupled with low
        lever module
     */
        private val sqlProducts =SqlProducts()
        fun getProducts(){
            sqlProducts.getAllProducts().forEach {
                println(it)
            }
        }

    /*
        below  we have followed DI principle
        it is loosely coupled
        high level module is depends on interface not on low leve module
     */

    private val sqlProducts1 =SqlProducts1()
    fun getProducts1(){
        sqlProducts.getAllProducts().forEach {
            println(it)
        }
    }

}
/*
    low level module
 */
class SqlProducts {

    fun getAllProducts() = mutableListOf<String>("APP", "BPP")
}

/*
    low level module
 */
class SqlProducts1 :IProductRepo {

    override fun getAllProducts1() = mutableListOf<String>("APP", "BPP")
}

interface IProductRepo {
    fun getAllProducts1() :MutableList<String>
}