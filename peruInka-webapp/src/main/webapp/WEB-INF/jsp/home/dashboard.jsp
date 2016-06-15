<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Bienvenido a la cadena de hotel PeruInka

<br>
<a href="frmPerson">Nueva Persona</a>
<br>
<display:table name="${listPerson}" id="item" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Nombres" property="name" />
	<display:column title="Ape Paterno" property="lastNameF" />
	<display:column title="Ape Paterno" property="lastNameM" />
	<display:column title="Tipo Documento" property="typeDocument" />
	<display:column title="Tipo Documento DESC" property="typeDocument.description" />
	<display:column title="Numero Documento" property="numDocument" />
	<display:column title="Estado" property="statusPerson.description" />
	<display:column title="OPC">
		<a href="editPerson?id_=${item.id}">Modificar</a>
		<a href="deletePerson?id_=${item.id}">Eliminar</a>
	</display:column>
	
</display:table>