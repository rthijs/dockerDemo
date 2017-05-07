CREATE TABLE public.quote (
	id int8 NOT NULL,
	author varchar(255) NULL,
	quote varchar(1023) NULL,
	CONSTRAINT quote_pkey PRIMARY KEY (id)
);

CREATE SEQUENCE public.seq_quote INCREMENT BY 1;