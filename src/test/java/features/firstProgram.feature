Feature: Application Login

  Background: 
    Given setup de entries in the database
    When launch the browser from configurables variables
    And hit the home page url of banking site

  @RegressionTest
  Scenario: Admin Page default login
    When User login into application with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

  @MobileTest
  Scenario: User Page default login
    Given User is on netbanking landing page
    When User login into application with "user" and password "0987"
    Then Home Page is displayed
    And Cards are displayed

  @SmokeTest @RegressionTest
  Scenario Outline: Mortgage User Page default login
    Given User is on netbanking landing page
    When User login into application with "<Username>" and password "<Password>"
    Then Home Page is displayed
    And Cards are displayed

    Examples: 
      | Username   | Password |
      | debituser  |     1234 |
      | credituser |     8765 |

  @SmokeTest
  Scenario: User Page default Sign up
    Given User is on Practice landing page
    When User login into application
      | rahul             |
      | shetty            |
      | contact@email.com |
      |       54903434353 |
    Then Home Page is displayed
    And Cards are displayed
