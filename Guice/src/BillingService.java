
import com.google.inject.Inject;

public class BillingService {
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    @Inject
    public BillingService(CreditCardProcessor processor,
                          TransactionLog transactionLog) {
        this.processor = processor;
        this.transactionLog = transactionLog;
    }

    @SuppressWarnings({ "static-method", "unused" })
    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {
        throw new UnsupportedOperationException();
    }

    public String toString(){
        return "CCP " + this.processor + "\n" + "Trans " + this.transactionLog; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    }
}