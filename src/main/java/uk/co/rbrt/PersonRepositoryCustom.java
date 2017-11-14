package uk.co.rbrt;

/**
 * @author <a href="mailto:roberthunt87@gmail.com">Robert Hunt</a>
 */
public interface PersonRepositoryCustom
{
    void requiresExistingTransaction();
    void willStartTransactionIfNoneExists();
}
