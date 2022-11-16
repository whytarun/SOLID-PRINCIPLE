/*
   interface should be in such way that client should not implement unnecssary functions they are
   not needed

   bulky interface is also problem where un-necssary methods need to implement
 */

interface ImultiFunctional{
    fun print()
    fun printSpoon()
    fun scanPhoto()
    fun scanImage()
    fun colorXerox()
    fun fax()
    fun email()
}
/*
    this class is forced to use fax and email which was not required
 */
class ColorPrinter :ImultiFunctional{
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun printSpoon() {
        TODO("Not yet implemented")
    }

    override fun scanPhoto() {
        TODO("Not yet implemented")
    }

    override fun scanImage() {
        TODO("Not yet implemented")
    }

    override fun colorXerox() {
        TODO("Not yet implemented")
    }

    override fun fax() {
        TODO("Not yet implemented")
    }

    override fun email() {
        TODO("Not yet implemented")
    }

}

/*
    to solve bulky interface we segrate the interface
 */

interface IScan{
    fun scanPhoto()
    fun scanImage()
}

interface IFax{
    fun fax()
    fun email()
}
/*
    we are using those which is required by the class
 */
class FaxPrinter : IFax {
    override fun fax() {
        TODO("Not yet implemented")
    }

    override fun email() {
        TODO("Not yet implemented")
    }

}