import classes.Comissao;

def comissoes = [new Comissao(valor: 100.50), new Comissao(valor: 200.50), new Comissao(valor: 300.50)]

def vlComissao = 5.70
comissoes.each { c ->  c.comissao = c.valor * vlComissao / 10 }
comissoes