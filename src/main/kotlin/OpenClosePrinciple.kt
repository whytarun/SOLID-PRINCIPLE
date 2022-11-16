/*
    you should be able to extend a class behaviour, without modifying it
     means using inheritance in good way
     OR add new features without having to rewrite or recompile any existing code.
     OR New integrations shouldn’t touch existing cod
 */
interface Customer{
    fun loyalCustomer():Boolean
}

class VehicleInsuranceCompany :Customer{
    override fun loyalCustomer(): Boolean =true
}

class HomeInsuranceCompany :Customer{
    override fun loyalCustomer(): Boolean =true
}

class LifeInsuranceCompany :Customer{
    override fun loyalCustomer(): Boolean =true
}

class InsuranceCompany{
    /*
        below method is closed for modification
     */
        fun discountRate(customer: Customer):Int{
            return if(customer.loyalCustomer()) 28 else 5
        }
}

fun main(){
    val vehicleInsuranceCompany =VehicleInsuranceCompany()
    val homeInsuranceCompany =HomeInsuranceCompany()
    val lifeInsuranceCompany =LifeInsuranceCompany()
    val insuranceCompany =InsuranceCompany()
    insuranceCompany.discountRate(vehicleInsuranceCompany)
}

