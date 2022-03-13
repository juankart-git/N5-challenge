Feature: Get All Gender
  Background:
    * url 'http://localhost:8080/api/v1'
    * header Content-Type = 'application/json'
    And header Accept-Encoding = 'gzip, deflate, br'
    And header Connection = 'Keep-Alive'
    And header Accept = '*/*'
    And header charset = 'utf-8'
    And header Connection = 'keep-alive'

  # Get All Gender
  Scenario: Get All Gender API
    Given path  '/gender'
    When method GET
    Then status 200
    And print response


  # CRUD Gender
  Scenario: Create Gender API

     # Create Gender
    Given path  '/gender'
    And request  {"name": "Name", "description": "Description"}
    When method POST
    Then status 201
    And print response
    And def idGender = response.id
    And print idGender

    # Get Created Gender
    Given path  '/gender/' + idGender
    When method GET
    Then status 200
    And print response

  # Update Created Gender
    Given path  '/gender'
    * def jsonRequestUpdate = '{ "id": ' + idGender + ', "name": "First", "description": "Last" }'
    * header Content-Type = 'application/json'
    And print jsonRequestUpdate
    And request  jsonRequestUpdate
    When method PUT
    Then status 201
    And print response

  # Delete Created Gender
    Given path  '/gender'
    * def jsonRequestDelete = '{ "id": ' + idGender + '}'
    * header Content-Type = 'application/json'
    And print jsonRequestDelete
    And request  jsonRequestDelete
    When method DELETE
    Then status 204
    And print response
