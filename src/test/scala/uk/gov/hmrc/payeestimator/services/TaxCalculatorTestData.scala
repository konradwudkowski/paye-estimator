package uk.gov.hmrc.payeestimator.services

object TaxCalculatorTestData {
  val tapering_emergency_code_response = """{"statePensionAge":false,"taxCode":"SK1100","payPerHour":"-1","hours":-1,"averageAnnualTaxRate":"43.16","marginalTaxRate":"42","maxTaxRate":"0.5","payeBand":"40","employeeNICBand":"2","tapered":false,"taxBreakdown":[{"period":"annual","grossPay":"115024.00","taxFreePay":"0","taxablePay":"126033.00","additionalTaxablePay":"11009.00","scottishElement":"12603.30","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"44013.20","aggregation":[{"percentage":"20","amount":"6400.00"},{"percentage":"40","amount":"37613.20"},{"percentage":"45","amount":"0"}]},{"taxType":"employeeNationalInsurance","total":"5633.28","aggregation":[{"percentage":"12","amount":"4192.80"},{"percentage":"2","amount":"1440.48"}]},{"taxType":"employerNationalInsurance","total":"14753.85","aggregation":[{"percentage":"13.8","amount":"14753.85"}]}],"totalDeductions":"49646.48","takeHomePay":"65377.52"},{"period":"monthly","grossPay":"9585.33","taxFreePay":"0","taxablePay":"10502.75","additionalTaxablePay":"917.42","scottishElement":"1050.28","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"3667.77","aggregation":[{"percentage":"20","amount":"533.33"},{"percentage":"40","amount":"3134.43"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"469.44","aggregation":[{"percentage":"12","amount":"349.40"},{"percentage":"2","amount":"120.04"}]},{"taxType":"employerNationalInsurance","total":"1229.49","aggregation":[{"percentage":"13.8","amount":"1229.49"}]}],"totalDeductions":"4137.21","takeHomePay":"5448.12"},{"period":"weekly","grossPay":"2212.00","taxFreePay":"0","taxablePay":"2423.71","additionalTaxablePay":"211.71","scottishElement":"242.37","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"846.41","aggregation":[{"percentage":"20","amount":"123.08"},{"percentage":"40","amount":"723.33"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"108.33","aggregation":[{"percentage":"12","amount":"80.63"},{"percentage":"2","amount":"27.70"}]},{"taxType":"employerNationalInsurance","total":"283.73","aggregation":[{"percentage":"13.8","amount":"283.73"}]}],"totalDeductions":"954.74","takeHomePay":"1257.26"}]}"""

  val hour_rate_weekly_response = """{"statePensionAge":false,"taxCode":"1100T","payPerHour":"96.15","hours":40,"averageAnnualTaxRate":"39.24","marginalTaxRate":"47","maxTaxRate":"0.5","payeBand":"45","employeeNICBand":"2","tapered":false,"taxBreakdown":[{"period":"annual","grossPay":"199992.00","taxFreePay":"11009.00","taxablePay":"188983.00","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"71142.35","aggregation":[{"percentage":"20","amount":"6400.00"},{"percentage":"40","amount":"47200.00"},{"percentage":"45","amount":"17542.35"}]},{"taxType":"employeeNationalInsurance","total":"7332.64","aggregation":[{"percentage":"12","amount":"4192.80"},{"percentage":"2","amount":"3139.84"}]},{"taxType":"employerNationalInsurance","total":"26479.44","aggregation":[{"percentage":"13.8","amount":"26479.44"}]}],"totalDeductions":"78474.99","takeHomePay":"121517.01"},{"period":"monthly","grossPay":"16666.00","taxFreePay":"917.42","taxablePay":"15748.58","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"5928.53","aggregation":[{"percentage":"20","amount":"533.33"},{"percentage":"40","amount":"3933.33"},{"percentage":"45","amount":"1461.86"}]},{"taxType":"employeeNationalInsurance","total":"611.05","aggregation":[{"percentage":"12","amount":"349.40"},{"percentage":"2","amount":"261.65"}]},{"taxType":"employerNationalInsurance","total":"2206.62","aggregation":[{"percentage":"13.8","amount":"2206.62"}]}],"totalDeductions":"6539.58","takeHomePay":"10126.42"},{"period":"weekly","grossPay":"3846.00","taxFreePay":"211.71","taxablePay":"3634.29","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"1368.12","aggregation":[{"percentage":"20","amount":"123.08"},{"percentage":"40","amount":"907.69"},{"percentage":"45","amount":"337.35"}]},{"taxType":"employeeNationalInsurance","total":"141.01","aggregation":[{"percentage":"12","amount":"80.63"},{"percentage":"2","amount":"60.38"}]},{"taxType":"employerNationalInsurance","total":"509.22","aggregation":[{"percentage":"13.8","amount":"509.22"}]}],"totalDeductions":"1509.13","takeHomePay":"2336.87"}]}"""

