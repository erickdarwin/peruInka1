
CREATE TABLE enterprice
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	businessName         VARCHAR(50) NULL,
	ruc                  VARCHAR(11) NULL,
	address              VARCHAR(80) NULL,
	phone                VARCHAR(25) NULL,
	status               VARCHAR(20) NULL,
	createdBy            VARCHAR(20) NULL,
	dateCreated          TIMESTAMP NULL,
	dateLastUpdated      TIMESTAMP NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	version              INTEGER NULL,
	PRIMARY KEY (id)
);



CREATE TABLE person
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	name                 VARCHAR(30) NULL,
	lastNameF            VARCHAR(25) NULL,
	lastNameM            VARCHAR(25) NULL,
	typeDocument         VARCHAR(20) NULL,
	numDocument          VARCHAR(20) NULL,
	phone                VARCHAR(25) NULL,
	address              VARCHAR(70) NULL,
	status               VARCHAR(20) NULL,
	PRIMARY KEY (id)
);



CREATE TABLE customer
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	enterpriceId         BIGINT NULL,
	personId             BIGINT NULL,
	status               VARCHAR(20) NULL,
	createdBy            VARCHAR(20) NULL,
	dateCreated          TIMESTAMP NULL,
	dateLastUpdated      TIMESTAMP NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	version              INTEGER NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_16 (enterpriceId) REFERENCES enterprice (id),
	FOREIGN KEY R_17 (personId) REFERENCES person (id)
);



CREATE TABLE invoice
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	enterpriceId         BIGINT NULL,
	date                 TIMESTAMP NULL,
	numInvoice           VARCHAR(12) NULL,
	status               VARCHAR(20) NULL,
	typeInvoice          VARCHAR(20) NULL,
	subTotal             DECIMAL(5,2) NULL,
	total                DECIMAL(5,2) NULL,
	igv                  DECIMAL(5,2) NULL,
	customerId           BIGINT NULL,
	createdBy            VARCHAR(20) NULL,
	dateCreated          TIMESTAMP NULL,
	dateLastUpdated      TIMESTAMP NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	version              INTEGER NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_22 (customerId) REFERENCES customer (id),
	FOREIGN KEY R_25 (enterpriceId) REFERENCES enterprice (id)
);



CREATE TABLE hotel
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	businessName         VARCHAR(50) NULL,
	ruc                  VARCHAR(11) NULL,
	address              VARCHAR(80) NULL,
	phone                VARCHAR(25) NULL,
	status               VARCHAR(20) NULL,
	personId             BIGINT NULL,
	root                 VARCHAR(15) NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_18 (personId) REFERENCES person (id)
);



CREATE TABLE product
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	productName          VARCHAR(30) NULL,
	price                DECIMAL(5,2) NULL,
	description          VARCHAR(60) NULL,
	attribute            VARCHAR(20) NULL,
	status               VARCHAR(20) NULL,
	hotelId              BIGINT NULL,
	productType          VARCHAR(20) NULL,
	createBy             VARCHAR(20) NULL,
	dateCreated          TIMESTAMP NULL,
	dateLastUpdated      TIMESTAMP NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	version              INTEGER NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_3 (hotelId) REFERENCES hotel (id)
);



CREATE TABLE invoiceDescription
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	invoiceId            BIGINT NULL,
	quantity             INTEGER NULL,
	priceUnitary         DECIMAL(5,2) NULL,
	priceAll             DECIMAL(5,2) NULL,
	productId            BIGINT NULL,
	createdBy            VARCHAR(20) NULL,
	dateCreated          TIMESTAMP NULL,
	dateLastUpdated      TIMESTAMP NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	version              INTEGER NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_19 (invoiceId) REFERENCES invoice (id),
	FOREIGN KEY R_20 (productId) REFERENCES product (id)
);



CREATE TABLE ticket
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	dateIni              TIMESTAMP NULL,
	dateEn               TIMESTAMP NULL,
	customerId           BIGINT NULL,
	createdBy            VARCHAR(20) NULL,
	dateCreated          VARCHAR(20) NULL,
	dateLastUpdated      VARCHAR(20) NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	version              VARCHAR(20) NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_21 (customerId) REFERENCES customer (id)
);



CREATE TABLE ticketDescription
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	productId            BIGINT NULL,
	ticketId             BIGINT NULL,
	quantity             VARCHAR(20) NULL,
	priceUnitary         VARCHAR(20) NULL,
	priceAll             VARCHAR(20) NULL,
	comment              VARCHAR(50) NULL,
	status               VARCHAR(20) NULL,
	createdy             VARCHAR(20) NULL,
	dateCreated          TIMESTAMP NULL,
	dateLastUpdated      TIMESTAMP NULL,
	lastUpdatedBy        VARCHAR(20) NULL,
	version              INTEGER NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_14 (productId) REFERENCES product (id),
	FOREIGN KEY R_15 (ticketId) REFERENCES ticket (id)
);



CREATE TABLE role
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	roleName             VARCHAR(40) NULL,
	description          VARCHAR(60) NULL,
	roleValue            VARCHAR(20) NULL,
	status               VARCHAR(20) NULL,
	PRIMARY KEY (id)
);



CREATE TABLE userSystem
(
	id                   BIGINT NOT NULL AUTO_INCREMENT,
	userName             VARCHAR(20) NULL,
	userPassword         VARCHAR(20) NULL,
	dateIni              TIMESTAMP NULL,
	dateEnd              TIMESTAMP NULL,
	status               VARCHAR(20) NULL,
	personId             BIGINT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY R_9 (personId) REFERENCES person (id)
);



CREATE TABLE accessRole
(
	rolId                BIGINT NOT NULL,
	userSystemId         BIGINT NOT NULL,
	hotelId              BIGINT NOT NULL,
	createBy             VARCHAR(20) NULL,
	dateCreated          TIMESTAMP NULL,
	PRIMARY KEY (rolId,userSystemId,hotelId),
	FOREIGN KEY R_13 (rolId) REFERENCES role (id),
	FOREIGN KEY R_23 (userSystemId) REFERENCES userSystem (id),
	FOREIGN KEY R_24 (hotelId) REFERENCES hotel (id)
);



CREATE TABLE baseType
(
	typeCode             VARCHAR(20) NOT NULL,
	typeCategory         VARCHAR(20) NULL,
	description          VARCHAR(100) NULL,
	attribute1           VARCHAR(20) NULL,
	orderBy              INTEGER NULL,
	PRIMARY KEY (typeCode)
);


