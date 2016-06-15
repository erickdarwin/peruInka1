<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Bienvenido a la cadena de hotel PeruInka

<br>
<a href="frmHotel">Nuevo Hotel</a>
<br>
<display:table name="${hoteles}" id="h" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Nombre" property="businessName" />
	<display:column title="RUC" property="ruc" />
	<display:column title="Direccion" property="address" />
	<display:column title="Telefono" property="phone" />
	<display:column title="Estado" property="statusHotel.description" />
	<display:column title="OPC">
		<a href="editHotel?id_=${h.id}">Modificar</a>
		<a href="deleteHotel?id_=${h.id}">Eliminar</a>
	</display:column>
	
</display:table>