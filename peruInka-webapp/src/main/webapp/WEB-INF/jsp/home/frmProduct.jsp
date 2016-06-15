<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2"></div>
		<div class="span10">


			<legend>Formulario Product : ${opc}</legend>
			<form:form commandName="product" action="saveProduct" method="POST">

				<table>
					<tr>
						<td>Nombre:</td>
						<td><form:input path="productName" />
						<td />
					</tr>
					<tr>
						<td>Precio:</td>
						<td><form:input path="price" />
						<td />
					</tr>
					<tr>
						<td>Descripcion:</td>
						<td><form:input path="description" />
						<td />
					</tr>
					<tr>
						<td>atributo:</td>
						<td><form:input path="attribute" />
						<td />
					</tr>

					<tr>
						<td>Hotel:</td>
						<td><form:select path="hotel.id">
								<option value="">Seleccione</option>
								<form:options items="${hoteles}" itemValue="id"
									itemLabel="businessName" />
							</form:select></td>
					</tr>

					<tr>
						<td>Estado</td>
						<td><form:select path="statusProduct.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusProduct}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>


					<tr>
						<td colspan="2"><button type="submit" class="btn btn-success">Guardar</button>
						<td />
					</tr>
				</table>

				<input type="hidden" name="opc" id="opc" value="${opc}">
				<form:hidden path="id" />
				<br>


			</form:form>


		</div>
	</div>
</div>


