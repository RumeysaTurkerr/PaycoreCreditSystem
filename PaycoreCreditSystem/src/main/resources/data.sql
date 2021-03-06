DROP TABLE IF EXISTS customer cascade;
DROP TABLE IF EXISTS score;
CREATE TABLE customer(
    id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    nationalIdentificationNumber VARCHAR(11) NOT NULL UNIQUE,
    name VARCHAR (25) NOT NULL,
    surname VARCHAR(25) NOT NULL,
    monthlyIncome INT NOT NULL,
    phoneNumber VARCHAR(11) NOT NULL UNIQUE
);
CREATE TABLE score(
    id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    customerId INT NOT NULL,
    creditScore VARCHAR(10) NOT NULL,
    FOREIGN KEY(customerId) REFERENCES customer(id)
);
