<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Usuarios

<br>
<a href="frmUserSystem">Nueva Persona</a>
<br>

<display:table name="${listUserSystem}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
 	
	<display:column title="Usuario" property="userName" />
 	
	<display:column title="Nombres" property="person.name" />
	<display:column title="Ape Paterno" property="person.lastNameF" />
	<display:column title="Ape Paterno" property="person.lastNameM" />
	<display:column title="Tipo Documento" property="person.typeDocument.description" />
	<display:column title="Numero Documento" property="person.numDocument" />
	<display:column title="Estado" property="statusUser.description" />
	<display:column title="OPC">
		<a href="editUserSystem?id=${item.id}">Modificar</a>
		<a href="deleteUserSystem?id=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>