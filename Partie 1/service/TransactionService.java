package bancKApi.bancKApi.service;



import banckApi.model.Transaction;
import banckApi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Page<Transaction> getTransactions(String accountId, int page, int size) {
        return transactionRepository.findByAccountId(accountId, PageRequest.of(page, size));
    }


}
