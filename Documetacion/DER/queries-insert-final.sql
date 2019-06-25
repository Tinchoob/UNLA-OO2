/*INSPECTOR*/

insert into inspector values(1,"Hector","Carballo",332211);
insert into inspector values(2,"Scott","Lang",998811);
insert into inspector values(3,"Ernesto","Juarez",112233);

select * from inspector;


/*ZONA*/
insert into zona values(1,"Burzaco",0);
insert into zona values(2,"Quilmes",0);
insert into zona values(3,"Banfield",0);

select * from zona;


/*INSPECTORXZONA*/
insert into inspectorxzona values(1,1);	-- INSPECTOR 1 EN ZONA 1
insert into inspectorxzona values(1,2);	-- INSPECTOR 1 EN ZONA 2
insert into inspectorxzona values(2,2); -- INSPECTOR 2 EN ZONA 2
insert into inspectorxzona values(2,3); -- INSPECTOR 2 EN ZONA 3
insert into inspectorxzona values(3,3); -- INSPECTOR 3 EN ZONA 3

select * from inspectorxzona;

/*CLIENTE*/		-- primero se carga en tabla cliente, despues CON EL MISMO ID en personaF o personaJ, sino no se puede.
insert into cliente values(1,"922",0);
insert into personafisica values(1,"Ignacio","Montania",4105567);
insert into contacto values(1,"igna@gmail.com","1533121","4211-2211");

insert into cliente values(2,"923",0);
insert into personafisica values(2,"Martin","Bombara",4133212);
insert into contacto values(2,"tincho@gmail.com","1533121","4211-2211");

insert into cliente values(3,"140",0);
insert into personajuridica values(3,"Universidad de Lanus","2213299");
insert into contacto values(3,"unla@gmail.com","1533121","4211-2211");

insert into cliente values(4,"141",0);
insert into personajuridica values(4,"Herreria Martinez","1138721");
insert into contacto values(4,"hierros@gmail.com","1533121","4211-2211");


select * from cliente,personafisica where cliente.idCliente=personaFisica.idPersonaFisica;
select * from cliente,personajuridica where cliente.idCliente=personajuridica.idPersonaJuridica;



/*MEDIDOR*/ -- unicos clientes con medidores son 1 y 3
insert into medidor values(1,123,"Quintana 312",0,1,1); -- el cliente 1 tiene 2 medidores, uno en la zona 1, el otro en la zona 2
insert into medidor values(2,231,"25 de mayo 122",0,2,1);
insert into medidor values(3,222,"Avenida Avellaneda 2377",0,3,3);
insert into medidor values(4,226,"Avenida Corrientes 112",0,2,3);

select * from medidor;

/*LECTURAS*/
insert into lectura values(1,'2019-03-01 13:00',1,1);
insert into lectura values(2,'2019-05-01 13:00',1,1);
insert into lectura values(3,'2019-07-01 13:00',1,1);
insert into lectura values(10,'2019-09-01 13:00',1,1);

insert into lectura values(4,'2019-09-02 13:00',2,3);
insert into lectura values(5,'2019-11-02 13:00',2,3);

insert into lectura values(6,'2020-01-02 13:00',2,3);
insert into lectura values(7,'2020-03-02 13:00',2,3);

insert into lectura values(8,'2020-05-02 13:00',2,3);
insert into lectura values(9,'2020-07-02 13:00',2,3);

insert into lecturaaltademanda values(4,"BT",150,100,200,300);
insert into lecturaaltademanda values(5,"BT",250,350,450,550);

insert into lecturaaltademanda values(6,"MT",250,170,270,300);
insert into lecturaaltademanda values(7,"MT",350,400,500,600);

insert into lecturaaltademanda values(8,"AT",250,235,280,292);
insert into lecturaaltademanda values(9,"AT",500,450,550,650);


insert into lecturabajademanda values(1,200);
insert into lecturabajademanda values(2,500);
insert into lecturabajademanda values(3,1200);
insert into lecturabajademanda values(10,1900);

select * from lectura;



/*TARIFA 1 BAJA DEMANDA*/
insert into tarifa values(1,"Luz Baja Demanda",'2019-4-1');
insert into tarifabaja values(1);

