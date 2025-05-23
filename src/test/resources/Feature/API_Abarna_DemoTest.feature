@Regression
Feature: API_Abarna_DemoTest

@Sanity
Scenario Outline: Get List Users of ReqRes Api
  Given Give the domain name of reqres
  When send the get request with the resource url of reqres
  Then validate the response code of reqres
  Examples:
    | dummy |
    | test  |

@Smoke
Scenario Outline: Get single User of ReqRes Api
  Given Give the domain name of reqres
  When send the get request with the single resource url of reqres
  Then validate the response code get of reqres
  Examples:
    | dummy |
    | test  |

@Smoke
Scenario Outline: Get single user not found of ReqRes Api
  Given Give the domain name of reqres
  When send get request in server of reqres
  Then validate the negative response code of reqres
  Examples:
    | dummy |
    | test  |

@Smoke
Scenario Outline: Get delayed response of ReqRes Api
  Given Give the domain name of reqres
  When Get delayed response in server of reqres
  Then validate the response code of reqres
  Examples:
    | dummy |
    | test  |

@Smoke
Scenario Outline: delete a User of ReqRes Api
  Given Give the domain name of reqres
  When delete user in server of reqres
  Then validate the delete response code of reqres
  Examples:
    | dummy |
    | test  |

@Smoke
Scenario Outline: Update user name successfully
  Given I have the user ID and new user name
  When I send a Patch request to update user details
  Then The response should contain the updated name
  Examples:
    | dummy |
    | test  |

@Smoke
Scenario Outline: verified with valid credentials
  Given I set base URI
  When I send POST request to /auth with valid credential
  Then I should get the 200 OK response
  And I should receives a token in response
  Examples:
    | dummy |
    | test  |
