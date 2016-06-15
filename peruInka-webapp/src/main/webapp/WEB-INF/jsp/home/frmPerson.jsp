<%@ include file="/WEB-INF/jsp/include/taglibs.jsp"%>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span2">MENBU</div>
		<div class="span10">


			<legend>Formulario Persona : ${opc}</legend>
			<form:form commandName="person" action="savePerson" method="POST">

				<table>
					<tr>
						<td>Nombre:</td>
						<td><form:input path="name" id="name" />
						<td />
					</tr>
					<tr>
						<td>Apellido Paterno:</td>
						<td><form:input path="lastNameF" id="lastNameF" />
						<td />
					</tr>
					<tr>
						<td>Apellido Materno:</td>
						<td><form:input path="lastNameM" id="lastNameM" />
						<td />
					</tr>
					<tr>
						<td>Tipo Documento</td>
						<td><form:select path="typeDocument.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${typeDocument}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>
					<tr>
						<td>Numero de Documento:</td>
						<td><form:input path="numDocument" id="numDocument" />
						<td />
					</tr>

					<tr>
						<td>Estado</td>
						<td><form:select path="statusPerson.typeCode">
								<option value="">Seleccione</option>
								<form:options items="${statusPerson}" itemValue="typeCode"
									itemLabel="description" />
							</form:select></td>
					</tr>

					<tr>
						<td colspan="2"><button type="submit" class="btn btn-success">Guardar</button>
						<td />
					</tr>
				</table>

				<%-- DNI: <form:input path="dni" id="dni"/><br> --%>

				<input type="hidden" name="opc" id="opc" value="${opc}">
				<form:hidden path="id" />
				<br>


			</form:form>


		</div>
	</div>
</div>