/*tarifabaja*/
insert into detallebaja values(1,"Cargo fijo","$/mes",0,150,36.82,1);
insert into detallebaja values(2,"Cargo variable","$/kWh",0,150,2.700,1); -- ok

insert into detallebaja values(3,"Cargo fijo","$/mes",151,325,60.11,1);
insert into detallebaja values(4,"Cargo variable","$/kWh",151,325,2.750,1); -- ok

insert into detallebaja values(5,"Cargo fijo","$/mes",326,400,95.80,1);
insert into detallebaja values(6,"Cargo variable","$/kWh",326,400,2.800,1); -- ok

insert into detallebaja values(7,"Cargo fijo","$/mes",401,450,109.25,1);  -- ok
insert into detallebaja values(8,"Cargo variable","$/kWh",0,150,2.860,1);

insert into detallebaja values(9,"Cargo fijo","$/mes",451,500,165.46,1);	-- ok
insert into detallebaja values(10,"Cargo variable","$/kWh",451,500,2.900,1);

insert into detallebaja values(11,"Cargo fijo","$/mes",501,600,330,1);		-- ok
insert into detallebaja values(12,"Cargo variable","$/kWh",501,600,2.970,1);

insert into detallebaja values(13,"Cargo fijo","$/mes",601,700,870.14,1);	-- ok
insert into detallebaja values(14,"Cargo variable","$/kWh",601,700,3.405,1);	-- ok

insert into detallebaja values(15,"Cargo fijo","$/mes",701,1400,1250.52,1);			-- ok
insert into detallebaja values(16,"Cargo variable","$/kWh",701,1400,3.480,1);

insert into detallebaja values(17,"Cargo fijo","$/mes",1400,99999,1500.48,1);		-- ok
insert into detallebaja values(18,"Cargo variable","$/kWh",1400,99999,3.650,1);

/*TARIFA*/ -- ingresar primero la superclase y luego la subclase
insert into tarifa values(2,"Luz Baja Demanda",'2019-6-1');
insert into tarifabaja values(2);

/*tarifabaja*/
insert into detallebaja values(19,"Cargo fijo","$/mes",0,150,32.82,2);
insert into detallebaja values(20,"Cargo variable","$/kWh",0,150,2.653,2); -- ok

insert into detallebaja values(21,"Cargo fijo","$/mes",151,325,56.11,2);
insert into detallebaja values(22,"Cargo variable","$/kWh",151,325,2.651,2); -- ok

insert into detallebaja values(23,"Cargo fijo","$/mes",326,400,91.73,2);
insert into detallebaja values(24,"Cargo variable","$/kWh",326,400,2.705,2); -- ok

insert into detallebaja values(25,"Cargo fijo","$/mes",401,450,107.34,2);  -- ok
insert into detallebaja values(26,"Cargo variable","$/kWh",0,150,2.785,2);

insert into detallebaja values(27,"Cargo fijo","$/mes",451,500,161.66,2);	-- ok
insert into detallebaja values(28,"Cargo variable","$/kWh",451,500,2.864,2);

insert into detallebaja values(29,"Cargo fijo","$/mes",501,600,316,2);		-- ok
insert into detallebaja values(30,"Cargo variable","$/kWh",501,600,2.918,2);

insert into detallebaja values(31,"Cargo fijo","$/mes",601,700,850.24,2);	-- ok
insert into detallebaja values(32,"Cargo variable","$/kWh",601,700,3.309,2);	-- ok

insert into detallebaja values(33,"Cargo fijo","$/mes",701,1400,1203.64,2);			-- ok
insert into detallebaja values(34,"Cargo variable","$/kWh",701,1400,3.411,2);

insert into detallebaja values(35,"Cargo fijo","$/mes",1400,99999,1442.88,2);		-- ok
insert into detallebaja values(36,"Cargo variable","$/kWh",1400,99999,3.437,2);


/*traer la tarifa de baja y sus detalles*/
select * from tarifabaja as t
inner join detallebaja as d on 
t.idTarifaBaja=d.idTarifaBaja;

-- ****************************************************************************
-- ******************************* 27/05/2019 *********************************
-- ****************************************************************************

