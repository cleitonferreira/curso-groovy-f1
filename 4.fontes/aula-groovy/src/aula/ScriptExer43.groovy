import groovy.sql.Sql

// exercício 1
def valor = 10
def resultado = 0;
valor.times() {
	println it
	resultado += it
}
println resultado

// exercício 2
Sql con = Sql.newInstance("jdbc:hsqldb:file:D:/Java/hsqldb-2.3.4/bases/aula;shutdown=true", "sa", "1234")
con.eachRow("select * from cliente") { c-> println c.nome}