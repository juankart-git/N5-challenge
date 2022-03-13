# N5-challenge
Technical Test - Tech LEad N5 Company

# 1. **Control del Documento**

## 1.1 Tabla de versiones ##

<table>
  <tr>
    <td colspan="4" style="background-color:#0574C1;text-align:center" >REGISTROS DE CAMBIOS EN EL DOCUMENTO</td>
 </tr>
  <tr>
    <td  style="text-align:center">Versión</td>
    <td  style="text-align:center">Motivo</td>
    <td  style="text-align:center">Realizado por</td>
    <td  style="text-align:center">Fecha</td>
  </tr>
  <tr>
    <td>1.0</td>
    <td></td>
    <td>Juan Carlos Acosta</td>
    <td>14-02-2022</td>
  </tr>  
</table>

## 1.2 Descripción ##
<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Versión</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
 </tr>
  <tr>
    <td  style="text-align:center">1.0</td>
    <td  style="text-align:center">Versión actual de la funcionalidad</td>
  </tr>
</table>

# 2.  **Repositorio**
[AW1170001_SV_Accounts](https://grupobancolombia.visualstudio.com/Vicepresidencia%20Servicios%20de%20Tecnolog%C3%ADa/_git/AW1170001_SV_Accounts)


# 3.  **Descripción**
Componente encargado de realizar las transacciones referentes a la gestion CRUD de las cuentas favoritas bancolombia.

## 3.1 **API Endpoint Guardar Favorito**

### 3.1.1 **/sv-accounts/save-favorite**
------

### 3.1.2 **Campos de la petición (Request)**
<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
  </tr> 
  <tr>
    <td  style="text-align:left"><b>header</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Direccion IP de origen de la peticion</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>header.id</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Identificador unico de la trasnaccion web</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>header.type</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Nombre del Path de la transaccion</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientIp</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Direccion IP de origen de la peticion</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>channelId</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Identificador del canal al cual esta accediendo</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>userAgent</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de origen de la peticion (navegador, app)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>consumerId</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo de indentificacion del consimidor</td>
  </tr>
   <tr>
    <td  style="text-align:left"><b>type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta (favoriteAccount)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>businessDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente persona juridica</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>businessDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nuemro de identificacion del cliente persona juridica</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nuemro de identificacion del cliente</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta destino (ahorros / corriente)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de cuenta a crear</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre de la cuenta</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Atributos adicionales en formato Json</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes.accountCategory</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Categoria de la cuenta</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes.bankCode</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo del banco de la cuenta favorita a guardar</td>
  </tr>

</table>

### 3.1.3 **Campos de la respuesta exitosa (Response)**

<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Descripción</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>data</b></td>
    <td  style="text-align:left">ARRAY</td>
    <td  style="text-align:left">Miembro de nivel superior dentro de la definición del estándar Open API</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>header</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Datos del encabezado</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>header.id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Identificador de la transacción enviada</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>header.type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre del Path de la transacción </td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Id de respuesta transacción </td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Objeto con la información de la cuenta favorita creada</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account.type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account.businessDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de identificación cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.businessDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de documento cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.clientDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.clientDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Documento del cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountCategory</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Categoría de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.bankCode</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Código del banco</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Objeto con los datos de la fecha de creación e inserción</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createDate</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createDateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateDate</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Hora de la ultima actualización del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateDateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de la ultima actualización del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account._rev</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Campo del  documento de la BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account._id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Campo del documento de la BD</td>
  </tr>
</table>


### 3.1.4 **Campos de respuesta fallida (Response)**

<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
 </tr>
   <tr>
    <td  style="text-align:left"><b>errors</b></td>
    <td  style="text-align:left">ARRAY</td>
    <td  style="text-align:left">Miembro de nivel superior dentro de la definición del estándar Open API</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>title</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Siempre va con el valor Error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>code</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Código del error que se generó durante la transacción</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>detail</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Mensaje con la descripción del error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>source</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Hace referencia a la ruta donde se generó el error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>detail</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Detalle técnico del error</td>
  </tr>

</table>

### 3.1.5 **Estructura JSON**

#### 3.1.5.1 Request
 ```json
{
	"data":
	[
		{
			"header":{
				"id":"SU123456789",
				"type":"account"
			},
			"type":"favoriteAccount",
			"businessDocumentType":"CC",
			"businessDocument":"72245772",
			"clientDocumentType":"CC",
			"clientDocument":"72245772",
			"accountType":"Cuenta ahorros",
			"accountNumber":"40672101007",
			"accountName":"",
			"attributes":{
				"accountCategory":"propio",
				"bankCode":"0"
			},
			"clientIp":"1.1.1.1",
			"channelId":"NDB",
			"consumerId":"string",
			"userAgent":"string"
		}
	]
}
```


#### 3.1.5.2 Successful Response
 ```json
{
    "data": [
        {
            "id": "79a43afcd0ef4f6f885da2c2e0cd17b0",
            "account": {
                "type": "favoriteAccount",
                "businessDocumentType": "CC",
                "businessDocument": "72245772",
                "clientDocumentType": "CC",
                "clientDocument": "72245772",
                "accountType": "SU874334859",
                "accountNumber": "40672101007",
                "accountName": "",
                "accountCategory": "propio",
                "bankCode": "0",
                "date": {
                    "createDate": "2022/02/15",
                    "createTime": "15:08:12.841",
                    "createDateTime": "2022/02/15 15:08:12.841",
                    "updateDate": "2022/02/15",
                    "updateTime": "15:08:12.841",
                    "updateDateTime": "2022/02/15 15:08:12.841"
                },
                "_rev": "1-0695355a07f75a420b566914ee2e6abf",
                "_id": "79a43afcd0ef4f6f885da2c2e0cd17b0"
            },
            "header": {
                "id": "SU123456789",
                "type": "accounts"
            },
            "code": "0000"
        }
    ]
}
```


#### 3.1.5.3 Failure response
 ```json
{
    "errors": [
        {
            "code": "0012",
            "detail": "La cuenta ya está registrada",
            "source": "/sv-accounts/save-favorite",
            "status": "424",
            "title": "Error"
        }
    ]
}
```

## 3.2. **API Endpoint Verificar Cuenta**

### 3.2.1 **/sv-accounts/verify-account**
------

### 3.2.2 **Campos de la petición (Request)**
<table>
  <tr> 
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
  </tr> 
  <tr>
    <td  style="text-align:left"><b>header</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Direccion IP de origen de la petición</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>header.id</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Identificador unico de la transacción web</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>header.type</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Nombre del Path de la transaccion</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientIp</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Direccion IP de origen de la peticion</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>channelId</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Identificador del canal al cual esta accediendo</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>userAgent</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de origen de la peticion (navegador, app)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>consumerId</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo de indentificacion del consimidor</td>
  </tr>
   <tr>
    <td  style="text-align:left"><b>type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta (favoriteAccount)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>businessDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente persona juridica</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>businessDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nuemro de identificacion del cliente persona juridica</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nuemro de identificacion del cliente</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta destino (ahorros / corriente)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de cuenta a crear</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre de la cuenta</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Atributos adicionales en formato Json</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes.accountCategory</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Categoria de la cuenta</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes.bankCode</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo del banco de la cuenta favorita a guardar</td>
  </tr>

</table>

### 3.2.3 **Campos de la respuesta exitosa (Response)**

<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Descripción</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>data</b></td>
    <td  style="text-align:left">ARRAY</td>
    <td  style="text-align:left">Miembro de nivel superior dentro de la definición del estándar Open API</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>header</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Datos del encabezado</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>header.id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Identificador de la transaccion enviada</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>header.type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre del Path de la transaccion</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Id de respuesta transaccion</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Objecto con la informacion de la cuenta favorita creada</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account.type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account.businessDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de identificacion cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.businessDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de docuemnto cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.clientDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.clientDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Docuemnto del cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountCategory</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Categoria de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.bankCode</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo del banco</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Objecto con los datos de la fecha de creacion e insercion</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createDate</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createDateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateDate</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Hora de la ultima actualización del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateDateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de la ultima actualización del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account._rev</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Campo del  documento de la BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account._id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Campo del documento de la BD</td>
  </tr>
</table>


### 3.2.4 **Campos de respuesta fallida (Response)**

<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
 </tr>
   <tr>
    <td  style="text-align:left"><b>errors</b></td>
    <td  style="text-align:left">ARRAY</td>
    <td  style="text-align:left">Miembro de nivel superior dentro de la definición del estándar Open API</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>title</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Siempre va con el valor Error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>code</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Código del error que se generó durante la transacción</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>detail</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Mensaje con la descripción del error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>source</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Hace referencia a la ruta donde se generó el error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>detail</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Detalle técnico del error</td>
  </tr>

</table>

### 3.2.5 **Estructura JSON**

#### 3.2.5.1 Request
 ```json
{
	"data":
	[
		{
			"header":{
				"id":"SU123456789",
				"type":"account"
			},
			"type":"favoriteAccount",
			"businessDocumentType":"CC",
			"businessDocument":"72245772",
			"clientDocumentType":"CC",
			"clientDocument":"72245772",
			"accountType":"Cuenta ahorros",
			"accountNumber":"40672101007",
			"accountName":"",
			"attributes":{
				"accountCategory":"propio",
				"bankCode":"0"
			},
			"clientIp":"1.1.1.1",
			"channelId":"NDB",
			"consumerId":"string",
			"userAgent":"string"
		}
	]
}
```


#### 3.2.5.2 Successful Response
 ```json
{
    "data": [
        {
            "id": "79a43afcd0ef4f6f885da2c2e0cd17b0",
            "account": {
                "type": "favoriteAccount",
                "businessDocumentType": "CC",
                "businessDocument": "72245772",
                "clientDocumentType": "CC",
                "clientDocument": "72245772",
                "accountType": "SU874334859",
                "accountNumber": "40672101007",
                "accountName": "",
                "accountCategory": "propio",
                "bankCode": "0",
                "date": {
                    "createDate": "2022/02/15",
                    "createTime": "15:08:12.841",
                    "createDateTime": "2022/02/15 15:08:12.841",
                    "updateDate": "2022/02/15",
                    "updateTime": "15:08:12.841",
                    "updateDateTime": "2022/02/15 15:08:12.841"
                },
                "_rev": "1-0695355a07f75a420b566914ee2e6abf",
                "_id": "79a43afcd0ef4f6f885da2c2e0cd17b0"
            },
            "header": {
                "id": "SU123456789",
                "type": "accounts"
            },
            "code": "0000"
        }
    ]
}
```


#### 3.2.5.3 Failure response
 ```json
{
    "errors": [
        {
            "code": "0012",
            "detail": "La cuenta ya está registrada",
            "source": "/sv-accounts/save-favorite",
            "status": "424",
            "title": "Error"
        }
    ]
}
```

## 3.3. **API Endpoint Eliminar Favorito**


### 3.3.1 **/sv-accounts/delete-favorite**
------

### 3.3.2 **Campos de la petición (Request)**
<table>
  <tr> 
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
  </tr> 
  <tr>
    <td  style="text-align:left"><b>header</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Direccion IP de origen de la petición</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>header.id</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Identificador unico de la transacción web</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>header.type</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Nombre del Path de la transaccion</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientIp</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Direccion IP de origen de la peticion</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>channelId</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Identificador del canal al cual esta accediendo</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>userAgent</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de origen de la peticion (navegador, app)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>consumerId</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo de indentificacion del consimidor</td>
  </tr>
   <tr>
    <td  style="text-align:left"><b>type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta (favoriteAccount)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>businessDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente persona juridica</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>businessDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nuemro de identificacion del cliente persona juridica</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nuemro de identificacion del cliente</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta destino (ahorros / corriente)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de cuenta a crear</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre de la cuenta</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Atributos adicionales en formato Json</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes.accountCategory</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Categoria de la cuenta</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes.bankCode</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo del banco de la cuenta favorita a guardar</td>
  </tr>

</table>

### 3.3.3 **Campos de la respuesta exitosa (Response)**

<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Descripción</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>data</b></td>
    <td  style="text-align:left">ARRAY</td>
    <td  style="text-align:left">Miembro de nivel superior dentro de la definición del estándar Open API</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>header</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Datos del encabezado</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>header.id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Identificador de la transaccion enviada</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>header.type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre del Path de la transaccion</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Id de respuesta transaccion</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Objecto con la informacion de la cuenta favorita creada</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account.type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account.businessDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de identificacion cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.businessDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de docuemnto cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.clientDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.clientDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Docuemnto del cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountCategory</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Categoria de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.bankCode</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo del banco</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Objecto con los datos de la fecha de creacion e insercion</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createDate</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createDateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateDate</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Hora de la ultima actualización del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateDateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de la ultima actualización del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account._rev</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Campo del  documento de la BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account._id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Campo del documento de la BD</td>
  </tr>
</table>


### 3.3.4 **Campos de respuesta fallida (Response)**

<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
 </tr>
   <tr>
    <td  style="text-align:left"><b>errors</b></td>
    <td  style="text-align:left">ARRAY</td>
    <td  style="text-align:left">Miembro de nivel superior dentro de la definición del estándar Open API</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>title</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Siempre va con el valor Error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>code</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Código del error que se generó durante la transacción</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>detail</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Mensaje con la descripción del error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>source</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Hace referencia a la ruta donde se generó el error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>detail</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Detalle técnico del error</td>
  </tr>

</table>

### 3.3.5 **Estructura JSON**

#### 3.3.5.1 Request
 ```json
{
	"data":
	[
		{
			"header":{
				"id":"SU123456789",
				"type":"account"
			},
			"type":"favoriteAccount",
			"businessDocumentType":"CC",
			"businessDocument":"72245772",
			"clientDocumentType":"CC",
			"clientDocument":"72245772",
			"accountType":"Cuenta ahorros",
			"accountNumber":"40672101007",
			"accountName":"",
			"attributes":{
				"accountCategory":"propio",
				"bankCode":"0"
			},
			"clientIp":"1.1.1.1",
			"channelId":"NDB",
			"consumerId":"string",
			"userAgent":"string"
		}
	]
}
```


#### 3.3.5.2 Successful Response
 ```json
{
    "data": [
        {
            "id": "79a43afcd0ef4f6f885da2c2e0cd17b0",
            "account": {
                "type": "favoriteAccount",
                "businessDocumentType": "CC",
                "businessDocument": "72245772",
                "clientDocumentType": "CC",
                "clientDocument": "72245772",
                "accountType": "SU874334859",
                "accountNumber": "40672101007",
                "accountName": "",
                "accountCategory": "propio",
                "bankCode": "0",
                "date": {
                    "createDate": "2022/02/15",
                    "createTime": "15:08:12.841",
                    "createDateTime": "2022/02/15 15:08:12.841",
                    "updateDate": "2022/02/15",
                    "updateTime": "15:08:12.841",
                    "updateDateTime": "2022/02/15 15:08:12.841"
                },
                "_rev": "1-0695355a07f75a420b566914ee2e6abf",
                "_id": "79a43afcd0ef4f6f885da2c2e0cd17b0"
            },
            "header": {
                "id": "SU123456789",
                "type": "accounts"
            },
            "code": "0000"
        }
    ]
}
```


#### 3.3.5.3 Failure response
 ```json
{
    "errors": [
        {
            "code": "0012",
            "detail": "La cuenta ya está registrada",
            "source": "/sv-accounts/save-favorite",
            "status": "424",
            "title": "Error"
        }
    ]
}
```

## 3.4. **API Endpoint Actualizar Favorito**

### 3.4.1 **/sv-accounts/update-favorite**
------

### 3.4.2 **Campos de la petición (Request)**
<table>
  <tr> 
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
  </tr> 
  <tr>
    <td  style="text-align:left"><b>header</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Direccion IP de origen de la petición</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>header.id</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Identificador unico de la transacción web</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>header.type</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Nombre del Path de la transaccion</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientIp</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Direccion IP de origen de la peticion</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>channelId</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Identificador del canal al cual esta accediendo</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>userAgent</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de origen de la peticion (navegador, app)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>consumerId</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo de indentificacion del consimidor</td>
  </tr>
   <tr>
    <td  style="text-align:left"><b>type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta (favoriteAccount)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>businessDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente persona juridica</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>businessDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nuemro de identificacion del cliente persona juridica</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nuemro de identificacion del cliente</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta destino (ahorros / corriente)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de cuenta a crear</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre de la cuenta</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Atributos adicionales en formato Json</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes.accountCategory</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Categoria de la cuenta</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes.bankCode</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo del banco de la cuenta favorita a guardar</td>
  </tr>

</table>

### 3.4.3 **Campos de la respuesta exitosa (Response)**

<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Descripción</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>data</b></td>
    <td  style="text-align:left">ARRAY</td>
    <td  style="text-align:left">Miembro de nivel superior dentro de la definición del estándar Open API</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>header</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Datos del encabezado</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>header.id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Identificador de la transaccion enviada</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>header.type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre del Path de la transaccion</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Id de respuesta transaccion</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Objecto con la informacion de la cuenta favorita creada</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account.type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account.businessDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de identificacion cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.businessDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de docuemnto cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.clientDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.clientDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Docuemnto del cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountCategory</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Categoria de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.bankCode</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo del banco</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Objecto con los datos de la fecha de creacion e insercion</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createDate</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createDateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateDate</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Hora de la ultima actualización del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateDateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de la ultima actualización del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account._rev</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Campo del  documento de la BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account._id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Campo del documento de la BD</td>
  </tr>
</table>


### 3.4.4 **Campos de respuesta fallida (Response)**

<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
 </tr>
   <tr>
    <td  style="text-align:left"><b>errors</b></td>
    <td  style="text-align:left">ARRAY</td>
    <td  style="text-align:left">Miembro de nivel superior dentro de la definición del estándar Open API</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>title</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Siempre va con el valor Error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>code</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Código del error que se generó durante la transacción</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>detail</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Mensaje con la descripción del error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>source</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Hace referencia a la ruta donde se generó el error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>detail</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Detalle técnico del error</td>
  </tr>

</table>

### 3.4.5 **Estructura JSON**

#### 3.4.5.1 Request
 ```json
{
	"data":
	[
		{
			"header":{
				"id":"SU123456789",
				"type":"account"
			},
			"type":"favoriteAccount",
			"businessDocumentType":"CC",
			"businessDocument":"72245772",
			"clientDocumentType":"CC",
			"clientDocument":"72245772",
			"accountType":"Cuenta ahorros",
			"accountNumber":"40672101007",
			"accountName":"",
			"attributes":{
				"accountCategory":"propio",
				"bankCode":"0"
			},
			"clientIp":"1.1.1.1",
			"channelId":"NDB",
			"consumerId":"string",
			"userAgent":"string"
		}
	]
}
```


#### 3.4.5.2 Successful Response
 ```json
{
    "data": [
        {
            "id": "79a43afcd0ef4f6f885da2c2e0cd17b0",
            "account": {
                "type": "favoriteAccount",
                "businessDocumentType": "CC",
                "businessDocument": "72245772",
                "clientDocumentType": "CC",
                "clientDocument": "72245772",
                "accountType": "SU874334859",
                "accountNumber": "40672101007",
                "accountName": "",
                "accountCategory": "propio",
                "bankCode": "0",
                "date": {
                    "createDate": "2022/02/15",
                    "createTime": "15:08:12.841",
                    "createDateTime": "2022/02/15 15:08:12.841",
                    "updateDate": "2022/02/15",
                    "updateTime": "15:08:12.841",
                    "updateDateTime": "2022/02/15 15:08:12.841"
                },
                "_rev": "1-0695355a07f75a420b566914ee2e6abf",
                "_id": "79a43afcd0ef4f6f885da2c2e0cd17b0"
            },
            "header": {
                "id": "SU123456789",
                "type": "accounts"
            },
            "code": "0000"
        }
    ]
}
```


#### 3.4.5.3 Failure response
 ```json
{
    "errors": [
        {
            "code": "0012",
            "detail": "La cuenta ya está registrada",
            "source": "/sv-accounts/save-favorite",
            "status": "424",
            "title": "Error"
        }
    ]
}
```

## 3.5. **API Endpoint Registrar Favorito**


### 3.5.1 **/sv-accounts/register-favorites**
------

### 3.5.2 **Campos de la petición (Request)**
<table>
  <tr> 
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
  </tr> 
  <tr>
    <td  style="text-align:left"><b>header</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Direccion IP de origen de la petición</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>header.id</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Identificador unico de la transacción web</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>header.type</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Nombre del Path de la transaccion</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientIp</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Direccion IP de origen de la peticion</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>channelId</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Identificador del canal al cual esta accediendo</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>userAgent</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de origen de la peticion (navegador, app)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>consumerId</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo de indentificacion del consimidor</td>
  </tr>
   <tr>
    <td  style="text-align:left"><b>type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta (favoriteAccount)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>businessDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente persona juridica</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>businessDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nuemro de identificacion del cliente persona juridica</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nuemro de identificacion del cliente</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta destino (ahorros / corriente)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de cuenta a crear</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre de la cuenta</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Atributos adicionales en formato Json</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes.accountCategory</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Categoria de la cuenta</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes.bankCode</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo del banco de la cuenta favorita a guardar</td>
  </tr>

</table>

### 3.5.3 **Campos de la respuesta exitosa (Response)**

<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Descripción</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>data</b></td>
    <td  style="text-align:left">ARRAY</td>
    <td  style="text-align:left">Miembro de nivel superior dentro de la definición del estándar Open API</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>header</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Datos del encabezado</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>header.id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Identificador de la transaccion enviada</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>header.type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre del Path de la transaccion</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Id de respuesta transaccion</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Objecto con la informacion de la cuenta favorita creada</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account.type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account.businessDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de identificacion cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.businessDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de docuemnto cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.clientDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.clientDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Docuemnto del cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountCategory</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Categoria de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.bankCode</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo del banco</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Objecto con los datos de la fecha de creacion e insercion</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createDate</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createDateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateDate</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Hora de la ultima actualización del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateDateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de la ultima actualización del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account._rev</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Campo del  documento de la BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account._id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Campo del documento de la BD</td>
  </tr>
</table>


### 3.5.4 **Campos de respuesta fallida (Response)**

<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
 </tr>
   <tr>
    <td  style="text-align:left"><b>errors</b></td>
    <td  style="text-align:left">ARRAY</td>
    <td  style="text-align:left">Miembro de nivel superior dentro de la definición del estándar Open API</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>title</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Siempre va con el valor Error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>code</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Código del error que se generó durante la transacción</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>detail</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Mensaje con la descripción del error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>source</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Hace referencia a la ruta donde se generó el error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>detail</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Detalle técnico del error</td>
  </tr>

</table>

### 3.5.5 **Estructura JSON**

#### 3.5.5.1 Request
 ```json
{
	"data":
	[
		{
			"header":{
				"id":"SU123456789",
				"type":"account"
			},
			"type":"favoriteAccount",
			"businessDocumentType":"CC",
			"businessDocument":"72245772",
			"clientDocumentType":"CC",
			"clientDocument":"72245772",
			"accountType":"Cuenta ahorros",
			"accountNumber":"40672101007",
			"accountName":"",
			"attributes":{
				"accountCategory":"propio",
				"bankCode":"0"
			},
			"clientIp":"1.1.1.1",
			"channelId":"NDB",
			"consumerId":"string",
			"userAgent":"string"
		}
	]
}
```


#### 3.5.5.2 Successful Response
 ```json
{
    "data": [
        {
            "id": "79a43afcd0ef4f6f885da2c2e0cd17b0",
            "account": {
                "type": "favoriteAccount",
                "businessDocumentType": "CC",
                "businessDocument": "72245772",
                "clientDocumentType": "CC",
                "clientDocument": "72245772",
                "accountType": "SU874334859",
                "accountNumber": "40672101007",
                "accountName": "",
                "accountCategory": "propio",
                "bankCode": "0",
                "date": {
                    "createDate": "2022/02/15",
                    "createTime": "15:08:12.841",
                    "createDateTime": "2022/02/15 15:08:12.841",
                    "updateDate": "2022/02/15",
                    "updateTime": "15:08:12.841",
                    "updateDateTime": "2022/02/15 15:08:12.841"
                },
                "_rev": "1-0695355a07f75a420b566914ee2e6abf",
                "_id": "79a43afcd0ef4f6f885da2c2e0cd17b0"
            },
            "header": {
                "id": "SU123456789",
                "type": "accounts"
            },
            "code": "0000"
        }
    ]
}
```


#### 3.5.5.3 Failure response
 ```json
{
    "errors": [
        {
            "code": "0012",
            "detail": "La cuenta ya está registrada",
            "source": "/sv-accounts/save-favorite",
            "status": "424",
            "title": "Error"
        }
    ]
}
```

## 3.6. **API Endpoint Buscar Favorito**

### 3.6.1 **/sv-accounts/find**
------

### 3.6.2 **Campos de la petición (Request)**
<table>
  <tr> 
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
  </tr> 
  <tr>
    <td  style="text-align:left"><b>header</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Direccion IP de origen de la petición</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>header.id</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Identificador unico de la transacción web</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>header.type</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Nombre del Path de la transaccion</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientIp</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Direccion IP de origen de la peticion</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>channelId</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Identificador del canal al cual esta accediendo</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>userAgent</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de origen de la peticion (navegador, app)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>consumerId</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo de indentificacion del consimidor</td>
  </tr>
   <tr>
    <td  style="text-align:left"><b>type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta (favoriteAccount)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>businessDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente persona juridica</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>businessDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nuemro de identificacion del cliente persona juridica</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>clientDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nuemro de identificacion del cliente</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta destino (ahorros / corriente)</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de cuenta a crear</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>accountName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre de la cuenta</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Atributos adicionales en formato Json</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes.accountCategory</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Categoria de la cuenta</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>attributes.bankCode</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo del banco de la cuenta favorita a guardar</td>
  </tr>

</table>

### 3.6.3 **Campos de la respuesta exitosa (Response)**

<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center">Descripción</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>data</b></td>
    <td  style="text-align:left">ARRAY</td>
    <td  style="text-align:left">Miembro de nivel superior dentro de la definición del estándar Open API</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>header</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Datos del encabezado</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>header.id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Identificador de la transaccion enviada</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>header.type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre del Path de la transaccion</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Id de respuesta transaccion</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Objecto con la informacion de la cuenta favorita creada</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account.type</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de cuenta</td>
 </tr>
 <tr>
    <td  style="text-align:left"><b>account.businessDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de identificacion cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.businessDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de docuemnto cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.clientDocumentType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de documento del cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.clientDocument</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Docuemnto del cliente</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountType</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Tipo de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountNumber</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Numero de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountName</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Nombre de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.accountCategory</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Categoria de la cuenta</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.bankCode</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Codigo del banco</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date</b></td>
    <td  style="text-align:left">Json Object</td>
    <td  style="text-align:left">Objecto con los datos de la fecha de creacion e insercion</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createDate</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.createDateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateDate</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de creación del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Hora de la ultima actualización del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account.date.updateDateTime</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Fecha y hora de la ultima actualización del documento en BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account._rev</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Campo del  documento de la BD</td>
  </tr>
<tr>
    <td  style="text-align:left"><b>account._id</b></td>
    <td  style="text-align:left">Alfanumérico</td>
    <td  style="text-align:left">Campo del documento de la BD</td>
  </tr>
</table>


### 3.6.4 **Campos de respuesta fallida (Response)**

<table>
  <tr>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Campo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Tipo</td>
    <td colspan="1" style="background-color:#0574C1;text-align:center" >Descripción</td>
 </tr>
   <tr>
    <td  style="text-align:left"><b>errors</b></td>
    <td  style="text-align:left">ARRAY</td>
    <td  style="text-align:left">Miembro de nivel superior dentro de la definición del estándar Open API</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>title</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Siempre va con el valor Error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>code</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Código del error que se generó durante la transacción</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>detail</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Mensaje con la descripción del error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>source</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Hace referencia a la ruta donde se generó el error</td>
  </tr>
  <tr>
    <td  style="text-align:left"><b>detail</b></td>
    <td  style="text-align:left">STRING</td>
    <td  style="text-align:left">Detalle técnico del error</td>
  </tr>

</table>

### 3.6.5 **Estructura JSON**

#### 3.6.5.1 Request
 ```json
{
	"data":
	[
		{
			"header":{
				"id":"SU123456789",
				"type":"account"
			},
			"type":"favoriteAccount",
			"businessDocumentType":"CC",
			"businessDocument":"72245772",
			"clientDocumentType":"CC",
			"clientDocument":"72245772",
			"accountType":"Cuenta ahorros",
			"accountNumber":"40672101007",
			"accountName":"",
			"attributes":{
				"accountCategory":"propio",
				"bankCode":"0"
			},
			"clientIp":"1.1.1.1",
			"channelId":"NDB",
			"consumerId":"string",
			"userAgent":"string"
		}
	]
}
```


#### 3.6.5.2 Successful Response
 ```json
{
    "data": [
        {
            "id": "79a43afcd0ef4f6f885da2c2e0cd17b0",
            "account": {
                "type": "favoriteAccount",
                "businessDocumentType": "CC",
                "businessDocument": "72245772",
                "clientDocumentType": "CC",
                "clientDocument": "72245772",
                "accountType": "SU874334859",
                "accountNumber": "40672101007",
                "accountName": "",
                "accountCategory": "propio",
                "bankCode": "0",
                "date": {
                    "createDate": "2022/02/15",
                    "createTime": "15:08:12.841",
                    "createDateTime": "2022/02/15 15:08:12.841",
                    "updateDate": "2022/02/15",
                    "updateTime": "15:08:12.841",
                    "updateDateTime": "2022/02/15 15:08:12.841"
                },
                "_rev": "1-0695355a07f75a420b566914ee2e6abf",
                "_id": "79a43afcd0ef4f6f885da2c2e0cd17b0"
            },
            "header": {
                "id": "SU123456789",
                "type": "accounts"
            },
            "code": "0000"
        }
    ]
}
```


#### 3.6.5.3 Failure response
 ```json
{
    "errors": [
        {
            "code": "0012",
            "detail": "La cuenta ya está registrada",
            "source": "/sv-accounts/save-favorite",
            "status": "424",
            "title": "Error"
        }
    ]
}
```



# 4.  **Diagramas**
## 4.1  **Diagrama de componentes**

![transfer-Page-1.drawio.png](/.attachments/transfer-Page-1.drawio-18c0bab6-9ee9-428f-afc8-769da0300890.png)
<table>
  <tr style="background-color:#0574C1;text-align:center">
    <td style="text-align:center">Componente</td>
    <td style="text-align:center" colspan="2">Descripción</td>
  </tr>
  <tr>
    <td rowspan="2">AW1170001_SV_Transfer</td>
    <td colspan="2" >Componente encargado de realizar las transferencias hacia cuentas bancolombia, tanto ahorros como corriente</td>
  </tr>  
  <tr>    
    <td><b>Cuenta corriente header services</b> <br> current-account-transfer</td>
    <td><b>Cuenta ahorros header services </b><br> saving-account-transfer</td>
  </tr> 
</table>

### 4.1.1 **Recursos**

## 4.2  **Diagrama de secuencia**

Transferencias:

![transfer-Page-2.drawio.png](/.attachments/transfer-Page-2.drawio-2dc75ba9-80ca-4a0a-aae3-4abe94e60abe.png)

### 4.2.1 **Consulta log técnico**


Transferencias cuenta corriente:
```json
{
   "selector": {
      "service": "/v4/current-account-transfer",
      "transactionRequest.date": {
         "$gt": "2022/02/05 18:30"
      }
   }
}
```

Transferencias cuenta ahorros:
```json
{
   "selector": {
      "service": "/v4/saving-account-transfer",
      "transactionRequest.date": {
         "$gt": "2022/02/05 18:30"
      }
   }
}
```


# 5. **Pipelines**

## 5.1 **Configuración en el RM**

Desarrollo: [Editar pipeline](https://grupobancolombia.visualstudio.com/Vicepresidencia%20Servicios%20de%20Tecnolog%C3%ADa/_releaseDefinition?definitionId=3902&_a=environments-editor-preview)

Certificación: [Editar pipeline](https://grupobancolombia.visualstudio.com/Vicepresidencia%20Servicios%20de%20Tecnolog%C3%ADa/_releaseDefinition?definitionId=13877&_a=environments-editor-preview)

Producción: [Editar pipeline](https://grupobancolombia.visualstudio.com/Vicepresidencia%20Servicios%20de%20Tecnolog%C3%ADa/_releaseDefinition?definitionId=13910&_a=environments-editor-preview)


## 5.2 **Configuración en el Build**

Pipeline de Build: [Editar pipeline](https://grupobancolombia.visualstudio.com/Vicepresidencia%20Servicios%20de%20Tecnolog%C3%ADa/_apps/hub/ms.vss-ciworkflow.build-ci-hub?_a=edit-build-definition&id=14458)




