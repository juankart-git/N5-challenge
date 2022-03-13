Feature: Get All Access
  Background:
    * url 'http://localhost:8080/api/v1'
    * header Content-Type = 'application/json'
    And header Accept-Encoding = 'gzip, deflate, br'
    And header Connection = 'Keep-Alive'
    And header Accept = '*/*'
    And header charset = 'utf-8'
    And header Connection = 'keep-alive'

  # Get All Access
  Scenario: Get All Access API
    Given path  '/access'
    When method GET
    Then status 200
    And print response


  # CRUD Access
  Scenario: Create Access API

     # Create Access
    Given path  '/access'
    And request  {"name": "Name", "description": "Description"}
    When method POST
    Then status 201
    And print response
    And def idAccess = response.id
    And print idAccess

    # Get Created Access
    Given path  '/access/' + idAccess
    When method GET
    Then status 200
    And print response

  # Update Created Access
    Given path  '/access'
    * def jsonRequestUpdate = '{ "id": ' + idAccess + ', "name": "First", "description": "Last" }'
    * header Content-Type = 'application/json'
    And print jsonRequestUpdate
    And request  jsonRequestUpdate
    When method PUT
    Then status 201
    And print response

  # Delete Created Access
    Given path  '/access'
    * def jsonRequestDelete = '{ "id": ' + idAccess + '}'
    * header Content-Type = 'application/json'
    And print jsonRequestDelete
    And request  jsonRequestDelete
    When method DELETE
    Then status 204
    And print response
