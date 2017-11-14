A simple project to demonstrate the use of the `@Transactional` annotation in a Custom Spring Data JPA repository.

* Spring Boot 1.5.8 RELEASE
* Spring Data JPA 1.11.8.RELEASE (Ingalls SR8)

There are two methods in the `PersonRepositoryCustom`
* requiresExistingTransaction()
* willStartTransactionIfNoneExists()

The `requiresExistingTransaction` method relies on the class (type) level `@Transactional` annotation to provide
MANDATORY propagation where as the `willStartTransactionIfNoneExists` method overrides the class (type) level annotation
to provide REQUIRES_NEW propagation.

The tests demonstrate that the overidden `@Transactional` does not appear to work.