package com.soliva.loans.controller.dto;

import com.soliva.loans.domain.LoanType;

public record LoanResponse(LoanType type,
                           Double interestRate) {
}