  val D1_taxCode_response = """{"statePensionAge":false,"taxCode":"D1","payPerHour":"-1","hours":-1,"averageAnnualTaxRate":"48.67","marginalTaxRate":"47","maxTaxRate":"0.5","payeBand":"45","employeeNICBand":"2","tapered":false,"taxBreakdown":[{"period":"annual","grossPay":"200000.00","taxFreePay":"0","taxablePay":"200000.00","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"90000.00","aggregation":[{"percentage":"20","amount":"0"},{"percentage":"40","amount":"0"},{"percentage":"45","amount":"90000.00"}]},{"taxType":"employeeNationalInsurance","total":"7332.80","aggregation":[{"percentage":"12","amount":"4192.80"},{"percentage":"2","amount":"3140.00"}]},{"taxType":"employerNationalInsurance","total":"26480.54","aggregation":[{"percentage":"13.8","amount":"26480.54"}]}],"totalDeductions":"97332.80","takeHomePay":"102667.20"},{"period":"monthly","grossPay":"16666.67","taxFreePay":"0","taxablePay":"16666.67","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"7500.00","aggregation":[{"percentage":"20","amount":"0.00"},{"percentage":"40","amount":"0.00"},{"percentage":"45","amount":"7500.00"}]},{"taxType":"employeeNationalInsurance","total":"611.07","aggregation":[{"percentage":"12","amount":"349.40"},{"percentage":"2","amount":"261.67"}]},{"taxType":"employerNationalInsurance","total":"2206.71","aggregation":[{"percentage":"13.8","amount":"2206.71"}]}],"totalDeductions":"8111.07","takeHomePay":"8555.60"},{"period":"weekly","grossPay":"3846.15","taxFreePay":"0","taxablePay":"3846.15","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"1730.77","aggregation":[{"percentage":"20","amount":"0.00"},{"percentage":"40","amount":"0.00"},{"percentage":"45","amount":"1730.77"}]},{"taxType":"employeeNationalInsurance","total":"141.01","aggregation":[{"percentage":"12","amount":"80.63"},{"percentage":"2","amount":"60.38"}]},{"taxType":"employerNationalInsurance","total":"509.24","aggregation":[{"percentage":"13.8","amount":"509.24"}]}],"totalDeductions":"1871.78","takeHomePay":"1974.37"}]}"""

