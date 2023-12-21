package com.projeto.pagamentos.resouces;

import com.projeto.pagamentos.domain.Payroll;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {
    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(
                new Payroll("val",payment.getDescription(),payment.getHourlyPrices(),100.0,payment.getHourlyPrices() * payment.getWorkedHours())
        );
    }
}