insert into tarifa values(3,"Luz BT",'2019-1-1');
-- TARIFA ALTA
-- necesito 3 tablas de tarifaalta diferentes, una para cada tension (BT,MT,AT) y si supera o no el limite (BT<300, BT>300, MT<300, MT>300, AT<300, AT>300)
-- ademas cada vez que creo una tarifaalta debo crear una tabla tarifa because herencia

insert into tarifaalta values(3,"BT",300);

-- BT<300
insert into detallealta values(1,"Cargo Fijo","$/mes",0,3226.41,3);
insert into detallealta values(2,"Cargo Variable Pico","$/kWh",0,2.260,3);
insert into detallealta values(3,"Cargo Variable Resto","$/kWh",0,2.160,3);
insert into detallealta values(4,"Cargo Variable Valle","$/kWh",0,2.061,3);

-- BT>300
insert into detallealta values(5,"Cargo Fijo","$/mes",1,3226.41,3);
insert into detallealta values(6,"Cargo Variable Pico","$/kWh",1,3.286,3);
insert into detallealta values(7,"Cargo Variable Resto","$/kWh",1,3.138,3);
insert into detallealta values(8,"Cargo Variable Valle","$/kWh",1,2.990,3);

-- hay que crear otra tarifa y su respectiva subclase 
insert into tarifa values(4,"Luz MT",'2019-1-1');
insert into tarifaalta values(4,"MT",300);

-- MT<300
insert into detallealta values(9,"Cargo Fijo","$/mes",0,3226.09,4);
insert into detallealta values(10,"Cargo Variable Pico","$/kWh",0,2.148,4);
insert into detallealta values(11,"Cargo Variable Resto","$/kWh",0,2.053,4);
insert into detallealta values(12,"Cargo Variable Valle","$/kWh",0,1.959,4);

-- MT>300
insert into detallealta values(13,"Cargo Fijo","$/mes",1,3226.09,4);
insert into detallealta values(14,"Cargo Variable Pico","$/kWh",1,3.123,4);
insert into detallealta values(15,"Cargo Variable Resto","$/kWh",1,2.983,4);
insert into detallealta values(16,"Cargo Variable Valle","$/kWh",1,2.841,4);


-- tarifa y subclase alta tension
insert into tarifa values(5,"Luz AT",'2019-1-1');
insert into tarifaalta values(5,"AT",300);

-- AT<300
insert into detallealta values(17,"Cargo Fijo","$/mes",0,3224.11,5);
insert into detallealta values(18,"Cargo Variable Pico","$/kWh",0,2.060,5);
insert into detallealta values(19,"Cargo Variable Resto","$/kWh",0,1.969,5);
insert into detallealta values(20,"Cargo Variable Valle","$/kWh",0,1.879,5);

-- AT>300

insert into detallealta values(21,"Cargo Fijo","$/mes",1,3224.11,5);
insert into detallealta values(22,"Cargo Variable Pico","$/kWh",1,2.995,5);
insert into detallealta values(23,"Cargo Variable Resto","$/kWh",1,2.860,5);
insert into detallealta values(24,"Cargo Variable Valle","$/kWh",1,2.725,5);


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


/*FACTURAS*/
insert into factura values(1,"Ignacio Montania",1,'2019-03-01,14:00',123,"Mes 1 Cargo fijo: 60.11 , Cargo Variable : 275.1 // Mes 2: Cargo Fijo: 60.11, Cargo variable: 275.1",1);
 
insert into factura values(2,"Ignacio Montania",2,'2019-05-01 16:21',123,"Mes 1 Cargo fijo: 60.11 , Cargo Variable : 412.5 // Mes 2: Cargo Fijo: 60.11, Cargo variable: 412.5",1);

insert into factura values(3,"Ignacio Montania",3,'2019-07-01 12:32',123,"Mes 1 Cargo fijo: 870.14 , Cargo Variable : 1191.75 // Mes 2: Cargo Fijo: 870.14, Cargo variable: 1191.75",1);

/*ITEMFACTURA*/
insert into itemfactura values(1,"Cargo Fijo",60.11,1,"$/mes",1);
insert into itemfactura values(2,"Cargo Variable",275.1,1,"$/kWh",1);
insert into itemfactura values(3,"Cargo Fijo",60.11,1,"$/mes",1);
insert into itemfactura values(4,"Cargo Variable",275.1,1,"$/kWh",1);