  val D0_taxCode_response = """{"statePensionAge":false,"taxCode":"D0","payPerHour":"-1","hours":-1,"averageAnnualTaxRate":"43.67","marginalTaxRate":"42","maxTaxRate":"0.5","payeBand":"40","employeeNICBand":"2","tapered":false,"taxBreakdown":[{"period":"annual","grossPay":"200000.00","taxFreePay":"0","taxablePay":"200000.00","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"80000.00","aggregation":[{"percentage":"20","amount":"0"},{"percentage":"40","amount":"80000.00"},{"percentage":"45","amount":"0"}]},{"taxType":"employeeNationalInsurance","total":"7332.80","aggregation":[{"percentage":"12","amount":"4192.80"},{"percentage":"2","amount":"3140.00"}]},{"taxType":"employerNationalInsurance","total":"26480.54","aggregation":[{"percentage":"13.8","amount":"26480.54"}]}],"totalDeductions":"87332.80","takeHomePay":"112667.20"},{"period":"monthly","grossPay":"16666.67","taxFreePay":"0","taxablePay":"16666.67","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"6666.67","aggregation":[{"percentage":"20","amount":"0.00"},{"percentage":"40","amount":"6666.67"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"611.07","aggregation":[{"percentage":"12","amount":"349.40"},{"percentage":"2","amount":"261.67"}]},{"taxType":"employerNationalInsurance","total":"2206.71","aggregation":[{"percentage":"13.8","amount":"2206.71"}]}],"totalDeductions":"7277.74","takeHomePay":"9388.93"},{"period":"weekly","grossPay":"3846.15","taxFreePay":"0","taxablePay":"3846.15","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"1538.46","aggregation":[{"percentage":"20","amount":"0.00"},{"percentage":"40","amount":"1538.46"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"141.01","aggregation":[{"percentage":"12","amount":"80.63"},{"percentage":"2","amount":"60.38"}]},{"taxType":"employerNationalInsurance","total":"509.24","aggregation":[{"percentage":"13.8","amount":"509.24"}]}],"totalDeductions":"1679.47","takeHomePay":"2166.68"}]}"""

  val BR_taxCode_response = """{"statePensionAge":false,"taxCode":"BR","payPerHour":"-1","hours":-1,"averageAnnualTaxRate":"23.67","marginalTaxRate":"22","maxTaxRate":"0.5","payeBand":"20","employeeNICBand":"2","tapered":false,"taxBreakdown":[{"period":"annual","grossPay":"200000.00","taxFreePay":"0","taxablePay":"200000.00","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"40000.00","aggregation":[{"percentage":"20","amount":"40000.00"},{"percentage":"40","amount":"0"},{"percentage":"45","amount":"0"}]},{"taxType":"employeeNationalInsurance","total":"7332.80","aggregation":[{"percentage":"12","amount":"4192.80"},{"percentage":"2","amount":"3140.00"}]},{"taxType":"employerNationalInsurance","total":"26480.54","aggregation":[{"percentage":"13.8","amount":"26480.54"}]}],"totalDeductions":"47332.80","takeHomePay":"152667.20"},{"period":"monthly","grossPay":"16666.67","taxFreePay":"0","taxablePay":"16666.67","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"3333.33","aggregation":[{"percentage":"20","amount":"3333.33"},{"percentage":"40","amount":"0.00"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"611.07","aggregation":[{"percentage":"12","amount":"349.40"},{"percentage":"2","amount":"261.67"}]},{"taxType":"employerNationalInsurance","total":"2206.71","aggregation":[{"percentage":"13.8","amount":"2206.71"}]}],"totalDeductions":"3944.40","takeHomePay":"12722.27"},{"period":"weekly","grossPay":"3846.15","taxFreePay":"0","taxablePay":"3846.15","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"769.23","aggregation":[{"percentage":"20","amount":"769.23"},{"percentage":"40","amount":"0.00"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"141.01","aggregation":[{"percentage":"12","amount":"80.63"},{"percentage":"2","amount":"60.38"}]},{"taxType":"employerNationalInsurance","total":"509.24","aggregation":[{"percentage":"13.8","amount":"509.24"}]}],"totalDeductions":"910.24","takeHomePay":"2935.91"}]}"""

