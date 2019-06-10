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

insert into contacto values(2,"tinchi@yahoo.com","155133123","4288-1234");
insert into contacto values(3,"unla@edu.ar","11332213","5088-9012");
insert into contacto values(4,"hierrosMart@edu.ar","156675563","4255-8811");


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
insert into lectura values(3,now(),1,3);
insert into lecturaaltademanda values(3,"AT",150,100,200,300);

insert into lecturabajademanda values(1,560);
insert into lecturabajademanda values(2,900);

select * from lectura;



/*TARIFA*/ -- ingresar primero la superclase y luego la subclase
insert into tarifa values(1,"Luz Baja Demanda",'2019-1-1');
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



/*traer la tarifa de baja y sus detalles*/
select * from tarifabaja as t
inner join detallebaja as d on 
t.idTarifaBaja=d.idTarifaBaja;

-- ****************************************************************************
-- ******************************* 27/05/2019 *********************************
-- ****************************************************************************

insert into tarifa values(2,"Luz BT",'2019-1-1');
-- TARIFA ALTA
-- necesito 3 tablas de tarifaalta diferentes, una para cada tension (BT,MT,AT) y si supera o no el limite (BT<300, BT>300, MT<300, MT>300, AT<300, AT>300)
-- ademas cada vez que creo una tarifaalta debo crear una tabla tarifa because herencia

insert into tarifaalta values(2,"BT",300);

-- BT<300
insert into detallealta values(1,"Cargo Fijo","$/mes",0,3226.41,2);
insert into detallealta values(2,"Cargo Variable Pico","$/kWh",0,2.260,2);
insert into detallealta values(3,"Cargo Variable Resto","$/kWh",0,2.160,2);
insert into detallealta values(4,"Cargo Variable Valle","$/kWh",0,2.061,2);

-- BT>300
insert into detallealta values(5,"Cargo Fijo","$/mes",1,3226.41,2);
insert into detallealta values(6,"Cargo Variable Pico","$/kWh",1,3.286,2);
insert into detallealta values(7,"Cargo Variable Resto","$/kWh",1,3.138,2);
insert into detallealta values(8,"Cargo Variable Valle","$/kWh",1,2.990,2);

-- hay que crear otra tarifa y su respectiva subclase 
insert into tarifa values(3,"Luz MT",'2019-1-1');
insert into tarifaalta values(3,"MT",300);

-- MT<300
insert into detallealta values(9,"Cargo Fijo","$/mes",0,3226.09,3);
insert into detallealta values(10,"Cargo Variable Pico","$/kWh",0,2.148,3);
insert into detallealta values(11,"Cargo Variable Resto","$/kWh",0,2.053,3);
insert into detallealta values(12,"Cargo Variable Valle","$/kWh",0,1.959,3);

-- MT>300
insert into detallealta values(13,"Cargo Fijo","$/mes",1,3226.09,3);
insert into detallealta values(14,"Cargo Variable Pico","$/kWh",1,3.123,3);
insert into detallealta values(15,"Cargo Variable Resto","$/kWh",1,2.983,3);
insert into detallealta values(16,"Cargo Variable Valle","$/kWh",1,2.841,3);


-- tarifa y subclase alta tension
insert into tarifa values(4,"Luz AT",'2019-1-1');
insert into tarifaalta values(4,"AT",300);

-- AT<300
insert into detallealta values(17,"Cargo Fijo","$/mes",0,3224.11,4);
insert into detallealta values(18,"Cargo Variable Pico","$/kWh",0,2.060,4);
insert into detallealta values(19,"Cargo Variable Resto","$/kWh",0,1.969,4);
insert into detallealta values(20,"Cargo Variable Valle","$/kWh",0,1.879,4);

-- AT>300

insert into detallealta values(21,"Cargo Fijo","$/mes",1,3224.11,4);
insert into detallealta values(22,"Cargo Variable Pico","$/kWh",1,2.995,4);
insert into detallealta values(23,"Cargo Variable Resto","$/kWh",1,2.860,4);
insert into detallealta values(24,"Cargo Variable Valle","$/kWh",1,2.725,4);


-- queries para asegurarte de que esta todo bien

-- imprimir detalles baja tension
select * from tarifaalta as t 
inner join detallealta as d on 
t.idTarifaAlta=d.idTarifaAlta
WHERE t.tensionContratada = "bt";


-- imprimir detalles media tension
select * from tarifaalta as t 
inner join detallealta as d on 
t.idTarifaAlta=d.idTarifaAlta
WHERE t.tensionContratada = "mt";


-- imprimir detalles alta tension
select * from tarifaalta as t 
inner join detallealta as d on 
t.idTarifaAlta=d.idTarifaAlta
WHERE t.tensionContratada = "at";


select * from detallealta;



 
 











