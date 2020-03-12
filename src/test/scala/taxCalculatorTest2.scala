

import collection.mutable.Stack
import org.scalatest._
import org.scalatest.Assertions._


class taxCalculatorTest2 extends FlatSpec {

  val income = 57000
  val incomeCap1 = 10000
  val incomeCap2 = 30000
  val incomeCap3 = 100000
  val taxIncome = income - incomeCap2


  assert(taxIncome == 27000)


  //
  //  val incomeTax = taxIncome * 0.1
  //
  //  assert(incomeTax == 800)




}