  val NT_taxCode_response = """{"statePensionAge":false,"taxCode":"NT","payPerHour":"-1","hours":-1,"averageAnnualTaxRate":"3.67","marginalTaxRate":"2","maxTaxRate":"0.5","payeBand":"0","employeeNICBand":"2","tapered":false,"taxBreakdown":[{"period":"annual","grossPay":"200000.00","taxFreePay":"200000.00","taxablePay":"0.00","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"0.00","aggregation":[{"percentage":"20","amount":"0"},{"percentage":"40","amount":"0"},{"percentage":"45","amount":"0"}]},{"taxType":"employeeNationalInsurance","total":"7332.80","aggregation":[{"percentage":"12","amount":"4192.80"},{"percentage":"2","amount":"3140.00"}]},{"taxType":"employerNationalInsurance","total":"26480.54","aggregation":[{"percentage":"13.8","amount":"26480.54"}]}],"totalDeductions":"7332.80","takeHomePay":"192667.20"},{"period":"monthly","grossPay":"16666.67","taxFreePay":"16666.67","taxablePay":"0.00","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"0.00","aggregation":[{"percentage":"20","amount":"0.00"},{"percentage":"40","amount":"0.00"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"611.07","aggregation":[{"percentage":"12","amount":"349.40"},{"percentage":"2","amount":"261.67"}]},{"taxType":"employerNationalInsurance","total":"2206.71","aggregation":[{"percentage":"13.8","amount":"2206.71"}]}],"totalDeductions":"611.07","takeHomePay":"16055.60"},{"period":"weekly","grossPay":"3846.15","taxFreePay":"3846.15","taxablePay":"0.00","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"0.00","aggregation":[{"percentage":"20","amount":"0.00"},{"percentage":"40","amount":"0.00"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"141.01","aggregation":[{"percentage":"12","amount":"80.63"},{"percentage":"2","amount":"60.38"}]},{"taxType":"employerNationalInsurance","total":"509.24","aggregation":[{"percentage":"13.8","amount":"509.24"}]}],"totalDeductions":"141.01","takeHomePay":"3705.14"}]}"""

  val taxCalculator_2016_response = """{"statePensionAge":false,"taxCode":"1100T","payPerHour":"-1","hours":-1,"averageAnnualTaxRate":"2.33","marginalTaxRate":"12","maxTaxRate":"0.5","payeBand":"0","employeeNICBand":"12","tapered":false,"taxBreakdown":[{"period":"annual","grossPay":"10000.08","taxFreePay":"10000.08","taxablePay":"0.00","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"0.00","aggregation":[{"percentage":"20","amount":"0"},{"percentage":"40","amount":"0"},{"percentage":"45","amount":"0"}]},{"taxType":"employeeNationalInsurance","total":"232.81","aggregation":[{"percentage":"12","amount":"232.81"}]},{"taxType":"employerNationalInsurance","total":"260.55","aggregation":[{"percentage":"13.8","amount":"260.55"}]}],"totalDeductions":"232.81","takeHomePay":"9767.27"},{"period":"monthly","grossPay":"833.34","taxFreePay":"833.34","taxablePay":"0.00","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"0.00","aggregation":[{"percentage":"20","amount":"0.00"},{"percentage":"40","amount":"0.00"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"19.40","aggregation":[{"percentage":"12","amount":"19.40"}]},{"taxType":"employerNationalInsurance","total":"21.71","aggregation":[{"percentage":"13.8","amount":"21.71"}]}],"totalDeductions":"19.40","takeHomePay":"813.94"},{"period":"weekly","grossPay":"192.31","taxFreePay":"192.31","taxablePay":"0.00","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"0.00","aggregation":[{"percentage":"20","amount":"0.00"},{"percentage":"40","amount":"0.00"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"4.48","aggregation":[{"percentage":"12","amount":"4.48"}]},{"taxType":"employerNationalInsurance","total":"5.01","aggregation":[{"percentage":"13.8","amount":"5.01"}]}],"totalDeductions":"4.48","takeHomePay":"187.83"}]}"""

