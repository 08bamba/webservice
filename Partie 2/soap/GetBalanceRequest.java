package bancKApi.bancKApi.soap;



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getBalanceRequest")
public class GetBalanceRequest {
    private String accountId;

    @XmlElement
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}

