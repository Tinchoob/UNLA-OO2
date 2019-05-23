/*INSPECTOR*/

insert into inspector values(1,"Hector","Carballo",332211);
insert into inspector values(2,"Scott","Lang",998811);
insert into inspector values(3,"Ernesto","Juarez",112233);

select * from inspector;


/*ZONA*/
insert into zona values(1,"Burzaco");
insert into zona values(2,"Quilmes");
insert into zona values(3,"Banfield");

select * from zona;


/*INSPECTORXZONA*/
insert into inspectorxzona values(1,1);	-- INSPECTOR 1 EN ZONA 1
insert into inspectorxzona values(1,2);	-- INSPECTOR 1 EN ZONA 2
insert into inspectorxzona values(2,2); -- INSPECTOR 2 EN ZONA 2
insert into inspectorxzona values(2,3); -- INSPECTOR 2 EN ZONA 3
insert into inspectorxzona values(3,3); -- INSPECTOR 3 EN ZONA 3

select * from inspectorxzona;

/*CLIENTE*/		-- primero se carga en tabla cliente, despues CON EL MISMO ID en personaF o personaJ, sino no se puede.
insert into cliente values(1,"922");
insert into personafisica values(1,"Ignacio","Montania",4105567);
insert into contacto values(1,"igna@gmail.com","1533121","4211-2211");

insert into cliente values(2,"923");
insert into personafisica values(2,"Martin","Bombara",4133212);

insert into cliente values(3,"140");
insert into personajuridica values(3,"Universidad de Lanus","2213299");

insert into cliente values(4,"141");
insert into personajuridica values(4,"Herreria Martinez","1138721");


select * from cliente,personafisica where cliente.idCliente=personaFisica.idPersonaFisica;
select * from cliente,personajuridica where cliente.idCliente=personajuridica.idPersonaJuridica;



/*MEDIDOR*/ -- unicos clientes con medidores son 1 y 3
insert into medidor values(1,123,"Quintana 312",0,1,1); -- el cliente 1 tiene 2 medidores, uno en la zona 1, el otro en la zona 2
insert into medidor values(2,231,"25 de mayo 122",0,2,1);

insert into medidor values(3,222,"Avenida Avellaneda 2377",0,3,3);
insert into medidor values(4,226,"Avenida Corrientes 112",0,2,3);

select * from medidor;

/*LECTURAS*/
insert into lectura values(1,now(),1,1);
insert into lectura values(2,'2019-05-20 09:22:12',2,2);

select * from lectura;



/*TARIFA*/ -- ingresar primero la superclase y luego la subclase
insert into tarifa values(1,"Luz",'2019-1-1');
insert into tarifabaja values(1);

/*tarifabaja*/
insert into detallebaja values(1,"Cargo fijo","$/mes",0,150,32.82,1);
insert into detallebaja values(2,"Cargo variable","$/kWh",0,150,2.653,1); -- ok

insert into detallebaja values(3,"Cargo fijo","$/mes",151,325,56.11,1);
insert into detallebaja values(4,"Cargo variable","$/kWh",151,325,2.651,1); -- ok

insert into detallebaja values(5,"Cargo fijo","$/mes",326,400,91.73,1);
insert into detallebaja values(6,"Cargo variable","$/kWh",326,400,2.705,1); -- ok

insert into detallebaja values(7,"Cargo fijo","$/mes",401,450,107.34,1);  -- ok
insert into detallebaja values(8,"Cargo variable","$/kWh",0,150,2.785,1);

insert into detallebaja values(9,"Cargo fijo","$/mes",451,500,161.66,1);	-- ok
insert into detallebaja values(10,"Cargo variable","$/kWh",451,500,2.864,1);

insert into detallebaja values(11,"Cargo fijo","$/mes",501,600,316,1);		-- ok
insert into detallebaja values(12,"Cargo variable","$/kWh",501,600,2.918,1);

insert into detallebaja values(13,"Cargo fijo","$/mes",601,700,850.24,1);	-- ok
insert into detallebaja values(14,"Cargo variable","$/kWh",601,700,3.309,1);	-- ok

insert into detallebaja values(15,"Cargo fijo","$/mes",701,1400,1203.64,1);			-- ok
insert into detallebaja values(16,"Cargo variable","$/kWh",701,1400,3.411,1);

insert into detallebaja values(17,"Cargo fijo","$/mes",1400,99999,1442.88,1);		-- ok
insert into detallebaja values(18,"Cargo variable","$/kWh",1400,99999,3.437,1);



/*traer la tarifa y sus detalles*/
select * from tarifabaja as t
inner join detallebaja as d on 
t.idTarifaBaja=d.idTarifaBaja;











