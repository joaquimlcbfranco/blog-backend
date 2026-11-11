CREATE SCHEMA blog;

CREATE TABLE posts (
    id UUID NOT NULL,
    title VARCHAR(250) NOT NULL,
    description VARCHAR(250),
    created_by VARCHAR (50),
    updated_by VARCHAR (50),
    created_at DATE NOT NULL,
    updated_at DATE NOT NULL
);