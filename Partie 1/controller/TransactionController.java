package bancKApi.bancKApi.controller;



import banckApi.model.Transaction;
import banckApi.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts/{accountId}/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public Page<Transaction> getTransactions(@PathVariable String accountId,
                                             @RequestParam int page,
                                             @RequestParam int size) {
        return transactionService.getTransactions(accountId, page, size);
    }
}

