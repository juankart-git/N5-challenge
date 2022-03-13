Feature: Get All Persons
  Background:
    * url 'http://localhost:8080/api/v1'
    * header Content-Type = 'application/json'
    And header Accept-Encoding = 'gzip, deflate, br'
    And header Connection = 'Keep-Alive'
    And header Accept = '*/*'
    And header charset = 'utf-8'
    And header Connection = 'keep-alive'

  # Get All Person
  Scenario: Get All Persons API
    Given path  '/person'
    When method GET
    Then status 200
    And print response


  # CRUD Person
  Scenario: Create Persons API

     # Create Person
    Given path  '/person'
    And request  {"firstName": "First Name", "lastName": "Last Name", "birthday": "01/01/1991", "documentNumber": "12345", "gender": 1, "documentType": 1 }
    When method POST
    Then status 201
    And print response
    And def idPerson = response.id
    And print idPerson

    # Get Created Person
    Given path  '/person/' + idPerson
    When method GET
    Then status 200
    And print response

  # Update Created Person
    Given path  '/person'
    * def jsonRequestUpdate = '{ "id": ' + idPerson + ', "firstName": "First", "lastName": "Last", "birthday": "01/00/1001", "documentNumber": "54321", "gender": 2, "documentType": 2 }'
    * header Content-Type = 'application/json'
    And print jsonRequestUpdate
    And request  jsonRequestUpdate
    When method PUT
    Then status 201
    And print response

  # Delete Created Person
    Given path  '/person'
    * def jsonRequestDelete = '{ "id": ' + idPerson + '}'
    * header Content-Type = 'application/json'
    And print jsonRequestDelete
    And request  jsonRequestDelete
    When method DELETE
    Then status 204
    And print response
