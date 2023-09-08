Feature: Application Login

  Background: 

    When launch the browser from configurables variables
    And hit the home page url of banking site

  @RegressionTest @NetBanking
  Scenario: User Page default login
    Given User is on netbanking landing page
    When User login into application with "user" and password "0987"
    Then Home Page is displayed
    And Cards are displayed

  @SmokeTest @RegressionTest @Mortgage
  Scenario Outline: Mortgage User Page default login
    Given User is on netbanking landing page
    When User login into application with "<Username>" and password "<Password>"
    Then Home Page is displayed
    And Cards are displayed

    Examples: 
      | Username   | Password |
      | debituser  |     1234 |
      | credituser |     8765 |