insert into itemfactura values(5,"Cargo Fijo",60.11,1,"$/mes",2);
insert into itemfactura values(6,"Cargo Variable",412.5,1,"$/kWh",2);
insert into itemfactura values(7,"Cargo Fijo",60.11,1,"$/mes",2);
insert into itemfactura values(8,"Cargo Variable",412.5,1,"$/kWh",2);

insert into itemfactura values(9,"Cargo Fijo",870.14,1,"$/mes",3);
insert into itemfactura values(10,"Cargo Variable",1191.75,1,"$/kWh",3);
insert into itemfactura values(11,"Cargo Fijo",870.14,1,"$/mes",3);
insert into itemfactura values(12,"Cargo Variable",1191.75,1,"$/kWh",3);

/*FACTURAS ALTA DEMANDA*/
insert into factura values(4,"Herreria Martinez",4,'2019-09-02 12:00:00',222,"Mes 1 Cargo fijo: 3266.41 , Cargo Variable Pico: 113.0, Cargo Variable Resto: 216.0, Cargo Variable Valle: 309.15 // Mes 2: Cargo fijo: 3266.41, Cargo Variable Pico: 113.0, Cargo Variable Resto: 216.0, Cargo Variable Valle: 309.15",3);
insert into factura values(5,"Herreria Martinez",5,'2019-11-02 12:00:00',222,"Mes 1 Cargo fijo: 3266.41 , Cargo Variable Pico: 575.05 , Cargo Variable Resto: 862.95‬, Cargo Variable Valle: 672.75 // Mes 2: Cargo fijo: 3266.41 , Cargo Variable Pico: 575.05, Cargo Variable Resto: 862.95‬, Cargo Variable Valle: 672.75",3);

insert into factura values(6,"Herreria Martinez",6,'2020-01-02 12:00:00',222,"Mes 1 Cargo fijo: 3266.41 , Cargo Variable Pico: 182.58‬, Cargo Variable Resto: 447.45, Cargo Variable Valle: 264.465 // Mes 2: Cargo fijo: 3266.41 , Cargo Variable Pico: 182.58‬, Cargo Variable Resto: 447.45, Cargo Variable Valle: 264.465",4);
insert into factura values(7,"Herreria Martinez",7,'2020-03-02 12:00:00',222,"Mes 1 Cargo fijo: 3266.41 , Cargo Variable Pico: 624.6‬, Cargo Variable Resto: 894.9, Cargo Variable Valle: 710.25 // Mes 2: Cargo fijo: 3266.41 , Cargo Variable Pico: 624.6, Cargo Variable Resto: 894.9, Cargo Variable Valle: 710.25",4);

insert into factura values(8,"Herreria Martinez",8,'2020-05-02 12:00:00',222,"Mes 1 Cargo fijo: 3266.41 , Cargo Variable Pico: 242.05‬, Cargo Variable Resto: 287.474, Cargo Variable Valle: 263.06 // Mes 2: Cargo fijo: 3266.41 , Cargo Variable Pico: 242.05‬, Cargo Variable Resto: 287.474, Cargo Variable Valle: 263.06",5);
insert into factura values(9,"Herreria Martinez",9,'2020-07-02 12:00:00',222,"Mes 1 Cargo fijo: 3266.41 , Cargo Variable Pico: 673.875, Cargo Variable Resto: 929.5‬, Cargo Variable Valle: 749.375‬ // Mes 2: Cargo fijo: 3266.41 , Cargo Variable Pico: 673.875, Cargo Variable Resto: 929.5‬, Cargo Variable Valle: 749.375‬",5);


/*ITEMFACTURA*/
insert into itemfactura values(13,"Cargo Fijo",3266.41,1,"$/mes",4);
insert into itemfactura values(14,"Cargo Variable Pico",113.0,1,"$/kWh",4);
insert into itemfactura values(15,"Cargo Variable Valle",309.15,1,"$/kWh",4);
insert into itemfactura values(16,"Cargo Variable Resto",216.0,1,"$/kWh",4);
insert into itemfactura values(17,"Cargo Fijo",3266.41,1,"$/mes",4);
insert into itemfactura values(18,"Cargo Variable Pico",113.0,1,"$/kWh",4);
insert into itemfactura values(19,"Cargo Variable Valle",309.15,1,"$/kWh",4);
insert into itemfactura values(20,"Cargo Variable Resto",216.0,1,"$/kWh",4);

