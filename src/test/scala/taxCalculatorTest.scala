import collection.mutable.Stack
import org.scalatest._
import org.scalatest.Assertions._


class taxCalculatorTest extends FlatSpec {

  val income = 18000
  val incomeCap1 = 10000
  val taxIncome = income - incomeCap1


  assert(taxIncome == 8000 )

  val incomeTax = taxIncome * 0.1

  assert(incomeTax == 800)




}

