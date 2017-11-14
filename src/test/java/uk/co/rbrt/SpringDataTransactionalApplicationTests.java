package uk.co.rbrt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataTransactionalApplicationTests
{
	@Autowired
	PersonRepository personRepository;

	@Test
    @Transactional
    public void testRequiresExistingTransaction()
    {
        personRepository.requiresExistingTransaction();
    }

    @Test
    public void testWillStartTransactionIfNoneExists()
    {
        personRepository.willStartTransactionIfNoneExists();
    }
}
