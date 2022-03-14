# N5-challenge
Technical Test - Tech LEad N5 Company

# 1. **Document Control**

## 1.1 Version table ##

<table>
  <tr>
    <td colspan="4" style="background-color:#0574C1;text-align:center" >RECORDS OF CHANGES IN THE DOCUMENT</td>
 </tr>
  <tr>
    <td  style="text-align:center">Version</td>
    <td  style="text-align:center">Created by</td>
    <td  style="text-align:center">Date</td>
  </tr>
  <tr>
    <td>1.0</td>
    <td>Juan Carlos Acosta</td>
    <td>13-03-2022</td>
  </tr>  
</table>

# 2.  **Repository**
[N5 - Challenge - Juan Acosta](https://github.com/juankart-git/N5-challenge.git)

https://github.com/juankart-git/N5-challenge.git


# 3.  **Description**
Web API of the company N5 for the registration of user permissions

## 3.1 **API Endpoint Save Person**

### 3.1.1 **/api/v1/person**
HTTP POST service responsible for creating person records

### 3.1.2 **Request fields**
<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
  </tr> 
<tr>
    <td  style="text-align:left"><b>firstName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Person First Name</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>lastName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Person Last Name</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>birthday</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Birthday person</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>documentNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Person Document Number</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>gender</b></td>
    <td  style="text-align:left">Long</td>
    <td  style="text-align:left">Person ID Gender</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>documentType</b></td>
    <td  style="text-align:left">Long</td>
    <td  style="text-align:left">Person ID Document Type</td>
  </tr>
</table>

### 3.1.3 **JSON Structure**

#### 3.1.3.1 Request
 ```json
{
      "firstName": "First Name",
      "lastName": "Last Name",
      "birthday": "01/01/1991",
      "documentNumber": "12345",
      "gender": 1,
      "documentType": 1
}
```

## 3.2 **API Endpoint Update Person**

### 3.2.1 **/api/v1/person**
HTTP PUT service responsible for creating person records

### 3.2.2 **Request fields**
<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
  </tr> 
  <tr>
    <td  style="text-align:left"><b>id</b></td>
    <td  style="text-align:left">Long</td>
    <td  style="text-align:left">Unique identifier of the record</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>firstName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Person First Name</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>lastName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Person Last Name</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>birthday</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Birthday person</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>documentNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Person Document Number</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>gender</b></td>
    <td  style="text-align:left">Long</td>
    <td  style="text-align:left">Person ID Gender</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>documentType</b></td>
    <td  style="text-align:left">Long</td>
    <td  style="text-align:left">Person ID Document Type</td>
  </tr>
</table>

### 3.2.3 **JSON Structure**

#### 3.2.3.1 Request
 ```json
{
        "id": 1,
        "firstName": "First Name",
        "lastName": "Last Name",
        "birthday": "01/01/1991",
        "documentNumber": "12345",
        "gender": 1,
        "documentType": 1
}
```
## 3.3 **API Endpoint Delete Person**

### 3.3.1 **/api/v1/person**
HTTP DELETE service responsible for deleteing person

### 3.3.2 **Request fields**
<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
  </tr> 
  <tr>
    <td  style="text-align:left"><b>id</b></td>
    <td  style="text-align:left">Long</td>
    <td  style="text-align:left">Unique identifier of the record</td>
  </tr>
</table>

### 3.3.3 **JSON Structure**

#### 3.3.3.1 Request
 ```json
{
        "id": 1,
        "firstName": "First Name",
        "lastName": "Last Name",
        "birthday": "01/01/1991",
        "documentNumber": "12345",
        "gender": 1,
        "documentType": 1
}
```
## 3.4 **API Endpoint Get All Persons**

### 3.4.1 **/api/v1/person**
HTTP GET service responsible for get all person

## 3.5 **API Endpoint Get One Person**

### 3.5.1 **/api/v1/person/$id**
HTTP GET service responsible for get one person by ID


