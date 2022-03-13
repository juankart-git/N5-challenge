Feature: Get All Document Type
  Background:
    * url 'http://localhost:8080/api/v1'
    * header Content-Type = 'application/json'
    And header Accept-Encoding = 'gzip, deflate, br'
    And header Connection = 'Keep-Alive'
    And header Accept = '*/*'
    And header charset = 'utf-8'
    And header Connection = 'keep-alive'

  # Get All Document Type
  Scenario: Get All Document Type API
    Given path  '/document_type'
    When method GET
    Then status 200
    And print response


  # CRUD Document Type
  Scenario: Create Document Type API

     # Create Document Type
    Given path  '/document_type'
    And request  {"name": "Name", "description": "Description" }
    When method POST
    Then status 201
    And print response
    And def idDocumentType = response.id
    And print idDocumentType

    # Get Created Document Type
    Given path  '/document_type/' + idDocumentType
    When method GET
    Then status 200
    And print response

  # Update Created Document Type
    Given path  '/document_type'
    * def jsonRequestUpdate = '{ "id": ' + idDocumentType + ', "name": "First", "description": "Last" }'
    * header Content-Type = 'application/json'
    And print jsonRequestUpdate
    And request  jsonRequestUpdate
    When method PUT
    Then status 201
    And print response

  # Delete Created Document Type
    Given path  '/document_type'
    * def jsonRequestDelete = '{ "id": ' + idDocumentType + '}'
    * header Content-Type = 'application/json'
    And print jsonRequestDelete
    And request  jsonRequestDelete
    When method DELETE
    Then status 204
    And print response
