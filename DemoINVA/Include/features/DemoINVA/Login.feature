Feature: User login validate credentials

  @LoginOnSite
  Scenario: User login the site with validate credentials
    Given User click on login button
    When User enter username and password
    And User click on login
    Then User is redirected on Homepage
