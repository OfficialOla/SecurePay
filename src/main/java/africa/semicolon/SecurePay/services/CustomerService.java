package africa.semicolon.SecurePay.services;

import africa.semicolon.SecurePay.dtos.request.CustomerRegistrationRequest;
import africa.semicolon.SecurePay.dtos.response.ApiResponse;
import africa.semicolon.SecurePay.dtos.response.CustomerRegistrationResponse;
import africa.semicolon.SecurePay.dtos.response.CustomerResponse;
import africa.semicolon.SecurePay.exceptions.CustomerRegistrationFailedException;
import africa.semicolon.SecurePay.exceptions.ProfileUpdateFailedException;
import africa.semicolon.SecurePay.exceptions.UserNotFoundException;
import com.github.fge.jsonpatch.JsonPatch;

import java.util.List;

public interface CustomerService {

    CustomerRegistrationResponse register(CustomerRegistrationRequest customerRegistrationRequest) throws CustomerRegistrationFailedException;

    CustomerResponse getCustomerById(Long id) throws UserNotFoundException;



    List<CustomerResponse> getAllCustomers(int page, int items);

    ApiResponse<?> deleteCustomer(Long id);

    void deleteAll();

    ApiResponse<?> updateCustomerDetails(Long id, JsonPatch jsonPatch) throws UserNotFoundException, ProfileUpdateFailedException;
}