  val no_NIC_Contribution_section_response = """{"statePensionAge":true,"taxCode":"1100T","payPerHour":"-1","hours":-1,"averageAnnualTaxRate":"0.00","marginalTaxRate":"0","maxTaxRate":"0.5","payeBand":"0","employeeNICBand":"0","tapered":false,"taxBreakdown":[{"period":"annual","grossPay":"10000.08","taxFreePay":"10000.08","taxablePay":"0.00","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"0.00","aggregation":[{"percentage":"20","amount":"0"},{"percentage":"40","amount":"0"},{"percentage":"45","amount":"0"}]},{"taxType":"employeeNationalInsurance","total":"0","aggregation":[]},{"taxType":"employerNationalInsurance","total":"0","aggregation":[]}],"totalDeductions":"0.00","takeHomePay":"10000.08"},{"period":"monthly","grossPay":"833.34","taxFreePay":"833.34","taxablePay":"0.00","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"0.00","aggregation":[{"percentage":"20","amount":"0.00"},{"percentage":"40","amount":"0.00"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"0","aggregation":[]},{"taxType":"employerNationalInsurance","total":"0","aggregation":[]}],"totalDeductions":"0.00","takeHomePay":"833.34"},{"period":"weekly","grossPay":"192.31","taxFreePay":"192.31","taxablePay":"0.00","additionalTaxablePay":"0.00","scottishElement":"-1","maxTaxAmount":"-1","taxCategories":[{"taxType":"incomeTax","total":"0.00","aggregation":[{"percentage":"20","amount":"0.00"},{"percentage":"40","amount":"0.00"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"0","aggregation":[]},{"taxType":"employerNationalInsurance","total":"0","aggregation":[]}],"totalDeductions":"0.00","takeHomePay":"192.31"}]}"""

  val max_tax_response = """{"statePensionAge":false,"taxCode":"K4000","payPerHour":"-1","hours":-1,"averageAnnualTaxRate":"52.33","marginalTaxRate":"52","maxTaxRate":"0.5","payeBand":"40","employeeNICBand":"12","tapered":false,"taxBreakdown":[{"period":"annual","grossPay":"10000.00","taxFreePay":"0","taxablePay":"50009.00","additionalTaxablePay":"40009.00","scottishElement":"-1","maxTaxAmount":"5000.00","taxCategories":[{"taxType":"incomeTax","total":"13603.60","aggregation":[{"percentage":"20","amount":"6400.00"},{"percentage":"40","amount":"7203.60"},{"percentage":"45","amount":"0"}]},{"taxType":"employeeNationalInsurance","total":"232.80","aggregation":[{"percentage":"12","amount":"232.80"}]},{"taxType":"employerNationalInsurance","total":"260.54","aggregation":[{"percentage":"13.8","amount":"260.54"}]}],"totalDeductions":"5232.80","takeHomePay":"4767.20"},{"period":"monthly","grossPay":"833.33","taxFreePay":"0","taxablePay":"4167.42","additionalTaxablePay":"3334.08","scottishElement":"-1","maxTaxAmount":"416.67","taxCategories":[{"taxType":"incomeTax","total":"1133.63","aggregation":[{"percentage":"20","amount":"533.33"},{"percentage":"40","amount":"600.30"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"19.40","aggregation":[{"percentage":"12","amount":"19.40"}]},{"taxType":"employerNationalInsurance","total":"21.71","aggregation":[{"percentage":"13.8","amount":"21.71"}]}],"totalDeductions":"436.07","takeHomePay":"397.26"},{"period":"weekly","grossPay":"192.31","taxFreePay":"0","taxablePay":"961.71","additionalTaxablePay":"769.40","scottishElement":"-1","maxTaxAmount":"96.16","taxCategories":[{"taxType":"incomeTax","total":"261.61","aggregation":[{"percentage":"20","amount":"123.08"},{"percentage":"40","amount":"138.53"},{"percentage":"45","amount":"0.00"}]},{"taxType":"employeeNationalInsurance","total":"4.48","aggregation":[{"percentage":"12","amount":"4.48"}]},{"taxType":"employerNationalInsurance","total":"5.01","aggregation":[{"percentage":"13.8","amount":"5.01"}]}],"totalDeductions":"100.64","takeHomePay":"91.67"}]}"""
}
