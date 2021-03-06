package uk.gov.hmrc.payeestimator.domain

import java.math.MathContext

import scala.math.BigDecimal
import scala.math.BigDecimal.RoundingMode

case class GovernmentReceipt(receiptSource: String, amount: BigDecimal)

case class GovernmentSpending(category: String, percentage: BigDecimal, spendingCategoryAmount: BigDecimal)

case class GovernmentReceiptDataResponse(year: String, governmentReceipting: Seq[GovernmentReceipt], totalGovernmentReceipts: BigDecimal)

object GovernmentReceiptData extends MoneyFormatting {

  val year = "2014-15"
  val governmentReceipting = Seq(GovernmentReceipt("Income Tax"        ,format(BigDecimal(164000000000.00))),
                                 GovernmentReceipt("National Insurance",format(BigDecimal(110000000000.00))),
                                 GovernmentReceipt("Excise Duties"     ,format(BigDecimal(47000000000.00))),
                                 GovernmentReceipt("Corporation Tax"   ,format(BigDecimal(43000000000.00))),
                                 GovernmentReceipt("VAT"               ,format(BigDecimal(111000000000.00))),
                                 GovernmentReceipt("Business Rates"    ,format(BigDecimal(27000000000.00))),
                                 GovernmentReceipt("Council Tax"       ,format(BigDecimal(28000000000.00))),
                                 GovernmentReceipt("Other"             ,format(BigDecimal(124000000000.00))))

  val totalGovernmentReceipts = governmentReceipting.foldLeft(BigDecimal(0.0, MathContext.DECIMAL64))(_ + _.amount)

}

object GovernmentSpendingData extends MoneyFormatting {

  val year = "2015"
  val totalGovernmentReceipts = GovernmentReceiptData.governmentReceipting.filter(
                                receipt => {
                                  receipt.receiptSource.equalsIgnoreCase("Income Tax") ||
                                  receipt.receiptSource.equalsIgnoreCase("National Insurance")
                                }).foldLeft(BigDecimal(0.0, MathContext.DECIMAL64))(_ + _.amount)

  val governmentSpending = Seq(createGovernmentSpending("Welfare",BigDecimal(25.30)),
                               createGovernmentSpending("Health",BigDecimal(19.90)),
                               createGovernmentSpending("State Pensions",BigDecimal(12.80)),
                               createGovernmentSpending("Education",BigDecimal(12.50)),
                               createGovernmentSpending("Defence",BigDecimal(5.40)),
                               createGovernmentSpending("National Debt Interest",BigDecimal(5.00)),
                               createGovernmentSpending("Public order & safety",BigDecimal(4.40)),
                               createGovernmentSpending("Transport" ,BigDecimal(3.00)),
                               createGovernmentSpending("Business and Industry",BigDecimal(2.70)),
                               createGovernmentSpending("Government Administration",BigDecimal(2.00)),
                               createGovernmentSpending("Culture e.g. sports, libraries, museums",BigDecimal(1.80)),
                               createGovernmentSpending("Environment",BigDecimal(1.70)),
                               createGovernmentSpending("Housing and Utilities",BigDecimal(1.60)),
                               createGovernmentSpending("Overseas Aid",BigDecimal(1.30)),
                               createGovernmentSpending("UK contribution to the EU budget",BigDecimal(0.60)))

  def createGovernmentSpending(description: String, percentage: BigDecimal) : GovernmentSpending = {
    GovernmentSpending(description, percentage, format(totalGovernmentReceipts*(percentage/100)))
  }

}

case class GovernmentSpendingDataResponse(year: String, totalGovernmentReceipts: BigDecimal, governmentSpending: Seq[GovernmentSpending])

trait MoneyFormatting {

  def format(amount: BigDecimal): BigDecimal = {
    amount.setScale(2, RoundingMode.HALF_UP)
  }
}