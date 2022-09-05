Feature: User login on the Site

  @OpenURLandCookies
  Scenario Outline: User navigate the site
    Given User enter the site
    When User accept cookies
    Then User can navigate site
