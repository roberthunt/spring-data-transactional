package uk.co.rbrt;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author <a href="mailto:roberthunt87@gmail.com">Robert Hunt</a>
 */
@Transactional(propagation = Propagation.MANDATORY)
public class PersonRepositoryImpl implements PersonRepositoryCustom
{
    @Override
    public void requiresExistingTransaction()
    {
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void willStartTransactionIfNoneExists()
    {
    }
}
