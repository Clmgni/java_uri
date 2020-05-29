publicclassAppQueUsaTV{
publicstaticvoidmain(Stringargs[]){
inta;
Stringb;
floatc;
 
Televisaot = newTelevisao();
Televisaot2 = newTelevisao();
 
t.marca = "Samsung da Suite Imperial";
t.tamanho = 60;
t.voltagem = 110;
t.ligada = false;
t.canal = 5;
t.volume = 8;
t.tipo = "Smart";
 
t2.marca = "LG ultra da Sala de TV";
t2.tamanho = 80;
t2.voltagem = 110;
t2.ligada = false;
t2.canal = 549;
t2.volume = 8;
t2.tipo = "Exclusive";
 
t.ligar();
t.avancarCanal();
t.mudarCanal(500);
 
t2.avancarCanal();

 }
}