insert into itemfactura values(21,"Cargo Fijo",3266.41,1,"$/mes",5);
insert into itemfactura values(22,"Cargo Variable Pico",575.05,1,"$/kWh",5);
insert into itemfactura values(23,"Cargo Variable Valle",672.75,1,"$/kWh",5);
insert into itemfactura values(24,"Cargo Variable Resto",862.95,1,"$/kWh",5);
insert into itemfactura values(25,"Cargo Fijo",3266.41,1,"$/mes",5);
insert into itemfactura values(26,"Cargo Variable Pico",575.05,1,"$/kWh",5);
insert into itemfactura values(27,"Cargo Variable Valle",672.75,1,"$/kWh",5);
insert into itemfactura values(28,"Cargo Variable Resto",862.95,1,"$/kWh",5);

insert into itemfactura values(29,"Cargo Fijo",3266.41,1,"$/mes",6);
insert into itemfactura values(30,"Cargo Variable Pico",182.5,1,"$/kWh",6);
insert into itemfactura values(31,"Cargo Variable Valle",264.465,1,"$/kWh",6);
insert into itemfactura values(32,"Cargo Variable Resto",447.45,1,"$/kWh",6);
insert into itemfactura values(33,"Cargo Fijo",3266.41,1,"$/mes",6);
insert into itemfactura values(34,"Cargo Variable Pico",182.5,1,"$/kWh",6);
insert into itemfactura values(35,"Cargo Variable Valle",264.465,1,"$/kWh",6);
insert into itemfactura values(36,"Cargo Variable Resto",447.45,1,"$/kWh",6);

insert into itemfactura values(37,"Cargo Fijo",3266.41,1,"$/mes",7);
insert into itemfactura values(38,"Cargo Variable Pico",624.6,1,"$/kWh",7);
insert into itemfactura values(39,"Cargo Variable Valle",710.25,1,"$/kWh",7);
insert into itemfactura values(40,"Cargo Variable Resto",894.9,1,"$/kWh",7);
insert into itemfactura values(41,"Cargo Fijo",3266.41,1,"$/mes",7);
insert into itemfactura values(42,"Cargo Variable Pico",624.6,1,"$/kWh",7);
insert into itemfactura values(43,"Cargo Variable Valle",710.25,1,"$/kWh",7);
insert into itemfactura values(44,"Cargo Variable Resto",894.9,1,"$/kWh",7);

insert into itemfactura values(45,"Cargo Fijo",3266.41,1,"$/mes",8);
insert into itemfactura values(46,"Cargo Variable Pico",242.05,1,"$/kWh",8);
insert into itemfactura values(47,"Cargo Variable Valle",263.06,1,"$/kWh",8);
insert into itemfactura values(48,"Cargo Variable Resto",287.474,1,"$/kWh",8);
insert into itemfactura values(49,"Cargo Fijo",3266.41,1,"$/mes",8);
insert into itemfactura values(50,"Cargo Variable Pico",242.05,1,"$/kWh",8);
insert into itemfactura values(51,"Cargo Variable Valle",263.06,1,"$/kWh",8);
insert into itemfactura values(52,"Cargo Variable Resto",287.474,1,"$/kWh",8);

insert into itemfactura values(53,"Cargo Fijo",3266.41,1,"$/mes",9);
insert into itemfactura values(54,"Cargo Variable Pico",673.875,1,"$/kWh",9);
insert into itemfactura values(55,"Cargo Variable Valle",749.375,1,"$/kWh",9);
insert into itemfactura values(56,"Cargo Variable Resto",929.5,1,"$/kWh",9);
insert into itemfactura values(57,"Cargo Fijo",3266.41,1,"$/mes",9);
insert into itemfactura values(58,"Cargo Variable Pico",673.875,1,"$/kWh",9);
insert into itemfactura values(59,"Cargo Variable Valle",749.375,1,"$/kWh",9);
insert into itemfactura values(60,"Cargo Variable Resto",929.5,1,"$/kWh",9);



select * from factura;




