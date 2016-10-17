/*
 * Copyright 2016 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package domain

//import play.api.libs.json.Json

case class CategoryBreakdown(categoryBreakdown: Seq[Category], expenditureOnServices: BigDecimal, accountingAdjustments: BigDecimal, totalExpenditure: BigDecimal)

case class Category(category: String, allocation: BigDecimal ,subCategory: Seq[Category])

case class CategoryUsage(category: String, allocation: BigDecimal, subCategory: Seq[CategoryUsage], percentage: BigDecimal)

//object CategoryBreakdown {
//
//  implicit val formatCategory = Json.format[Category]
//  implicit val format= Json.format[CategoryBreakdown]
//}
//
//object Category {
//  implicit val format = Json.format[Category]
//}
//
//object CategoryUsage {
//  implicit val format = Json.format[CategoryUsage]
//}
