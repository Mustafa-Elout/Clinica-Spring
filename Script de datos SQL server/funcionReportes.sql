create FUNCTION TABLA_CONSULTASPORDIA()
Returns table
as
return (
select convert(varchar,fecha,1)as fecha, count(*) as cantidad from consulta group by fecha
);