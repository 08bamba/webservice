package bancKApi.bancKApi.soap;



import banckApi.model.Account;
import banckApi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AccountSoapService {

    private static final String NAMESPACE_URI = "http://banckApi/soap";

    @Autowired
    private AccountService accountService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBalanceRequest")
    @ResponsePayload
    public GetBalanceResponse getBalance(@RequestPayload GetBalanceRequest request) {
        Account account = accountService.getBalance(request.getAccountId());
        GetBalanceResponse response = new GetBalanceResponse();
        response.setBalance(account.getBalance());
        response.setCurrency(account.getCurrency());
        return response;
    }


}

