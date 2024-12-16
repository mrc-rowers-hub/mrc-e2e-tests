#Feature: Smoketest
#  Scenario: User can open app
#    Given I print something
#    Then Something is printed

  Feature: User Login
    Scenario: Successful login
      Given a correct username and password is entered
      Then user is taken to the homepage