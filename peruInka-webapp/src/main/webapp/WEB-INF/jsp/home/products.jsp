<%@ include file = "/WEB-INF/jsp/include/taglibs.jsp"%>

Bienvenido a la cadena de hotel PeruInka

<br>
<a href="frmProduct">Nuevo Producto</a>
<br>
<display:table name="${productos}" id="p" class="table">
 	<display:column title="Codigo" property="id" />
	<display:column title="Nombre" property="productName" />
	<display:column title="precio" property="price" />
	<display:column title="descripcion" property="description" />
	<display:column title="atributpo" property="attribute" />
	<display:column title="Estado" property="statusProduct.description" />
	<display:column title="hotel" property="hotel.businessName" />
	
	<display:column title="OPC">
		<a href="editProduct?id_=${p.id}">Modificar</a>
		<a href="deleteProduct?id_=${p.id}">Eliminar</a>
	</display:column>
	
</display:table>