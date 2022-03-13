Feature: Get All Access By Person
  Background:
    * url 'http://localhost:8080/api/v1'
    * header Content-Type = 'application/json'
    And header Accept-Encoding = 'gzip, deflate, br'
    And header Connection = 'Keep-Alive'
    And header Accept = '*/*'
    And header charset = 'utf-8'
    And header Connection = 'keep-alive'

  # Get All Access By Person
  Scenario: Get All Access By Person API
    Given path  '/access_by_person'
    When method GET
    Then status 200
    And print response

