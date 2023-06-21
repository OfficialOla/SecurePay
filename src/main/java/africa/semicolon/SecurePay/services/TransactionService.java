package africa.semicolon.SecurePay.services;

import africa.semicolon.SecurePay.dtos.response.ApiResponse;
import africa.semicolon.SecurePay.dtos.response.TransactionInitiationRequest;
import africa.semicolon.SecurePay.dtos.response.TransactionResponse;

import java.util.List;

public interface TransactionService {
//    TransactionInitiationResponse initiateTransaction(TransactionInitiationRequest transactionInitiationRequest);

    TransactionResponse getTransactionsById(Long id);

    List<TransactionResponse> getAllTransactions();

    ApiResponse<?> deleteTransactions();

    void deleteAll();

}

